package model;

import java.util.Date;

public class Favorite {

	private String ShareID;
	
	private String UserID;
	
	private String VideoID;
	
	private String Emails;
	
	private Date ShareDate;
	

	public String getShareID() {
		return ShareID;
	}


	public void setShareID(String shareID) {
		ShareID = shareID;
	}


	public String getUserID() {
		return UserID;
	}


	public void setUserID(String userID) {
		UserID = userID;
	}


	public String getVideoID() {
		return VideoID;
	}


	public void setVideoID(String videoID) {
		VideoID = videoID;
	}


	public String getEmails() {
		return Emails;
	}


	public void setEmails(String emails) {
		Emails = emails;
	}


	public Date getShareDate() {
		return ShareDate;
	}


	public void setShareDate(Date shareDate) {
		ShareDate = shareDate;
	}


	public Favorite() {
		super();
	}


	public Favorite(String shareID, String userID, String videoID, String emails, Date shareDate) {
		super();
		ShareID = shareID;
		UserID = userID;
		VideoID = videoID;
		Emails = emails;
		ShareDate = shareDate;
	}

}
