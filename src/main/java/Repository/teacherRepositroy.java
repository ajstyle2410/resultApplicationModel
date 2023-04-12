package Repository;

import java.util.List;

import Model.teacherModel;

public interface teacherRepositroy {
	   public   List <teacherModel> ShowTeacher();
	   public boolean deleteTeacher(int id);
}
