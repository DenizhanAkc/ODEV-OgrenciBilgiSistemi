public class Main {
    public static void main(String[] args){

        Teacher t1 = new Teacher("Mahmut Hoca", "905554443322", "TRH");
        Teacher t2 = new Teacher("Graham Bell", "901112223344", "FZK");
        Teacher t3 = new Teacher("Kulyutmaz", "902223334455", "BIO");

        Course tarih = new Course("Tarih", "101", "TRH", t1);
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102","FZK", t2);
        fizik.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji", "103", "BIO", t3);
        biyoloji.addTeacher(t3);


        Student s1 = new Student("Inek Saban", "900001112233", " 4",tarih, fizik, biyoloji);
        s1.addBulkExamNote(100,100,100);
        s1.addBulkSpeakingNote(80,80,80);
        s1.isPass();

        Student s2 = new Student("Guduk Necmi", "213812", "4",tarih, fizik, biyoloji);
        s2.addBulkExamNote(50,30,70);
        s2.addBulkSpeakingNote(80,80,80);
        s2.isPass();


    }
}
