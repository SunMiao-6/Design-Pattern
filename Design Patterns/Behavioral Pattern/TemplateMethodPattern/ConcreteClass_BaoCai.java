package TemplateMethodPattern;

//����˺���˵���
public class ConcreteClass_BaoCai extends AbstractCook {

	@Override
	void pourVegetable() {
		// TODO �Զ����ɵķ������
		System.out.println("�¹����߲��ǰ���");
	}

	@Override
	void pourSauce() {
		// TODO �Զ����ɵķ������
		System.out.println("�¹��Ľ���������");
	}

}
