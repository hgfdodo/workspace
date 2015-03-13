package utils;

import java.util.ResourceBundle;

/**
 * @Project: CyberSpeedTest_ivce
 * @Author: Guangfu He
 * @Date: 2015-3-11
 * @Copyright: 2015 cyber Inc. All rights reserved.
 */

public class PropertiesUtils {
	
	private ResourceBundle properties;
	
	public PropertiesUtils(String propertyFileName) {
		properties = ResourceBundle.getBundle(propertyFileName);
	}
	
	//get property value through property file keys
	public String getProperty(String key){
		return this.properties.getString(key);
	}

}
