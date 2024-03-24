package model;

import java.util.Date;

public class Share {

	private String favoriteID;
	
	private String userID;
	
	private String videoID;
	
	private Date likeDate;

	public String getFavoriteID() {
		return favoriteID;
	}

	public void setFavoriteID(String favoriteID) {
		this.favoriteID = favoriteID;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getVideoID() {
		return videoID;
	}

	public void setVideoID(String videoID) {
		this.videoID = videoID;
	}

	public Date getLikeDate() {
		return likeDate;
	}

	public void setLikeDate(Date likeDate) {
		this.likeDate = likeDate;
	}

	public Share() {
		super();
	}

	public Share(String favoriteID, String userID, String videoID, Date likeDate) {
		super();
		this.favoriteID = favoriteID;
		this.userID = userID;
		this.videoID = videoID;
		this.likeDate = likeDate;
	}
	


}
