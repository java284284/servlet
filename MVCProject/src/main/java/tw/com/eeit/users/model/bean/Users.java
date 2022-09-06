package tw.com.eeit.users.model.bean;

public class Users {

	private String id;
	private String account;
	private String userName;
	private String password;
	private String imgPath;

	public Users() {
	}

	public Users(String id, String account, String userName, String password, String imgPath) {
		this.id = id;
		this.account = account;
		this.userName = userName;
		this.password = password;
		this.imgPath = imgPath;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

}
