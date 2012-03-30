package studentmanagementsystem;

public class Student {

	private String firstName;
	private String lastName;
	private long regNumber;
	private String address;

        public Student(String aFirstName, String aLastname, long aRegNumber, String aAddress){
            firstName=aFirstName;
            lastName=aLastname;
            regNumber=aRegNumber;
            address=aAddress;
        }
        public String getFirstName(){
            return this.firstName;
        }
        public String getLastName(){
            return this.lastName;
        }
        public long getRegNo(){
            return this.regNumber;
        }
        public String getAddress(){
            return this.address;
        }

    public void setRegNo(long aRegNo) {
        this.regNumber=aRegNo;
    }

    public void setFirstName(String aFirstName){
        this.firstName=aFirstName;
    }
    public void setLastName(String aLastName){
        this.lastName=aLastName;
    }
    public void setAddress(String anAddress){
        this.address=anAddress;
    }
}
