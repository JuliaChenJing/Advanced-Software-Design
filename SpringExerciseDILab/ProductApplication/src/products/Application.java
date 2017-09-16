package products;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {

		//IProductService productService = new ProductService();
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		IProductService productService = context.getBean("productService", IProductService.class);
		
		Product product1 = productService.getProduct(423);
		if (product1 != null) {
			System.out.println(product1.toString());
		}

		Product product2 = productService.getProduct(239);
		if (product2 != null) {
			System.out.println(product2.toString());
		}

	

	}

}
