package DProxyPattern;

public class CTest implements ITestInterface {

	@Override
	public void SendMessage(String mes) {
		// TODO �Զ����ɵķ������
		for(int i=5;i>=0;i--)
		{
			System.out.println(mes+"�о�����"+i+"�뵽��ս����");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
		System.out.println(mes+"�о��ѵ���ս����");

	}

}
