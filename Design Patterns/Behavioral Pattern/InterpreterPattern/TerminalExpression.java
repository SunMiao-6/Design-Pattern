package InterpreterPattern;

public class TerminalExpression implements Expression {
	
	private String data;
	public TerminalExpression(String data) {
		// TODO �Զ����ɵĹ��캯�����
		this.data=data;
	}
	
	@Override
	public boolean interpret(String context) {
		// TODO �Զ����ɵķ������
		if(context.contains(context))
			return true;
		return false;
	}
}
