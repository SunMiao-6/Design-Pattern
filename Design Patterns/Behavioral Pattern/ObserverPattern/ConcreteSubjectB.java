package ObserverPattern;

public class ConcreteSubjectB extends SubjectS {
	public ConcreteSubjectB()
	{
		super();
	}
	@Override
	public void notifyObserver() {
		// TODO �Զ����ɵķ������
		System.out.println("BĿ�귢���˸ı�");
		for(ObserverS obs:observers)
		{
			obs.response();
		}
	}

}
