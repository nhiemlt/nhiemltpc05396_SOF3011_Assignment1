package temp;

import java.util.ArrayList;
import java.util.List;

import model.User;

public class UserTemp {

	User user1 = new User("1", "user1", "Nguyen Van A", "12345", "nguyenvana@gmail.com", false);
    User user2 = new User("2", "user2", "Nguyen Van B", "12345", "nguyenvanb@gmail.com", false);
    User user3 = new User("3", "user3", "Nguyen Van C", "12345", "nguyenvanc@gmail.com", false);
    User user4 = new User("4", "user4", "Nguyen Van D", "12345", "nguyenvand@gmail.com", false);
    User user5 = new User("5", "user5", "Nguyen Van E", "12345", "nguyenvane@gmail.com", false);
    User user6 = new User("6", "user6", "Nguyen Van F", "12345", "nguyenvanf@gmail.com", false);
    User user7 = new User("7", "user7", "Nguyen Van G", "12345", "nguyenvang@gmail.com", false);
    User user8 = new User("8", "user8", "Nguyen Van H", "12345", "nguyenvanh@gmail.com", false);
    User user9 = new User("9", "user9", "Nguyen Van I", "12345", "nguyenvani@gmail.com", false);
    User user10 = new User("10", "user10", "Nguyen Van K", "12345", "nguyenvank@gmail.com", false);
    
    public List<User> getUsersList() {
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user6);
        userList.add(user7);
        userList.add(user8);
        userList.add(user9);
        userList.add(user10);
        return userList;
    }
}
