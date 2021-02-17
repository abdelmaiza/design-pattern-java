package dz.cirta.designspattern.creational.factory.factorywebsite;

import dz.cirta.designspattern.creational.factory.factorywebsite.website.Blog;
import dz.cirta.designspattern.creational.factory.factorywebsite.website.Shop;
import dz.cirta.designspattern.creational.factory.factorywebsite.website.Website;
import dz.cirta.designspattern.creational.factory.factorywebsite.website.type.WebsiteType;

public class WebsiteFactory {

	public static Website getWebsite(WebsiteType siteType) {
		switch(siteType) {
			case BLOG : {
				return new Blog();
			}
		
			case SHOP : {
				return new Shop();
			}
			
			default : {
				return null;
			}
 		}
	}
}
