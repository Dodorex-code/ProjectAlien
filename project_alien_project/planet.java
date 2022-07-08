import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class planet extends Actor
{
    int PlanetNumber;
    GreenfootSound LandSound = new GreenfootSound("on_land.mp3");
    GreenfootImage PlanetImage = getImage();
    
    public planet()
    {
        PlanetNumber = Greenfoot.getRandomNumber(16);
        setImage("planet"+PlanetNumber+".png");
        // could be used, but shouldn't
        // random_scale = random_scale + 100;
        // getImage().scale(random_scale,random_scale);
    }
    public void act()
    {
        // if(isTouching(player.class))
        // {
        //    LandSound.play();
        //    Greenfoot.setWorld(new MyWorld());
        // }
    }
}
