public class Human {
    public String name;
    public String town;
    public int yearOfBirth;
    public String jobTitle;

    Human(String name, String town, int yearOfBirth, String jobTitle) {
        if (name == null || name.isEmpty()) {
            this.name = "Информация не указана";
        } else
            this.name = name;
        if (town == null || town.isEmpty()) {
            this.town = "Информация не указана";
        } else
            this.town = town;
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        }
        if (jobTitle == null || jobTitle.isEmpty()) {
            this.jobTitle = "Информация не указана";
        } else
            this.jobTitle = jobTitle;
    }

    void hello() {
        System.out.println("Привет! Меня зовут " + this.name + ".\nЯ из города " + this.town + ".\nЯ родился в " + this.yearOfBirth + ". \nЯ работаю на должности " + this.jobTitle + ".\nБудем знакомы!\n");
    }
}
