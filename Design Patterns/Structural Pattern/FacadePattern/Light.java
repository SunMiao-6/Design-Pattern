package FacadePattern;

public class Light {
	private String position;

	public Light(String position) {
		// TODO �Զ����ɵĹ��캯�����
		this.position=position;
	}

	public void on() {
		// TODO �Զ����ɵķ������
		System.out.println(this.position+"�ƿ�");
	}

	public void off() {
		// TODO �Զ����ɵķ������
		System.out.println(this.position+"�ƹ�");
	}

}
