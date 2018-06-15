package model;

public interface User {
    default String getUserName(){
        return this.getClass().getSimpleName();
    }
}
