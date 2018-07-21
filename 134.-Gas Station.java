class Solution {
    //在油箱里面还有油的时候继续向远进行，没有的话向前找之前的加油站
    //如果A值为正且无法到B，那么A/B之间所有点都无法到B
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = gas.length-1;
        int end = 0;
        int sum = gas[start] - cost[start];
        while (start > end) {
            if (sum >= 0) {
                sum += gas[end] - cost[end];
                ++end;
            }
            else {
                --start;
                sum += gas[start] - cost[start];
            }
        }
        return sum >= 0 ? start : -1;
    }
}
