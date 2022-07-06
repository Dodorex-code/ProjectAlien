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
    //only use for resizing of image => WARNING: will blur image and make planet ugly
    //just dont use
    //int random_scale = Greenfoot.getRandomNumber(300);
    GreenfootSound LandSound = new GreenfootSound("on_land.mp3");
    GreenfootImage PlanetImage = getImage();
    
    public planet()
    {
        PlanetNumber = Greenfoot.getRandomNumber(16);
        setImage("planet"+PlanetNumber+".png");
        //could be used, but shouldn't
        //random_scale = random_scale + 100;
        //getImage().scale(random_scale,random_scale);
    }
    public void act()
    {
        //if(isTouching(player.class))
        //{
            //LandSound.play();
            //Greenfoot.setWorld(new MyWorld());
        //}
    }
}
