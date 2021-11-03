package demo.actiTime.GenericUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
/**
 * This utility returns the property file data as per the key provided
 * @author QSP
 *
 */
public class PropertyUtils {
	public String getPropertyData(String filePath,String key){
		FileInputStream file;
		try {
			file = new FileInputStream(filePath);
			Properties properties = new Properties();
			properties.load(file);
			return properties.getProperty(key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
	}

}
