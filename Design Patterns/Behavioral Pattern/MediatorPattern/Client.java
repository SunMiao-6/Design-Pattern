package MediatorPattern;

public class Client {
	public static void main(String[] args) {
		AbstractChatroom happyChat=new ChatGroup();
		Member member1,member2,member3,member4;
		member1=new DiamondMember("����");
		member2=new DiamondMember("С��");
		member3=new CommonMember("����");
		member4=new CommonMember("���");
		
		happyChat.register(member1);
		happyChat.register(member2);
		happyChat.register(member3);
		happyChat.register(member4);
		
		member1.sendText("����", "I LOVE YOU");
		member2.sendText("���", "LOVE YOU");
		member1.sendImage("����", "����֮��");
		member2.sendImage("���", "�ͷ׶�����");
		
		member3.sendText("����", "I LOVE YOU,TOO");
		member4.sendText("С��", "LOVE YOU,TOO");
		member3.sendImage("����", "����ҹ֮��");
		member4.sendImage("С��", "���֮��");
		
	}

}
