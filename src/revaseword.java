public class revaseword {
    public void main (String[]args){
        String a=" exception in thread main ";// revarse word
        String b[]=a.split(" ");
        String c="";
        for(int i=b.length-1; i>0; i--){
            c=c+b[i]+' ';
        }
        System.out.println("output: "+c);
    }
}
