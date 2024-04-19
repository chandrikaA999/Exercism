import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class PythagoreanTriplet {
    private int a,b,c;
    PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PythagoreanTriplet that)) return false;
        return a == that.a && b == that.b && c == that.c;
    }

    


    static TripletListBuilder makeTripletsList() {
        return new TripletListBuilder();
    }

    static class TripletListBuilder {
        List<PythagoreanTriplet> triplets = new ArrayList<>();
        int sum;
        int maxFactor;
        TripletListBuilder thatSumTo(int sum) {
            this.sum = sum;
            return this;
        }

        TripletListBuilder withFactorsLessThanOrEqualTo(int maxFactor) {
            this.maxFactor = maxFactor;
            return this;
        }

        List<PythagoreanTriplet> build() {
            if(maxFactor == 0) maxFactor = sum/2;
            int beginAt = (int) Math.sqrt(sum);
            for (int a = beginAt; a <= maxFactor ; a++) {
                for (int b = a; b <= maxFactor ; b++) {
                    double c = Math.sqrt(a*a + b*b);
                    if(c%1==0 && c<=maxFactor && a+b+c == sum){
                        triplets.add(new PythagoreanTriplet(a,b,(int) c));
                    }
                }

            }
            return triplets;
        }

    }

}