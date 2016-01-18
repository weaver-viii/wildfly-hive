package org.jboss.tools.servers.wildfly.swarm.core.internal.server.wst;
/******************************************************************************* 
 * Copyright (c) 2015 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Fred Bricon - Initial API and implementation 
 ******************************************************************************/


import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.wst.server.core.IModule;
import org.eclipse.wst.server.core.model.ServerDelegate;
import org.jboss.tools.servers.wildfly.swarm.core.internal.Activator;

public class WildFlySwarmServerDelegate extends ServerDelegate {
	
	public IStatus canModifyModules(IModule[] add, IModule[] remove) {
		return new Status(IStatus.WARNING, Activator.PLUGIN_ID, "This server doesn't support modules");
	}

	public IModule[] getChildModules(IModule[] module) {
		return new IModule[0];
	}

	public IModule[] getRootModules(IModule module) throws CoreException {
		return new IModule[] { module };
	}

	@Override
	public void modifyModules(IModule[] add, IModule[] remove, IProgressMonitor monitor) throws CoreException {

	}

	
}
