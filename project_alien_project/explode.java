import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class explode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class explode extends Actor
{
    private int timer = 100;
    public void act()
    {
        this.timer = this.timer -1;
        if(this.timer == 90)
        {
            setImage("boom1.png");
        }
        if(this.timer == 80)
        {
            setImage("boom2.png");
        }
        if(this.timer == 70)
        {
            setImage("boom3.png");
        }
        if(this.timer == 60)
        {
            setImage("boom4.png");
        }
        if(this.timer == 50)
        {
            setImage("boom5.png");
        }
        if(this.timer == 40)
        {
            setImage("boom6.png");
        }
        if(this.timer == 30)
        {
            setImage("boom7.png");
        }
        if(this.timer == 20)
        {
            setImage("boom8.png");
        }
        if(this.timer == 10)
        {
            setImage("boom9.png");
        }
        if(this.timer == 0)
        {
            getWorld().removeObject(this);
        }
    }
}
