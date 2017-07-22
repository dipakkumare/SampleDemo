package generic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashSet;
//import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public abstract class BaseClass {
	public String setPath(String path){
		
		String currentDirectoryPath = System.getProperty("user.dir");
		currentDirectoryPath = currentDirectoryPath + path;
		return currentDirectoryPath;
	}
	/* public void readExcel(String fileName){
		 
		 File datafile - new File(this.setPath("\\src\\test\\java\\datasheet\\" +fileName));
		 fileInputStream fis;
		
		
	} */
	
	
	 public void writeExcel(String fileName, LinkedHashSet<String> lhs){
	
		 
		 File datafile= new File(this.setPath("\\src\\test\\java\\datasheet\\" +fileName));
		 
		 XSSFWorkbook workbook= new XSSFWorkbook();
		 XSSFSheet sheet=workbook.createSheet();   //getsheet
		
		 int i=0;
		 for(String value : lhs){
		 XSSFRow  row=sheet.createRow(i); //getrow
		 XSSFCell cell=row.createCell(0);//getcell
		 cell.setCellValue(value); //getcellvalue
		 i++;
		 
		 }
		 try {
			FileOutputStream fos= new FileOutputStream(datafile);
			  workbook.write(fos); //read
			  workbook.close();
			  
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
			 
		 
		 }
		 
	 }

