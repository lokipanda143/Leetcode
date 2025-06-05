class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer>index_vals=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].contains(String.valueOf(x))){
                index_vals.add(i);
            }
        }
        return index_vals;
    }
}