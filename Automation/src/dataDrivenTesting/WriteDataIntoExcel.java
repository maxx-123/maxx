package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcel {
		public static void main(String[] args) throws IOException {
			FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			wb.getSheet("create customer").getRow(1).getCell(4).setCellValue ("Darshan@devil.com");
			FileOutPutStream fos=new FileOutPutStream("./data/testscript.xlsx") ;
			wb.write(fos);
		}

}
