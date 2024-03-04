public class M57InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] result = new int[0][];
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][1] >= newInterval[1]) {
                intervals[i][0] = Math.min(intervals[i][0], newInterval[0]);
                return intervals;
            } else if (intervals[i][0] >= newInterval[0]) {
                intervals[i][0] = newInterval[0];
                return intervals;
            } else if (intervals[i][1] <= newInterval[0]) {
              
            } else if (intervals[i][0] < newInterval[0]) {

            }
        }
        return result;
    }
}
