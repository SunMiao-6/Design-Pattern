package StatePattern;

public class RunnableState extends ThreadState {
	public RunnableState()
	{
		state=StateSet.RUNNABLE;
		System.out.println("����״̬");
	}
	public void getCPU(ThreadContext tc) 
	{
		System.out.println("���CPUʱ��");
		if(state==StateSet.RUNNABLE)
			tc.setThreadState(new RunningState());
		else
			System.out.println("��ǰ�̲߳��Ǿ���״̬");
	}

}
