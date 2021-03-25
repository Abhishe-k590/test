

package com.crm.vtiger.genericutility;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilities 
{
	/**
	 * Used to get data from fixed sheet
	 * @param sheetName
	 * @param rownum
	 * @param colnum
	 * @return
	 * @throws Throwable
	 */
public String getExceldata(String sheetName,int rownum,int colnum) throws Throwable
{
	FileInputStream fis=new FileInputStream(PathConstants.excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetName);
	Row R = sh.getRow(rownum);
	Cell c = R.getCell(colnum);
	String value = c.getStringCellValue();
	wb.close();
	return value;
}
public int getRowCount(String sheetName) throws Throwable
{
	FileInputStream fis=new FileInputStream(PathConstants.excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetName);
	int lastRownu = sh.getLastRowNum();
	return lastRownu;
}
public void setExceldata(String sheetName,int rownum,int colnum,String data) throws Throwable
{
	FileInputStream fis=new FileInputStream(PathConstants.excelpath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet(sheetName);
	Row R = sh.getRow(rownum);
	Cell c = R.createCell(colnum);
	c.setCellFormula(data);
	FileOutputStream fou=new FileOutputStream(PathConstants.excelpath);
	wb.write(fou);
	wb.close();
}

}
