package BridgePattern;

//̨ʽ����
public class Desktop extends Computer {
	public Desktop(Brand b) {
        super(b);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("����̨ʽ����");
    }
}

