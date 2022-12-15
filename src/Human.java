public class Human {
    public String name;
    public String town;
    public int yearOfBirth;
    public String jobTitle;

    Human(String name, String town, int yearOfBirth, String jobTitle) {
        if (name != null) {
            this.name = name;
        } else
            this.name = "Информация не указана";
        if (town != null) {
            this.town = town;
        } else
            this.town = "Информация не указана";
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        }
        if (jobTitle != null) {
            this.jobTitle = jobTitle;
        } else
            this.jobTitle = "Информация не указана";
    }

    void hello() {
        System.out.println("Привет! Меня зовут " + this.name + ".\nЯ из города " + this.town + ".\nЯ родился в " + this.yearOfBirth + ". \nЯ работаю на должности " + this.jobTitle + ".\nБудем знакомы!\n");
    }
}
