package BridgePattern;

//�ʼǱ�����
public class Laptop extends Computer {
	public Laptop(Brand b) {
        super(b);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("���۱ʼǱ�");
    }
}
