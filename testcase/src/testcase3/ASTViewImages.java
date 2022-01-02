/*******************************************************************************
 * Copyright (c) 2000, 2006 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package testcase3;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.resource.ImageDescriptor;

import org.osgi.framework.Bundle;

/**
 * @stereotype BOUNDARY 
 */
public class ASTViewImages {

	private static final IPath ICONS_PATH= new Path("$nl$/icons"); 

	/**
	 * @stereotype COLLABORATOR 
	 */
	public static void setImageDescriptors(IAction action, String type) {
		ImageDescriptor id= create("d", type); //$NON-NLS-1$
		if (id != null)
			action.setDisabledImageDescriptor(id);

		id= create("e", type); //$NON-NLS-1$
		if (id != null) {
			action.setHoverImageDescriptor(id);
			action.setImageDescriptor(id);
		} else {
			action.setImageDescriptor(ImageDescriptor.getMissingImageDescriptor());
		}
	}

	/**
	 * @stereotype COLLABORATOR 
	 */
	private static ImageDescriptor create(String prefix, String name) {
		IPath path= ICONS_PATH.append(prefix).append(name);
		return createImageDescriptor(null, path);
	}

	/*
	 * Since 3.1.1. Load from icon paths with $NL$
	 */
	/**
	 * @stereotype COLLABORATOR 
	 */
	public static ImageDescriptor createImageDescriptor(Bundle bundle, IPath path) {
		URL url= FileLocator.find(bundle, path, null);
		if (url != null) {
			return ImageDescriptor.createFromURL(url);
		}
		return null;
	}

	/**
	 * @stereotype CONSTRUCTOR 
	 */
	private ASTViewImages() {
	}
}
