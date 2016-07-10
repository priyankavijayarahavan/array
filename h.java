public class Hanoi {

    public static void main(String[] args) {
        playHanoi (2,"A","B","C");
    }

    //move n disks from position "from" to "to" via "other"
    private static void playHanoi(int n, String from , String other, String to) {
        if (n == 0)
            return;
        if (n > 0)
        playHanoi(n-1, from, to, other);
        System.out.printf("Move one disk from pole %s to pole %s \n ", from, to);
        playHanoi(n-1, other, from, to);
    }

}

Does the place I put the print method matter? Also, can I do it like this:
