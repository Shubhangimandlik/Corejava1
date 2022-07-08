

	import  java.sql.*;
	import java.io.*;
	public class menuRecord {

		public static void main(String[] args)throws SQLException,ClassNotFoundException, IOException
		  {
			int ch,roll,marks,k;
			String name,sql;
			Statement stmt;
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver Reg");
			Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
			System.out.println("Conn success");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
		do
			{
				System.out.println("MENU");
				System.out.println("1.Insert\n2.Update\n3.Delete\n4:Display \n5:Search\n6:Exit");
				System.out.print("Enter ur choice");
				ch=Integer.parseInt(br.readLine());//String to integer 
				switch(ch)
				{
				case 1:
			stmt=cn.createStatement();
				System.out.print("Enter rollno ");
				roll=Integer.parseInt(br.readLine());
				System.out.print("Enter name ");
				name=br.readLine();
				System.out.print("Enter marks ");
				marks=Integer.parseInt(br.readLine());
				sql="Insert into student_info values("+roll+", '" +name +"'," +marks+")";
				           k=stmt.executeUpdate(sql);
					if(k>0)
						{
				System.out.println("Record inserted");
						}
						else
						{
				System.out.println("Error");
						}

				stmt.close();
				break;
		case 2:
				stmt=cn.createStatement();
				System.out.print("Enter rollno ");
				roll=Integer.parseInt(br.readLine());
				System.out.print("Enter name ");
				name=br.readLine();
				System.out.print("Enter marks ");
				marks=Integer.parseInt(br.readLine());
		sql="update student_info set name='" +name+"', per=" +marks+" where rollno="+roll+" ";
				           k=stmt.executeUpdate(sql);
				if(k>0)
					System.out.println("Record updated");
				else
					System.out.println("Check rollno");
				stmt.close();
				break;
				case 3:
				stmt=cn.createStatement();
				System.out.print("Enter rollno ");
				roll=Integer.parseInt(br.readLine());
				
		sql="delete from student_info where rollno="+roll+"  ";
				           k=stmt.executeUpdate(sql);
				if(k>0)
					System.out.println("Record delete");
				else
					System.out.println("Check rollno");
				stmt.close();
				break;

		case 4 :
			stmt=cn.createStatement();
				sql="Select * from student_info";
				ResultSet res=stmt.executeQuery(sql);
				while(res.next())
				         {
					System.out.println(res.getInt("roll")+"\t"+res.getString(2)+"\t"+res.getInt(3));
				          }
		break;

				case 5 :
			stmt=cn.createStatement();
					System.out.print("Enter rollno ");
				roll=Integer.parseInt(br.readLine());
				sql="Select * from student_info where roll="+roll+"";
				ResultSet res1=stmt.executeQuery(sql);
				while(res1.next())
				         {
					System.out.println(res1.getInt(1)+"\t"+res1.getString(2)+"\t"+res1.getInt(3));
				          }
		break;
				case 6:System.exit(0);
		default :System.out.println("Invalid choice");

		          }
		}while(ch<=6);
		    }
	}


