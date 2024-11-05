package com.restAPI.code;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.restAPI.code.modules.Product;
import com.restAPI.code.repositories.ProductRepository;

@Component
public class DataSeeder implements CommandLineRunner{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void run(String ...args) throws Exception {
		if(productRepository.count()==0) {
			List<Product> products = Arrays.asList(
					new Product("Front Load Machine", "Samsung", "https://assets.ccbp.in/frontend/react-js/ecommerce/appliances-washing-machine.png", "Washing Machines", 22490, 4.5, 1, 2563),
					new Product("Collider Black Dial Men's Watch", "Fossil", "https://assets.ccbp.in/frontend/react-js/ecommerce/electronics-simple-belt-watch.png", "Watches", 14995, 4.3, 1, 987),
					new Product("True Wireless Earbuds", "LG", "https://assets.ccbp.in/frontend/react-js/ecommerce/appliances-ear-buds.png", "Electronics", 13499, 4.4, 1, 1542),
					new Product("Maritime Men's Watch", "Titan", "https://assets.ccbp.in/frontend/react-js/ecommerce/electronics-tatar-watch.png", "Watches", 11999, 4.3, 0, 482),
					new Product("Neutra Analog Men's Watch", "Fossil", "https://assets.ccbp.in/frontend/react-js/ecommerce/electronics-simple-watch.png", "Watches", 10995, 4.1, 1, 765),
					new Product("Monsters Charm Toy", "Trendytap", "https://assets.ccbp.in/frontend/react-js/ecommerce/toys-minnos.png", "Toys", 8600, 4.2, 1, 1198),
					new Product("Privateer Quartz Watch", "Fossil", "https://assets.ccbp.in/frontend/react-js/ecommerce/electronics-royal-black-watch.png", "Watches", 8122, 4.4, 0, 532),
					new Product("Chronograph Black Watch", "Fossil", "https://assets.ccbp.in/frontend/react-js/ecommerce/electronics-royal-watch.png", "Watches", 6395, 3.8, 1, 439),
					new Product("Podcast Microphone", "MAONO", "https://assets.ccbp.in/frontend/react-js/ecommerce/appliances-singing-mike.png", "Electronics", 5555, 4.4, 1, 1153),
					new Product("Virgin Avocado Oil", "ProV", "https://assets.ccbp.in/frontend/react-js/ecommerce/grocery-oil.png", "Groceries", 4144, 4.4, 1, 976),
					new Product("Wrap Dress", "Vero Moda", "https://assets.ccbp.in/frontend/react-js/ecommerce/clothes-simple-formal.png", "Clothing", 3039, 3.2, 1, 328),
					new Product("Warm Up Jacket", "Monte Carlo", "https://assets.ccbp.in/frontend/react-js/ecommerce/clothes-sim-jacket.png", "Clothing", 2796, 4.4, 0, 612)

			);
			productRepository.saveAll(products);
			System.out.println("Products are seeded...");
		}
	}
}
