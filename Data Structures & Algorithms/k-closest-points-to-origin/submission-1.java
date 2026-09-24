class Solution {
    public int[][] kClosest(int[][] points, int k) {

    Arrays.sort(points, (a,b) -> Long.compare(cal(a), cal(b)));

    return Arrays.copyOf(points, k);

    }

    public long cal (int [] a) {

        return 1L * ((a[0] * a[0]) + (a[1] * a[1]));

    }
}
        



