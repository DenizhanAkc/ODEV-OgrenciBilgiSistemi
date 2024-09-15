public class Course {

    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sNote;

    Course(String name, String code, String prefix, Teacher teacher) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.teacher = teacher;
        int note = 0;
        int sNote = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            printTeacher();
        } else {
            System.out.println("Ogretmen ve Ders Bolumleri uyusmuyor!");

        }
    }

    void printTeacher(){
        this.teacher.print();

    }
}
