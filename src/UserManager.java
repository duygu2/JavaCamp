import java.io.PrintStream;

public class UserManager {
    public UserManager() {
    }

    public void add(User user) {
        System.out.println("Name:" + user.getFirstName());
        System.out.println("Last Name:" + user.getLastName());
    }

    public void delete(User user) {
        PrintStream var10000 = System.out;
        String var10001 = user.getFirstName();
        var10000.println(var10001 + " " + user.getLastName() + " deleted.");
    }

    public void addMultiple(User[] users) {
        User[] var2 = users;
        int var3 = users.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            User user = var2[var4];
            this.add(user);
        }

    }
}