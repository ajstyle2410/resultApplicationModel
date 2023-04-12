package ClassImpl;

import java.util.List;

import Interface.TeacherAllDataInterface;
import Model.teacherModel;
import ReoImpl.teacherRepoImpl;

public class TeacherAllDataImplements implements TeacherAllDataInterface {
	teacherRepoImpl tl = new teacherRepoImpl();
	@Override
	public List<teacherModel> ShowTeacher() {
		return tl.ShowTeacher();
	}
	
	@Override
	public boolean DeleteTechar(int id) {
		return tl.deleteTeacher(id);
	}

}
