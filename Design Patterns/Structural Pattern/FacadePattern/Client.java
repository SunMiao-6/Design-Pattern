package FacadePattern;

public class Client {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		GeneralSwitchFacade gsf=new GeneralSwitchFacade();
		gsf.on();
		System.out.println("-----------------");
		gsf.off();
	}

}
