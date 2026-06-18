class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            // be sure to add delimiter to keep strings seperate 
            // ex: "ab, cd" and "abc, d" both output "abcd"
            sb.append(str.length()).append("#").append(str);
        }
        String encoded_string = sb.toString();
        return encoded_string;

    }

    public List<String> decode(String str) {
        List<String> decoded_string = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {
            // find #
            int slash = str.indexOf('#', i);
            // parse from # to slash 
            int length = Integer.parseInt(str.substring(i, slash));
            // get string using the length 
            String actual = str.substring(slash + 1, slash + 1 + length);
            decoded_string.add(actual);
            // move i pointer past actual to next iteration
            i = slash + 1 + length;
        }
        return decoded_string;
    }
}
