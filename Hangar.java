class Hangar{
    public static void main(String[] args) {

        Car dacia = new Car("Dacia",150000);
        Boat rainbowWarrior = new Boat ("rainbowWarrior",15);
        System.out.println(dacia.doStuff());
        System.out.println(rainbowWarrior.doStuff());
        dacia.setBrand("Enfaitjesuisuntractopelle");
        System.out.println(dacia.doStuff());

    }
}

        
