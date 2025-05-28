/**
 * The {@code Character} class represents a player in the game.
 * It stores basic information such as name, gender, and age, and provides
 * methods for getting and setting these values.
 * It also includes a nested {@code Hero} class to demonstrate inheritance with additional stats.
 *
 * <p>Structure Overview:</p>
 * <ul>
 *   <li>Line 10: 1/4 of the core game classes</li>
 *   <li>Line 10+: Declares fields and constructor for character data</li>
 *   <li>Line 17+: Provides getters and setters for encapsulation</li>
 *   <li>Line 26+: {@code Stats()} method prints character information</li>
 *   <li>Line 32+: {@code Hero} subclass includes a health bar (inheritance example)</li>
 * </ul>
 */
public class Character { // 1/4 class

    private String name;
    private String gender;
    private int age;

    /**
     * Constructs a {@code Character} object with the specified name, gender, and age.
     *
     * @param name   the name of the character
     * @param gender the gender of the character
     * @param age    the age of the character
     */
    public Character(String name, String gender, int age) { 
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // Getters
    public String getName() { return name; } 
    public String getGender() { return gender; }
    public int getAge() { return age; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setGender(String gender) { this.gender = gender; }
    public void setAge(int age) { this.age = age; }

    /**
     * Prints the character's statistics: name, gender, and age.
     */
    public void Stats() { 
        System.out.println("Character Name: " + name);
        System.out.println("Character Gender: " + gender);
        System.out.println("Character Age: " + age);
    }

    /**
     * The {@code Hero} class extends {@code Character} and adds a health attribute,
     * serving as an example of inheritance and enhanced character abilities.
     */
    public class Hero extends Character { 
        private int health;

        /**
         * Constructs a {@code Hero} object with extended attributes.
         *
         * @param name   the name of the hero
         * @param gender the gender of the hero
         * @param age    the age of the hero
         * @param health the health level of the hero
         */
        public Hero(String name, String gender, int age, int health) {
            super(name, gender, age);
            this.health = health;
        }

        /**
         * Returns the health value of the hero.
         *
         * @return the health of the hero
         */
        public int getHealth() { return health; }
    }
}
