package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

public static List<Object[]>getTestdata(String filepath,String sheetname) throws IOException{
	FileInputStream fis=new FileInputStream(filepath);
	Workbook workbook=new XSSFWorkbook(sheetname);

	return null;

}


}
