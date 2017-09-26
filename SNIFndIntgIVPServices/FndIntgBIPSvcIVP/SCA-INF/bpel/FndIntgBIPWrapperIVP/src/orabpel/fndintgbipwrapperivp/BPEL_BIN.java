package orabpel.fndintgbipwrapperivp;

/**
 * CONFIDENTIAL AND PROPRIETARY SOURCE CODE OF ORACLE CORPORATION
 * Copyright (c) 2001, 2009, Oracle and/or its affiliates. 
 * All rights reserved. 
 *
 * Use of this Source Code is subject to the terms of the applicable
 * license agreement from Oracle Corporation.
 *
 * The copyright notice(s) in this Source Code does not indicate
 * actual or intended publication of this Source Code.
 */
// java imports
import java.lang.*;
import java.util.*;
import javax.xml.namespace.QName;

// collaxa/engine imports
import com.collaxa.cube.CubeException;
import com.collaxa.cube.engine.core.*;
import com.collaxa.cube.engine.core.map.*;

// collaxa/engine BPEL v1 nodes/blocks/wmp
import com.collaxa.cube.engine.ext.bpel.v1.*;
import com.collaxa.cube.engine.ext.bpel.v1.nodes.*;
import com.collaxa.cube.engine.ext.bpel.v1.blocks.*;
import com.collaxa.cube.engine.ext.bpel.v1.wmp.*;

// more collaxa/engine imports
import com.collaxa.cube.engine.ICubeContext;
import com.collaxa.cube.CubeDefs;
import com.collaxa.cube.engine.CubeEngineDefs;
import com.collaxa.cube.engine.types.bpel.*;
import com.collaxa.cube.engine.util.*;
import com.collaxa.cube.engine.delivery.*;

// BPEL client
import com.oracle.bpel.client.*;

// constants from symbol table
import orabpel.fndintgbipwrapperivp.*;

/**
 * generated Process Execution Map - Please do not modify by hand
 */
public final class BPEL_BIN  extends BPEL1Process 
{
  public BPEL_BIN()
  {
    super();
    // Process or MessageDrivenProcess or EmailDrivenProcess?
    setFlavor(1);
    setCompilerVersion("v12.1.4");
    // correlation set receives
    // correlation subscriptions ...
    // javascript includes ...
  }

  private static InitiationInfo[] _$$0 = new InitiationInfo[1];
  static
  {
    InitiationInfo ii;
    ii = new InitiationInfo("process","fndintgbipwrapperivp_client",C0.Q__http_xmlns_schneider_com_SNIFndIntgIVPServices_FndIntgBIPWrapperIVP_FndIntgBI_4,C0.Q__http_xmlns_schneider_com_SNIFndIntgIVPServices_FndIntgBIPWrapperIVP_FndIntgBI_4);
    _$$0[0] = ii;
  }

  public InitiationInfo[] getInitiationInfos()
  {
    return _$$0;
  }

  /**
   * The initRootScope method is responsible for declaring and initializing
   * the field of the process.
   * Note: field initializer can not have node dependencies
   */
  public void initRootScope(IScope __sc, ICubeContext __ctx) throws CubeException
  {
    BaseCubeProcess __that;
    __that = this;
    // initialize global partnerLinks
    L1.initPartnerLinks_16(__sc,__ctx);
    
    // initialize global variables
    L1.initVariables_19(__sc,__ctx,__that);
    
    // initialize global correlationSets
    L1.initCorrelationSets_22(__sc,__ctx);
    
    // initialize propertyAliases
    Set __pas = new HashSet();
    __sc.declareAndSet( "__correlationAliases", __pas );
    L1.initPropertyAliases_25(__sc,__ctx,__pas);
  }

  /**
   * Generate Topology of the Excecution Map. One map will be generate per 
   * method defined in the process.
   */
  protected void buildMaps (ICubeContext __ctx) throws CubeException
  {
    // <process>
    // begin map representation of method: process
    BPELCubeMap process = new BPELCubeMap(13);
    process.setCubeProcess(this);
    BIN0.addMaps$process (process, __ctx);
    
    mMethods.put("process", CubeMapFactory.create(process, __ctx ));
  }

}

// nodes-n-blocks: 13
// gen-classes: 0
// direct-use-classes: 13
// --- end of file ----
