package com.jwebmp.plugins.angularfastclick;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.angular.AngularPageConfigurator;
import com.jwebmp.core.base.references.JavascriptReference;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

/**
 * Allows for elements to have an auto expand by adding a class
 *
 * @author Marc Magon
 * @since 16 Jun 2017
 */
@PluginInformation(pluginName = "Angular Fast Click",
		pluginDescription = "Auto Fast Click to override the 300ms delay",
		pluginUniqueName = "jwebswing-angular-fastclick",
		pluginVersion = "1.0.0",
		pluginCategories = "angular,fast click,ui,web ui, framework",
		pluginSubtitle = "Fast Click Components with Angular",
		pluginSourceUrl = "https://www.npmjs.com/package/angular-fastclick",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-Fastclick/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-Fastclick",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://www.npmjs.com/package/angular-fastclick",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/FastClick.jar/download")
@ComponentInformation(name = "Angular Auto Expand",
		description = "Auto Expands Components with Angular",
		url = "https://www.akveo.com/products.html")
public class AngularFastClickPageConfigurator
		implements IPageConfigurator
{
	/*
	 * Constructs a new AngularAutoExpandPageConfigurator
	 */
	public AngularFastClickPageConfigurator()
	{
		//Nothing needed
	}

	@NotNull
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);
			AngularPageConfigurator.setRequired(true);
			page.getBody()
			    .addJavaScriptReference(new JavascriptReference("FastClickReferenceJS", 4.003, "bower_components/ng-fastclick/dist/index.min.js", 11));
		}
		return page;
	}
}
