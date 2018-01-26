package Warrior;

import java.util.*;

public class TheFauna {
    public static void main(String[] args){

        lengthEachScene(Arrays.asList('a', 'b', 'c', 'a'));

    }
    static List<Integer> lengthEachScene(List<Character> inputList){
        List<Shot> shots = new ArrayList<>();
        Map<Character, Shot> ref = new HashMap<>();

        for(int i=0; i < inputList.size(); i++){
            Character c = inputList.get(i);
            if(ref.get(c) == null) {
                ref.put(c, new Shot(i, i));
            } else{
                Shot shot = ref.get(c);
                shot.setLastIndex(i);
                ref.put(c, shot);
            }
            System.out.println(ref);
        }
        return Collections.emptyList();
    }

}

class Shot{
    private Character ch;
    private int startIndex, lastIndex;

    public Shot(int startIndex, int lastIndex) {
        this.ch = ch;
        this.startIndex = startIndex;
        this.lastIndex = lastIndex;
    }

    public int getLength(){
        return (this.lastIndex + 1) - this.startIndex;
    }

    public Character getCh() {
        return ch;
    }

    public void setCh(Character ch) {
        this.ch = ch;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getLastIndex() {
        return lastIndex;
    }

    public void setLastIndex(int lastIndex) {
        this.lastIndex = lastIndex;
    }

    @Override
    public String toString() {
        return "Shot{" +
                "ch=" + ch +
                ", startIndex=" + startIndex +
                ", lastIndex=" + lastIndex +
                '}';
    }
}
