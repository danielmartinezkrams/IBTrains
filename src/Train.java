public class Train {
        Engine[] mEngines;
        Wagon[] mWagons;
        int mEngineCount;
        int mWagonCount;
        int mTrainNumber;
        double mWeight;

        public Train(int number) {
            mTrainNumber = number;
            mEngines = new Engine[6];
            mEngineCount = 0;
            mWagons = new Wagon[100];
            mWagonCount = 0;
            mWeight = 0;
        }
        public void addEngine(Engine newEngine){
            mEngines[mEngineCount] = newEngine;
            mEngineCount++;
        }
        public Engine removeEngine(){
            mEngineCount--;
            return mEngines[mEngineCount];
        }
        public void addWagon(Wagon newWagon) {
            mWagons[mWagonCount] = newWagon;
            mWagonCount++;
        }
        public Wagon removeWagon() {
            Wagon returnWagon = null;
            if(mWagonCount > 0){
                mWagonCount--;
                returnWagon = mWagons[mWagonCount];
                mWagons[mWagonCount] = null;
            }
            return returnWagon;
        }
        public double getWeight() {
            int returnWeight = 0;
            for(int i = 0; i < mWagonCount; i++){
                returnWeight += mWagons[i].getWeight();
            }
            for(int j = 0; j < mEngineCount; j++){
                returnWeight += mEngines[j].getWeight();
            }
            return returnWeight;
        }
        public int getNumberOfWagons(){
            return this.mWagonCount;
        }


}
