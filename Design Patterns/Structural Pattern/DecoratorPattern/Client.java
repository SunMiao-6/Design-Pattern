package DecoratorPattern;

public class Client {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		IBirthdayCake BirthdayCake=new Cake();
		BirthdayCake.Show();
		Cream cream=new Cream(BirthdayCake);
		cream.putCream();
		//cream.Show();
		
		Fruit fruit=new Fruit(cream);
		fruit.putFruit();
		fruit.Show();

	}

}
