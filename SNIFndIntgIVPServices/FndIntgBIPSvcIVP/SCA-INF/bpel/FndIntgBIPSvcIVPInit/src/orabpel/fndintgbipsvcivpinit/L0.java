package orabpel.fndintgbipsvcivpinit;

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
import orabpel.fndintgbipsvcivpinit.*;

/**
 * code spanning class to distribute code among methods/classes
 *  mpc=32
 *  lpm=2,048
 *  lpc=65,536
 *  npm=64
 *  npc=2,048
 */
final class L0 
{
  // load method # 1
  static void initPartnerLinks_2 (IScope __sc, ICubeContext __ctx) throws CubeException
  {
    // there are 2 partnerLinks
    CXPartnerLink _0;
    // service QName will be set at process initialization time
    _0 = new CXPartnerLink();
    __sc.declareAndSet("fndintgbipsvcivpinit_client",_0);
    _0.setName("fndintgbipsvcivpinit_client");
    _0.setPartnerLinkType(C0.Q__http_xmlns_oracle_com_SOA_IVP_App_FndIntgBIPSvcIVPInit_FndIntgBIPSvcIVPInit_F_4);
    _0.getMyRole().setName("FndIntgBIPSvcIVPInitProvider");
    _0.getMyRole().setPortType(C0.Q__http_xmlns_oracle_com_SOA_IVP_App_FndIntgBIPSvcIVPInit_FndIntgBIPSvcIVPInit_F_4);
    
    // service QName will be set at process initialization time
    _0 = new CXPartnerLink();
    __sc.declareAndSet("FndIntgBIPWrapperIVP.fndintgbipwrapperivp_client",_0);
    _0.setName("FndIntgBIPWrapperIVP.fndintgbipwrapperivp_client");
    _0.setPartnerLinkType(C0.Q__http_xmlns_schneider_com_SNIFndIntgIVPServices_FndIntgBIPWrapperIVP_FndIntgBI_c);
    _0.getMyRole().setName("FndIntgBIPWrapperIVPRequester");
    _0.getPartnerRole().setName("FndIntgBIPWrapperIVPProvider");
    _0.getMyRole().setPortType(C0.Q__http_xmlns_schneider_com_SNIFndIntgIVPServices_FndIntgBIPWrapperIVP_FndIntgBI_e);
    _0.getPartnerRole().setPortType(C0.Q__http_xmlns_schneider_com_SNIFndIntgIVPServices_FndIntgBIPWrapperIVP_FndIntgBI_c);
    
  }

  // load method # 2
  static void initVariables_5 (IScope __sc, ICubeContext __ctx, BaseCubeProcess __that) throws CubeException
  {
    // there are 6 cube variables

    org.w3c.dom.Element e2;

    CXMessageVariable m1;
    CXPart p1;
    m1 = new CXMessageVariable();
    __sc.declareAndSet("inputVariable",m1);
    m1.setName("inputVariable");
    m1.setMessageType(C0.Q__http_xmlns_oracle_com_SOA_IVP_App_FndIntgBIPSvcIVPInit_FndIntgBIPSvcIVPInit_F_0);
    m1.setParts(new ArrayList(1));
    p1 = new CXPart();
    p1.setName("payload");
    p1.setElement(C0.Q__http_xmlns_oracle_com_SNIFndIntgIVPServices_FndIntgBIPSvcIVPInit_FndIntgBIPSv_h);
    m1.getParts().add(p1);
    
    // xml initialization
    e2 = __that.getCachedDOMElement("<process xmlns=\"http:\/\/xmlns.oracle.com\/SNIFndIntgIVPServices\/FndIntgBIPSvcIVPInit\/FndIntgBIPSvcIVPInit\"\/>\n");
    m1.put("payload",e2);
    
    
    m1 = new CXMessageVariable();
    __sc.declareAndSet("outputVariable",m1);
    m1.setName("outputVariable");
    m1.setMessageType(C0.Q__http_xmlns_oracle_com_SOA_IVP_App_FndIntgBIPSvcIVPInit_FndIntgBIPSvcIVPInit_F_a);
    m1.setParts(new ArrayList(1));
    p1 = new CXPart();
    p1.setName("payload");
    p1.setElement(C0.Q__http_xmlns_oracle_com_SNIFndIntgIVPServices_FndIntgBIPSvcIVPInit_FndIntgBIPSv_l);
    m1.getParts().add(p1);
    
    // xml initialization
    e2 = __that.getCachedDOMElement("<processResponse xmlns=\"http:\/\/xmlns.oracle.com\/SNIFndIntgIVPServices\/FndIntgBIPSvcIVPInit\/FndIntgBIPSvcIVPInit\">\n   <result\/>\n   <additionalInfo\/>\n<\/processResponse>\n");
    m1.put("payload",e2);
    
    
    CXTypeVariable t1;
    t1 = new CXTypeVariable();
    __sc.declareAndSet("keyIdentifier",t1);
    t1.setName("keyIdentifier");
    t1.setType(C0.Q__http_www_w3_org_2001_XMLSchema_string_n);
    
    // xml initialization
    e2 = __that.getCachedDOMElement("<t xmlns=\"\"\/>");
    t1.setValue(e2);
    
    
    t1 = new CXTypeVariable();
    __sc.declareAndSet("cacheStatus",t1);
    t1.setName("cacheStatus");
    t1.setType(C0.Q__http_www_w3_org_2001_XMLSchema_string_n);
    
    // xml initialization
    e2 = __that.getCachedDOMElement("<t xmlns=\"\"\/>");
    t1.setValue(e2);
    
    
    t1 = new CXTypeVariable();
    __sc.declareAndSet("iCounter",t1);
    t1.setName("iCounter");
    t1.setType(C0.Q__http_www_w3_org_2001_XMLSchema_int_r);
    
    // xml initialization
    e2 = __that.getCachedDOMElement("<t xmlns=\"\"\/>");
    t1.setValue(e2);
    
    
    m1 = new CXMessageVariable();
    __sc.declareAndSet("InvokeBIPWrapper_process_InputVariable",m1);
    m1.setName("InvokeBIPWrapper_process_InputVariable");
    m1.setMessageType(C0.Q__http_xmlns_schneider_com_SNIFndIntgIVPServices_FndIntgBIPWrapperIVP_FndIntgBI_6);
    m1.setParts(new ArrayList(1));
    p1 = new CXPart();
    p1.setName("payload");
    p1.setElement(C0.Q__http_xmlns_schneider_com_SNIFndIntgIVPServices_FndIntgBIPWrapperIVP_FndIntgBI_t);
    m1.getParts().add(p1);
    
    // xml initialization
    e2 = __that.getCachedDOMElement("<process xmlns=\"http:\/\/xmlns.schneider.com\/SNIFndIntgIVPServices\/FndIntgBIPWrapperIVP\/FndIntgBIPWrapperIVP\">\n   <ReportURL\/>\n   <email\/>\n   <user\/>\n   <password\/>\n   <identifier\/>\n<\/process>\n");
    m1.put("payload",e2);
    
    
  }

  // load method # 3
  static void initCorrelationSets_8 (IScope __sc, ICubeContext __ctx) throws CubeException
  {
    // there are no correlation sets
  }

  // load method # 4
  static void initPropertyAliases_11 (IScope __sc, ICubeContext __ctx, Set __pas) throws CubeException
  {
    // there are no property aliases
  }

}

