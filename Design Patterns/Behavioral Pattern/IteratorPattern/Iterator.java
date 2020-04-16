package IteratorPattern;

//Iterator������Ҫ��������������next������hasNext�����������˱��������������ݵ�����������
//remove�������û��ʵ�ֵĻ�Ĭ���ǻ��׳�һ����֧�ָò������쳣��
public interface Iterator<E> {
	boolean hasNext();
    
	E next();
    
	default void remove() {
        throw new UnsupportedOperationException();
    }
}
