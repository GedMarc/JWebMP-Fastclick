import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.angularfastclick.AngularFastClickModule;
import com.jwebmp.plugins.angularfastclick.AngularFastClickPageConfigurator;

module com.jwebmp.plugins.angularfastclick {
	exports com.jwebmp.plugins.angularfastclick;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;

	provides IPageConfigurator with AngularFastClickPageConfigurator;
	provides IAngularModule with AngularFastClickModule;

}
