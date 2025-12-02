public class plandrome {
    public static void main(String[] args) {
        String a=" navin ";
        String b="";

        for(int i=a.length()-1; i>=0; i--)
        {
            b=b+a.charAt(i);

        }
        if(a.equals(b)){
            System.out.println(" is palandrom ");
        }
        else{
            System.out.println(" not a palandrom ");
        }
    }
}
