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
		if (key == "IP") {
			value = getIp();
		} else if (key == "USERNAME") {
			value = getUsernmae();
		} else if (key == "PASSWORD") {
			value = getPassword();
		} else if (key == "ROOTPASS") {
			value = getRootpass();
		} else if (key == "URL") {
			value = getUrl();
		} else if (key == "SSHPORT") {
			value = Integer.toString(getSshPort());
		} else if (key == "SFTPPORT") {
			value = Integer.toString(getSftpPort());
		} else {
			System.out.println("invalid env info item: " + key);
		}
		
		return value;
		
	}
}
