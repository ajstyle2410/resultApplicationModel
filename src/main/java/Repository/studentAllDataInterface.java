package Repository;

import java.util.List;
import java.util.Map;

import Model.studentAllMarksModel;
import Model.studentRegistration;

public interface studentAllDataInterface {
	public List<studentRegistration> studentRecords();
	 public List<studentAllMarksModel> studentAllResult();
		public studentRegistration studentSpacificData(int registerId);
}
