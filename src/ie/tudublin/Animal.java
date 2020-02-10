package ie.tudublin;

public class Animal
{
    private String name;

    // Constructor
    // Same name as the class
    // No return type
    // If you dont add one, you get a default one 
    public Animal(String name)
    {
        setName(name);
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void speak()
    {
        System.out.println("I cant speak!");
    }
}