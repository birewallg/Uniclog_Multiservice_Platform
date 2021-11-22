package local.uniclog.frame_dataaccess.repository;

import local.uniclog.frame_dataaccess.entity.TelegramMyFitnessUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TelegramMyFitnessUserRepository extends JpaRepository<TelegramMyFitnessUserEntity, Long> {
    TelegramMyFitnessUserEntity findByUserTelegramId(Long userTelegramId);
    List<TelegramMyFitnessUserEntity> findBySubscriber(boolean subscriber);
}