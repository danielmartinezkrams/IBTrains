public class Runner {
    public static void main(String[] args){
        Train A = new Train(123);
        Engine B = new Engine(7);
        A.addEngine(B);
        Wagon C = new Wagon(23);
        A.addWagon(C);
        Wagon D = new Wagon(66);
        A.addWagon(D);
        Wagon E = new Wagon(71);
        A.addWagon(E);
        A.addEngine(new Engine(9));
        System.out.println(A.mEngines[0].getID() + " " + A.mEngines[1].getID());
        System.out.println(A.mEngineCount);
        Wagon F = A.removeWagon();
        System.out.println(F.getID());
        F = A.removeWagon();
        A.addWagon(new Wagon(214));
        System.out.println(F.getID());
        System.out.println(A.mWagons[0].getID() + " " + A.mWagons[1].getID());
    }
}
