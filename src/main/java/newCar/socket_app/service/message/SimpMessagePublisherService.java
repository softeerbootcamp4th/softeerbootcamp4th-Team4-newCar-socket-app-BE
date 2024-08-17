package newCar.socket_app.service.message;

import lombok.RequiredArgsConstructor;
import newCar.socket_app.model.chat.ChatMessage;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SimpMessagePublisherService implements MessagePublisherService {

    private final SimpMessagingTemplate messagingTemplate;

    @Override
    public void publish(String topic, ChatMessage message) {
        messagingTemplate.convertAndSend(topic, message);
    }
}
