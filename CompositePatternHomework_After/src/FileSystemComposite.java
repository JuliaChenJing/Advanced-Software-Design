import java.util.ArrayList;
import java.util.Collection;

public abstract class FileSystemComposite extends FileSystemComponent {
	protected Collection<FileSystemComponent> list = new ArrayList<FileSystemComponent>();

	public FileSystemComposite(String name) {
		super(name);
	}

	public void addComponent(FileSystemComponent component) {
		list.add(component);
	}

	public int getSizeInBytes() {
		int sizeInBytes = 0;
		for (FileSystemComponent component : list) {
			sizeInBytes += component.getSizeInBytes();
		}
		return sizeInBytes;
	}
}