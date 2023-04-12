package Model;

import java.util.Comparator;

public class studentRegistration implements Comparator<studentRegistration>   {
	private int sid;
	 private String name;
	 private long contact;
	 private String Address;
	 private studentAllMarksModel studentMarks;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public studentAllMarksModel getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(studentAllMarksModel studentMarks) {
		this.studentMarks = studentMarks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long studentContact) {
		this.contact = studentContact;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String email) {
		this.Address = email;
	}
	@Override
	public String toString() {
		return "studentRegistration [sid=" + sid + ", name=" + name + ", contact=" + contact + ", Address=" + Address
				+ ", studentMarks=" + studentMarks + "]";
	}

	

	@Override
	public int compare(studentRegistration o1, studentRegistration o2) {
		  String p1 = ((studentRegistration) o1).getName();
	       String p2 = ((studentRegistration) o2).getName();
	       if (p1 .compareTo(p2)>0) {
	           return 1;
	       } else if (p1 .compareTo(p2)<0) {

	           return -1;
	       } else {
	           return 0;
	       }
	}

	
	
}
