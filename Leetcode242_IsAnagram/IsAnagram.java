import java.util.*;;
public class IsAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
           return false;
       char[] ch1 = s.toCharArray();
       char[] ch2 = t.toCharArray();
       Arrays.sort(ch1);
       Arrays.sort(ch2);
       for(int i=0;i<ch1.length;i++)
       {
           if(ch1[i]!=ch2[i])
               return false;
       }
       return true;
   }
   public static void main(String[] args) {
        String s = "racecar";
        String t = "carrace";
        System.out.println(isAnagram(s,t));
   }
}
