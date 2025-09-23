package goodrichtomassia.chap02;

public class RepeatedDivisionCounter {
    int repeatedDiv(int n){
        int count = 0;
        while(n>=2){
            n = n/2;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        RepeatedDivisionCounter repeatedDivisionCounter = new RepeatedDivisionCounter();
        System.out.println(repeatedDivisionCounter.repeatedDiv(10));
    }
}
