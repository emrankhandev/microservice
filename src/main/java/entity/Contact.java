package entity;

public class Contact {

	private Long cId;
	private String contactName;
	private String email;
	private Long uId;
	
	public Contact() {
		super();
		
	}

	public Contact(Long cId, String contactName, String email, Long uId) {
		super();
		this.cId = cId;
		this.contactName = contactName;
		this.email = email;
		this.uId = uId;
	}

	public Long getcId() {
		return cId;
	}

	public void setcId(Long cId) {
		this.cId = cId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getuId() {
		return uId;
	}

	public void setuId(Long uId) {
		this.uId = uId;
	}
	
}
