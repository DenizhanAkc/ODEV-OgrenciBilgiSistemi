public class Teacher {
    String name;
    String mpNo;
    String branch;

    Teacher(String name, String mpNo, String branch){
        this.name = name;
        this.mpNo = mpNo;
        this.branch = branch;
    }
    void print(){
        System.out.println("================================");
        System.out.println("Adi : " +this.name);
        System.out.println("Telefon Numarasi : " +this.mpNo);
        System.out.println("Bolumu : " +this.branch);
        System.out.println("================================");
    }
}


