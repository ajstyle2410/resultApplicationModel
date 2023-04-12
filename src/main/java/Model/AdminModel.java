package Model;

public class AdminModel {
 private int AdminId;
 private String AdminName;
 @Override
public String toString() {
	return "AdminModel [AdminId=" + AdminId + ", AdminName=" + AdminName + ", AdminPassword=" + AdminPassword + "]";
}
public int getAdminId() {
	return AdminId;
}
public void setAdminId(int adminId) {
	AdminId = adminId;
}
public String getAdminName() {
	return AdminName;
}
public void setAdminName(String adminName) {
	AdminName = adminName;
}
public String getAdminPassword() {
	return AdminPassword;
}
public void setAdminPassword(String adminPassword) {
	AdminPassword = adminPassword;
}
private String AdminPassword;
 
}  
