import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Practise1 {
    static class Employee{
        int id;

        String name;

        int age;

        String gender;

        String department;

        int yearOfJoining;

        double salary;

        public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary)
        {
            this.id = id;
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.department = department;
            this.yearOfJoining = yearOfJoining;
            this.salary = salary;
        }

        public int getId()
        {
            return id;
        }

        public String getName()
        {
            return name;
        }

        public int getAge()
        {
            return age;
        }

        public String getGender()
        {
            return gender;
        }

        public String getDepartment()
        {
            return department;
        }

        public int getYearOfJoining()
        {
            return yearOfJoining;
        }

        public double getSalary()
        {
            return salary;
        }

        @Override
        public String toString()
        {
            return "Id : "+id
                    +", Name : "+name
                    +", age : "+age
                    +", Gender : "+gender
                    +", Department : "+department
                    +", Year Of Joining : "+yearOfJoining
                    +", Salary : "+salary;
        }
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        // Query 3.1 : How many male and female employees are there in the organization?
        // System.out.println(employeeList.stream().collect(Collectors.groupingBy(e -> e.getGender(), Collectors.counting())));

        // Query 3.2 : Print the name of all departments in the organization?
        // System.out.println(employeeList.stream().map(e->e.getDepartment()).distinct().collect(Collectors.toList()));

        // Query 3.3 : What is the average age of male and female employees?
//        System.out.println(employeeList.stream().collect(Collectors.groupingBy(e->e.getGender(), Collectors.averagingInt(Employee::getAge))));

        // Query 3.4 : Get the details of highest paid employee in the organization?
//        System.out.println(employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(1).collect(Collectors.toSet()));

        // Query 3.5 : Get the names of all employees who have joined after 2015?
//        System.out.println(employeeList.stream().filter(e->e.getYearOfJoining()>2015).collect(Collectors.toSet()));

        // Query 3.6 : Count the number of employees in each department?
//        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())));

//        Query 3.7 : What is the average salary of each department?
//        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingInt(e-> (int) e.getSalary()))));

        // Query 3.8 : Get the details of youngest male employee in the product development department?
//        employeeList.stream().filter(e -> e.getGender()=="Male" && e.getDepartment()=="Product Development").sorted(Comparator.comparing(Employee::getAge)).limit(1).forEach(System.out::println);

        // Query 3.9 : Who has the most working experience in the organization?
//        employeeList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).limit(1).forEach(System.out::println);

        // Query 3.13 : What is the average salary and total salary of the whole organization?
//        employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getAverage();
//        employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getSum();

        // Query 3.14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
//        System.out.println(employeeList.stream().collect(Collectors.partitioningBy(e->e.getAge()>25)));
    }



}
