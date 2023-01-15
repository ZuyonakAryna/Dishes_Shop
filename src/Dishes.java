
public class Dishes
{
    public String producer;
    public double price;
    public String style;
    Dishes()
    {
        producer="Japan";
        price=15.0;
        style="Japanese";
    }
    Dishes(String producer, double price, String style)
    {
        this.producer=producer;
        this.price=price;
        this.style=style;
    }
    Dishes(String producer, double price)
    {
        this.producer=producer;
        this.price=price;
    }
    public String getProducer() {
        return producer;
    }

    public double getPrice() {
        return price;
    }

    public String getStyle() {
        return style;
    }
    String name()
    {
        return "Dishes";
    }
}
class Plate extends Dishes
{
    private int diameter;
    Plate(String producer, double price, String style, int newDiameter)
    {
        super(producer, price, style);
        diameter=newDiameter;
    }
    Plate(String producer, double price)
    {
        super(producer, price);
        diameter=30;
    }
    Plate()
    {
        super();
        diameter=15;
    }

    public int getDiameter() {
        return diameter;
    }
    String name()
    {
        return "Plate";
    }
}
class Pot extends Dishes
{
    private int volume;
    private boolean lid;
    Pot(String producer, double price, String style, int volume, boolean lid)
    {
        super(producer, price, style);
        this.volume=volume;
        this.lid=lid;
    }
    Pot(String producer, double price, int volume)
    {
        super(producer, price);
        this.volume=volume;
        lid=true;
    }
    Pot()
    {
        super();
        volume=10;
        lid=false;
    }
    public static void IsThereLid(Pot numberOfPot) {
        if (numberOfPot.getLid())
        {
            System.out.println("there is lid");

        }
        else
        {
            System.out.println("there is no lid");
        }
    }
    int getVolume()
    {
        return volume;
    }
    boolean getLid()
    {
        return lid;
    }
    String name()
    {
        return "Pot";
    }
}
class Pan extends Dishes
{
    private double handleLength;
    private String coating;
    Pan(String producer, double price, String style, double handleLength, String coating)
    {
        super(producer, price, style);
        this.handleLength=handleLength;
        this.coating=coating;
    }
    Pan(String producer, double price, double handleLength)
    {
        super(producer, price);
        this.handleLength=handleLength;
        coating="ceramic";
    }
    Pan()
    {
        super();
        handleLength=15.78;
        coating="non-stick";
    }
    double getHandleLength()
    {
        return handleLength;
    }
    String getCoating()
    {
        return coating;
    }
    String name()
    {
        return "Pan";
    }
}
