import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class planet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class planet extends Actor
{
    int PlanetNumber;
    GreenfootSound LandSound = new GreenfootSound("on_land.mp3");
    GreenfootImage PlanetImage = getImage();
    
    public planet()
    {
        PlanetNumber = Greenfoot.getRandomNumber(16);
        setImage("planet"+PlanetNumber+".png");
        
    }
    public void act()
    {
        if(isTouching(player.class))
        {
            LandSound.play();
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
