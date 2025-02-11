public class E771JewelsStones {
    public int numJewelsInStones(String jewels, String stones) {
        Set jewelsSet = new HashSet();
        int count = 0;
        for (char jewel: jewels.toCharArray()){
            jewelsSet.add(jewel);
        }
        for (char stone: stones.toCharArray()){
            if (jewelsSet.contains(stone)){
                count++;
            }
        }
        return count;
    }

    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(char c:stones.toCharArray()){
            if(jewels.indexOf(c)!=-1)count++;
        }
        return count;
    }
}
