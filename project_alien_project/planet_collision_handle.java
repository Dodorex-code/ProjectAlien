import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class planet_collision_handle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class planet_collision_handle extends Actor
{
    /**
     * Act - do whatever the planet_collision_handle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound LandSound = new GreenfootSound("on_land.mp3");
    public void act()
    {
        if(isTouching(player.class))
        {
            LandSound.play();
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
