package my;
import java.sql.*;
public class JDBCExample2 {
	 public static void main(String args[]) { 
 		//1단계 DB연결을 위한 커넥션 인터페이스
		 Connection conn = null;
		 //Statement 인터페이스
		 Statement stmt = null;
		 // Resultset 인터페이스 -SQL결과를저장
		 ResultSet rs = null;
		 //try~catch문에서 DB연결중에 예외가 발생하는지 검사
         try { 
        	 //2단계:JDBC드라이버를 로드한다
             Class.forName("com.mysql.jdbc.Driver"); 
            //3단계:드라이버매니져 클래스는 get~메소드로 DB연결한다
             conn = DriverManager.getConnection( 
               "jdbc:mysql://localhost:3307/mysql", "root", "12345"); 
             System.out.println("데이터베이스에 접속했습니다."); 
          //커넥션 객체가 Statement 객체를 생성
            stmt = conn.createStatement();
            //DHL SQL쿼리실행후 결과를 저장
            rs = stmt.executeQuery("select jumincd, pname, gender, age from person");
            
            System.out.println("주민번호      이름           성별        나이"); 
             while(rs.next()) {
            	 
            	 String jumincd = rs.getString(1);
            	 String pname = rs.getString(2);
            	 String gender = rs.getString(3);
            	 int age = rs.getInt(4);
            	 
            	 System.out.println(jumincd + "---" + pname +"----" +  gender + "-----"+ age);
             }
           //4단계 : DB연결을 종료한다.
            conn.close(); 
         }
         
        catch (ClassNotFoundException cnfe) { 
            System.out.println("해당 클래스를 찾을 수 없습니다." +  
                              cnfe.getMessage()); 
        }
         catch (SQLException se) { 
             System.out.println(se.getMessage()); 
        } 
     } 
 } 