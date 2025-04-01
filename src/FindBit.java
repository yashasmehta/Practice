public class FindBit {
    public int findIthBit(int num, int i) {
        int mask = 1 << i;
        if((num & mask) == 0) {
          return 0;
        } else {
            return 1;
        }
    }

    public int setIthBit(int num, int i) {
        int mask = 1 << i;
        return num | mask;
    }

    public int clearIthBit(int num, int i) {
        int mask = ~(1 << i);
        return num & mask;
    }

    public int findSetBits(int num) {
        if(num == 0) {
            return 0;
        }
        int n = num;
        int count = 0;
        do {
           n = n & (n-1);
           count++;
        } while(n != 0);
        return count;
    }

    public static void main(String[] args) {
        FindBit obj = new FindBit();
        System.out.println("The ith bit is " + obj.findIthBit(9, 4));
        System.out.println("The num after ith bit set is " + obj.setIthBit(9, 2));
        System.out.println("The num after ith bit clear is " + obj.clearIthBit(9, 3));
        System.out.println("The number of set bits " + obj.findSetBits(13));
    }
}
