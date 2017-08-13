package app;
public class Drive extends FileSystemComposite {
	public Drive(String name) {
		super(name);
	}

	public void print() {

		System.out.println("- drive " + name + " size=" + getSizeInBytes() + "bytes");
		for (FileSystemComponent component : list) {
			component.print();
		}
	}
}