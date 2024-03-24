package model;

public class Video {
	
	private String videoID;
	
	private String title;
	
	private String poster;
	
	private int views;
	
	private String description;
	
	private boolean active;
	
	private String youTubeURL;


	public String getVideoID() {
		return videoID;
	}

	public void setVideoID(String videoID) {
		this.videoID = videoID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getYouTubeURL() {
		return youTubeURL;
	}

	public void setYouTubeURL(String youTubeURL) {
		this.youTubeURL = youTubeURL;
	}

	public Video() {
		
	}

	public Video(String videoID, String title, String poster, int views, String description, boolean active,
			String youTubeURL) {
		super();
		this.videoID = videoID;
		this.title = title;
		this.poster = poster;
		this.views = views;
		this.description = description;
		this.active = active;
		this.youTubeURL = youTubeURL;
	}


}
