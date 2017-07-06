package com.huawei.MavenTest.excelconfig;

public class CommonConfigItem {

	private String key;
	private String value;
	private String defaultValue;
	
	public CommonConfigItem() {
		this.key = "";
		this.value = "";
		this.defaultValue = "";
	}
	
	public CommonConfigItem(String key, String value) {
		this.key = key;
		this.value = value;
		this.defaultValue = "";
	}
	
	public CommonConfigItem(String key, String value, String defaultValue) {
		this.key = key;
		this.value = value;
		this.defaultValue = defaultValue;
	}
	
	public Boolean isEmpty() {
		return this.value.isEmpty();
	}
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
}
