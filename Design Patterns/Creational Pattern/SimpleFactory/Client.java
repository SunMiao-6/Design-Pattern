package SimpleFactory;

public class Client {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Factory factory=new Factory();
		Fruit fruit=factory.CreateFruit("A");
		fruit.eat();
	}

	public String factory(String fruitname) {
		if(fruitname.equals("Apple"))
			return "Apple";
		if(fruitname.equals("Banana"))
			return "Banana";
		return null;
	}
}
