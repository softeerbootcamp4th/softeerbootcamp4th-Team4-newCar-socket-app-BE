package newCar.socket_app.secure;

import newCar.socket_app.model.Team;
import org.springframework.stereotype.Component;

@Component
public class JwtTokenProviderImpl implements JwtTokenProvider {
    @Override
    public Long getUserId(String token) {
        return 1234L;
    }

    @Override
    public Team getTeam(String token) {
        return Team.TRAVEL;
    }

    @Override
    public boolean validateToken(String token) {
        return true;
    }
}
