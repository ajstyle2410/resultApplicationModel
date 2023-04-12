package Interface;

import java.util.List;

import Model.teacherModel;

public interface TeacherAllDataInterface {
   public   List <teacherModel> ShowTeacher();
   public boolean DeleteTechar(int id);
}
