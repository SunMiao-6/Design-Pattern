package MementoPattern;

public class MementoChess {
	private String label;
	private int x,y;
	
	public MementoChess( String label, int x, int y) {
		// TODO �Զ����ɵĹ��캯�����
		this.label=label;
		this.x=x;
		this.y=y;
	}

	public String getLable() {
		// TODO �Զ����ɵķ������
		return label;
	}
	
	public void setLable(String label) {
		// TODO �Զ����ɵķ������
		this.label=label;
	}
	
	public void SetX(int x) {
		// TODO �Զ����ɵķ������
		this.x=x;	
	}

	public void SetY(int y) {
		// TODO �Զ����ɵķ������
		this.y=y;
	}

	public int getX() {
		// TODO �Զ����ɵķ������
		return x;
	}

	public int getY() {
		// TODO �Զ����ɵķ������
		return y;
	}

	

}
