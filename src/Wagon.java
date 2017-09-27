import java.util.ArrayList;

public class Wagon extends RollingStock{
    private ArrayList<Parcel> mParcels;
    private int mParcelCount;

    public Wagon(int ID){
        super(ID, 32000); // Empty wagon weighs 32000 kilograms
        mParcels = new ArrayList<Parcel>();
        mParcelCount = 0;
    }

    // Accessor methods
    public int getWagonID() {
        return this.getID();
    }
    public double getWeight() {
        int returnWeight = 0;
        for(int i = 0; i < mParcelCount; i++){
            returnWeight += mParcels[i].getWeight();
        }
        return returnWeight + super.getWeight();
    }
    public void addParcel(Parcel parcel) {
        mParcels.add(parcel);
    }
    public void removeParcel(){
        mParcels.remove(mParcels.size());
    }
}
