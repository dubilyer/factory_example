import factories.Users;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println(
                Users
                        .RIDER
                        .PERFECTO
                        .getUser()
                        .getUserName());

    }
}

