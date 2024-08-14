package newCar.socket_app.model;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter
@JsonTypeInfo(use = JsonTypeInfo.Id.NONE)
public class ChatMessage implements Serializable {
    //test!!!! private String id;
    private String sender;
    private String content;
    private String team;

    public ChatMessage(ChatMessageReceived chatMessageReceived) {
        this.content = chatMessageReceived.getContent();
    }
}
