package Model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="MyUser_Table")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="user_type",discriminatorType = DiscriminatorType.STRING)
public class User {
	@Id
	@GeneratedValue
	private int userId;
	private String userName;
	private String password;
	public User()
	{ 
		
	}
	public User( String userName, String password) {
	
		
		this.userName = userName;
		this.password = password;
	    
	}
	public int getUserId() {
		return userId;
	}
	
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	
	

}
