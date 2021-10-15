class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int i = 0;
        int j = n;
        int mpoint = i + (j - i) / 2;
        while (i <= j) {
            if (isBadVersion(mpoint)) {
                j = mpoint-1;
            } else {
                i = mpoint + 1;
            }
            mpoint = i + (j - i) / 2;
        }
        return i;
    }
}
