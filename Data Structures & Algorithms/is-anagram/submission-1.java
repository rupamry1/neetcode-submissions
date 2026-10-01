class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
        else{
            char[] saray = s.toCharArray();
            char[] taray = t.toCharArray();

            Arrays.sort(saray);
            Arrays.sort(taray);

            return Arrays.equals(saray,taray);
        }
    }
}

