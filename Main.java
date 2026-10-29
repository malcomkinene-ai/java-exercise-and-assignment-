public class Main {
    public static void main(String[] args) {
        Student[] studentList = new Student[2];

        studentList[0] = new CourseworkStudent("Kinene", "2026/BIT/001", 85.0, 78.0);
        studentList[1] = new ResearchStudent("Sarah", "2026/MSC/042", 90.0, 92.5);

        System.out.println("=== UNIVERSITY STUDENT RESULT SYSTEM ===\n");

        for (Student s : studentList) {
            s.displayDetails();
        }
    }
}
