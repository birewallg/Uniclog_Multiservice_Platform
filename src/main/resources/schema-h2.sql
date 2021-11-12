CREATE TABLE IF NOT EXISTS telegram_Torg_Users (id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT, subscriber BOOLEAN NULL DEFAULT NULL, user_name VARCHAR(255) NULL DEFAULT NULL, user_telegram_id BIGINT NULL DEFAULT NULL);
CREATE TABLE IF NOT EXISTS telegram_unic_bot_core_users (id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT, subscriber BOOLEAN NULL DEFAULT NULL, user_name VARCHAR(255) NULL DEFAULT NULL, user_telegram_id BIGINT NULL DEFAULT NULL);
CREATE TABLE IF NOT EXISTS `keys` (`key` VARCHAR(255) NOT NULL PRIMARY KEY, date TIMESTAMP);
CREATE TABLE IF NOT EXISTS TELEGRAM_UNIC_BOT_CORE_USERS (ID BIGINT auto_increment primary key, SUBSCRIBER BOOLEAN, USER_NAME VARCHAR(255), USER_TELEGRAM_ID BIGINT);
CREATE TABLE IF NOT EXISTS TELEGRAM_MY_FITNESS_USERS (ID BIGINT AUTO_INCREMENT PRIMARY KEY, SUBSCRIBER BOOLEAN, USER_NAME VARCHAR(255), USER_TELEGRAM_ID BIGINT, WATER_COUNT INT DEFAULT 0);