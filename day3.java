public class day3 {
    public static void main(String[] args) {
        String s = "aba";
        String ans = "" ;
        for(int i=s.length()-1;i>=0;i-- ){
            ans = ans +s.charAt(i);
        }
        System.out.println(ans);// reverse a string
        if(ans.equals(s)){
            System.out.println("its a palindrome");
        }
        else{
            System.out.println("its not a palindrome");
        }// palindrome
    }
    
}
