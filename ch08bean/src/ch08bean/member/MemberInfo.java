package ch08bean.member;

import java.util.Date;

/**
 * 회원 정보를 저장하는 객체
 * 아이디, 비밀번호, 이름, 등록일, 이메일
 */

public class MemberInfo {
	private String id, password, name;
	private Date registerDate;
	private String email;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNickName() {return name+" 짱!";}
	
	@Override
	public String toString() {
		return "MemberInfo [id=" + id + ", password=" + password + ", name=" + name + ", registerDate=" + registerDate
				+ ", email=" + email + "]";
	}
	
	
}
