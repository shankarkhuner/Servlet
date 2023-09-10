package Model;


import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("admin")
public class Admin extends User{
	
	private String adminName;
	private String adminAddress;
	private long adminPhone;
	private LocalDate adminDob;
	private String adminGender;
	public Admin() {

}
	public Admin(String userName, String password, String adminName, String adminAddress, long adminPhone, LocalDate adminDob, String adminGender) {
		super(userName, password);
		this.adminName = adminName;
		this.adminAddress = adminAddress;
		this.adminPhone = adminPhone;
		this.adminDob = adminDob;
		this.adminGender = adminGender;
		
}
	public String getAdminName() {
		return adminName;
	}
	public String getAdminAddress() {
		return adminAddress;
	}
	public long getAdminPhone() {
		return adminPhone;
	}
	public LocalDate getAdminDob() {
		return adminDob;
	}
	public String getAdminGender() {
		return adminGender;
	}
}