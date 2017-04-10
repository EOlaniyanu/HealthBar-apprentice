import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class MyWorld here.
 * 
 * Name: Emmanuel Olaniyanu
 * Teacher: Mr. Hardman
 * Lab #3, HealthBar-apprentice
 * Date Last Modified: 04/10/2017 
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
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     * 
     * @param There are no parameters.
     * @return Nothing is returned.
     */
    private void prepare()
    {
        HealthBar healthbar = new HealthBar();
        addObject(healthbar,198,126);
        Button button = new Button();
        addObject(button,160,315);
        Button button2 = new Button( Color.RED, Color.GREEN, -80);
        addObject(button2,400,315);
        healthbar.setLocation(292,119);
    }
}
