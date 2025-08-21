public class School {
    
    public String firstName;
    public String lastName;
    public int age;
    public String currentDegree;
    public String school;

    public School(String studentName, String studentLastName, int studentAge, String studentDegree, String degreeSchool){
        firstName = studentName;
        lastName =  studentLastName;
        age = studentAge;
        currentDegree = studentDegree;
        school = degreeSchool;
    }

    public void studentResume(){
        System.out.println(firstName + " " + lastName + " is " + age + " years old, and is currently studying " + currentDegree + " in " + school);
    }


    public static void main(String[] args) {
        School studentOne = new School("Marc", "Abad", 17, "SMIX2", "Stucom");
        School studentTwo = new School("Casey", "Cleto", 17, "DAM1", "Stucom");
        School studentThree = new School("Renz", "Nixon", 16, "2ndo de Bachillerato Cientifico", "Sagrat Cor Diputació");
        studentOne.studentResume();
        studentTwo.studentResume();
        studentThree.studentResume();
    }
}
