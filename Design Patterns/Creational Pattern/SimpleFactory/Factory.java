package SimpleFactory;

public class Factory {

	public Fruit CreateFruit(String kind) {
		// TODO �Զ����ɵķ������
		if(kind.equals("A"))
			return new Apple();
		if(kind.equals("B"))
			return new Banana();
		return null;
	}

}
