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
package org.polarsys.capella.test.diagram.filters.ju.lab;

import java.util.Arrays;
import java.util.List;

import org.polarsys.capella.core.sirius.analysis.constants.IFilterNameConstants;
import org.polarsys.capella.test.diagram.filters.ju.LabelFilterTestCase;

public class ShowExchangeItemsOnFunctionalExchangesForLAB extends LabelFilterTestCase {

  private final String FUNCTIONAL_EXCHANGE_1_ID = "998a0b1e-5baa-4d8b-84e9-22c13dd22b55";

  @Override
  protected String getTestProjectName() {
    return "StandardDiagramFiltersModel";
  }

  @Override
  protected String getDiagramName() {
    return "[LAB] Logical System";
  }

  @Override
  protected String getFilterName() {
    return IFilterNameConstants.FILTER_LAB_SHOW_EXCHANGE_ITEMS_ON_FUNCTIONAL_EXCHANGES_ID;
  }

  @Override
  protected List<String> getFilteredObjetIDs() {
    return Arrays.asList(new String[] { FUNCTIONAL_EXCHANGE_1_ID });
  }

  @Override
  protected List<String> getExpectedElementLabels() {
    return Arrays.asList(new String[] { "; ;" });
  }

}
