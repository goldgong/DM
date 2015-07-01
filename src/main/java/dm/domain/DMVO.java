package dm.domain;

public class DMVO {

	private String memberUid; 
	public String getMemberUid() {
		return memberUid;
	}
	public void setMemberUid(String memberUid) {
		this.memberUid = memberUid;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String nickName;
	private String passwd;
	private String email;
}
