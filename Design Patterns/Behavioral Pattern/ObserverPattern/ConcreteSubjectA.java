package ObserverPattern;

public class ConcreteSubjectA extends SubjectS {
	public ConcreteSubjectA()
	{
		super();
	}
	@Override
	public void notifyObserver() {
		// TODO �Զ����ɵķ������
		System.out.println("AĿ�귢���˸ı�");
		for(ObserverS obs:observers)
		{
			obs.response();
		}
	}
}
