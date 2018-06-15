package ReusableClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;



public class Database_Testing_for_Cucumber {
	
	
public static String a[][];
public static int k;
public static int m;
		
		
		
public static void Delete_From_Inprogress() throws Exception {
			
			
			Connection conn = null;
			 a=new String[200][100];
				
			
	       try {
	        	for (int i=1;i<=1;i++)
				{
	 
	    String dbURL = "jdbc:sqlserver://WINSS251352-GPY\\SQLFULL:1433;databaseName=CTSOUTWARD_Canara_Delhi";
	      String user = "sa";
 String pass = "Ncr1234$";
		 conn = DriverManager.getConnection(dbURL, user, pass);
	            if (conn != null) {
	            	
	                Statement statement = conn.createStatement();
	               
	              //  String queryString = "select * from phydocumenttbl";
	                //ResultSet rs = statement.executeQuery(queryString);
	                
	                String queryString1 ="select * from BankBranchRoutingTbl";
	                System.out.println("query is"+queryString1);
	                Thread.sleep(3000);
	                
	                ResultSet rs1 = statement.executeQuery(queryString1);
	                
	              
	              // System.out.println("size of a is "+a);
	            
	                while (rs1.next()) {
	                    System.out.println(rs1.getString(i));
	                    System.out.println("current value of i is"+i);
	                 
	                }
	              
	                
				}
	       
	        	   
	       
	                
				}
	       }
				
	                catch (SQLException ex) {
	            ex.printStackTrace();
	        } 
	        finally {
	            try {
	                if (conn != null && !conn.isClosed()) {
	                    conn.close();
	                }
	            } catch (SQLException ex) {
	                ex.printStackTrace();
	            }
	        }
	       
	  }



