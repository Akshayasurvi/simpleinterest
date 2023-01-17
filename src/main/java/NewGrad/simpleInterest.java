package NewGrad;

public class simpleInterest {
	public float si(float p,float r,float t) {
		return (p*r*t/100);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simpleInterest o=new simpleInterest();
		float r=o.si(5000, 7, 2);
		System.out.println(r);

	}

}
