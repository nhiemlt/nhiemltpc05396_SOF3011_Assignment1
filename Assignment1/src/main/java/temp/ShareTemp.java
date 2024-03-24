package temp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Share;

public class ShareTemp {

	 Share share1 = new Share("1", "user1", "1", new Date());
     Share share2 = new Share("2", "user2", "2", new Date());
     Share share3 = new Share("3", "user3", "3", new Date());
     Share share4 = new Share("4", "user4", "4", new Date());
     Share share5 = new Share("5", "user5", "5", new Date());
     Share share6 = new Share("6", "user6", "6", new Date());
     Share share7 = new Share("7", "user7", "7", new Date());
     Share share8 = new Share("8", "user8", "8", new Date());
     Share share9 = new Share("9", "user9", "9", new Date());
     Share share10 = new Share("10", "user10", "10", new Date());
     
     public List<Share> getSharesList() {
         List<Share> shareList = new ArrayList<>();
         shareList.add(share1);
         shareList.add(share2);
         shareList.add(share3);
         shareList.add(share4);
         shareList.add(share5);
         shareList.add(share6);
         shareList.add(share7);
         shareList.add(share8);
         shareList.add(share9);
         shareList.add(share10);
         return shareList;
     }
}
