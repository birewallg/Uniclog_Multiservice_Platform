package local.uniclog.frame_dataaccess.repository;

import local.uniclog.frame_dataaccess.entity.TelegramUnicBotCoreUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TelegramUnicBotCoreRepository extends JpaRepository<TelegramUnicBotCoreUserEntity, Long> {
    TelegramUnicBotCoreUserEntity findByUserTelegramId(Long userTelegramId);
    List<TelegramUnicBotCoreUserEntity> findBySubscriber(boolean subscriber);
}