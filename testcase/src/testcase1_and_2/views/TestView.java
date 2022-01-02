package testcase1_and_2.views;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import javax.inject.Inject;


/**
 * @stereotype BOUNDARY COMMANDER 
 */
public class TestView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "testcase1.views.SampleView";

	@Inject IWorkbench workbench;
	
	private TableViewer viewer;
	 
	/**
	 * @stereotype COMMAND COLLABORATOR 
	 */
	@Override
	public void createPartControl(Composite parent) {
		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		
		viewer.setContentProvider(ArrayContentProvider.getInstance());
		viewer.setInput(new String[] { "One", "Two", "Three" });

		// Create the help context id for the viewer's control
		workbench.getHelpSystem().setHelp(viewer.getControl(), "testcase1.viewer");
		getSite().setSelectionProvider(viewer);
		showMessage(" ");
	}


	/**
	 * @stereotype COLLABORATOR 
	 */
	private void showMessage(String message) {
		MessageDialog.openInformation(
			viewer.getControl().getShell(),
			"Sample View",
			message);
	}

	/**
	 * @stereotype SET 
	 */
	@Override
	public void setFocus() {
		viewer.getControl().setFocus();
	}
}
