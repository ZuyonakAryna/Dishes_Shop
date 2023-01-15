public class Output {
    public void printing(){
        Plate firstPlate = new Plate("China", 10.90, "Loft", 10);
        System.out.println(firstPlate.name()+": producer " + firstPlate.getProducer() + ", price " +
                firstPlate.getPrice() + ", style " + firstPlate.getStyle() + ", diameter " + firstPlate.getDiameter());
        Plate secondPlate=new Plate("German", 57.95);
        System.out.println(secondPlate.name()+": producer " + secondPlate.getProducer() + ", price " +
                secondPlate.getPrice() + ", diameter " + secondPlate.getDiameter());
        Plate thirdPlate = new Plate();
        System.out.println(thirdPlate.name()+": producer " + thirdPlate.getProducer() + ", price " +
                thirdPlate.getPrice() + ", style " + thirdPlate.getStyle() + ", diameter " + thirdPlate.getDiameter());
        Pot firstPot = new Pot("Poland", 37.97,  "Country", 10, true);
        System.out.print(firstPot.name()+": producer " + firstPot.getProducer() + ", price " +
                firstPot.getPrice() + ", style " + firstPot.getStyle() + ", volume " + firstPot.getVolume() + ", ");
        Pot.IsThereLid(firstPot);
        Pot secondPot=new Pot("the UK", 59.97, 35);
        System.out.print(secondPot.name()+": producer " + secondPot.getProducer() + ", price " +
                secondPot.getPrice() + ", volume " + secondPot.getVolume() + ", ");
        Pot.IsThereLid(secondPot);
        Pot thirdPot = new Pot();
        System.out.print(thirdPot.name() + ": producer " + thirdPot.getProducer() + ", price " +
                thirdPot.getPrice() + ", style " + thirdPot.getStyle() + ", volume "+ thirdPot.getVolume() + ", ");
        Pot.IsThereLid(thirdPot);
        Pan firstPan = new Pan("Slovakia", 27.07, "Country", 10.50, "teflon");
        System.out.println(firstPan.name()+": producer " + firstPan.getProducer() + ", price " +
                firstPan.getPrice() + ", style " + firstPan.getStyle() + ", the length of handle "
                + firstPan.getHandleLength() + ", coating " + firstPan.getCoating());
        Pan secondPan = new Pan("Sweden", 29.57, 25.15);
        System.out.println(secondPan.name()+": producer " + secondPan.getProducer() + ", price " +
                secondPan.getPrice() + ", the length of handle " + secondPan.getHandleLength() + ", coating "
                + secondPan.getCoating());
        Pan thirdPan = new Pan();
        System.out.println(thirdPan.name()+": producer " + thirdPan.getProducer() + ", price " +
                thirdPan.getPrice() + ", style " + thirdPan.getStyle() + ", the length of handle "
                + thirdPan.getHandleLength() + ", coating " + thirdPan.getCoating());
    }
}
