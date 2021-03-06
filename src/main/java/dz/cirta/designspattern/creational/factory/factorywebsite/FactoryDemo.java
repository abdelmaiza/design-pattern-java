package dz.cirta.designspattern.creational.factory.factorywebsite;

import dz.cirta.designspattern.creational.factory.factorywebsite.website.Website;
import dz.cirta.designspattern.creational.factory.factorywebsite.website.type.WebsiteType;

public class FactoryDemo {

	public static void main(String[] args) {
		Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
		
		System.out.println(site.getPages());
		
		site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
		
		System.out.println(site.getPages());
	}

}
