import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lizard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lizard extends Players
{
    /**
     * Act - do whatever the Lizard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int size;
    public Lizard()
    {
        getImage().scale(60,50);
    }    
    
    public void setSize(int size)
    {
        this.size = size;
        GreenfootImage image = getImage();
        image.scale(size, size);
    }
    }    

