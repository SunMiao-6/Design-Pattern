package StatePattern;

public class DeadState extends ThreadState {
	public DeadState()
	{
		state=StateSet.DEAD;
		System.out.println("�߳�����");
	}
	public void stop(ThreadContext tc) 
	{
		System.out.println("������stop����");
		if(state==StateSet.DEAD)
			tc.setThreadState(new DeadState());
		else
			System.out.println("��ǰ�̲߳�������״̬");
	}

}
