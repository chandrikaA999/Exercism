public class Lasagna {
    public int expectedMinutesInOven(){
        return 40;
    }

    public int remainingMinutesInOven(int actualMin){

        return expectedMinutesInOven() - actualMin;

    }

    public int preparationTimeInMinutes(int noOfLayers){
        return noOfLayers*2;
    }

    public int totalTimeInMinutes(int noOfLayers,int noOfMinutes){
        return preparationTimeInMinutes(noOfLayers) + noOfMinutes;
    }

}
