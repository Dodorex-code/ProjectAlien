import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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