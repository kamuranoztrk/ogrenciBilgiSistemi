public class Student {
    String name;
    String stuNo;
    int  classes;
    Course mat;
    Course fizik;
    Course kimya;

    double avarage;
    boolean isPass;
    double matAvarage;
    double fizAvarage;
    double kimAvarage;


    Student(String name, int classes,  String stuNo, Course mat, Course fizik, Course kimya ){
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.avarage = 0.0;
        this.isPass = false;
        this.matAvarage = 0.0;
        this.fizAvarage = 0.0;
        this.kimAvarage = 0.0;
        calcAvarage();
    }
    public void addBulkExamNote(int mat, int fizik, int kimya){
        if(mat >=0 && mat<=100){
            this.mat.note = mat;
        }
        if(fizik >=0 && fizik<=100){
            this.fizik.note = fizik;
        }
        if(kimya >=0 && kimya<=100){
            this.kimya.note = kimya;
        }
    }
    public void addSozluNote(int mat, int fizik, int kimya){
        if(mat >=0 && mat<=100){
            this.mat.snote = mat;
        }
        if(fizik >=0 && fizik<=100){
            this.fizik.snote = fizik;
        }
        if(kimya >=0 && kimya<=100){
            this.kimya.snote = kimya;
        }
    }
    public void isPass(){
        printNote();
        if (this.avarage >= 55){
            System.out.println("Ortalama : " + this.avarage + "Sınıfı geçti");
        }else{
            System.out.println("Ortalama : " + this.avarage + "Sınıfta kaldı!");
        }

    }
    public void calcAvarage(){
        this.matAvarage = (this.fizik.note * 0.80) + (this.fizik.snote * 0.20);
        this.fizAvarage = (this.mat.note * 0.80) + (this.mat.snote * 0.20);
        this.kimAvarage = (this.kimya.note * 0.80) + (this.kimya.snote * 0.20);

        this.avarage = (this.fizAvarage + this.kimAvarage + this.matAvarage) / 3;
    }
    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Sınav Notu : " + this.mat.note + "Sözlü notu: " + this.mat.snote );
        System.out.println("Fizik Sınav Notu : " + this.fizik.note + "Sözlü notu: " + this.fizik.snote );
        System.out.println("Kimya Sınav Notu : " + this.kimya.note + "Sözlü notu: " + this.kimya.snote );
    }
}
