package CRIO_DS_solutions;

	import java.util.*;
	import java.util.Map.Entry;

class LongestPalindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int res = longestPalindrome(n, s);

        System.out.println(res);
    }

////    @SuppressWarnings("unlikely-arg-type")
//	@SuppressWarnings("unlikely-arg-type")
	static int longestPalindrome(int n, String s) {
    	
    	HashMap<Character,Integer> hm=new HashMap<>();
    	int ans=0;
    	boolean flag=false;
    	
    	for(char c:s.toCharArray()) {
    		
    		if(hm.containsKey(c)) {
    			hm.put(c, hm.get(c)+1);
    		}else {
    			hm.put(c, 1);
    		}
    		
    		
    	}
    	for(Entry<Character, Integer> key:hm.entrySet()) {

    			
    		int count = key.getValue();
            if (count % 2 == 0) {
                ans += count;
            } else if (count% 2 == 1) {
                flag = true;
                ans += (count / 2) * 2;
            }
    	
    	}
    	if(flag) {
    		ans+=1;
    	}
    	
    	
    	
    	
    	
    	
    	
        return ans;
    }
}