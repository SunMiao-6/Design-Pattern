package StrategyPattern;

public class Client {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Chef chef=new Chef();
		ICutFruit cut=new MultiBlade();
		chef.SetCutMethod(cut);
		chef.CutFruit("����");
	}

}
