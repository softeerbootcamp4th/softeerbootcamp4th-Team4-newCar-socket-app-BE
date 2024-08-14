package newCar.socket_app.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class GameData {
    private Long P; //PET
    private Long T; //TRAVEL
    private Long S; //SPACE
    private Long L; //LEISURE

    public Long getGameData(Team team){
        return switch (team) {
            case PET -> P;
            case TRAVEL -> T;
            case SPACE -> S;
            case LEISURE -> L;
        };
    }
}
