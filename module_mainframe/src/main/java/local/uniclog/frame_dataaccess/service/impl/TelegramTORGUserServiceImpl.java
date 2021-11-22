package local.uniclog.frame_dataaccess.service.impl;

import local.uniclog.frame_dataaccess.entity.TelegramTORGUserEntity;
import local.uniclog.frame_dataaccess.repository.TelegramTORGUserRepository;
import local.uniclog.frame_dataaccess.service.TelegramTORGUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TelegramTORGUserServiceImpl implements TelegramTORGUserService {
    private TelegramTORGUserRepository telegramTORGUserRepository;
    @Autowired
    public void setTelegramTORGUserRepository(TelegramTORGUserRepository telegramTORGUserRepository) {
        this.telegramTORGUserRepository = telegramTORGUserRepository;
    }

    @Override
    public void save(TelegramTORGUserEntity user) {
        TelegramTORGUserEntity userEntity = telegramTORGUserRepository.findByUserTelegramId(user.getUserTelegramId());
        if (userEntity != null) {
            update(user);
            return;
        }
        telegramTORGUserRepository.save(user);
    }

    @Override
    public void update(TelegramTORGUserEntity user) {
            TelegramTORGUserEntity userFromDb = telegramTORGUserRepository.findByUserTelegramId(user.getUserTelegramId());
            if (userFromDb == null) {
                save(user);
                return;
            }
            telegramTORGUserRepository.save(user);
    }

    @Override
    public List<TelegramTORGUserEntity> findAll() {
        return telegramTORGUserRepository.findAll();
    }

    @Override
    public TelegramTORGUserEntity findByUserTelegramId(Long userTelegramId) {
        return telegramTORGUserRepository.findByUserTelegramId(userTelegramId);
    }

    @Override
    public List<TelegramTORGUserEntity> findAllSubscribers() {
        return telegramTORGUserRepository.findAllBySubscriber(true);
    }
}