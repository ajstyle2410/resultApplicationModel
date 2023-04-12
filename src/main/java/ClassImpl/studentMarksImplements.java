package ClassImpl;

import java.util.List;

import Interface.studentMarksInterface;
import Model.studentAllMarksModel;
import ReoImpl.studentMarksRepoImplements;

public class studentMarksImplements implements studentMarksInterface {
	studentMarksRepoImplements marks = new studentMarksRepoImplements();
	studentMarksRepoImplements sr = new studentMarksRepoImplements();
	
	@Override
	public boolean addMarks(studentAllMarksModel sm) {
		return marks.addMarks(sm);
	}
	@Override
	public List<studentAllMarksModel> showMarksData() {
		return sr.showMarksData();
	}
	
	
}
