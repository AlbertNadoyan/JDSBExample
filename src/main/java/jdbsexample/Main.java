package jdbsexample;

import jdbsexample.manager.UserManager;
import jdbsexample.model.User;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        try {
//           User user = new User("John", "Brown", "johnbr@gmail.com", "johnbr712");
//           userManager.addUser(user);
//            System.out.println(user);
            List<User> allUsers = userManager.getAllUsers();
            for (User user : allUsers) {
                System.out.println(user);
            }
            userManager.deleteUserById(2);

            System.out.println();

            allUsers = userManager.getAllUsers();
            for (User user : allUsers) {
                System.out.println(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
