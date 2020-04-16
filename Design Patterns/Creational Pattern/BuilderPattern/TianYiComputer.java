package BuilderPattern;

//��������510Pro��������
public class TianYiComputer extends AbstractComputer {

	  @Override
	    public void display() {
	        System.out.println("����23Ӣ�糬����Ļ");
	    }
	 
	    @Override
	    public void cpu() {
	        System.out.println("Intel Core I5-7400,��������6MB,4�ˣ�3.00GHz");
	    }
	 
	    @Override
	    public void memory() {
	        System.out.println("DDR4 8G�ڴ棬������ݵ�32G");
	    }
	 
	    @Override
	    public void disk() {
	        System.out.println("1TB���������ڴ棬ת��7200ת/����");
	    }
	 
	    @Override
	    public void mainboard() {
	        System.out.println("���ض�����");
	    }
	 
	    @Override
	    public void keyboard() {
	        System.out.println("�������߼���");
	    }
	 
	    @Override
	    public void mouse() {
	        System.out.println("�����������");
	    }
	 
	    @Override
	    public void crate() {
	        System.out.println("���������з�ideacentre����");
	    }
}
