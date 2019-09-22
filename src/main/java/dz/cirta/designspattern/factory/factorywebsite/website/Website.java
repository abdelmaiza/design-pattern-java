package dz.cirta.designspattern.factory.factorywebsite.website;

import dz.cirta.designspattern.factory.factorywebsite.page.Page;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

	protected List<Page> pages = new ArrayList<>();
	
	public List<Page> getPages() {
		return pages;
	}

	public Website() {
		this.createWebsite();
	}
	
	protected abstract void createWebsite();
	
}
