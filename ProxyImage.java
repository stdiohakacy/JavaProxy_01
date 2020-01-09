package structual.Proxy._01;

public class ProxyImage implements Image {

	private Image image;
	private String url;

	public ProxyImage(String url) {
		this.url = url;
	}

	@Override
	public void showImage() {
		if(image == null) {
			image = new RealImage(this.url);
		}else {
			System.out.println("Image already existed " + this.url);
		}
		image.showImage();
	}

}
