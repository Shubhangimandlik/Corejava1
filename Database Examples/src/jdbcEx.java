

	import java.sql.*;//1
	import java .util.*;
	public class jdbcEx 
	{

		public static void main(String[] args) throws SQLException,ClassNotFoundException//2
		{
			int id;
			String name;
			Double per;
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter id,name and per ");
			id=sc.nextInt();
			name=sc.next();
			per=sc.nextDouble();
			Class.forName("com.mysql.jdbc.Driver"); //3
		System.out.println("Driver reg");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","");//4
		System.out.println(" conn secuss");
		String s1="insert into student values("+id+",'"+name+"',"+per+")";
		Statement stmt=con.createStatement(); //5 
		int i=stmt.executeUpdate(s1);//6
		if(i>0)
			System.out.println("Save successfully");
		else
			System.out.println("Save Unsuccessfully");
		con.close();

		}

	}

