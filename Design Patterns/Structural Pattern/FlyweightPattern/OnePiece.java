package FlyweightPattern;

public class OnePiece extends APiece {

	public OnePiece(String inKind) {
		super(inKind);
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void Play(int x, int y) {
		// TODO �Զ����ɵķ������
		System.out.println("��"+inKind+"�ӷ���("+x+","+y+")��λ��");
	}

}
