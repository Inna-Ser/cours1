public class Human {
    public String name;
    public String town;
    public int yearOfBirth;
    public String jobTitle;

    Human(String name, String city, int bornYeas, String jobTitle) {
        this.name = name;
        this.town = city;
        this.yearOfBirth = bornYeas;
        this.jobTitle = jobTitle;
    }

    void hello() {
        System.out.println("Привет! Меня зовут " + name + ".\nЯ из города " + town + ".\nЯ родился в " + yearOfBirth + ". \nЯ работаю на должности " + jobTitle + ".\nБудем знакомы!\n");
    }
}