package BuilderPattern;

public class Demo {
	public static void main(String[] args) {
        //���Դ�������
        AbstractComputer ac = new TianYiComputer();
        //��װ
        ac.mouse();
        ac.memory();
        ac.disk();
    }
}
