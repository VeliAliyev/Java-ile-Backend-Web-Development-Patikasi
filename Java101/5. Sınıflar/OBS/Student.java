public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int oralMat ,int fizik, int oralFizik, int kimya, int oralKimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (oralMat >= 0 && oralMat <= 100) {
            this.mat.oralExamNote = oralMat;
            this.mat.oralProportion = 0.2;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (oralFizik >= 0 && oralFizik <= 100) {
            this.fizik.oralExamNote = oralFizik;
            this.fizik.oralProportion = 0.3;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if (oralKimya >= 0 && oralKimya <= 100) {
            this.kimya.oralExamNote = oralKimya;
            this.kimya.oralProportion = 0.4;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (
                this.fizik.note*(1-this.fizik.oralProportion) + this.fizik.oralExamNote*this.fizik.oralProportion +
                this.kimya.note*(1-this.kimya.oralProportion) + this.kimya.oralExamNote*this.kimya.oralProportion +
                this.mat.note*(1-this.mat.oralProportion) + this.mat.oralExamNote*this.mat.oralProportion) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sözlü Notu : " + this.mat.oralExamNote);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlü Notu : " + this.fizik.oralExamNote);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sözlü Notu : " + this.kimya.oralExamNote);
    }

}