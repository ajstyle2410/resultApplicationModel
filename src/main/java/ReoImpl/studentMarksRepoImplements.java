package ReoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Database.ConnectionProvider;
import Model.studentAllMarksModel;
import Repository.studentMarksRepo;

public class studentMarksRepoImplements implements studentMarksRepo {
	java.sql.PreparedStatement stmt;
	ResultSet rs;
	List<studentAllMarksModel> list;
	Connection con=ConnectionProvider.getConnectionProvider();
	@Override
	public boolean addMarks(studentAllMarksModel sm) {
		try {
			System.out.println(sm.toString());
			stmt = con.prepareStatement("insert into studentresultmarks values('0',?,?,?,?,?,?,?,?,?)");

			stmt.setFloat(1, sm.getMicoController());
			stmt.setFloat(2, sm.getMicroProcessor());
			stmt.setFloat(3, sm.getDigitalElectronics());
			stmt.setFloat(4, sm.getControlSystem());
			stmt.setFloat(5, sm.getAnologCircuit());
			stmt.setFloat(6, sm.getSignalAndSignal());
			stmt.setInt(7, sm.getStudentFkId());
			stmt.setFloat(8, sm.getTotalMarks());
			stmt.setFloat(9, sm.getStudentAgg());
			int val = stmt.executeUpdate();
			System.out.println("===>data executed");
			if (val > 0)
				return true;
			else
				return false;

		} catch (Exception ex) {
			return false;
		}

	}

	@Override
	public List<studentAllMarksModel> showMarksData() {

		list = new ArrayList<>();

		try {
			stmt = con.prepareStatement("select * from studentresultmarks ");

			rs = stmt.executeQuery();

			while (rs.next()) {
				studentAllMarksModel sm = new studentAllMarksModel();
				sm.setStudentId(rs.getInt(1));
				sm.setMicoController(rs.getFloat(2));
				sm.setDigitalElectronics(rs.getFloat(3));
				sm.setControlSystem(rs.getFloat(4));
				sm.setAnologCircuit(rs.getFloat(5));
				sm.setSignalAndSignal(rs.getFloat(6));
				sm.setTotalMarks(rs.getFloat(7));
				sm.setStudentAgg(rs.getFloat(8));
				list.add(sm);
			}
		} catch (SQLException e) {

			System.out.println(e);
		}

		return list;
	}

}
