package FactoryMethodPattern;

import java.io.File;
import javax.xml.parsers.*;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
  
	//�÷������ڴ�XML�ļ�����ȡ������������������һ��ʵ������
	public static Object getBean() {
		try {
			//�����ĵ�����
			DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
			DocumentBuilder builder=dFactory.newDocumentBuilder();
			Document doc;
			doc=builder.parse(new File("config.xml"));
			
			//��ȡ�����������ı��ڵ�
			NodeList nl=doc.getElementsByTagName("className");
			Node classNode=nl.item(0).getFirstChild();
			String cName=classNode.getNodeValue();
			
			//ͨ����������ʵ�������䷵��
			Class c=Class.forName(cName);
			Object obj=c.newInstance();
			return obj;			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
	}

}
