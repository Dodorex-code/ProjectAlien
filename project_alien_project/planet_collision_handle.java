import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class planet_collision_handle extends Actor
{
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
