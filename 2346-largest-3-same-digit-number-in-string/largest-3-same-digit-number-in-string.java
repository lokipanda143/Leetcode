class Solution {
    public String largestGoodInteger(String num) {
        String res="";
        for(int i=0;i+2<num.length();i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2)){
                String res2=num.substring(i,i+3);
                if(res2.compareTo(res)>0){
                    res=res2;
                }
            }
        }
        return res;
    }
}