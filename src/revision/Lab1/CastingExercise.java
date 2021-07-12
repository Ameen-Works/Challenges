package revision.Lab1;

public class CastingExercise {
	public static void main(String[] args) {
		long l=32222222099999999l;
		System.out.println(l);
		int i=(int)l;
		System.out.println(i);
		short s=(short)i;
		System.out.println(s);
		byte b=(byte)s;
		System.out.println(b);
		System.out.println("----------------------");
		byte x=90;
		byte y=127;
		int z=(int) (x*y);
		System.out.println(z+" "+x*y);
				
	}
}
