package singleton;

public class LoginSingleton {

    private static LoginSingleton instance;

    public boolean validateUser(String username, String password) {
        return username.equals(password);
    }

    public static LoginSingleton getInstance() {
        if (instance == null) {
            synchronized (LoginSingleton.class) {
                if(instance == null) {
                    // double synchronization
                    instance = new LoginSingleton();
                }
            }
        }
        return instance;
    }
}
