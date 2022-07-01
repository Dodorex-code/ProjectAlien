import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Toolkit;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    // spawnt die hintergrundmusik, speilt sie allerdings nicht ab
    GreenfootSound backgroundMusic = new GreenfootSound("ambient_space_mp.mp3");
    // anzakl der asteroiden die gespawnt werden sollen
    int AsteroidAmmount = Greenfoot.getRandomNumber(8);
    
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super((int) Math.round(Toolkit.getDefaultToolkit().getScreenSize().width * 0.8), (int) Math.round(Toolkit.getDefaultToolkit().getScreenSize().height * 0.8), 1, false); 

        addObject(new planet(), Greenfoot.getRandomNumber(getWidth()-50), Greenfoot.getRandomNumber(getHeight()-50));
        addObject(new player(),(int) (0.5*getWidth()),(int) (0.5*getHeight()));
        for(int i = 0; i < AsteroidAmmount; i++)
        {
            int x = Greenfoot.getRandomNumber(getWidth()-10);
            int y = Greenfoot.getRandomNumber(getHeight()-10);
            addObject(new asteroid(), x,y);
        }
    }
    public void act()
    {
        backgroundMusic.play();
    }
}
