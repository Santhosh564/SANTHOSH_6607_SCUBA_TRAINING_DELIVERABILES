package com.test.KDL;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadData {
	
	    
	    public Sheet readExcel(String filePath,String fileName,String sheetName) throws IOException{
	    System.out.println("+++ The file path +++" +filePath);
	    File file = new File(filePath+"\\"+fileName);
	    System.out.println("+++ The file path +++" +file);
	    FileInputStream inputStream = new FileInputStream(file);
	    Workbook guru99Workbook = null;
	    String fileExtensionName = fileName.substring(fileName.indexOf("."));
	    if(fileExtensionName.equals(".xlsx")){
	    guru99Workbook = new XSSFWorkbook(inputStream);
	    }
	    else if(fileExtensionName.equals(".xls")){
	        guru99Workbook = new HSSFWorkbook(inputStream);
	    }
	    Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);
	     return guru99Sheet;    
	    }
	}
	