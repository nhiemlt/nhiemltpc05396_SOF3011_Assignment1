package temp;

import java.util.ArrayList;
import java.util.List;

import model.Video;

public class VideoTemp {

	Video video1 = new Video("1", "The Avengers", "poster1.png", 165916,
            "The Avengers is an epic superhero film featuring Marvel's iconic characters: Iron Man, Captain America, Thor, Hulk, Black Widow, and Hawkeye. Together, they form a team to battle Loki and his alien army, threatening Earth's existence. Filled with action, humor, and camaraderie, it's a thrilling adventure that showcases each hero's strengths and vulnerabilities.",
            true, "https://www.youtube.com/embed/TcMBFSGVi1c?si=IBaehI-FzlcyBIrT");

    Video video2 = new Video("2", "Inception", "poster2.png", 215652,
            "Inception is a mind-bending sci-fi thriller directed by Christopher Nolan. It explores the concept of dreams within dreams, featuring Leonardo DiCaprio as a skilled thief who enters the subconscious minds of his targets.",
            true, "https://www.youtube.com/embed/y2TCjYiTGIo?si=7FjUknTkeX_IVMR1");

    Video video3 = new Video("3", "The Dark Knight", "poster3.png", 320458,
            "The Dark Knight is a critically acclaimed superhero film directed by Christopher Nolan. It follows Batman's struggle against the Joker, played by Heath Ledger, who wreaks havoc on Gotham City.",
            true, "https://www.youtube.com/embed/EXeTwQWrcwY?si=p6DL7pEeOcwwwWJ3");

    Video video4 = new Video("4", "Interstellar", "poster4.png", 187340,
            "Interstellar is a visually stunning sci-fi epic directed by Christopher Nolan. It follows a group of astronauts who embark on a journey through a wormhole near Saturn in search of a new habitable planet for humanity.",
            true, "https://www.youtube.com/embed/zSWdZVtXT7E?si=Gp4zIO2SddByuzn7");

    Video video5 = new Video("5", "Avatar", "poster5.png", 568392,
            "Avatar is a groundbreaking science fiction film directed by James Cameron. Set on the alien planet Pandora, it follows the journey of a paraplegic ex-Marine who becomes involved in the conflict between the indigenous Na'vi people and the human corporation mining their homeland.",
            true, "https://www.youtube.com/embed/d9MyW72ELq0?si=fS-ZccBAzt3ta2aP");

    Video video6 = new Video("6", "The Lord of the Rings: The Fellowship of the Ring", "poster6.png", 452139,
            "The Fellowship of the Ring is the first installment in the iconic fantasy film series directed by Peter Jackson. It follows Frodo Baggins and his companions as they embark on a quest to destroy the One Ring and defeat the Dark Lord Sauron.",
            true, "https://www.youtube.com/embed/V75dMMIW2B4?si=2kAS2jpxVnI57UXE");
    public List<Video> getVideoList() {
        List<Video> videoList = new ArrayList<>();
        videoList.add(video1);
        videoList.add(video2);
        videoList.add(video3);
        videoList.add(video4);
        videoList.add(video5);
        videoList.add(video6);
        return videoList;
    }
}
