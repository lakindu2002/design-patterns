package singleton;

public class LoginMain implements Runnable {
    private static String username ="Udara";
    private static String password = "Udara";

    public static void main(String[] args) {

        new Thread(new LoginMain()).start();

        LoginSingleton instance = LoginSingleton.getInstance();
        Boolean result = instance.validateUser(username,password);
        System.out.println(result);
    }

    @Override
    public void run() {
        LoginSingleton instance1 = LoginSingleton.getInstance();
        LoginSingleton instance2 = LoginSingleton.getInstance();

        Boolean result = instance1.validateUser(username,password);
        System.out.println(result);
        System.out.println(instance1.equals(instance2)); // pointing two same memory address
    }
}
