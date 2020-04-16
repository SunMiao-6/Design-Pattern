package MementoPattern;

public class Client {
	public static void main(String[] args) {
		OriginatorChess chess=new OriginatorChess(new MementoChess("��",2,2));
		
		play(chess);
		chess.SetX(3);
		play(chess);
		chess.SetY(6);
		play(chess);
		undo(chess,index);
		undo(chess,index);
		redo(chess,index);
		redo(chess,index);
	}

	private static int index=0;
	private static CaretakerChess caretaker=new CaretakerChess();
	private static void play(OriginatorChess chess) {
		// TODO �Զ����ɵķ������
		index++;
		caretaker.AddMem(chess.SavetoMemento());
		chess.Show();
	}
	
	private static void undo(OriginatorChess chess, int i) {
		// TODO �Զ����ɵķ������
		System.out.println("**********����**********");
		index--;
		chess.Restore(caretaker.getMem(index-1));
		chess.Show();
	}
	private static void redo(OriginatorChess chess, int i) {
		// TODO �Զ����ɵķ������
		System.out.println("*********��������*********");
		chess.Restore(caretaker.getMem(index));
		index++;
		chess.Show();
	}
}
