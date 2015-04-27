package sample.di.business.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MessageServiceImpl implements MessageService {

    @Value("#{msgProperties.message}")
    private String message;

    public String getMessage() {
        return message;
    }

    // applicationContext で指定する場合、必要
//    public void setMessage(String message) {
//        this.message = message;
//    }
  
}
