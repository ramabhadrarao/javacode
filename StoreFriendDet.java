public class StoreFriendDet {
String fName;
String fMobileNo;
double marks;
public void setFriendDetails(String fName,String fMobileNo,double marks){
	this.fName=fName;
	this.fMobileNo=fMobileNo;
	this.marks=marks;
}
public void getFriendDetails(){
	System.out.println("Name is:"+this.fName);
	System.out.println("Mobile is:"+this.fMobileNo);
	System.out.println("marks is:"+this.marks);
}

public static void main(String args[]){
	StoreFriendDet sfd=new StoreFriendDet();
	sfd.setFriendDetails("Harini","9000160000",550.5);
	sfd.getFriendDetails();

	StoreFriendDet sfd1=new StoreFriendDet();
	sfd1.setFriendDetails("Raju","9000160023",530.5);
	sfd1.getFriendDetails();

	StoreFriendDet sfd2=new StoreFriendDet();
	sfd2.setFriendDetails("Sai","9000161200",558.5);
	sfd2.getFriendDetails();


}
}