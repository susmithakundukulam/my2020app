package com.my2020app.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.util.Properties;

import org.springframework.stereotype.Service;

@Service
public class CommonUtils {

public  Properties getPropertyFile(String fileName) {
		
		Properties props 		= 	new Properties();
		InputStream inputStream	=	null;
		try {
			String path 		= 	this.getClass().getClassLoader().getResource("").getPath();
			String fullPath 	= 	URLDecoder.decode(path, "UTF-8");
			String pathArr[] 	= 	fullPath.split("/WEB-INF/classes/");
			fullPath 			= 	pathArr[0];
			String filepath 	= 	new File(fullPath).getPath() + File.separatorChar +"WEB-INF"+ File.separatorChar+
									"resources"+ File.separatorChar +fileName+".properties";
			inputStream 		= 	new FileInputStream(new File(filepath));
			props.load(inputStream);
		} catch (IOException  e) {
			e.printStackTrace(); 
			
		}finally{
			if(inputStream!=null)
				try {
				inputStream.close();
				}catch(Exception e){}
		}
		return props;
	}
}
