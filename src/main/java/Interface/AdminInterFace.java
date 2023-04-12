package Interface;

import Model.teacherModel;

public interface AdminInterFace {
    public boolean TeacherLogin( String name, String password);
    public boolean StudentLogin(String name, String email);
    public boolean addTeacher(teacherModel tm);
    
    
}
