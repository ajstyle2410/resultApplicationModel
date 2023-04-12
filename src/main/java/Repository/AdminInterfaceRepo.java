package Repository;

import Model.teacherModel;

public interface AdminInterfaceRepo {
	   public boolean TeacherLogin(String name, String password);
	   public boolean studentLogin(String name,String email);
	    public boolean addTeacher(teacherModel tm);

}
