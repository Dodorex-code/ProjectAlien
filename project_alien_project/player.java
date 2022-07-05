import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    int bullets = 5;
    private boolean spaceDown;
    int AsteroidsInSpace = 0;
    //sounds
    GreenfootSound Pickup = new GreenfootSound("on_land.mp3");
    GreenfootSound Laser = new GreenfootSound("laser.mp3");
    
    public static int norm180(int rot)
    {
        if(rot>180)rot=-180+(rot-180);
        return rot;
    }
    
    public static int norm360(int rot)
    {
        if(rot<0)rot=360+rot;
        return rot;
    }
    
    public int direction(int angle1, int angle2)
    {
        int a=norm180(angle2)-norm180(angle1);
        int b=norm360(angle2)-norm180(angle1);
        int c=norm180(angle2)-norm360(angle1);
        int d=norm360(angle2)-norm360(angle1);
        a=(Math.abs(a) <Math.abs(b))?a:b;
        c=(Math.abs(c) <Math.abs(d))?c:d;
        return (Math.abs(a) <Math.abs(c))?a:c;
    }
    
    public void  IncrementAsteroids()
    {
        AsteroidsInSpace += 1;
    }
    
    public void  DecrementAsteroids()
    {
        AsteroidsInSpace -= 1;
    }
    
    public void act()
    {
        MouseInfo mouse=Greenfoot.getMouseInfo();
        if(mouse!=null)
        {
            int angle1=getRotation();
            
            double rx=mouse.getX()-getX();
            double ry=mouse.getY()-getY();
            double r=Math.sqrt(rx*rx+ry*ry);
            if(r<5)return;
            
            int angle2=(int)Math.round(Math.atan2(ry,rx)*180.0/Math.PI);
            int delta=direction(angle1,angle2);
            
            int btsrot=5;
            if(Math.abs(delta)>btsrot){
                if(delta<0)delta=-btsrot;
                else delta=btsrot;
            }
            int angle=getRotation()+delta;
            
            int step=5;
            int posx=getX()+(int)Math.round(step*Math.cos(angle*Math.PI/180));
            int posy=getY()+(int)Math.round(step*Math.sin(angle*Math.PI/180));
            
            setLocation(posx,posy);
            setRotation(angle);
        }
        if (!spaceDown && Greenfoot.isKeyDown("space"))
        {
            spaceDown = true;
            bullet Bullet = new bullet();
            Bullet.setRotation(getRotation());
            if(bullets > 0)
            {
                getWorld().addObject(Bullet, getX(), getY());
                bullets -= 1;
                Laser.play();
            }
        }
        if (spaceDown && !Greenfoot.isKeyDown("space"))
        {
            spaceDown = false;
        }
        
        //text ausgabe
        this.getWorld().showText("Bullets:" + bullets,this.getWorld().getWidth()/2, 30);
        
        //interacting with other actors
        Actor ammo_pick = getOneIntersectingObject(ammo_pickup.class);
        if(ammo_pick != null)
        {
            bullets += 5;
            Pickup.play();
            getWorld().removeObject(ammo_pick);
        }
    }
}
