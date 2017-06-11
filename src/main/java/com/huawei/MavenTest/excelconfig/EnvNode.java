package com.huawei.MavenTest.excelconfig;

public class EnvNode {
	
	private String nodeName;
	private String ip;
	private String usernmae;
	private String password;
	private String rootpass;
	private String url;
	private int sftpPort;
	private int sshPort;
	
	public String getNodeName() {
		return nodeName;
	}
	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getUsernmae() {
		return usernmae;
	}
	public void setUsernmae(String usernmae) {
		this.usernmae = usernmae;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRootpass() {
		return rootpass;
	}
	public void setRootpass(String rootpass) {
		this.rootpass = rootpass;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getSftpPort() {
		return sftpPort;
	}
	public void setSftpPort(int sftpPort) {
		this.sftpPort = sftpPort;
	}
	public int getSshPort() {
		return sshPort;
	}
	public void setSshPort(int sshPort) {
		this.sshPort = sshPort;
	}
	
	public String getValueByKey(String key) {
		
		String value = "";
		switch (key) {
		case "IP":
			value = getIp();
			break;
		case "USERNAME":
			value = getUsernmae();
			break;
		case "PASSWORD":
			value = getPassword();
			break;
		case "ROOTPASS":
			value = getRootpass();
			break;
		case "URL":
			value = getUrl();
			break;
		case "SSHPORT":
			value = Integer.toString(getSshPort());
			break;
		case "SFTPPORT":
			value = Integer.toString(getSftpPort());
			break;
		default:
			System.out.println("invalid env info item: " + key);
			break;
		}
		
		return value;
		
	}
}
