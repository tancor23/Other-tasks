package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;



@Entity
@Table(name = "users")
public class User {
		
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private int id;
	
	@Size(min = 3, max = 14, message = "The input is not correct!")
	@Column(unique = true)
	private String login;
	
	@Size(min = 2, max = 14, message = "The input is not correct!")
	@Column
	private String password;
	
	@Email(regexp = "^[a-zA-Z0-9]{1,}"+"((\\.|\\_|-{0,1})[a-zA-Z0-9]{1,})*"+"@"+"[a-zA-Z0-9]{1,}"
	               +"((\\.|\\_|-{0,1})[a-zA-Z0-9]{1,})*"+"\\.[a-zA-Z]{2,}$")
	@Column
	private String email;

	public User() {
	}

	public User(int id, @Size(min = 3, max = 14, message = "The input is not correct!") String login,
			@Size(min = 2, max = 14, message = "The input is not correct!") String password,
			@Email(regexp = "^[a-zA-Z0-9]{1,}((\\.|\\_|-{0,1})[a-zA-Z0-9]{1,})*@[a-zA-Z0-9]{1,}((\\.|\\_|-{0,1})[a-zA-Z0-9]{1,})*\\.[a-zA-Z]{2,}$") String email) {
		this.id = id;
		this.login = login;
		this.password = password;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\nUser"
	+"\nidUser:" + this.id + ";  " 
				+ "\nlogin:" + login + ";  " 
	+ "\npassword:" + password + ";  "
	            + "\nemail:" + email +"; ";
	}


}
