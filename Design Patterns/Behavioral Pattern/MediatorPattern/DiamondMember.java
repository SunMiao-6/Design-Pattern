package MediatorPattern;

public class DiamondMember extends Member {
	public DiamondMember(String name) {
		super(name);
	}

	@Override
	public void sendText(String to, String message) {
		// TODO �Զ����ɵķ������
		System.out.println("��ʯ��Ա������Ϣ��");
		chatroom.sendText(name, to, message);

	}

	@Override
	public void sendImage(String to, String image) {
		// TODO �Զ����ɵķ������
		System.out.println("��ʯ��Ա����ͼƬ��");
		chatroom.sendText(name, to, image);


	}

}
