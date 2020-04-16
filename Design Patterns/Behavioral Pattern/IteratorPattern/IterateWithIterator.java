package IteratorPattern;

//ӵ���������ݴ������������һ��ʵ��Iterator�ӿڵĶ��󣬲�ʹ��Iterator�ӿڷ����������ݷ��ʡ�
public class IterateWithIterator {
    private Iterator elements;

    public void setContainer(Iterator newElements) {
        this.elements = newElements;
    }

    // ���ʲ��Ҵ����������ݵķ���
    public void printElemtents() {
        if (elements == null) throw new NullPointerException();
        // ����list�����ڵ�����
        while (elements.hasNext()) {
            System.out.println(elements.next());
        }

    }

    public static void main(String[] args) {
        IterateWithIterator it = new IterateWithIterator();
        it.setContainer(new MyContainer<Byte>().createIterator());
        it.printElemtents();
    }
}
