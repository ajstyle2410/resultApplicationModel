
package ReoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Database.ConnectionProvider;
import Model.studentAllMarksModel;
import Model.studentRegistration;
import Repository.studentAllDataInterface;

import java.sql.*;

public class studentAllDataImplRepo implements studentAllDataInterface {
	 
	ResultSet rs;
	ResultSet rss;
	PreparedStatement stmt;
	List<studentRegistration> studentData;
	List<studentAllMarksModel> studentPercentage;
	Map<studentRegistration, studentAllMarksModel> mp;
	static int RegisterId;
        
	// use database 
	Connection  con = ConnectionProvider.getConnectionProvider();
	

	@Override
	public List<studentRegistration> studentRecords() {
		try {
			studentData = new ArrayList<>();
			stmt = con.prepareStatement("select * from studentrecords");
			rs = stmt.executeQuery();
			while (rs.next()) {
				studentRegistration sr = new studentRegistration();
				sr.setSid(rs.getInt(1));
				sr.setName(rs.getString(2));
				sr.setContact(rs.getLong(3));
				sr.setAddress(rs.getString(4));
				studentData.add(sr);
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}

		return studentData;
	}

	@Override
	public List<studentAllMarksModel> studentAllResult() {

		studentPercentage = new ArrayList<>();
		try {
			stmt = con.prepareStatement("select * from studentresultmarks");
			rs = stmt.executeQuery();

			while (rs.next()) {
				studentAllMarksModel sm = new studentAllMarksModel();
				sm.setStudentId(rs.getInt(1));
				sm.setMicoController(rs.getFloat(2));
				sm.setMicroProcessor(rs.getFloat(3));
				sm.setDigitalElectronics(rs.getFloat(4));
				sm.setControlSystem(rs.getFloat(5));
				sm.setAnologCircuit(rs.getFloat(6));
				sm.setSignalAndSignal(rs.getFloat(7));
				sm.setStudentFkId(rs.getInt(8));
				sm.setTotalMarks(rs.getFloat(9));
                sm.setStudentAgg(rs.getFloat(10));
				studentPercentage.add(sm);
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
		return studentPercentage;
	}
     
	

	@Override
	public studentRegistration studentSpacificData(int registerId) {
		studentRegistration sr = new studentRegistration();
		try {
			System.out.println("repository id is"+registerId);

			stmt = con.prepareStatement(
					"select * from studentrecords s inner join studentresultmarks sm on s.sid=sm.srid where srid=?");
			stmt.setInt(1, registerId);	
			System.out.println("id loaded..");

			rs = stmt.executeQuery();
			System.out.println("data executed..");
		
			while (rs.next()) {
				System.out.println("data loaded..");
				sr.setSid(rs.getInt(1));
				sr.setName(rs.getString(2));
				sr.setContact(rs.getLong(3));
				sr.setAddress(rs.getString(4));
				studentAllMarksModel sm = new studentAllMarksModel();
				sm.setStudentId(rs.getInt(5));
				sm.setMicoController(rs.getFloat(6));
				sm.setMicroProcessor(rs.getFloat(7));
				sm.setDigitalElectronics(rs.getFloat(8));
				sm.setControlSystem(rs.getFloat(9));
				sm.setAnologCircuit(rs.getFloat(10));
				sm.setSignalAndSignal(rs.getFloat(11));
				sm.setTotalMarks(rs.getFloat(12));
				sm.setStudentFkId(rs.getInt(13));
				sr.setStudentMarks(sm);
			}

		} catch (Exception ex) {
			System.out.println();
		}
		return sr;
	}

}
