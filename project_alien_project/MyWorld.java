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
    public int AsteroidAmmount = Greenfoot.getRandomNumber(8);
    int planetX = Greenfoot.getRandomNumber(getWidth()-50);
    int planetY = Greenfoot.getRandomNumber(getHeight()-50);
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super((int) Math.round(Toolkit.getDefaultToolkit().getScreenSize().width * 0.8), (int) Math.round(Toolkit.getDefaultToolkit().getScreenSize().height * 0.8), 1, false);

        addObject(new planet(), planetX, planetY);
        addObject(new player(),(int) (0.5*getWidth()),(int) (0.5*getHeight()));
        addObject(new planet_collision_handle(), planetX, planetY);
        addObject(new ammo_pickup(), Greenfoot.getRandomNumber(getWidth()-100), Greenfoot.getRandomNumber(getHeight()-100));
        addObject(new ammo_pickup(), Greenfoot.getRandomNumber(getWidth()-100), Greenfoot.getRandomNumber(getHeight()-100));
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
