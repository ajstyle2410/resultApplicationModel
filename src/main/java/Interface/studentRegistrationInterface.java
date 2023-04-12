package Interface;
import java.util.*;

import Model.studentAllMarksModel;
import Model.studentRegistration;

public interface studentRegistrationInterface {
 public boolean AddRgistrationData(studentRegistration sr);
 public List<studentRegistration> ShowData();
 public boolean StudentDeleteData(int id);
 public boolean StudentUpdateData(int id, String name, long contact, String email);
 public List<studentAllMarksModel> showMarksData();
}
