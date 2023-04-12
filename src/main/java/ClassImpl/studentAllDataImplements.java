package ClassImpl;

import java.util.List;

import Interface.studentAllDataInterface;
import Model.studentAllMarksModel;
import Model.studentRegistration;
import ReoImpl.studentAllDataImplRepo;
import ReoImpl.studentMarksRepoImplements;

public class studentAllDataImplements implements studentAllDataInterface {
	studentAllDataImplRepo sd = new studentAllDataImplRepo();
	studentMarksRepoImplements sr = new studentMarksRepoImplements();
	
	@Override
	public List<studentRegistration> studentRecords() {
		// TODO Auto-generated method stub
		return sd.studentRecords();
	}

	@Override
	public List<studentAllMarksModel> studentAllResult() {
		// TODO Auto-generated method stub
		return sd.studentAllResult();
	}

	@Override
	public studentRegistration studentSpacificData(int registerId) {
		return sd.studentSpacificData( registerId);
	}

	@Override
	public List<studentAllMarksModel> showMarksData() {
		return sr.showMarksData();
	}



}
