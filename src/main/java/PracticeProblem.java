public class PracticeProblem {

	public static void main(String args[]) {

	}public static int goodString(String s) {
    int n = s.length();
    if (n < 2) return -1;


    int[] first = new int[256];
    int[] last = new int[256];


    for (int i = 0; i < 256; i++) first[i] = -1;


    for (int i = 0; i < n; i++) {
        int ch = s.charAt(i);
        if (first[ch] == -1) first[ch] = i;
        last[ch] = i;
    }

    int best = Integer.MAX_VALUE;


    for (int ch = 0; ch < 256; ch++) {
        if (first[ch] != -1 && last[ch] > first[ch]) {
            int ops = first[ch] + (n - 1 - last[ch]);
            if (ops < best) best = ops;
        }
    }

    return (best == Integer.MAX_VALUE) ? -1 : best;
}

}
