/*******************************************************************************
 * Copyright (c) 2019 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.test.diagram.filters.ju.pab;

import java.util.Arrays;
import java.util.List;

import org.polarsys.capella.core.sirius.analysis.constants.IFilterNameConstants;

public class HideFunctionsForPAB extends FiltersForPAB {

  @Override
  protected String getFilterName() {
    return IFilterNameConstants.FILTER_PAB_HIDE_FUNCTIONS;
  }

  @Override
  protected List<String> getFilteredObjetIDs() {
    return Arrays.asList(new String[] { PHYSICAL_FUNCTION_1_ID, PHYSICAL_FUNCTION_2_ID, PHYSICAL_FUNCTION_3_ID, PHYSICAL_FUNCTION_9_ID });
  }

}
