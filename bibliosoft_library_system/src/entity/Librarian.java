package entity;

public class Librarian {
	private String Manager_ID;
	private String Manager_name;
	private String Manager_password;
	private String Manager_phone;
	private String Manager_type;

	public Librarian() {
	}

	public Librarian(String Manager_ID, String Manager_name, String Manager_password, String Manager_phone,
			String Manager_type) {
		super();
		this.Manager_ID = Manager_ID;
		this.Manager_name = Manager_name;
		this.Manager_password = Manager_password;
		this.Manager_phone = Manager_phone;
		this.Manager_type = Manager_type;
	}

	public String getManager_ID() {
		return Manager_ID;
	}

	public void setManager_ID(String manager_ID) {
		Manager_ID = manager_ID;
	}

	public String getManager_name() {
		return Manager_name;
	}

	public void setManager_name(String manager_name) {
		Manager_name = manager_name;
	}

	public String getManager_password() {
		return Manager_password;
	}

	public void setManager_password(String manager_password) {
		Manager_password = manager_password;
	}

	public String getManager_phone() {
		return Manager_phone;
	}

	public void setManager_phone(String manager_phone) {
		Manager_phone = manager_phone;
	}

	public String getManager_type() {
		return Manager_type;
	}

	public void setManager_type(String manager_type) {
		Manager_type = manager_type;
	}

}
