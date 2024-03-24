package model;

public class User {

	private String userID;
	
	private String username;
	
	private String fullname;
	
	private String password;
	
	private String email;
	
	private boolean admin;
	
	public String getuserID() {
		return userID;
	}

	public void setuserID(String userID) {
		userID = userID;
	}

	public String getusername() {
		return username;
	}

	public void setusername(String username) {
		username = username;
	}

	public String getfullname() {
		return fullname;
	}

	public void setfullname(String fullname) {
		fullname = fullname;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		password = password;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		email = email;
	}

	public boolean isadmin() {
		return admin;
	}

	public void setadmin(boolean admin) {
		admin = admin;
	}

	public User() {
		super();
	}

	public User(String userID, String username, String fullname, String password, String email, boolean admin) {
		super();
		userID = userID;
		username = username;
		fullname = fullname;
		password = password;
		email = email;
		admin = admin;
	}

}
