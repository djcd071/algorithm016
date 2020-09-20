package Week_02;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramGroup {

    /**
     * 思路：采用排序后字符串作为hashmap key
     * 击败74.95%
     * 时间复杂度：O(KNlogN) K为strs长度，N为strs中最长字符串长度
     * 空间复杂度：O(n)
     *
     * @param strs
     * @return
     */
//    public List<List<String>> groupAnagrams(String[] strs) {
//        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
//        for (String s : strs){
//            char[] chars = s.toCharArray();
//            Arrays.sort(chars);
//            map.computeIfAbsent(new String(chars), k -> new ArrayList<>());
//            map.get(new String(chars)).add(s);
//        }
//        return new ArrayList<>(map.values());
//    }

}
