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
    __sc.declareAndSet("bpelprocess1_client",_0);
    _0.setName("bpelprocess1_client");
    _0.setPartnerLinkType(C0.Q__http_xmlns_oracle_com_SNIFndIntgIVPServices_jws_FndIntg_SimpleBRIVP_BPELProce_4);
    _0.getMyRole().setName("BPELProcess1Provider");
    _0.getMyRole().setPortType(C0.Q__http_xmlns_oracle_com_SNIFndIntgIVPServices_jws_FndIntg_SimpleBRIVP_BPELProce_4);
    
    // service QName will be set at process initialization time
    _0 = new CXPartnerLink();
    __sc.declareAndSet("BR_Service",_0);
    _0.setName("BR_Service");
    _0.setPartnerLinkType(C0.Q__http_xmlns_oracle_com_BR_simpulerule_BR_simpulerule_DecisionService_1_BR_Serv_e);
    _0.getPartnerRole().setName("IDecisionService");
    _0.getPartnerRole().setPortType(C0.Q__http_xmlns_oracle_com_BR_simpulerule_BR_simpulerule_DecisionService_1_IDecisi_g);
    
  }

  // load method # 2
  static void initVariables_5 (IScope __sc, ICubeContext __ctx, BaseCubeProcess __that) throws CubeException
  {
    // there are 4 cube variables

    org.w3c.dom.Element e2;

    CXMessageVariable m1;
    CXPart p1;
    m1 = new CXMessageVariable();
    __sc.declareAndSet("inputVariable",m1);
    m1.setName("inputVariable");
    m1.setMessageType(C0.Q__http_xmlns_oracle_com_SNIFndIntgIVPServices_jws_FndIntg_SimpleBRIVP_BPELProce_0);
    m1.setParts(new ArrayList(1));
    p1 = new CXPart();
    p1.setName("payload");
    p1.setElement(C0.Q__http_siebel_com_OrderManagement_Order_Data_SWIOrderOutputs_j);
    m1.getParts().add(p1);
    
    // xml initialization
    e2 = __that.getCachedDOMElement("<SWIOrderOutputs xmlns=\"http://siebel.com/OrderManagement/Order/Data\"/>\r\n");
    m1.put("payload",e2);
    
    
    m1 = new CXMessageVariable();
    __sc.declareAndSet("outputVariable",m1);
    m1.setName("outputVariable");
    m1.setMessageType(C0.Q__http_xmlns_oracle_com_SNIFndIntgIVPServices_jws_FndIntg_SimpleBRIVP_BPELProce_c);
    m1.setParts(new ArrayList(1));
    p1 = new CXPart();
    p1.setName("payload");
    p1.setElement(C0.Q__http_siebel_com_OrderManagement_Order_Data_SWIOrderOutputs_j);
    m1.getParts().add(p1);
    
    // xml initialization
    e2 = __that.getCachedDOMElement("<SWIOrderOutputs xmlns=\"http://siebel.com/OrderManagement/Order/Data\">\r\n   <Value1/>\r\n   <Value2/>\r\n   <Value3/>\r\n   <Value4/>\r\n   <Value5/>\r\n   <Value6/>\r\n</SWIOrderOutputs>\r\n");
    m1.put("payload",e2);
    
    
    m1 = new CXMessageVariable();
    __sc.declareAndSet("Invoke_1_callFunctionStateful_InputVariable",m1);
    m1.setName("Invoke_1_callFunctionStateful_InputVariable");
    m1.setMessageType(C0.Q__http_xmlns_oracle_com_BR_simpulerule_BR_simpulerule_DecisionService_1_callFun_6);
    m1.setParts(new ArrayList(1));
    p1 = new CXPart();
    p1.setName("payload");
    p1.setElement(C0.Q__http_xmlns_oracle_com_BR_simpulerule_BR_simpulerule_DecisionService_1_callFun_m);
    m1.getParts().add(p1);
    
    // xml initialization
    e2 = __that.getCachedDOMElement("<callFunctionStateful name=\"\" xmlns=\"http://xmlns.oracle.com/BR_simpulerule/BR_simpulerule_DecisionService_1\">\r\n   <bpelInstance>\r\n      <processId xmlns=\"http://xmlns.oracle.com/bpel\"/>\r\n      <processVersion xmlns=\"http://xmlns.oracle.com/bpel\"/>\r\n      <domainId xmlns=\"http://xmlns.oracle.com/bpel\"/>\r\n      <processURL xmlns=\"http://xmlns.oracle.com/bpel\"/>\r\n      <instanceId xmlns=\"http://xmlns.oracle.com/bpel\"/>\r\n      <conversationId xmlns=\"http://xmlns.oracle.com/bpel\"/>\r\n   </bpelInstance>\r\n   <parameterList>\r\n      <SWIOrderOutputs xmlns=\"http://siebel.com/OrderManagement/Order/Data\">\r\n         <Value1/>\r\n         <Value2/>\r\n         <Value3/>\r\n         <Value4/>\r\n         <Value5/>\r\n         <Value6/>\r\n      </SWIOrderOutputs>\r\n   </parameterList>\r\n</callFunctionStateful>\r\n");
    m1.put("payload",e2);
    
    
    m1 = new CXMessageVariable();
    __sc.declareAndSet("Invoke_1_callFunctionStateful_OutputVariable",m1);
    m1.setName("Invoke_1_callFunctionStateful_OutputVariable");
    m1.setMessageType(C0.Q__http_xmlns_oracle_com_BR_simpulerule_BR_simpulerule_DecisionService_1_callFun_a);
    m1.setParts(new ArrayList(1));
    p1 = new CXPart();
    p1.setName("payload");
    p1.setElement(C0.Q__http_xmlns_oracle_com_BR_simpulerule_BR_simpulerule_DecisionService_1_callFun_p);
    m1.getParts().add(p1);
    
    // xml initialization
    e2 = __that.getCachedDOMElement("<callFunctionStatefulDecision xmlns=\"http://xmlns.oracle.com/BR_simpulerule/BR_simpulerule_DecisionService_1\"/>\r\n");
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

