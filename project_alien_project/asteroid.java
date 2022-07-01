import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class asteroid extends Actor
{
    GreenfootSound ExplsionSound = new GreenfootSound("explosion.mp3");
    
    public asteroid()
    {
        setRotation(Greenfoot.getRandomNumber(270));
    }
    public void act()
    {
        move(1);
        if(isAtEdge())
        {
            turn(45);
        }
        if(isTouching(asteroid.class))
        {
            turn(45);
        }
        if(isTouching(player.class))
        {
            ExplsionSound.play();
            Greenfoot.setWorld(new MyWorld());
        }
        if(isTouching(bullet.class))
        {
            getWorld().removeObject(this);
        }
    }
}
