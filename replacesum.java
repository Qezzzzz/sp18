public class replacesum{

    public static void replace(int[] a,int n){
                 
	for(int k=0;k<a.length-1;k++){
              int sum=0;                            
		if(a[k]<=0) continue;
			if(k+n>a.length-1){
				for(int i=k;i<=a.length-1;i++){
					sum=sum+a[i];	     }	
				a[k]=sum;
				
					     }
			else{
				for(int i=k;i<=k+n;i++){
			sum=sum+a[i];			    }
				a[k]=sum;
}
				          }

                                              }


public static void main(String[] args){
   int[] a={1,-1,-1,10,5,-1};
	int n=2;
	replace(a,n);

}






			     }