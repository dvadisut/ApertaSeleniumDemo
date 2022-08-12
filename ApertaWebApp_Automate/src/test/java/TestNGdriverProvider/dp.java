package TestNGdriverProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class dp {

	String[][] data=null;
	@DataProvider(name="logindata")
	public String [][] method2() throws BiffException, IOException {
		
		data=getexceldata();
		return data;
	}
	
	
	public String[][] getexceldata() throws BiffException, IOException {
		
		FileInputStream ex=new FileInputStream("D:\\java-2021-06\\Book.xls");
		
		Workbook wb=Workbook.getWorkbook(ex);
		
		Sheet sh=wb.getSheet(0);
		
		int row=sh.getRows();
		int column=sh.getColumns();
		String testdata[][]= new String[row-1][column];
		
		for(int i=1;i<row;i++) {
			for(int j=0;j<column;j++) {
				
				testdata[i-1][j]=sh.getCell(j,i).getContents();
				
			}
			
		}
		return testdata;
	}
}
