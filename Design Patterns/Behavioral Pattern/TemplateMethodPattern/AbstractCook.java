package TemplateMethodPattern;

public abstract class AbstractCook {
	//ģ�巽�����������Ƴ��˵����� �����˵�������һ����-���ã�
	//����Ϊfinal����ϣ�����า�������������ֹ�������̵�ִ��˳�� 
	final void cookProcess(){
		this.pourOil();          //��һ��������
		this.HeatOil();          //�ڶ���������
	    this.pourVegetable();    //�����������߲�
	    this.pourSauce();        //���Ĳ�������ζ��
	    this.fry();              //���岽������
	}
	//����ṹ����Щ���������й��̶���һ���Ŀɸ��õģ���Щ����Ҫ�������ʵ�ֵ�

	//��һ����������һ���ģ�����ֱ��ʵ��
	void pourOil(){  
		System.out.println("����");  
		}  

	//�ڶ�����������һ���ģ�����ֱ��ʵ��
	void  HeatOil(){  
		System.out.println("����");  
		}  
	
	//��������Ϊ���󷽷�������������ʵ�� 
	abstract void  pourVegetable();
	
	//���Ĳ�������ζ���ǲ�һ���ģ�һ����������һ���������أ�
	//��������Ϊ���󷽷�������������ʵ�� 
	abstract void  pourSauce();
	
	//���岽��������һ���ģ�����ֱ��ʵ��
	void fry(){  
		System.out.println("�������������찡");  
		} 
}
	