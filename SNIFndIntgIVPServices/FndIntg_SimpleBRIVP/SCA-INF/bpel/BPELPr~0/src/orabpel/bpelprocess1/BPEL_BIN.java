package orabpel.bpelprocess1;

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
import orabpel.bpelprocess1.*;

/**
 * generated Process Execution Map - Please do not modify by hand
 */
public final class BPEL_BIN  extends BPEL1Process 
{
  public BPEL_BIN()
  {
    super();
    // Process or MessageDrivenProcess or EmailDrivenProcess?
    setFlavor(0);
    setCompilerVersion("v12.1.4");
    // correlation set receives
    // correlation subscriptions ...
    // javascript includes ...
  }

  private static InitiationInfo[] _$$0 = new InitiationInfo[1];
  static
  {
    InitiationInfo ii;
    ii = new InitiationInfo("process","bpelprocess1_client",C0.Q__http_xmlns_oracle_com_SNIFndIntgIVPServices_jws_FndIntg_SimpleBRIVP_BPELProce_4,C0.Q__http_xmlns_oracle_com_SNIFndIntgIVPServices_jws_FndIntg_SimpleBRIVP_BPELProce_4);
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
    L0.initPartnerLinks_2(__sc,__ctx);
    
    // initialize global variables
    L0.initVariables_5(__sc,__ctx,__that);
    
    // initialize global correlationSets
    L0.initCorrelationSets_8(__sc,__ctx);
    
    // initialize propertyAliases
    Set __pas = new HashSet();
    __sc.declareAndSet( "__correlationAliases", __pas );
    L0.initPropertyAliases_11(__sc,__ctx,__pas);
  }

  /**
   * Generate Topology of the Excecution Map. One map will be generate per 
   * method defined in the process.
   */
  protected void buildMaps (ICubeContext __ctx) throws CubeException
  {
    // <process>
    // begin map representation of method: process
    BPELCubeMap process = new BPELCubeMap(7);
    process.setCubeProcess(this);
    BIN0.addMaps$process (process, __ctx);
    
    mMethods.put("process", CubeMapFactory.create(process, __ctx ));
  }

}

// nodes-n-blocks: 8
// gen-classes: 0
// direct-use-classes: 8
// --- end of file ----
