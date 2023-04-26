public class palindromo {
    public static void main(String[] args) {
        boolean flag=palindormoCheck("anilina");
        System.out.println(flag);
    }

    public boolean palindromoCheck(String s) {
        if (s.length()==0||s.length()==1) {
            return true;
        }
        if (s.charAt(0)==s.charAt(s.length()-1)){
            return palindromoCheck(s.substring(1,s.length()-1));
        }
        return false;
    }
}
