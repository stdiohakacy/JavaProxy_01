package structual.Proxy._01;

public class RealImage implements Image {

	private String url;

	public RealImage(String url) {
		this.url = url;
	}

	@Override
	public void showImage() {
		System.out.println("Show real image " + url);
	}

}
