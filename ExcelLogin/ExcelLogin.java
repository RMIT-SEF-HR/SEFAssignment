

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;
import java.util.*;
import Approval.Request;
import Approval.Approval;



public class ExcelLogin {

	public static void main(String[] args) {
        String ExcelFile = "C:\\Users\\Hamad\\Desktop\\ExcelLogin\\ExcelLogin\\login.xls";
        System.out.println("This program is a login screen that checks against an excel file ("+ExcelFile+") if the username and password are correct\n");
        
        System.out.print("Enter your username: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("Your username is " + username);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        boolean MatchedPassword = false;
        boolean MatchedUser = false;
        
        try {			
            FileInputStream file = new FileInputStream(new File(ExcelFile));
            
            //Get the workbook instance for XLS file 
            HSSFWorkbook workbook = new HSSFWorkbook(file);

            //Get first sheet from the workbook
            HSSFSheet sheet = workbook.getSheetAt(0);
            
            //Iterate through each rows from first sheet
            Iterator<Row> rowIterator = sheet.iterator();
            while(rowIterator.hasNext()  && !MatchedPassword && !MatchedUser) {
              Row row = rowIterator.next();
              
              //For each row, iterate through each columns
              Iterator<Cell> cellIterator = row.cellIterator();
              int i = 0;
              MatchedUser = false;
              while(cellIterator.hasNext()) {
                
                Cell cell = cellIterator.next();
                String cellValue = "";
                switch(cell.getCellType()) {
                  case Cell.CELL_TYPE_STRING:
                    cellValue = cell.getStringCellValue();
                    i ++;
                    break;                    
                }
                if (i == 1 && username.equals(cellValue) ) MatchedUser = true;
                if (i == 2 && MatchedUser && password.equals(cellValue) ) MatchedPassword = true;
              }
            }
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }   
        if (MatchedPassword) System.out.println("Username and Password matched.");
        else if (MatchedUser) System.out.println("Password incorrect.");
        else System.out.println("Username not matched.");
        
        Request a_request = new Request(0, "a job request");
        Approval an_approval = new Approval(a_request);
        System.out.println("job request status is: " + an_approval.getState() );
        an_approval.Assess_Approval_state();
        System.out.println("  After assessment, job request status is: " + an_approval.getState() );
	}

}

