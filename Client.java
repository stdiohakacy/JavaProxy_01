package structual.Proxy._01;

public class Client {
	public static void main(String[] args) {
		ProxyImage proxyImage = new ProxyImage("https://gpcoder.com/favicon.ico");

		proxyImage.showImage();

		proxyImage.showImage();
	}
}
