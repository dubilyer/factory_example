package factories;

import model.User;

@FunctionalInterface
interface FactoryEnum {
    User getUser() throws Exception;
}