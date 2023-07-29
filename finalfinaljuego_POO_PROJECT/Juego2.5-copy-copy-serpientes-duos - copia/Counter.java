import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int score = 0;
    public Counter()
    {
        setImage(new GreenfootImage("Score:"+ score, 20, Color.BLACK, Color.WHITE));
    }
    public void act()
    {
        setImage(new GreenfootImage("Score:"+ score, 20, Color.BLACK, Color.WHITE));
        yuWin();
    }
    public void addScore()
    {
        score++;
    }
    public int getScore()
    {
        return score;
    }
    public void yuWin()
    {
        if(score == 10){
            getWorld().addObject(new YpuWin(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
    }
}
