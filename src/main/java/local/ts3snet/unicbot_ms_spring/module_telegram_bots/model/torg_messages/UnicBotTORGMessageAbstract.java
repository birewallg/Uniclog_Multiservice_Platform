package local.ts3snet.unicbot_ms_spring.module_telegram_bots.model.torg_messages;

import local.ts3snet.unicbot_ms_spring.core.service.TelegramTORGUserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.nio.charset.StandardCharsets;

@Data
public abstract class UnicBotTORGMessageAbstract implements UnicBotTORGMessageInterface {
    private String textMessage;
    private Long userId;
    private String userName;

    private TelegramTORGUserService telegramTORGUserService;
    @Autowired
    public void setTelegramTORGUserService(TelegramTORGUserService telegramTORGUserService) {
        this.telegramTORGUserService = telegramTORGUserService;
    }

    public String convertToUTF8(String text) {
        return new String(text.getBytes(), StandardCharsets.UTF_8);
    }
}