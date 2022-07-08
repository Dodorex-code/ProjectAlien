import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
            getWorld().addObject(new explode(), getX(), getY());
            this.getWorld().getObjects(player.class).get(0).incScore();
            ExplsionSound.play();
            getWorld().removeObject(this);
        }
    }
}
