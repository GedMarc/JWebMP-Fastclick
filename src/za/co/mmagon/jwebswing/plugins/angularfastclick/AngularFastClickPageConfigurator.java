package za.co.mmagon.jwebswing.plugins.angularfastclick;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.base.angular.AngularPageConfigurator;
import za.co.mmagon.jwebswing.base.references.JavascriptReference;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.jwebswing.plugins.jquery.JQueryPageConfigurator;

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
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/FastClick.jar/download"
)
@ComponentInformation(name = "Angular Auto Expand",
		description = "Auto Expands Components with Angular",
		url = "https://www.akveo.com/products.html")
public class AngularFastClickPageConfigurator extends PageConfigurator
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new AngularAutoExpandPageConfigurator
	 */
	public AngularFastClickPageConfigurator()
	{
		//Nothing needed
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(page.getBody(), true);
			AngularPageConfigurator.setRequired(page.getBody(), true);
			page.getAngular().getAngularModules().add(new AngularFastClickModule());

			page.getBody().addJavaScriptReference(new JavascriptReference("FastClickReference", 4.003, "bower_components/ng-fastclick/dist/index.min.js", 11));
		}
		return page;
	}
}
