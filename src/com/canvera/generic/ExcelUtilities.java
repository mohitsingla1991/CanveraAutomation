package com.canvera.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelUtilities 
{
   public static String filepath="./testData/testCanvera.xlsx";
   
   public static String readData(String sheetName, int rowNum, int cellNum)   
   {   
	   String data="";
	   try
	   {
		   Workbook wb=WorkbookFactory.create(new FileInputStream(new File(filepath)));
		   data=wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();   
	   }
	   
	   catch(FileNotFoundException e)
	   {
		   e.printStackTrace();
	   }
	   
	   catch(InvalidFormatException e)
	   {
		   e.printStackTrace();
	   }
       catch(IOException e)
	   {
    	  e.printStackTrace();
	   }
	   
	   catch(EncryptedDocumentException e)
	   {
		  e.printStackTrace(); 
	   }
	   
	   return data;
   }
}
