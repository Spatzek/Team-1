import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 400, 1);
        prepare();
    }
    
    private void prepare()
    {
        Ant ant = new Ant();
        addObject(ant, 60, 30);
        Fish fish = new Fish();
        addObject(fish, 60, 96);
        Fly fly = new Fly();
        addObject(fly, 60, 163);
        Lizard lizard = new Lizard();
        addObject(lizard, 60, 229);
        Mouse mouse = new Mouse();
        addObject(mouse, 60,296);
        Turtle turtle = new Turtle();
        addObject(turtle, 60, 362);
    }
       
    
    
}
