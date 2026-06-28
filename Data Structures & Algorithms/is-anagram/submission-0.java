class Solution {
    public boolean isAnagram(String s, String t) {

        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        String a = String.valueOf(first);
        String b = String.valueOf(second);

        return a.equals(b);
    }
}
