package DProxyPattern;

public class Client {
	public static void main(String[] args) {
		/*IShowPic isp=new CRemoPic();
		CLocalPicShow cpic=new CLocalPicShow(isp);
		IShowPic localpic=(IShowPic)cpic.getProxyInstance();
		localpic.ShowPic("Photo");*/  //��̬����
		
		ITestInterface ipic=new CTest();
		ITestInterface proxy=(ITestInterface)new CLocalPicShow(ipic).getProxyInstance();
		proxy.SendMessage(" ");     //��̬����
	}

}