	/*public static void Validating_Data_From_Database_working() throws Exception {
	
	
	Connection conn = null;
	 a=new String[200][100];
		
	
   try {
    	

String dbURL = "jdbc:sqlserver://WINSS251352-GPY\\SQLFULL:1433;databaseName=SPDC_LIVE";
  String user = "sa";
String pass = "Ncr1234$";
 conn = DriverManager.getConnection(dbURL, user, pass);
 for (int i=1;i<=6;i++)
	{
        if (conn != null) {
        	
            Statement statement = conn.createStatement();
           
          //  String queryString = "select * from phydocumenttbl";
            //ResultSet rs = statement.executeQuery(queryString);
            
            String queryString1 = PDC_Inward_Excel_Utility.getCellValue("Data Verification",i,1);
           System.out.println("query is "+queryString1); 
            ResultSet rs1 = statement.executeQuery(queryString1);
            
          
         	   
         String Expected_Status=PDC_Inward_Excel_Utility.getCellValue("Data Verification",i,0);

          String parts[]=Expected_Status.split("@");
          System.out.println(parts[0]);
          System.out.println(parts[1]);
          System.out.println(parts[2]);
          System.out.println(parts[3]);
          System.out.println(parts[4]);
          System.out.println(parts[5]);
          // System.out.println("size of a is "+a);
          String chqno =null; 
          String sortcode = null;
          String amount =null; 
          String tc = null;
          String accountno =null; 
          String agreementno = null;
          
          while (rs1.next()) {
        	  if(i==1)
        	  {
        		   System.out.println(rs1.getString(i));
                   System.out.println("current value of i is"+i);
                   String d=rs1.getString(i);
                   System.out.println("value of d is"+d);
                    chqno = rs1.getString(i);
              
                    System.out.println("value of cheque no is"+chqno);
                    sortcode = rs1.getString (i+1);
                    System.out.println("value of sortcode no is"+sortcode);
                    amount = rs1.getString (i+2);
                    System.out.println("value of amount no is"+amount);
                    tc = rs1.getString (i+3);
                    
                    System.out.println("value of tc  is"+tc);
                    accountno = rs1.getString (i+4);
                    System.out.println("value of accountno  is"+accountno);
                    agreementno = rs1.getString (i+5);
                    System.out.println("value of agreementno  is"+agreementno);
                  // a[0][i-1]=d;
                   System.out.println("the value of d is"+d);
                	Assert.assertEquals(parts[0], chqno);
               	Assert.assertEquals(parts[1], sortcode);
               	Assert.assertEquals(parts[2], amount);
               	Assert.assertEquals(parts[3], tc);
               	Assert.assertEquals(parts[4], accountno);
               	Assert.assertEquals(parts[5], agreementno);
        		  
        	  }
        	  if(i==2)
        	  {
        		   System.out.println(rs1.getString(i));
                   System.out.println("current value of i is"+i);
                   String d=rs1.getString(i-1);
                   System.out.println("value of d is"+d);
                    chqno = rs1.getString(i-1);
              
                    System.out.println("value of cheque no is"+chqno);
                    sortcode = rs1.getString (i);
                    System.out.println("value of sortcode no is"+sortcode);
                    amount = rs1.getString (i+1);
                    System.out.println("value of amount no is"+amount);
                    tc = rs1.getString (i+2);
                    
                    System.out.println("value of tc  is"+tc);
                    accountno = rs1.getString (i+3);
                    System.out.println("value of accountno  is"+accountno);
                    agreementno = rs1.getString (i+4);
                    System.out.println("value of agreementno  is"+agreementno);
                  // a[0][i-1]=d;
                   System.out.println("the value of d is"+d);
                	Assert.assertEquals(parts[0], chqno);
               	Assert.assertEquals(parts[1], sortcode);
               	Assert.assertEquals(parts[2], amount);
               	Assert.assertEquals(parts[3], tc);
               	Assert.assertEquals(parts[4], accountno);
               	Assert.assertEquals(parts[5], agreementno);
        		  
        	  }
        	  if(i==3)
        	  {
        		   System.out.println(rs1.getString(i));
                   System.out.println("current value of i is"+i);
                   String d=rs1.getString(i-2);
                   System.out.println("value of d is"+d);
                    chqno = rs1.getString(i-2);
              
                    System.out.println("value of cheque no is"+chqno);
                    sortcode = rs1.getString (i-1);
                    System.out.println("value of sortcode no is"+sortcode);
                    amount = rs1.getString (i);
                    System.out.println("value of amount no is"+amount);
                    tc = rs1.getString (i+1);
                    
                    System.out.println("value of tc  is"+tc);
                    accountno = rs1.getString (i+2);
                    System.out.println("value of accountno  is"+accountno);
                    agreementno = rs1.getString (i+3);
                    System.out.println("value of agreementno  is"+agreementno);
                  // a[0][i-1]=d;
                   System.out.println("the value of d is"+d);
                	Assert.assertEquals(parts[0], chqno);
               	Assert.assertEquals(parts[1], sortcode);
               	Assert.assertEquals(parts[2], amount);
               	Assert.assertEquals(parts[3], tc);
               	Assert.assertEquals(parts[4], accountno);
               	Assert.assertEquals(parts[5], agreementno);
        		  
        	  }
        	  
        	  if(i==4)
        	  {
        		   System.out.println(rs1.getString(i));
                   System.out.println("current value of i is"+i);
                   String d=rs1.getString(i-3);
                   System.out.println("value of d is"+d);
                    chqno = rs1.getString(i-3);
              
                    System.out.println("value of cheque no is"+chqno);
                    sortcode = rs1.getString (i-2);
                    System.out.println("value of sortcode no is"+sortcode);
                    amount = rs1.getString (i-1);
                    System.out.println("value of amount no is"+amount);
                    tc = rs1.getString (i);
                    
                    System.out.println("value of tc  is"+tc);
                    accountno = rs1.getString (i+1);
                    System.out.println("value of accountno  is"+accountno);
                    agreementno = rs1.getString (i+2);
                    System.out.println("value of agreementno  is"+agreementno);
                  // a[0][i-1]=d;
                   System.out.println("the value of d is"+d);
                	Assert.assertEquals(parts[0], chqno);
               	Assert.assertEquals(parts[1], sortcode);
               	Assert.assertEquals(parts[2], amount);
               	Assert.assertEquals(parts[3], tc);
               	Assert.assertEquals(parts[4], accountno);
               	Assert.assertEquals(parts[5], agreementno);
        		  
        	  }
        	  
        	  if(i==5)
        	  {
        		   System.out.println(rs1.getString(i));
                   System.out.println("current value of i is"+i);
                   String d=rs1.getString(i-4);
                   System.out.println("value of d is"+d);
                    chqno = rs1.getString(i-4);
              
                    System.out.println("value of cheque no is"+chqno);
                    sortcode = rs1.getString (i-3);
                    System.out.println("value of sortcode no is"+sortcode);
                    amount = rs1.getString (i-2);
                    System.out.println("value of amount no is"+amount);
                    tc = rs1.getString (i-1);
                    
                    System.out.println("value of tc  is"+tc);
                    accountno = rs1.getString (i);
                    System.out.println("value of accountno  is"+accountno);
                    agreementno = rs1.getString (i+1);
                    System.out.println("value of agreementno  is"+agreementno);
                  // a[0][i-1]=d;
                   System.out.println("the value of d is"+d);
                	Assert.assertEquals(parts[0], chqno);
               	Assert.assertEquals(parts[1], sortcode);
               	Assert.assertEquals(parts[2], amount);
               	Assert.assertEquals(parts[3], tc);
               	Assert.assertEquals(parts[4], accountno);
               	Assert.assertEquals(parts[5], agreementno);
        		  
        	  }
        	  
        	
        	  if(i==6)
        	  {
        		   System.out.println(rs1.getString(i));
                   System.out.println("current value of i is"+i);
                   String d=rs1.getString(i-5);
                   System.out.println("value of d is"+d);
                    chqno = rs1.getString(i-5);
              
                    System.out.println("value of cheque no is"+chqno);
                    sortcode = rs1.getString (i-4);
                    System.out.println("value of sortcode no is"+sortcode);
                    amount = rs1.getString (i-3);
                    System.out.println("value of amount no is"+amount);
                    tc = rs1.getString (i-2);
                    
                    System.out.println("value of tc  is"+tc);
                    accountno = rs1.getString (i-1);
                    System.out.println("value of accountno  is"+accountno);
                    agreementno = rs1.getString (i);
                    System.out.println("value of agreementno  is"+agreementno);
                  // a[0][i-1]=d;
                   System.out.println("the value of d is"+d);
                	Assert.assertEquals(parts[0], chqno);
               	Assert.assertEquals(parts[1], sortcode);
               	Assert.assertEquals(parts[2], amount);
               	Assert.assertEquals(parts[3], tc);
               	Assert.assertEquals(parts[4], accountno);
               	Assert.assertEquals(parts[5], agreementno);
        		  
        	  }
        	  
        	  
             
            }
           
            	
        }
        }}catch (SQLException ex) {
        ex.printStackTrace();
    } 
    finally {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
   
	}
*/}


