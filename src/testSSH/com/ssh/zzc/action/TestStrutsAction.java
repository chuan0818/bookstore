package com.ssh.zzc.action;

public class TestStrutsAction {
	
	private String username;
	private String password;
	
	//≤‚ ‘struts
	public String testStruts(){
		System.out.println("action÷¥–– struts≤‚ ‘≥…π¶");
		if("zzc".equals(username) && "zzc".equals(password)){
			return "success";
		}
		return "fail";
	}
	
	//≤‚ ‘struts+hibernate
	public String testHibernate(){
		return null;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
}
