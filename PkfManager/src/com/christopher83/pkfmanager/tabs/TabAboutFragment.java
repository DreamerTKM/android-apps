/**
 *
 * Copyright (C) 2013, Cristoforo Cataldo (Christopher83)
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 */
package com.christopher83.pkfmanager.tabs;

import com.christopher83.framework.controls.TabPreferenceListFragment;
import com.christopher83.pkfmanager.R;

/**
 * Class for the About tab fragment
 * @author Cristoforo Cataldo (Christopher83)
 */
public class TabAboutFragment extends TabPreferenceListFragment {

	/**
	 * Class constructor
	 */
	public TabAboutFragment() {
		// Invoke the base class constructor
		super();

		// Set the resource IDs for the title and the preferences showed by this tab
		_titleID = R.string.title_about;
		_preferencesID = R.xml.preferences_about;
	}

}