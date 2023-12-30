package LookupDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import DBconnector.DBConnector;
import SQLStrings.SQLString;

public class LookupDaoImpl implements LookupDao{

	public List<String> getAllUserNameFromDB() {
		List<String> userNameList = new ArrayList<String>();
		try {
			String userNameQuery = SQLString.GET_USERNAME_STRING;
	        Connection connection = DBConnector.getNewConnection();
	        assert connection != null;
	        PreparedStatement statement = connection.prepareStatement(userNameQuery);
	        ResultSet resultSet = statement.executeQuery();
	
	        if (resultSet.next()) {
	        	userNameList.add(resultSet.getString("USER_NAME"));
	        }
	        
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return userNameList;
	}

}
