package products;

public class InventoryService implements IInventoryService{
	
	public int getNumberInStock(int productNumber){
		return productNumber-20;
	}

}
