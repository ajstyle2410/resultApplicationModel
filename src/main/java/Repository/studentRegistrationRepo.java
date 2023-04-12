package Repository;

import java.util.List;

import Model.studentRegistration;

public interface studentRegistrationRepo {
	 public boolean AddRgistrationData(studentRegistration sr);
	 public List<studentRegistration> ShowData();
	 public boolean StudentDeleteData(int id);
	 public boolean StudentUpdateData(int id, String name, long contact, String email);
}
