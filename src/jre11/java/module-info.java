import com.jwebmp.plugins.angularfastclick.implementations.AngularFastClickModuleInclusion;

module com.jwebmp.plugins.angularfastclick {
	exports com.jwebmp.plugins.angularfastclick;

	requires com.jwebmp.core;
	requires com.guicedee.logmaster;

	requires jakarta.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angularfastclick.AngularFastClickPageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularModule with com.jwebmp.plugins.angularfastclick.AngularFastClickModule;

	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.angularfastclick.implementations.AngularFastClickExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with AngularFastClickModuleInclusion;

}
