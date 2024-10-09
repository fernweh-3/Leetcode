import java.util.ArrayList;

public class M208ImplementTrie {

    class Trie {
        private ArrayList<String> arrayList;

        public Trie() {
            arrayList = new ArrayList<>();
        }

        public void insert(String word) {
            arrayList.add(word);
        }

        public boolean search(String word) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (word.equals(arrayList.get(i))){
                    return true;
                }
            }
            return false;
        }

        public boolean startsWith(String prefix) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i).startsWith(prefix)){
                    return true;
                }
            }
            return false;
        }
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */