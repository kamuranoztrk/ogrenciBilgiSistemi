public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");


        Teacher t1 = new Teacher("ALİ Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Veli Hoca", "90550000001", "FZK");
        Teacher t3 = new Teacher("Selami Hoca", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Halide Edip", 4, "15465354", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.addSozluNote(100,58,90);
        s1.isPass();
        s1.printNote();

        Student s2 = new Student("Necip Fazıl", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s1.addSozluNote(100,90,80);
        s2.isPass();
        s2.printNote();

        Student s3 = new Student("Orhan Kemal", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s1.addSozluNote(90,60,70);
        s3.isPass();
        s3.printNote();
    }
}
