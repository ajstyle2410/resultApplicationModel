package ReoImpl;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

import Model.studentRegistration;
import Repository.studentRegistrationRepo;

public class studentRegistrationRepoImplemets implements studentRegistrationRepo {
	ResultSet rs;
	PreparedStatement stmt;
	Connection con;
	List<studentRegistration> lst;

	public studentRegistrationRepoImplemets() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/result", "root", "root");
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
	@Override
	public boolean AddRgistrationData(studentRegistration sr) {
		try {
			stmt = con.prepareStatement("insert into studentrecords values('0',?,?,?)");
			stmt.setString(1, sr.getName());
			stmt.setLong(2, sr.getContact());
			stmt.setString(3, sr.getAddress());
			int val = stmt.executeUpdate();
			if (val > 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception ex) {
			System.out.println(ex);
			return false;
		}
	}
	@Override
	public List<studentRegistration> ShowData() {

		lst = new ArrayList<>();
		try {
			stmt = con.prepareStatement("select * from studentrecords");
			rs = stmt.executeQuery();

			while (rs.next()) {
				studentRegistration sr = new studentRegistration();
				sr.setSid(rs.getInt(1));
				sr.setName(rs.getString(2));
				sr.setContact(rs.getLong(3));
				sr.setAddress(rs.getString(4));
				lst.add(sr);
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return lst;
	}

	@Override
	public boolean StudentDeleteData(int id) {

		try {
			stmt = con.prepareStatement("delete from studentrecords where Sid=?");
			stmt.setInt(1, id);
			int val = stmt.executeUpdate();
			if (val > 0) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			System.out.println(e);
			return false;
		}

	}

	@Override
	public boolean StudentUpdateData(int id, String name, long contact, String email) {
		try {
			studentRegistration sr = new studentRegistration();
			stmt = con.prepareStatement(
					"update studentrecords set studentname=? , student_contact=?, email=? where Sid=?");
			stmt.setString(1, name);
			stmt.setLong(2, contact);
			stmt.setString(3, email);
			stmt.setInt(4, id);
			int val = stmt.executeUpdate();
			if (val > 0)
				return true;
			else
				return false;
		} catch (Exception ex) {
			System.out.println(ex);
			return false;
		}
	}

}
