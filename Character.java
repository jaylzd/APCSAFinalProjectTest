/** 
 * this is the character class that helps creat a object 
   and inheritance etc just getting a understanding of the player 
 * Line 10 1/4 class
 * Line 10+ gets the Name, Gender, Age and Inheritance 
 * Line 17+ are the getters and setters
 * Line 26+ is setting them for printing in story
 *Line 32+ is health bar for inheritance
 */
public class Character { //1/4 class
    private String name;
    private String gender;
    private int age;

    public Character(String name, String gender, int age) { 
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() { return name; } 
    public String getGender() { return gender; }
    public int getAge() { return age; }

    public void setName(String name) { this.name = name; }
    public void setGender(String gender) { this.gender = gender; }
    public void setAge(int age) { this.age = age; }

    public void Stats() { 
        System.out.println("Character Name: " + name);
        System.out.println("Character Gender: " + gender);
        System.out.println("Character Age: " + age);
    }
    public class Hero extends Character { 
    private int health;

    public Hero(String name, String gender, int age, int health) {
        super(name, gender, age);
        this.health = health;
    }

    public int getHealth() { return health; }
}

}