/*
 ***************************************************************************************
 *  Copyright (C) 2006 EsperTech, Inc. All rights reserved.                            *
 *  http://www.espertech.com/esper                                                     *
 *  http://www.espertech.com                                                           *
 *  ---------------------------------------------------------------------------------- *
 *  The software in this package is published under the terms of the GPL license       *
 *  a copy of which has been included with this distribution in the license.txt file.  *
 ***************************************************************************************
 */
package com.espertech.esper.client.dataflow;

import com.espertech.esper.client.EPException;

/**
 * Thrown to indicate a data flow is not found.
 */
public class EPDataFlowNotFoundException extends EPException {

    private static final long serialVersionUID = -4913672758054359149L;

    /**
     * Ctor.
     *
     * @param message error message
     */
    public EPDataFlowNotFoundException(String message) {
        super(message);
    }
}
