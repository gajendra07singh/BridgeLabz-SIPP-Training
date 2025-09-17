interface SensitiveData {}

class UserCredentials implements SensitiveData {
    String username = "admin";
    String password = "1234";
}

public class SensitiveDataTagging {
    public static void main(String[] args) {
        UserCredentials creds = new UserCredentials();
        if (creds instanceof SensitiveData) {
            System.out.println("This data is sensitive and should be encrypted!");
        }
    }
}