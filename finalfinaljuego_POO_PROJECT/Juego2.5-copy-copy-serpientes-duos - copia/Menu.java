import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    Flecha flecha=new Flecha();
    private int opcion=0; // 0=jugar| 1=Salir
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        super(700, 500, 1);

        prepararMundo();
        prepare();
    }

    private void prepararMundo(){
        addObject(new Jugar(),350,400);
        addObject(new Salir(),350,450);
        addObject(flecha,250,400);
    }

    public void act(){
        if (Greenfoot.isKeyDown("UP") && opcion!=0) {opcion++;}
        if (Greenfoot.isKeyDown("Down") && opcion!=1) {opcion--;}
        if (opcion>=2) opcion=0;
        if (opcion<0) opcion=1;

        flecha.setLocation(250,400+(opcion*50));

        if (Greenfoot.isKeyDown("SPACE") || Greenfoot.isKeyDown("ENTER")){
            switch(opcion){
                case 0: //Jugar
                    Greenfoot.setWorld(new MyWorld());
                    break;
                case 1: //Salir
                    Greenfoot.stop();
                    break;
            }
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
