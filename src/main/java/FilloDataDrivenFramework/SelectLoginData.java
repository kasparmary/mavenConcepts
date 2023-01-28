package FilloDataDrivenFramework;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class SelectLoginData {

	public static void main(String[] args) throws FilloException {
		// TODO Auto-generated method stub
		Fillo fillo = new Fillo();
		Connection connection = fillo.getConnection("/home/kaspar/eclipse-workspace/MavanSamples/src/main/resources/UserData.xls");
		String strQuery = "select * from LoginData";
		Recordset rs = connection.executeQuery(strQuery);
		while(rs.next()) {
			System.out.println(rs.getField("Username") + "----" + rs.getField("Password"));
				
		}
		//Total rows
		System.out.println(rs.getCount());
		rs.close();
		connection.close();
	}

}

