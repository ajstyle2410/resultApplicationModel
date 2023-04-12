package ClassImpl;

import java.util.List;

import Interface.studentRegistrationInterface;
import Model.studentAllMarksModel;
import Model.studentRegistration;
import ReoImpl.studentMarksRepoImplements;
import ReoImpl.studentRegistrationRepoImplemets;

public class studentRegisterationImplements implements studentRegistrationInterface {
	studentRegistrationRepoImplemets rpo= new studentRegistrationRepoImplemets();
	studentMarksRepoImplements rs = new studentMarksRepoImplements();
	@Override
	public boolean AddRgistrationData(studentRegistration sr) {
		return rpo.AddRgistrationData(sr);
	}
	@Override
	public List<studentRegistration> ShowData() {
		return rpo.ShowData();
	}
	@Override
	public boolean StudentDeleteData(int id) {
		return rpo.StudentDeleteData(id);
	}
	
	@Override
	public boolean StudentUpdateData(int id, String name, long contact, String email) {
		return rpo.StudentUpdateData(id, email, contact, email);
	}
	@Override
	public List<studentAllMarksModel> showMarksData() {
		return rs.showMarksData();
	}

}
