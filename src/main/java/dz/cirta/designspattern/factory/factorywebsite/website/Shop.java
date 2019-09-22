package dz.cirta.designspattern.factory.factorywebsite.website;

import dz.cirta.designspattern.factory.factorywebsite.page.CartPage;
import dz.cirta.designspattern.factory.factorywebsite.page.ItemPage;
import dz.cirta.designspattern.factory.factorywebsite.page.SearchPage;

public class Shop extends Website {

	@Override
	public void createWebsite() {
		pages.add(new CartPage());
		pages.add(new ItemPage());
		pages.add(new SearchPage());
	}

}
