package models;

public class User {
	private int userId;
	private int deptId;
	private int superId;
	private String userName;
	private String password;
	private String email;
	
	public User() {
		super();
	}

	public User(int userId, int deptId, int superId, String userName, String password, String email) {
		super();
		this.userId = userId;
		this.deptId = deptId;
		this.superId = superId;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public int getSuperId() {
		return superId;
	}

	public void setSuperId(int superId) {
		this.superId = superId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", deptId=" + deptId + ", superId=" + superId + ", userName=" + userName
				+ ", password=" + password + ", email=" + email + "]";
	}

}
