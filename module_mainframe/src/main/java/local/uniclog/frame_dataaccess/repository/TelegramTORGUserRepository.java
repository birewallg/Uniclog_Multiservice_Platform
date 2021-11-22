package local.uniclog.frame_dataaccess.repository;

import local.uniclog.frame_dataaccess.entity.TelegramTORGUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TelegramTORGUserRepository extends JpaRepository<TelegramTORGUserEntity, Long> {
    TelegramTORGUserEntity findByUserTelegramId(Long userTelegramId);
    List<TelegramTORGUserEntity> findAllBySubscriber(boolean subscriber);
}