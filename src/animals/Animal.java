package animals;

public class Animal {
    private String name;
    private int age;
    private Dimension dimension;
    private NutritionClassification nutritionClassification;
    private String scream;

    public void say()
    {
        System.out.println(this.scream);
    }

}

