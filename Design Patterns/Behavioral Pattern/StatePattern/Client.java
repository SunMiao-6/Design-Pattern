package StatePattern;

public class Client {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ThreadContext tc=new ThreadContext();
		tc.start();
		tc.getCPU();
		//tc.suspend();
		tc.stop();
	}
}
