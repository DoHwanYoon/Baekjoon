package FinalTest2019_2;

public class ChildClass extends ParentsClass {
	int num1;
	int num2;
	
	@Override
	double Control(double r) {
		System.out.println("ChildClass�� �Լ��� ���.");
		return super.Control(r);
	}

	ChildClass() {
		this.number = 0;
	}
	
	public static void main(String[] args) {
		ChildClass b = new ChildClass();
		System.out.println(b.Control(6));
	}
}
