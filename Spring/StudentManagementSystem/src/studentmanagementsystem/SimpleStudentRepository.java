package studentmanagementsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleStudentRepository implements StudentRepository {

	private Map<Long, Student> studentsDb = new HashMap<Long, Student>();

	@Override
	public void saveStudent(Student stu) {
            if(stu==null){
                System.out.println("Empty student cannot be saved");
            }
            else{
		studentsDb.put(stu.getRegNo(), stu);
            }

	}

	@Override
	public void deleteStudent(Student stu) {
            if(stu==null){
                System.out.println("Empty student cannot be deleted");
            }
            else{
		studentsDb.remove(stu.getRegNo());
            }
		

	}

	@Override
	public Student findStudent(long regNumber) {
		return studentsDb.get(regNumber);
	}

	@Override
	public void updateStudent(Student stu,String aField,String aValue) {
            Student student=studentsDb.get(stu.getRegNo());
            if ("regNo".equals(aField)){
                student.setRegNo(Long.parseLong(aValue));
            }
            else if ("firstName".equals(aField)){
                student.setFirstName(aValue);
            }
            else if ("lastName".equals(aField)){
                student.setLastName(aValue);
            }
            else if ("address".equals(aField)){
                student.setAddress(aValue);
            }
	}

	@Override
	public List<Student> findAllStudents() {
            List<Student> list =new ArrayList<Student>(studentsDb.values());
            return list;
	}

}
