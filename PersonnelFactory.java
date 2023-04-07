public class PersonnelFactory {

    public PersonnelFactory() {}

    public Person createPersonnel(String personnelType, String last, String first, String middle, int id, double sal) {
        if (personnelType.toLowerCase().trim() == "employee") {
            return new Employee(last, first, middle, id, sal);
        } else if (personnelType.toLowerCase().trim() == "executives") {
            return new Executives(last, first, middle, id, sal);
        } else if (personnelType.toLowerCase().trim() == "security") {
            return new Security(last, first, middle, id, sal);
        } else if (personnelType.toLowerCase().trim() == "volunteers") {
            return new Volunteers(last, first, middle, id);
        } 
        else
            return new Person(last, first, middle);
    }
}
