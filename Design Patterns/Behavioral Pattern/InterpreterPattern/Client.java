package InterpreterPattern;

public class Client {
	public static void main(String[] args) {
		Expression isMale=getMaleExpression();
		Expression isMarriedWomen=getMarriedWomenExpression();
		
		System.out.println("John is male?"+isMale.interpret("Joh"));
		System.out.println("Julie is a married women?"+isMarriedWomen.interpret("Married Julie"));
	}
	
    //����Robert��John������
	private static Expression getMarriedWomenExpression() {
		// TODO �Զ����ɵķ������
		Expression robert=new TerminalExpression("Robert");
		Expression john=new TerminalExpression("John");
		return new OrExpression(robert, john);
	}
	
	//����Julie��һ���ѻ��Ů��
	private static Expression getMaleExpression() {
		// TODO �Զ����ɵķ������
		Expression julie=new TerminalExpression("Julie");
		Expression married=new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}
}
