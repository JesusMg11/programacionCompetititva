package RetosV1;

/**
 *
 * @author Jesus
 */
import java.io.*;
public class Re217_Calle {
    public static void main(String[] args) {
        try{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int x=0;
    do{
        x=Integer.parseInt(br.readLine());
        int res=0;
        res=x%2;
        if (x==0) {
            break;
        }else{
        if (res==0) {
            System.out.println("DERECHA");
        }else if (res>0) {
            System.out.println("IZQUIERDA");
        }}
    }while(x!=0);
}catch(Exception e){
            System.err.println(e.getMessage());
} 
    }
   
}
