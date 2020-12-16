package com.jwebmp.plugins.angularfastclick.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class AngularFastClickModuleInclusion implements IGuiceScanModuleInclusions<AngularFastClickModuleInclusion>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.angularfastclick");
		return set;
	}
}
