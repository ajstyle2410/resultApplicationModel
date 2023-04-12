package Repository;

import java.util.List;

import Model.studentAllMarksModel;

public interface studentMarksRepo {
	public boolean addMarks(studentAllMarksModel sm);
	public List<studentAllMarksModel>showMarksData();
}
