package newCar.socket_app.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Team {
    PET("P"),
    TRAVEL("T"),
    SPACE("S"),
    LEISURE("L");

    private final String code;
}

