class DynamicArray {
    private int[] arr;
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.arr = new int[this.capacity];
    }

    public int get(int i) {
        return this.arr[i];
    }

    public void set(int i, int n) {
        this.arr[i] = n;
        // this.size++;
    }

    public void pushback(int n) {
        if (this.size == this.capacity){
            resize();
        }
        this.arr[this.size] = n;
        this.size++;
    }

    public int popback() {
        this.size --;
        return arr[this.size];
    }

    private void resize() {
        this.capacity *=2;
        int[] temp = new int[this.capacity];
        for (int i = 0; i < this.size; i++){
            temp[i] = this.arr[i];
        }
        this.arr = temp;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
