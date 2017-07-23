
public class Directory extends FileSystemComposite {
	public Directory(String name) {
		super(name);
	}

	public void print() {
		System.out.println("-- dir " + name + " size=" + getSizeInBytes() + "bytes");
		for (FileSystemComponent component : list) {
			component.print();
		}
	}
}