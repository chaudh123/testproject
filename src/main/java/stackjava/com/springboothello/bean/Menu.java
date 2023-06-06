package stackjava.com.springboothello.bean;

public class Menu {
	private String name;
	private String path;
	private String title;

	@Override
	public String toString() {
		return "Menu{" + "naa='" + name + '\'' + ", path='" + path + '\'' + ", titlee='" + title + '\'' + '}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
