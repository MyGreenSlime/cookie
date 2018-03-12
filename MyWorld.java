import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public Counter thecounter = new Counter();
    //public grandmom grandMom = new grandmom();
    public grandmom grandmom = new grandmom();
    public farm farm = new farm();
    public factory factory = new factory();
    public mine mine = new mine();
    public lab lab = new lab();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    //public Counter counter = new Counter();
    // Counter counter = new Counter();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       
        super(1024 , 768, 1); 
        prepare();
    }
    public Counter getCount()
    {
        return thecounter;
    }
   
    public grandmom getMOM()
    {
        return grandmom;
    }
    public farm getFARM()
    {
        return farm;
    }
    public factory getFAC()
    {
        return factory;
    }
    public mine getMINE()
    {
        return mine;
    }
    public lab getLAB()
    {
        return lab;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        System.out.println("CHECK");
        cookie cookie = new cookie();
        addObject(cookie,308,473);

        addObject(grandmom,904,88);

        addObject(farm,916,239);

        addObject(factory,916,410);

        addObject(mine,925,568);

        addObject(lab,935,712);
        farm.setLocation(911,219);
        factory.setLocation(910,378);
        mine.setLocation(919,528);
        lab.setLocation(926,694);
        //Counter counter = new Counter();
        addObject(thecounter,317,174);
        banner banner = new banner();
        addObject(banner,235,69);
        banner.setLocation(236,58);
        textmom textmom = new textmom();
        addObject(textmom,694,143);
        textmomunit textmomunit = new textmomunit();
        addObject(textmomunit,698,101);
        textmomunit.setLocation(691,101);
        pricefarm pricefarm = new pricefarm();
        addObject(pricefarm,703,272);
        pricefarm.setLocation(695,267);
        unitfarm unitfarm = new unitfarm();
        addObject(unitfarm,698,236);
        unitfarm.setLocation(692,232);
        unitfarm.setLocation(691,227);
        pricefac pricefac = new pricefac();
        addObject(pricefac,705,419);
        pricefac.setLocation(698,414);
        unitfac unitfac = new unitfac();
        addObject(unitfac,693,369);
        unitfac.setLocation(696,370);
        pricemine pricemine = new pricemine();
        addObject(pricemine,709,578);
        pricemine.setLocation(702,577);
        unitmine unitmine = new unitmine();
        addObject(unitmine,704,543);
        unitmine.setLocation(700,536);
        pricelab pricelab = new pricelab();
        addObject(pricelab,708,746);
        pricelab.setLocation(703,736);
        pricelab.setLocation(703,744);
        pricelab.setLocation(703,745);
        unitlab unitlab = new unitlab();
        addObject(unitlab,707,709);
        unitlab.setLocation(701,702);
        grandtext grandtext = new grandtext();
        addObject(grandtext,707,60);
        farmtext farmtext = new farmtext();
        addObject(farmtext,702,196);
        farmtext.setLocation(699,189);
        farmtext.setLocation(664,188);
        grandtext.setLocation(732,60);
        farmtext.setLocation(771,183);
        factext factext = new factext();
        addObject(factext,739,327);
        factext.setLocation(735,319);
        minetext minetext = new minetext();
        addObject(minetext,748,501);
        minetext.setLocation(769,488);
        labtext labtext = new labtext();
        addObject(labtext,785,665);
        labtext.setLocation(813,646);
        minetext.setLocation(797,487);
        factext.setLocation(757,320);
        farmtext.setLocation(792,182);
        grandtext.setLocation(746,60);
    }
}
