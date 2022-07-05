import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ammo_pickup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ammo_pickup extends Actor
{
    public ammo_pickup()
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
    }
}