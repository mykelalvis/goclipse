/*******************************************************************************
 * Copyright (c) 2015, 2015 Bruno Medeiros and other Contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bruno Medeiros - initial API and implementation
 *******************************************************************************/
package melnorme.lang.ide.ui.tools.console;



public class TextConsoleUIHelper {
	
	public TextConsoleUIHelper() {
	}
	
	protected String headerBIG(String headerString) {
		return "************  " + headerString + "  ************"+"\n";
	}
	
	protected String headerSMALL(String headerString) {
		return "-------  " + headerString + "  -------"+"\n";
	}
	
	protected String headerHASH(String headerString) {
		return "##########  " + headerString + "  ##########"+"\n";
	}
	
}