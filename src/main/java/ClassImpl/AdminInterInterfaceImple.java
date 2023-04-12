package ClassImpl;

import Interface.AdminInterFace;
import Model.teacherModel;
import ReoImpl.AdminRepoImplements;

public class AdminInterInterfaceImple implements AdminInterFace {
	AdminRepoImplements  al = new AdminRepoImplements();
	@Override
	public boolean TeacherLogin(String name, String password) {
		return al.TeacherLogin(name, password);  
	}
	@Override
	public boolean StudentLogin(String name, String email) {
		return al.studentLogin(name, email);
	}
	@Override
	public boolean addTeacher(teacherModel tm) {
		return al.addTeacher(tm);
	}

}
