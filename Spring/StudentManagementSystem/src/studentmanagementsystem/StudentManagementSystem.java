package studentmanagementsystem;

import java.util.Iterator;

public class StudentManagementSystem {

	private SimpleStudentRepository repo;
        
        public StudentManagementSystem(){
            repo=new SimpleStudentRepository();
        }
	public void listAllStudents() {
		Iterator<Student> i=repo.findAllStudents().iterator();
                while(i.hasNext()){
                    Student stu=i.next();
                    if (stu==null){
                        continue;
                    }
                    else{
                        System.out.println(i.next().getRegNo()+"/t"+i.next().getFirstName()+"/t"+i.next().getLastName()+"/t"+i.next().getAddress());
                    }
                } 
	}

	public void registerStudent(Student stu){
		repo.saveStudent(stu);
	}
        public SimpleStudentRepository getRepository(){
            return this.repo;
        }
}
