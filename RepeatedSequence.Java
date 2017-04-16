/*All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG". When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.

Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.
*/




public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<String>();
        HashMap<String, Boolean> map = new HashMap<String, Boolean>();
        int len = s.length();
        for (int i = 0; i < len - 9; i++) {
            String str = s.substring(i, i + 10);
            if (!map.containsKey(str))
                map.put(str, true);
            else {
                if (map.get(str))
                    res.add(str);
                map.put(str, false);
            }
        }
        return res;
    }
}