package IteratorPattern;

//Iterable�ӿ�ʮ�ּ򵥣��ṩһ���������Iteator����ķ���
public interface Iterable<E> {
	Iterator<E> createIterator();
}
