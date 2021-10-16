class MyHashMap {
    ArrayList<Integer> map;
    ArrayList<Integer> valmap;
    public MyHashMap() {
        this.map = new ArrayList<Integer>();
        this.valmap = new ArrayList<Integer>();
    }
    private int binarySearch(ArrayList<Integer> arr, int x)
    {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            // Check if x is present at mid
            if (arr.get(m) == x)
                return m;
 
            // If x greater, ignore left half
            if (arr.get(m) < x)
                l = m + 1;
 
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
 
        // if we reach here, then element was
        // not present
        return -1;
    }

    private int searchInsert(ArrayList<Integer> nums, int target) {
        int i = 0, j = nums.size(), mpoint = i + (j - i) / 2;
        if (target < nums.get(i)) return i;
        else if (target > nums.get(j-1)) return j;
        while(i < j){
            if (nums.get(mpoint) == target || (target < nums.get(mpoint) && target > nums.get(mpoint-1))) return mpoint;
            if (target < nums.get(mpoint)){
                j = mpoint-1;
                mpoint = i + (j - i) / 2;
            }else if (target > nums.get(mpoint)){
                i = mpoint+1;
                mpoint = i + (j - i) / 2;
            }
        }
        if (nums.get(i) == target || (target < nums.get(i) && target > nums.get(i-1))) return i;
        else return j;
    }
    
    public void put(int key, int value) {
        int pos = binarySearch(this.map, key);
        if (pos != -1){
            this.valmap.set(pos, value);
            return;
        }else if (this.map.size() == 0){
            this.map.add(key);
            this.valmap.add(value);
            return;
        }
        pos = searchInsert(this.map, key);
        if (pos == this.map.size()){
            this.map.add(key);
            this.valmap.add(value);
        }else{
            this.map.add(pos, key);
            this.valmap.add(pos, value);
        }
    }
    
    public int get(int key) {
        int pos = binarySearch(this.map, key);
        if (pos != -1){
            return this.valmap.get(pos);
        }
        return -1;
    }
    
    public void remove(int key) {
        int pos = binarySearch(this.map, key);
        if (pos != -1 && this.map.get(pos) == key){
            this.valmap.remove(pos);
            this.map.remove(pos);
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
