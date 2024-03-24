package temp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Favorite;

public class FavoriteTemp {

    Favorite favorite1 = new Favorite("1", "user1", "1", "nguyenvana@gmail.com", new Date());
    Favorite favorite2 = new Favorite("2", "user2", "2", "nguyenvanb@gmail.com", new Date());
    Favorite favorite3 = new Favorite("3", "user3", "3", "nguyenvanc@gmail.com", new Date());
    Favorite favorite4 = new Favorite("4", "user4", "4", "nguyenvand@gmail.com", new Date());
    Favorite favorite5 = new Favorite("5", "user5", "5", "nguyenvane@gmail.com", new Date());
    Favorite favorite6 = new Favorite("6", "user6", "6", "nguyenvanf@gmail.com", new Date());
    Favorite favorite7 = new Favorite("7", "user7", "7", "nguyenvang@gmail.com", new Date());
    Favorite favorite8 = new Favorite("8", "user8", "8", "nguyenvanh@gmail.com", new Date());
    Favorite favorite9 = new Favorite("9", "user9", "9", "nguyenvani@gmail.com", new Date());
    Favorite favorite10 = new Favorite("10", "user10", "10", "nguyenvank@gmail.com", new Date());
    
    public List<Favorite> getFavoritesList() {
        List<Favorite> favoriteList = new ArrayList<>();
        favoriteList.add(favorite1);
        favoriteList.add(favorite2);
        favoriteList.add(favorite3);
        favoriteList.add(favorite4);
        favoriteList.add(favorite5);
        favoriteList.add(favorite6);
        favoriteList.add(favorite7);
        favoriteList.add(favorite8);
        favoriteList.add(favorite9);
        favoriteList.add(favorite10);
        return favoriteList;
    }
}
