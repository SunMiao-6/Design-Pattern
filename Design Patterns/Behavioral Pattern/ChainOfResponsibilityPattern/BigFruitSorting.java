package ChainOfResponsibilityPattern;

public class BigFruitSorting extends AbstractFruitSort {

	public BigFruitSorting(int weight) {
		super(weight);
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	protected void pushBox(String fruit) {
		// TODO �Զ����ɵķ������
		fruitBox.add("����:"+fruit);

	}

}