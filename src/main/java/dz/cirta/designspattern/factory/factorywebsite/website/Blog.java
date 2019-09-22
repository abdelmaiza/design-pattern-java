package dz.cirta.designspattern.factory.factorywebsite.website;

import dz.cirta.designspattern.factory.factorywebsite.page.AboutPage;
import dz.cirta.designspattern.factory.factorywebsite.page.CommentPage;
import dz.cirta.designspattern.factory.factorywebsite.page.ContactPage;
import dz.cirta.designspattern.factory.factorywebsite.page.PostPage;

public class Blog extends Website {

	@Override
	public void createWebsite() {
		pages.add(new PostPage());
		pages.add(new AboutPage());
		pages.add(new CommentPage());
		pages.add(new ContactPage());
	}

}
