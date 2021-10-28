package com.ApertaWebApp_Automate.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		
		File src = new File("./Configuration/config.properties");
		
		try {
			
			FileInputStream inf = new FileInputStream(src);
			pro = new Properties();
			pro.load(inf);
			
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
		
	}
	
	public String getApplicationURL() {
		
		String url=pro.getProperty("baseURL");
		return url;
		
	}

    public String getusername() {
		
		String username=pro.getProperty("username");
		return username;
		
	}
    
    public String getpassword() {
    	
    	String password=pro.getProperty("password");
		return password;
		
	}
    
    public String getWpassword() {
    	
    	String Wpassword=pro.getProperty("Wpassword");
		return Wpassword;
		
	}
    
    public String getwrongmsg() {
    	
    	String wrongmsg=pro.getProperty("wrongmsg");
		return wrongmsg;
		
	}
    
    public String getdetitle() {
    	
    	String detitle=pro.getProperty("detitle");
		return detitle;
		
	}
    
    public String getaptitle() {
    	
    	String aptitle=pro.getProperty("aptitle");
		return aptitle;
		
	}
    
    public String getdcbtitle() {
    	
    	String dcbtitle=pro.getProperty("dcbtitle");
		return dcbtitle;
		
	}
    
    public String getChromepath() {
    	
    	String Chromepath=pro.getProperty("Chromepath");
		return Chromepath;
		
	}
    
    public String getiepath() {
    	
    	String iepath=pro.getProperty("iepath");
		return iepath;
		
	}
    
    public Date date() {
    	
    	//String date=pro.getProperty("date");
		return date();
		
	}
    
public String getbaltitle() {
    	
    	String baltitle=pro.getProperty("baltitle");
		return baltitle;
		
	}
public String getsuptitle() {
	
	String suptitle=pro.getProperty("suptitle");
	return suptitle;
	
}
}
