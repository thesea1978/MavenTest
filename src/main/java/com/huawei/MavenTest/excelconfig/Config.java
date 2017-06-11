package com.huawei.MavenTest.excelconfig;

import java.util.HashMap;
import java.util.Map;

public class Config {

	private Map<String, EnvNode> mapEnvInfo;
	private Map<String, CommonConfigItem> mapCommonConfig;
	
	public Config() {
		String ConfgFilePath = "J:\\workspace\\testng\\MavenTest\\src\\main\\java\\com\\huawei\\MavenTest\\Config\\Config.xlsx";
		
		this.mapCommonConfig = new HashMap<String, CommonConfigItem>();
		this.mapEnvInfo = new HashMap<String, EnvNode>();
	}
	
	public Config(String ConfgFilePath) {
	}

	public void setCommonConfig(Map<String, CommonConfigItem> mapCommonConfig) {
		this.mapCommonConfig = mapCommonConfig;
	}
	
	public String getCommonConfigItem(String key) {
		
		CommonConfigItem commonCfgItem = mapCommonConfig.get(key);
		if (null == commonCfgItem) {
			return "null";
		}
		
		if (!commonCfgItem.isEmpty()) {
			return commonCfgItem.getValue();
		} else {
			return commonCfgItem.getDefaultValue();
		}
		
	}
	
	public void setCommonConfigItem(String key, CommonConfigItem commonConfigItem) {
		this.mapCommonConfig.put(key, commonConfigItem);
	}
	
	public String getEnvInfoItem(String nodeName, String key) {
		EnvNode curEnvNode = mapEnvInfo.get(nodeName);
		return curEnvNode.getValueByKey(key);
	}
	
	public EnvNode getEnvInfo(String nodeName) {
		return mapEnvInfo.get(nodeName);
	}

	public void setEnvInfo(String nodeName, EnvNode envNode) {
		mapEnvInfo.put(nodeName, envNode);
	}
	
}
