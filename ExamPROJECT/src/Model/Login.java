package Model;

import java.io.Serializable;

import javax.persistence.*;


@Entity
public class Login implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id 
	@Column (name="idProduit")
	@GeneratedValue (strategy=GenerationType.IDENTITY) 
	private String username;

	private String password;

	
	public Login(  String username, String password) {
		super();
		
	
		this.username = username;
		this.password = password;

	}

	public Login() {
	}

	public  String getusername() {
		return this.username;
	}

	public void setusername(String username) {
		this.username = username;
	}

	public  String getpassword() {
		return this.password;
	}

	public void setpassword(String password) {
		this.password = password;
	}

	

	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password +  "]";
	}

}