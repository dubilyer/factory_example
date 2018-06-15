package factories;

import model.ApiDriver;
import model.ApiRider;
import model.PerfectoDriver;
import model.User;

import java.util.*;

public enum Users {
    rider, driver;

    public enum DRIVER implements FactoryEnum {
        API (ApiDriver::new),
        PERFECTO (ApiDriver::new);

        private final FactoryEnum driver;

        DRIVER(FactoryEnum driver) {
            this.driver = driver;
        }

        @Override
        public User getUser() throws Exception {
            return driver.getUser();
        }
    }

    public enum RIDER implements FactoryEnum {
        API (ApiRider::new),
        PERFECTO (ApiRider::new);

        private final FactoryEnum rider;

        RIDER(FactoryEnum rider) {
            this.rider = rider;
        }

        @Override
        public User getUser() throws Exception {
            return rider.getUser();
        }
    }
}
