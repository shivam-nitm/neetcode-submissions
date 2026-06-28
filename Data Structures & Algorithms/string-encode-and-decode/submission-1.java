class Solution {

   public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
            var s =strs.stream().map(st -> st.length() +"#"+st).map(sb::append).toList();
            return sb.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> list = new ArrayList<>();
        while (i < str.length()) {
            int indexOfDelimiter = str.indexOf("#", i);
            if (indexOfDelimiter == -1) {
                break;
            }
            int lengthOfString = Integer.parseInt(str.substring(i, indexOfDelimiter));
            int lastIndex = indexOfDelimiter+lengthOfString+1;
            String s1 =  str.substring(indexOfDelimiter+1, lastIndex);
            list.add(s1);
            i = lastIndex;
        }
        return list;
    }
}
