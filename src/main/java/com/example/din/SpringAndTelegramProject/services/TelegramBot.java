
package com.example.din.SpringAndTelegramProject.services;

import com.example.din.SpringAndTelegramProject.Entities.User;
import com.example.din.SpringAndTelegramProject.configuration.BotConfig;
import com.example.din.SpringAndTelegramProject.impl.UserServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.List;

@Component
@Data
@AllArgsConstructor
public class TelegramBot extends TelegramLongPollingBot {
    @Autowired
    final BotConfig config;
    @Autowired
    UserServiceImpl userService;
    @Override
    public void onUpdateReceived(Update update) {
            if(update.hasMessage() && update.getMessage().hasText()){
                String messageText = update.getMessage().getText();
                long chatId = update.getMessage().getChatId();
                SendMessage message = new SendMessage();
                message.setChatId(chatId);
                List<User> userList  = userService.getUsers();
                message.setText(userList.toString());
                try {
                    execute(message);
                }catch (TelegramApiException e){

                }
            }
    }

    @Override
    public String getBotToken() {
        return "5880422234:AAGsrGQG4eHvOQyNfLe2Hb_lu361VkqfWZs";
    }

    @Override
    public String getBotUsername() {
        return config.getName();
    }
}
