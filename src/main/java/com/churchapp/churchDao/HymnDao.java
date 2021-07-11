package com.churchapp.churchDao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.churchapp.churchEntity.HymnEntity;


@Repository
public class HymnDao {
	
	
	@Autowired
	DataSource dataSource;

	@Autowired
	HymnEntity hymnEntity;

	public HymnEntity getHymn(int hymnNumber) {

		Connection connection = null;
		CallableStatement callableStatement = null;
		HymnEntity hymnEntity = null;
		ResultSet rs= null;

		try {
			connection = dataSource.getConnection();

			String query = "SELECT * FROM HYMN_TABLE WHERE HYMN_NUMBER =" + hymnNumber + "";
			callableStatement = connection.prepareCall(query);
			callableStatement.setInt(1, hymnNumber);
			callableStatement.registerOutParameter(2, Types.VARCHAR);
			callableStatement.registerOutParameter(3, Types.VARCHAR);
			callableStatement.registerOutParameter(4, Types.VARCHAR);
			callableStatement.execute();

			
			
		    if (rs!=null)
			hymnEntity = new HymnEntity();

			hymnEntity.setHymnNumber(hymnNumber);
			hymnEntity.setHymnTitle("hymnTitle");
			hymnEntity.setHymnLyrics("hymnLyrics");

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return hymnEntity;

	}

}
