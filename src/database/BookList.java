package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookList {
   Connection con;
   
   public BookList() {
      String Driver="";
      String url="jdbc:oracle:thin:@localhost:1521:xe";
      String userid="scott";
      String pwd="tiger";
      
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         System.out.println("����̹� �ε� ����");
      }catch(ClassNotFoundException e) {
         e.printStackTrace();
      }
      
      try {
         System.out.println("�����ͺ��̽� ���� �غ� ...");
         con=DriverManager.getConnection(url,userid,pwd);
         System.out.println("�����ͺ��̽� ���� ����");
      }catch(SQLException e) {
         e.printStackTrace();
      }
   }
   
   
   private void sqlRun() {
      String query = "SELECT *FROM Book";
      try {
         Statement stmt=con.createStatement();
         ResultSet rs = stmt.executeQuery(query);
         System.out.println("BOOK NO \tBOOK NAME \t\tPUBLISHER \tPRICE");
         while(rs.next()) {
            System.out.print(rs.getInt(1));
            System.out.print("\t\t"+rs.getString(2));
            System.out.print("\t\t\t"+rs.getString(3));
            System.out.println("\t\t"+rs.getInt(4));
         }
         
         con.close();
      }catch(SQLException e) {
         e.printStackTrace();
      }
            
   }
   
   public static void main(String[] args) {
      BookList so = new BookList();
      so.sqlRun();
   }
   
}
