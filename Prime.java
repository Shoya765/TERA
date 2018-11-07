//100ˆÈ‰º‚Ì‘f”‚ğ•\¦‚·‚é
class Prime{
public static void main(String[] args){

System.out.println("Prime : ");
for(int i=2;i<100;i++){
  int x = 0;
			for(int j = i/2; j > 1; j--){
				if( i%j != 0){continue;}
				else{x=1;
        break;}
			}
			if(x==0){
				System.out.print(i+" ");
			}
		}
	}
}
