package TemplateMethodPattern;

public class Client {
	 public static void main(String[] args){
		 //�� - ��˺����
		 ConcreteClass_BaoCai BaoCai = new ConcreteClass_BaoCai();
		 BaoCai.cookProcess();

		//�� - ���ز���
		ConcreteClass_CaiXin CaiXin = new ConcreteClass_CaiXin();
		CaiXin.cookProcess();
		
	 }
}
