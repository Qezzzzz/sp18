public class TriangleDrawer{
    public static void drawTriangle(int N){
	String s="*";
	for(int k=0;k<N;k++){
	System.out.println(s);
	s=s+"*";
}

}
    public static void main(String[] args){

	drawTriangle(10);
}

}
