package ProxyPattern;

public class CLocalShowPic implements Runnable, IShowPic {
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		pic.ShowPic(picname);
		System.out.println(picname+"ͼƬ�������");

	}
	private IShowPic pic;
	private String picname;
	@Override
	public void ShowPic(String picname) {
		// TODO �Զ����ɵķ������
		pic=new CRemoPic();
		this.picname=picname;
		System.out.println("׼������ͼƬ"+picname);
		Thread th=new Thread(this);
		th.start();

	}



}
