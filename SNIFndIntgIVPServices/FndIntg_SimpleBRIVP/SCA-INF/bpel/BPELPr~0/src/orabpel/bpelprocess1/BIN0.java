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

class BIN0 
{
  static void addMaps$process ( BPELCubeMap p, ICubeContext __ctx) throws CubeException
  {
    addMaps$process$0(p,__ctx);
  }

  static void addMaps$process$0 ( BPELCubeMap p, ICubeContext __ctx) throws CubeException
  {
    ICubeBlock b; ICubeNode n;
    BPELProcessBlock _0;
    _0 = new BPELProcessBlock(); _0.setId("BpPrc0"); p.add(_0);
    // standard init
    _0.setLineNumber(36);
    _0.setLocation("A");
    _0.setName("BPELProcess1");
    _0.registerNSPrefix("","http://schemas.xmlsoap.org/ws/2003/03/business-process/");
    _0.registerNSPrefix("bpws","http://schemas.xmlsoap.org/ws/2003/03/business-process/");
    _0.registerNSPrefix("ns2","http://siebel.com/OrderManagement/Order/Data");
    _0.registerNSPrefix("ns1","http://xmlns.oracle.com/BR_simpulerule/BR_simpulerule_DecisionService_1");
    _0.registerNSPrefix("ns4","http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIDVMExtensionFunctions");
    _0.registerNSPrefix("ns3","http://xmlns.oracle.com/bpel");
    _0.registerNSPrefix("ns6","http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.Xpath20");
    _0.registerNSPrefix("ns5","http://xmlns.schneider.com/BPEL/sni/foundation/soa/extensions/xpath");
    _0.registerNSPrefix("ns8","http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.ExtFunc");
    _0.registerNSPrefix("ns7","http://schemas.oracle.com/xpath/extension/ldap");
    _0.registerNSPrefix("ns13","http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIADFExtensionFunctions");
    _0.registerNSPrefix("ns12","http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIFormatExtensionFunctions");
    _0.registerNSPrefix("ns9","http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.utils.SNIUtilityExtensionFunctions");
    _0.registerNSPrefix("ns11","http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIPropertyFileExtensionFunctions");
    _0.registerNSPrefix("ns10","http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIDateTimeExtensionFunctions");
    _0.registerNSPrefix("ns17","http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIOptimisticLockExtensionFunctions");
    _0.registerNSPrefix("client","http://xmlns.oracle.com/SNIFndIntgIVPServices_jws/FndIntg_SimpleBRIVP/BPELProcess1");
    _0.registerNSPrefix("ns16","http://www.oracle.com/XSL/Transform/java/oracle.tip.dvm.LookupValue");
    _0.registerNSPrefix("bpelx","http://schemas.oracle.com/bpel/extension");
    _0.registerNSPrefix("ns15","http://www.oracle.com/XSL/Transform/java/oracle.tip.xref.xpath.XRefXPathFunctions");
    _0.registerNSPrefix("ns14","http://docs.oasis-open.org/wsbpel/2.0/process/executable");
    _0.registerNSPrefix("ns19","http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIXRefExtensionFunctions");
    _0.registerNSPrefix("ora","http://schemas.oracle.com/xpath/extension");
    _0.registerNSPrefix("ns18","http://schemas.oracle.com/bpel/extension/xpath/function/xdk");
    // specialized init
    _0.setEntryTokensVA("BpTry0");
    _0.setMethodName("process");
    _0.setTransactionType("not-supported");
    
    BPELTryBlock _1;
    _1 = new BPELTryBlock(); _1.setId("BpTry0"); _1.setParentBlockId("BpPrc0"); p.add(_1);
    // standard init
    _1.setLineNumber(36);
    _1.setExitTokensVA("BpPrc0");
    // specialized init
    _1.setEntryTokensVA("BpSeq0");
    _1.setHasEventHandlers(false);
    
    BPELSequenceBlock _2;
    _2 = new BPELSequenceBlock(); _2.setId("BpSeq0"); _2.setParentBlockId("BpTry0"); p.add(_2);
    // standard init
    _2.setLineNumber(87);
    _2.setLocation("AD");
    _2.setName("main");
    _2.setExitTokensVA("BpTry0");
    // specialized init
    _2.setEntryTokensVA("BpRcv0");
    
    BPEL1ReceiveNode _3;
    _3 = new BPEL1ReceiveNode(); _3.setId("BpRcv0"); _3.setParentBlockId("BpSeq0"); p.add(_3);
    // standard init
    _3.setLineNumber(90);
    _3.setLocation("ADA");
    _3.setName("receiveInput");
    _3.setExitTokensVA("BpAss0");
    // specialized init
    _3.setIsCreateInstance(true);
    _3.setPartnerLinkName("bpelprocess1_client");
    _3.setOperationName("process");
    _3.setVariableName("inputVariable");
    _3.setIsTwoWay(true);
    _3.setInputMessageType(C0.Q__http_xmlns_oracle_com_SNIFndIntgIVPServices_jws_FndIntg_SimpleBRIVP_BPELProce_0);
    _3.setPortType(C0.Q__http_xmlns_oracle_com_SNIFndIntgIVPServices_jws_FndIntg_SimpleBRIVP_BPELProce_4);
    _3.setMyRole("BPELProcess1Provider");
    _3.setIsVariableReadOnly(true);
    
    BPEL1AssignNode _4;
    _4 = new BPEL1AssignNode(); _4.setId("BpAss0"); _4.setParentBlockId("BpSeq0"); p.add(_4);
    // standard init
    _4.setLineNumber(93);
    _4.setLocation("ADB");
    _4.setName("Assign_1");
    _4.setExitTokensVA("BpInv0");
    _4.setEarlyPurgeVariables(new String[] {"inputVariable"});
    // specialized init
    List<CXAssignFromToOp> _5;
    _5 = new ArrayList<CXAssignFromToOp>(13);
    {
      CXAssignFromToOp _6;
      
      // copy 1
      _6 = new CXAssignFromToOp();
      _6.setLineNumber(94);
      _6.setLocation("ADBA");
      _6.setParentContext(_4);
      _6.setOperation(CXAssignFromToOp.OP_COPY);
      
      CXFrom _7;
      _7 = new CXFrom();
      _7.setLineNumber(95);
      _7.setLocation("ADBAA");
      _7.setExpression("'BR_simpulerule_DecisionService_1'");
      _7.setExpressionLanguageURI("xpath");
      // from expr holder
      _7.setParentContext(_4);
      _6.setFrom(_7);
      _6.setIgnoreMissingFromData(false);
      _6.setInsertMissingToData(0);
      _6.setCopyQName(false);
      
      CXTo _8;
      _8 = new CXTo();
      _8.setLineNumber(97);
      _8.setLocation("ADBAB");
      _8.setPart("payload");
      _8.setQuery("/ns1:callFunctionStateful/@name");
      _8.setVariable("Invoke_1_callFunctionStateful_InputVariable");
      _8.setContiguousXPath(false);
      _6.setTo(_8);
      _8.setParentContext(_6);
      _5.add(_6);
      
      // copy 2
      _6 = new CXAssignFromToOp();
      _6.setLineNumber(99);
      _6.setLocation("ADBB");
      _6.setParentContext(_4);
      _6.setOperation(CXAssignFromToOp.OP_COPY);
      
      _7 = new CXFrom();
      _7.setLineNumber(100);
      _7.setLocation("ADBBA");
      _7.setExpression("ora:getProcessVersion()");
      _7.setExpressionLanguageURI("xpath");
      // from expr holder
      _7.setParentContext(_4);
      _6.setFrom(_7);
      _6.setIgnoreMissingFromData(false);
      _6.setInsertMissingToData(0);
      _6.setCopyQName(false);
      
      _8 = new CXTo();
      _8.setLineNumber(103);
      _8.setLocation("ADBBB");
      _8.setPart("payload");
      _8.setQuery("/ns1:callFunctionStateful/ns1:bpelInstance/ns3:processVersion");
      _8.setVariable("Invoke_1_callFunctionStateful_InputVariable");
      _8.setContiguousXPath(false);
      _6.setTo(_8);
      _8.setParentContext(_6);
      _5.add(_6);
      
      // copy 3
      _6 = new CXAssignFromToOp();
      _6.setLineNumber(105);
      _6.setLocation("ADBC");
      _6.setParentContext(_4);
      _6.setOperation(CXAssignFromToOp.OP_COPY);
      
      _7 = new CXFrom();
      _7.setLineNumber(106);
      _7.setLocation("ADBCA");
      _7.setExpression("'soa4'");
      _7.setExpressionLanguageURI("xpath");
      // from expr holder
      _7.setParentContext(_4);
      _6.setFrom(_7);
      _6.setIgnoreMissingFromData(false);
      _6.setInsertMissingToData(0);
      _6.setCopyQName(false);
      
      _8 = new CXTo();
      _8.setLineNumber(109);
      _8.setLocation("ADBCB");
      _8.setPart("payload");
      _8.setQuery("/ns1:callFunctionStateful/ns1:bpelInstance/ns3:domainId");
      _8.setVariable("Invoke_1_callFunctionStateful_InputVariable");
      _8.setContiguousXPath(false);
      _6.setTo(_8);
      _8.setParentContext(_6);
      _5.add(_6);
      
      // copy 4
      _6 = new CXAssignFromToOp();
      _6.setLineNumber(111);
      _6.setLocation("ADBD");
      _6.setParentContext(_4);
      _6.setOperation(CXAssignFromToOp.OP_COPY);
      
      _7 = new CXFrom();
      _7.setLineNumber(112);
      _7.setLocation("ADBDA");
      _7.setExpression("ora:getProcessURL()");
      _7.setExpressionLanguageURI("xpath");
      // from expr holder
      _7.setParentContext(_4);
      _6.setFrom(_7);
      _6.setIgnoreMissingFromData(false);
      _6.setInsertMissingToData(0);
      _6.setCopyQName(false);
      
      _8 = new CXTo();
      _8.setLineNumber(115);
      _8.setLocation("ADBDB");
      _8.setPart("payload");
      _8.setQuery("/ns1:callFunctionStateful/ns1:bpelInstance/ns3:processURL");
      _8.setVariable("Invoke_1_callFunctionStateful_InputVariable");
      _8.setContiguousXPath(false);
      _6.setTo(_8);
      _8.setParentContext(_6);
      _5.add(_6);
      
      // copy 5
      _6 = new CXAssignFromToOp();
      _6.setLineNumber(117);
      _6.setLocation("ADBE");
      _6.setParentContext(_4);
      _6.setOperation(CXAssignFromToOp.OP_COPY);
      
      _7 = new CXFrom();
      _7.setLineNumber(118);
      _7.setLocation("ADBEA");
      _7.setExpression("ora:getInstanceId()");
      _7.setExpressionLanguageURI("xpath");
      // from expr holder
      _7.setParentContext(_4);
      _6.setFrom(_7);
      _6.setIgnoreMissingFromData(false);
      _6.setInsertMissingToData(0);
      _6.setCopyQName(false);
      
      _8 = new CXTo();
      _8.setLineNumber(121);
      _8.setLocation("ADBEB");
      _8.setPart("payload");
      _8.setQuery("/ns1:callFunctionStateful/ns1:bpelInstance/ns3:instanceId");
      _8.setVariable("Invoke_1_callFunctionStateful_InputVariable");
      _8.setContiguousXPath(false);
      _6.setTo(_8);
      _8.setParentContext(_6);
      _5.add(_6);
      
      // copy 6
      _6 = new CXAssignFromToOp();
      _6.setLineNumber(123);
      _6.setLocation("ADBF");
      _6.setParentContext(_4);
      _6.setOperation(CXAssignFromToOp.OP_COPY);
      
      _7 = new CXFrom();
      _7.setLineNumber(124);
      _7.setLocation("ADBFA");
      _7.setExpression("'ConvID'");
      _7.setExpressionLanguageURI("xpath");
      // from expr holder
      _7.setParentContext(_4);
      _6.setFrom(_7);
      _6.setIgnoreMissingFromData(false);
      _6.setInsertMissingToData(0);
      _6.setCopyQName(false);
      
      _8 = new CXTo();
      _8.setLineNumber(127);
      _8.setLocation("ADBFB");
      _8.setPart("payload");
      _8.setQuery("/ns1:callFunctionStateful/ns1:bpelInstance/ns3:conversationId");
      _8.setVariable("Invoke_1_callFunctionStateful_InputVariable");
      _8.setContiguousXPath(false);
      _6.setTo(_8);
      _8.setParentContext(_6);
      _5.add(_6);
      
      // copy 7
      _6 = new CXAssignFromToOp();
      _6.setLineNumber(129);
      _6.setLocation("ADBG");
      _6.setParentContext(_4);
      _6.setOperation(CXAssignFromToOp.OP_COPY);
      
      _7 = new CXFrom();
      _7.setLineNumber(130);
      _7.setLocation("ADBGA");
      _7.setExpression("ora:getProcessId()");
      _7.setExpressionLanguageURI("xpath");
      // from expr holder
      _7.setParentContext(_4);
      _6.setFrom(_7);
      _6.setIgnoreMissingFromData(false);
      _6.setInsertMissingToData(0);
      _6.setCopyQName(false);
      
      _8 = new CXTo();
      _8.setLineNumber(133);
      _8.setLocation("ADBGB");
      _8.setPart("payload");
      _8.setQuery("/ns1:callFunctionStateful/ns1:bpelInstance/ns3:processId");
      _8.setVariable("Invoke_1_callFunctionStateful_InputVariable");
      _8.setContiguousXPath(false);
      _6.setTo(_8);
      _8.setParentContext(_6);
      _5.add(_6);
      
      // copy 8
      _6 = new CXAssignFromToOp();
      _6.setLineNumber(135);
      _6.setLocation("ADBH");
      _6.setParentContext(_4);
      _6.setOperation(CXAssignFromToOp.OP_COPY);
      
      _7 = new CXFrom();
      _7.setLineNumber(137);
      _7.setLocation("ADBHA");
      _7.setPart("payload");
      _7.setQuery("/ns2:SWIOrderOutputs/ns2:Value1");
      _7.setVariable("inputVariable");
      _7.setParentContext(_4);
      _6.setFrom(_7);
      _6.setIgnoreMissingFromData(false);
      _6.setInsertMissingToData(0);
      _6.setCopyQName(false);
      
      _8 = new CXTo();
      _8.setLineNumber(140);
      _8.setLocation("ADBHB");
      _8.setPart("payload");
      _8.setQuery("/ns1:callFunctionStateful/ns1:parameterList/ns2:SWIOrderOutputs/ns2:Value1");
      _8.setVariable("Invoke_1_callFunctionStateful_InputVariable");
      _8.setContiguousXPath(false);
      _6.setTo(_8);
      _8.setParentContext(_6);
      _5.add(_6);
      
      // copy 9
      _6 = new CXAssignFromToOp();
      _6.setLineNumber(142);
      _6.setLocation("ADBI");
      _6.setParentContext(_4);
      _6.setOperation(CXAssignFromToOp.OP_COPY);
      
      _7 = new CXFrom();
      _7.setLineNumber(144);
      _7.setLocation("ADBIA");
      _7.setPart("payload");
      _7.setQuery("/ns2:SWIOrderOutputs/ns2:Value2");
      _7.setVariable("inputVariable");
      _7.setParentContext(_4);
      _6.setFrom(_7);
      _6.setIgnoreMissingFromData(false);
      _6.setInsertMissingToData(0);
      _6.setCopyQName(false);
      
      _8 = new CXTo();
      _8.setLineNumber(147);
      _8.setLocation("ADBIB");
      _8.setPart("payload");
      _8.setQuery("/ns1:callFunctionStateful/ns1:parameterList/ns2:SWIOrderOutputs/ns2:Value2");
      _8.setVariable("Invoke_1_callFunctionStateful_InputVariable");
      _8.setContiguousXPath(false);
      _6.setTo(_8);
      _8.setParentContext(_6);
      _5.add(_6);
      
      // copy 10
      _6 = new CXAssignFromToOp();
      _6.setLineNumber(149);
      _6.setLocation("ADBJ");
      _6.setParentContext(_4);
      _6.setOperation(CXAssignFromToOp.OP_COPY);
      
      _7 = new CXFrom();
      _7.setLineNumber(151);
      _7.setLocation("ADBJA");
      _7.setPart("payload");
      _7.setQuery("/ns2:SWIOrderOutputs/ns2:Value3");
      _7.setVariable("inputVariable");
      _7.setParentContext(_4);
      _6.setFrom(_7);
      _6.setIgnoreMissingFromData(false);
      _6.setInsertMissingToData(0);
      _6.setCopyQName(false);
      
      _8 = new CXTo();
      _8.setLineNumber(154);
      _8.setLocation("ADBJB");
      _8.setPart("payload");
      _8.setQuery("/ns1:callFunctionStateful/ns1:parameterList/ns2:SWIOrderOutputs/ns2:Value3");
      _8.setVariable("Invoke_1_callFunctionStateful_InputVariable");
      _8.setContiguousXPath(false);
      _6.setTo(_8);
      _8.setParentContext(_6);
      _5.add(_6);
      
      // copy 11
      _6 = new CXAssignFromToOp();
      _6.setLineNumber(156);
      _6.setLocation("ADBK");
      _6.setParentContext(_4);
      _6.setOperation(CXAssignFromToOp.OP_COPY);
      
      _7 = new CXFrom();
      _7.setLineNumber(158);
      _7.setLocation("ADBKA");
      _7.setPart("payload");
      _7.setQuery("/ns2:SWIOrderOutputs/ns2:Value4");
      _7.setVariable("inputVariable");
      _7.setParentContext(_4);
      _6.setFrom(_7);
      _6.setIgnoreMissingFromData(false);
      _6.setInsertMissingToData(0);
      _6.setCopyQName(false);
      
      _8 = new CXTo();
      _8.setLineNumber(161);
      _8.setLocation("ADBKB");
      _8.setPart("payload");
      _8.setQuery("/ns1:callFunctionStateful/ns1:parameterList/ns2:SWIOrderOutputs/ns2:Value4");
      _8.setVariable("Invoke_1_callFunctionStateful_InputVariable");
      _8.setContiguousXPath(false);
      _6.setTo(_8);
      _8.setParentContext(_6);
      _5.add(_6);
      
      // copy 12
      _6 = new CXAssignFromToOp();
      _6.setLineNumber(163);
      _6.setLocation("ADBL");
      _6.setParentContext(_4);
      _6.setOperation(CXAssignFromToOp.OP_COPY);
      
      _7 = new CXFrom();
      _7.setLineNumber(165);
      _7.setLocation("ADBLA");
      _7.setPart("payload");
      _7.setQuery("/ns2:SWIOrderOutputs/ns2:Value5");
      _7.setVariable("inputVariable");
      _7.setParentContext(_4);
      _6.setFrom(_7);
      _6.setIgnoreMissingFromData(false);
      _6.setInsertMissingToData(0);
      _6.setCopyQName(false);
      
      _8 = new CXTo();
      _8.setLineNumber(168);
      _8.setLocation("ADBLB");
      _8.setPart("payload");
      _8.setQuery("/ns1:callFunctionStateful/ns1:parameterList/ns2:SWIOrderOutputs/ns2:Value5");
      _8.setVariable("Invoke_1_callFunctionStateful_InputVariable");
      _8.setContiguousXPath(false);
      _6.setTo(_8);
      _8.setParentContext(_6);
      _5.add(_6);
      
      // copy 13
      _6 = new CXAssignFromToOp();
      _6.setLineNumber(170);
      _6.setLocation("ADBM");
      _6.setParentContext(_4);
      _6.setOperation(CXAssignFromToOp.OP_COPY);
      
      _7 = new CXFrom();
      _7.setLineNumber(172);
      _7.setLocation("ADBMA");
      _7.setPart("payload");
      _7.setQuery("/ns2:SWIOrderOutputs/ns2:Value6");
      _7.setVariable("inputVariable");
      _7.setParentContext(_4);
      _6.setFrom(_7);
      _6.setIgnoreMissingFromData(false);
      _6.setInsertMissingToData(0);
      _6.setCopyQName(false);
      
      _8 = new CXTo();
      _8.setLineNumber(175);
      _8.setLocation("ADBMB");
      _8.setPart("payload");
      _8.setQuery("/ns1:callFunctionStateful/ns1:parameterList/ns2:SWIOrderOutputs/ns2:Value6");
      _8.setVariable("Invoke_1_callFunctionStateful_InputVariable");
      _8.setContiguousXPath(false);
      _6.setTo(_8);
      _8.setParentContext(_6);
      _5.add(_6);
    }

    _4.setOperations(_5);
    
    BPEL1InvokeNode _6;
    _6 = new BPEL1InvokeNode(); _6.setId("BpInv0"); _6.setParentBlockId("BpSeq0"); p.add(_6);
    // standard init
    _6.setLineNumber(182);
    _6.setLocation("ADC");
    _6.setName("Invoke_1");
    _6.setExitTokensVA("BpAss1");
    _6.setEarlyPurgeVariables(new String[] {"Invoke_1_callFunctionStateful_InputVariable"});
    // specialized init
    _6.setPartnerLinkName("BR_Service");
    _6.setOperationName("callFunctionStateful");
    _6.setInputVariableName("Invoke_1_callFunctionStateful_InputVariable");
    _6.setInputMessageType(C0.Q__http_xmlns_oracle_com_BR_simpulerule_BR_simpulerule_DecisionService_1_callFun_6);
    _6.setOutputVariableName("Invoke_1_callFunctionStateful_OutputVariable");
    _6.setOutputMessageType(C0.Q__http_xmlns_oracle_com_BR_simpulerule_BR_simpulerule_DecisionService_1_callFun_a);
    
    _4 = new BPEL1AssignNode(); _4.setId("BpAss1"); _4.setParentBlockId("BpSeq0"); p.add(_4);
    // standard init
    _4.setLineNumber(183);
    _4.setLocation("ADD");
    _4.setName("Assign_2");
    _4.setExitTokensVA("BpRpl0");
    _4.setEarlyPurgeVariables(new String[] {"Invoke_1_callFunctionStateful_OutputVariable"});
    // specialized init
    _5 = new ArrayList<CXAssignFromToOp>(1);
    {
      CXAssignFromToOp _7;
      
      // copy 1
      _7 = new CXAssignFromToOp();
      _7.setLineNumber(184);
      _7.setLocation("ADDA");
      _7.setParentContext(_4);
      _7.setOperation(CXAssignFromToOp.OP_COPY);
      
      CXFrom _8;
      _8 = new CXFrom();
      _8.setLineNumber(187);
      _8.setLocation("ADDAA");
      _8.setPart("payload");
      _8.setQuery("/ns1:callFunctionStatefulDecision/ns1:resultList/ns2:SWIOrderOutputs/ns2:Value2");
      _8.setVariable("Invoke_1_callFunctionStateful_OutputVariable");
      _8.setParentContext(_4);
      _7.setFrom(_8);
      _7.setIgnoreMissingFromData(false);
      _7.setInsertMissingToData(0);
      _7.setCopyQName(false);
      
      CXTo _9;
      _9 = new CXTo();
      _9.setLineNumber(189);
      _9.setLocation("ADDAB");
      _9.setPart("payload");
      _9.setQuery("/ns2:SWIOrderOutputs/ns2:Value2");
      _9.setVariable("outputVariable");
      _9.setContiguousXPath(false);
      _7.setTo(_9);
      _9.setParentContext(_7);
      _5.add(_7);
    }

    _4.setOperations(_5);
    
    BPEL1ReplyNode _7;
    _7 = new BPEL1ReplyNode(); _7.setId("BpRpl0"); _7.setParentBlockId("BpSeq0"); p.add(_7);
    // standard init
    _7.setLineNumber(192);
    _7.setLocation("ADE");
    _7.setName("replyOutput");
    _7.setExitTokensVA("BpSeq0");
    _7.setEarlyPurgeVariables(new String[] {"outputVariable"});
    // specialized init
    /**
     * reply's variable name
     */
    _7.setVariableName("outputVariable");
    _7.setOperationName("process");
    /**
     * reply's partner name
     */
    _7.setPartnerLinkName("bpelprocess1_client");
    _7.setMessageType(C0.Q__http_xmlns_oracle_com_SNIFndIntgIVPServices_jws_FndIntg_SimpleBRIVP_BPELProce_c);
    
  }

}

