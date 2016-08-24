package br.com.unipejet.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotEmpty;

import br.com.unipejet.entity.UserProfile;

@Entity
@Table(name = "user")
public class User implements Serializable{
	static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@NotEmpty
	@Column(name="login", unique=true, nullable=false)
	private String login;

	@NotEmpty
	@Column(name="password", nullable=false)
	private String password;

	@NotEmpty
	@Column(name="name", nullable=false)
	private String name;

	@Column(name="cpf")
	private String cpf;

	@Column(name="rg")
	private String rg;

	@NotEmpty
	@Column(name="date_birth", nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date date_birth;

	@NotEmpty
	@Column(name="miles_card", nullable=false)
	private Integer miles_card;

	@NotEmpty
	@Column(name="email", nullable=false)
	private String email;

	@NotEmpty
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "user_user_profile", 
             joinColumns = { @JoinColumn(name = "user_id") }, 
             inverseJoinColumns = { @JoinColumn(name = "user_profile_id") })
	private Set<UserProfile> userProfiles = new HashSet<UserProfile>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDate_birth() {
		return date_birth;
	}

	public void setDate_birth(Date date_birth) {
		this.date_birth = date_birth;
	}

	public Integer getMiles_card() {
		return miles_card;
	}

	public void setMiles_card(Integer miles_card) {
		this.miles_card = miles_card;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<UserProfile> getUserProfiles() {
		return userProfiles;
	}

	public void setUserProfiles(Set<UserProfile> userProfiles) {
		this.userProfiles = userProfiles;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		User user = (User) o;

		if (id != null ? !id.equals(user.id) : user.id != null) return false;
		if (login != null ? !login.equals(user.login) : user.login != null) return false;
		if (password != null ? !password.equals(user.password) : user.password != null) return false;
		if (name != null ? !name.equals(user.name) : user.name != null) return false;
		if (cpf != null ? !cpf.equals(user.cpf) : user.cpf != null) return false;
		if (rg != null ? !rg.equals(user.rg) : user.rg != null) return false;
		if (date_birth != null ? !date_birth.equals(user.date_birth) : user.date_birth != null) return false;
		if (miles_card != null ? !miles_card.equals(user.miles_card) : user.miles_card != null) return false;
		if (email != null ? !email.equals(user.email) : user.email != null) return false;
		return userProfiles != null ? userProfiles.equals(user.userProfiles) : user.userProfiles == null;

	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (login != null ? login.hashCode() : 0);
		result = 31 * result + (password != null ? password.hashCode() : 0);
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (cpf != null ? cpf.hashCode() : 0);
		result = 31 * result + (rg != null ? rg.hashCode() : 0);
		result = 31 * result + (date_birth != null ? date_birth.hashCode() : 0);
		result = 31 * result + (miles_card != null ? miles_card.hashCode() : 0);
		result = 31 * result + (email != null ? email.hashCode() : 0);
		result = 31 * result + (userProfiles != null ? userProfiles.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "User{" +
				"login='" + login + '\'' +
				", id=" + id +
				", name='" + name + '\'' +
				", cpf='" + cpf + '\'' +
				'}';
	}
}
