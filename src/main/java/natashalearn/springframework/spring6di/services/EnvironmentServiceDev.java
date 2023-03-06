package natashalearn.springframework.spring6di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service
public class EnvironmentServiceDev implements EnvironmentService {
    @Override
    public String getEnv() {
        return "This is DEV datasource";
    }
}
