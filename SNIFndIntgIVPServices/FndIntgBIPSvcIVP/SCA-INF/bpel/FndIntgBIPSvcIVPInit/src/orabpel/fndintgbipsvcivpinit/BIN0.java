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
    _0.setLineNumber(34);
    _0.setLocation("A");
    _0.setName("FndIntgBIPSvcIVPInit");
    _0.registerNSPrefix("","http:\/\/schemas.xmlsoap.org\/ws\/2003\/03\/business-process\/");
    _0.registerNSPrefix("xref","http:\/\/www.oracle.com\/XSL\/Transform\/java\/oracle.tip.xref.xpath.XRefXPathFunctions");
    _0.registerNSPrefix("bpws","http:\/\/schemas.xmlsoap.org\/ws\/2003\/03\/business-process\/");
    _0.registerNSPrefix("bpel2","http:\/\/docs.oasis-open.org\/wsbpel\/2.0\/process\/executable");
    _0.registerNSPrefix("xsd","http:\/\/www.w3.org\/2001\/XMLSchema");
    _0.registerNSPrefix("ns1","http:\/\/xmlns.oracle.com\/SNIFndIntgIVPServices\/FndIntgBIPIVP\/FndIntgBIPIVP");
    _0.registerNSPrefix("xp20","http:\/\/www.oracle.com\/XSL\/Transform\/java\/oracle.tip.pc.services.functions.Xpath20");
    _0.registerNSPrefix("ns4","http:\/\/xmlns.oracle.com\/SNIFndIntgIVPServices\/FndIntgBIPSvcIVP\/FndIntgBIPWrapper");
    _0.registerNSPrefix("ns3","http:\/\/xmlns.oracle.com\/SNIFndIntgIVPServices\/FndIntgBIPSvcIVPInit\/FndIntgBIPSvcIVPInit");
    _0.registerNSPrefix("ns5","http:\/\/xmlns.schneider.com\/SNIFndIntgIVPServices\/FndIntgBIPWrapperIVP\/FndIntgBIPWrapperIVP");
    _0.registerNSPrefix("snibpel","http:\/\/xmlns.schneider.com\/BPEL\/sni\/foundation\/soa\/extensions\/xpath");
    _0.registerNSPrefix("ldap","http:\/\/schemas.oracle.com\/xpath\/extension\/ldap");
    _0.registerNSPrefix("hwf","http:\/\/xmlns.oracle.com\/bpel\/workflow\/xpath");
    _0.registerNSPrefix("client","http:\/\/xmlns.oracle.com\/SOA_IVP_App\/FndIntgBIPSvcIVPInit\/FndIntgBIPSvcIVPInit");
    _0.registerNSPrefix("ids","http:\/\/xmlns.oracle.com\/bpel\/services\/IdentityService\/xpath");
    _0.registerNSPrefix("bpelx","http:\/\/schemas.oracle.com\/bpel\/extension");
    _0.registerNSPrefix("dvm","http:\/\/www.oracle.com\/XSL\/Transform\/java\/oracle.tip.dvm.LookupValue");
    _0.registerNSPrefix("oraext","http:\/\/www.oracle.com\/XSL\/Transform\/java\/oracle.tip.pc.services.functions.ExtFunc");
    _0.registerNSPrefix("bpm","http:\/\/xmlns.oracle.com\/bpmn20\/extensions");
    _0.registerNSPrefix("xdk","http:\/\/schemas.oracle.com\/bpel\/extension\/xpath\/function\/xdk");
    _0.registerNSPrefix("ora","http:\/\/schemas.oracle.com\/xpath\/extension");
    // specialized init
    _0.setEntryTokensVA("BpTry0");
    _0.setMethodName("process");
    _0.setTransactionType("not-supported");
    
    BPELTryBlock _1;
    _1 = new BPELTryBlock(); _1.setId("BpTry0"); _1.setParentBlockId("BpPrc0"); p.add(_1);
    // standard init
    _1.setLineNumber(34);
    _1.setExitTokensVA("BpCAl0","BpPrc0");
    // specialized init
    _1.setEntryTokensVA("BpSeq1");
    _1.setHasEventHandlers(false);
    _1.addCatchTransition(null, null, "BpCAl0");
    
    BPELSequenceBlock _2;
    _2 = new BPELSequenceBlock(); _2.setId("BpSeq1"); _2.setParentBlockId("BpTry0"); p.add(_2);
    // standard init
    _2.setLineNumber(109);
    _2.setLocation("AE");
    _2.setName("main");
    _2.setExitTokensVA("BpTry0");
    // specialized init
    _2.setEntryTokensVA("BpRcv0");
    
    BPEL1ReceiveNode _3;
    _3 = new BPEL1ReceiveNode(); _3.setId("BpRcv0"); _3.setParentBlockId("BpSeq1"); p.add(_3);
    // standard init
    _3.setLineNumber(113);
    _3.setLocation("AEA");
    _3.setName("receiveInput");
    _3.setExitTokensVA("BpAss1");
    // specialized init
    _3.setIsCreateInstance(true);
    _3.setPartnerLinkName("fndintgbipsvcivpinit_client");
    _3.setOperationName("process");
    _3.setVariableName("inputVariable");
    _3.setIsTwoWay(true);
    _3.setInputMessageType(C0.Q__http_xmlns_oracle_com_SOA_IVP_App_FndIntgBIPSvcIVPInit_FndIntgBIPSvcIVPInit_F_0);
    _3.setPortType(C0.Q__http_xmlns_oracle_com_SOA_IVP_App_FndIntgBIPSvcIVPInit_FndIntgBIPSvcIVPInit_F_4);
    _3.setMyRole("FndIntgBIPSvcIVPInitProvider");
    _3.setIsVariableReadOnly(true);
    
    BPEL1AssignNode _4;
    _4 = new BPEL1AssignNode(); _4.setId("BpAss1"); _4.setParentBlockId("BpSeq1"); p.add(_4);
    // standard init
    _4.setLineNumber(114);
    _4.setLocation("AEB");
    _4.setName("Assign1");
    _4.setExitTokensVA("BpAss2");
    _4.setEarlyPurgeVariables(new String[] {"inputVariable"});
    // specialized init
    List<CXAssignFromToOp> _5;
    _5 = new ArrayList<CXAssignFromToOp>(6);
    {
      CXAssignFromToOp _6;
      
      // copy 1
      _6 = new CXAssignFromToOp();
      _6.setLineNumber(115);
      _6.setLocation("AEBA");
      _6.setParentContext(_4);
      _6.setOperation(CXAssignFromToOp.OP_COPY);
      
      CXFrom _7;
      _7 = new CXFrom();
      _7.setLineNumber(116);
      _7.setLocation("AEBAA");
      _7.setExpression("0");
      _7.setExpressionLanguageURI("xpath");
      // from expr holder
      _7.setParentContext(_4);
      _6.setFrom(_7);
      _6.setIgnoreMissingFromData(false);
      _6.setInsertMissingToData(0);
      _6.setCopyQName(false);
      
      CXTo _8;
      _8 = new CXTo();
      _8.setLineNumber(117);
      _8.setLocation("AEBAB");
      _8.setVariable("iCounter");
      _8.setContiguousXPath(false);
      _6.setTo(_8);
      _8.setParentContext(_6);
      _5.add(_6);
      
      // copy 2
      _6 = new CXAssignFromToOp();
      _6.setLineNumber(119);
      _6.setLocation("AEBB");
      _6.setParentContext(_4);
      _6.setOperation(CXAssignFromToOp.OP_COPY);
      
      _7 = new CXFrom();
      _7.setLineNumber(121);
      _7.setLocation("AEBBA");
      _7.setPart("payload");
      _7.setQuery("\/ns3:process\/ns3:ReportURL");
      _7.setVariable("inputVariable");
      _7.setParentContext(_4);
      _6.setFrom(_7);
      _6.setIgnoreMissingFromData(false);
      _6.setInsertMissingToData(0);
      _6.setCopyQName(false);
      
      _8 = new CXTo();
      _8.setLineNumber(123);
      _8.setLocation("AEBBB");
      _8.setPart("payload");
      _8.setQuery("\/ns5:process\/ns5:ReportURL");
      _8.setVariable("InvokeBIPWrapper_process_InputVariable");
      _8.setContiguousXPath(false);
      _6.setTo(_8);
      _8.setParentContext(_6);
      _5.add(_6);
      
      // copy 3
      _6 = new CXAssignFromToOp();
      _6.setLineNumber(125);
      _6.setLocation("AEBC");
      _6.setParentContext(_4);
      _6.setOperation(CXAssignFromToOp.OP_COPY);
      
      _7 = new CXFrom();
      _7.setLineNumber(127);
      _7.setLocation("AEBCA");
      _7.setPart("payload");
      _7.setQuery("\/ns3:process\/ns3:email");
      _7.setVariable("inputVariable");
      _7.setParentContext(_4);
      _6.setFrom(_7);
      _6.setIgnoreMissingFromData(false);
      _6.setInsertMissingToData(0);
      _6.setCopyQName(false);
      
      _8 = new CXTo();
      _8.setLineNumber(129);
      _8.setLocation("AEBCB");
      _8.setPart("payload");
      _8.setQuery("\/ns5:process\/ns5:email");
      _8.setVariable("InvokeBIPWrapper_process_InputVariable");
      _8.setContiguousXPath(false);
      _6.setTo(_8);
      _8.setParentContext(_6);
      _5.add(_6);
      
      // copy 4
      _6 = new CXAssignFromToOp();
      _6.setLineNumber(131);
      _6.setLocation("AEBD");
      _6.setParentContext(_4);
      _6.setOperation(CXAssignFromToOp.OP_COPY);
      
      _7 = new CXFrom();
      _7.setLineNumber(133);
      _7.setLocation("AEBDA");
      _7.setPart("payload");
      _7.setQuery("\/ns3:process\/ns3:user");
      _7.setVariable("inputVariable");
      _7.setParentContext(_4);
      _6.setFrom(_7);
      _6.setIgnoreMissingFromData(false);
      _6.setInsertMissingToData(0);
      _6.setCopyQName(false);
      
      _8 = new CXTo();
      _8.setLineNumber(135);
      _8.setLocation("AEBDB");
      _8.setPart("payload");
      _8.setQuery("\/ns5:process\/ns5:user");
      _8.setVariable("InvokeBIPWrapper_process_InputVariable");
      _8.setContiguousXPath(false);
      _6.setTo(_8);
      _8.setParentContext(_6);
      _5.add(_6);
      
      // copy 5
      _6 = new CXAssignFromToOp();
      _6.setLineNumber(137);
      _6.setLocation("AEBE");
      _6.setParentContext(_4);
      _6.setOperation(CXAssignFromToOp.OP_COPY);
      
      _7 = new CXFrom();
      _7.setLineNumber(139);
      _7.setLocation("AEBEA");
      _7.setPart("payload");
      _7.setQuery("\/ns3:process\/ns3:password");
      _7.setVariable("inputVariable");
      _7.setParentContext(_4);
      _6.setFrom(_7);
      _6.setIgnoreMissingFromData(false);
      _6.setInsertMissingToData(0);
      _6.setCopyQName(false);
      
      _8 = new CXTo();
      _8.setLineNumber(141);
      _8.setLocation("AEBEB");
      _8.setPart("payload");
      _8.setQuery("\/ns5:process\/ns5:password");
      _8.setVariable("InvokeBIPWrapper_process_InputVariable");
      _8.setContiguousXPath(false);
      _6.setTo(_8);
      _8.setParentContext(_6);
      _5.add(_6);
      
      // copy 6
      _6 = new CXAssignFromToOp();
      _6.setLineNumber(143);
      _6.setLocation("AEBF");
      _6.setParentContext(_4);
      _6.setOperation(CXAssignFromToOp.OP_COPY);
      
      _7 = new CXFrom();
      _7.setLineNumber(145);
      _7.setLocation("AEBFA");
      _7.setPart("payload");
      _7.setQuery("\/ns3:process\/ns3:identifier");
      _7.setVariable("inputVariable");
      _7.setParentContext(_4);
      _6.setFrom(_7);
      _6.setIgnoreMissingFromData(false);
      _6.setInsertMissingToData(0);
      _6.setCopyQName(false);
      
      _8 = new CXTo();
      _8.setLineNumber(147);
      _8.setLocation("AEBFB");
      _8.setPart("payload");
      _8.setQuery("\/ns5:process\/ns5:identifier");
      _8.setVariable("InvokeBIPWrapper_process_InputVariable");
      _8.setContiguousXPath(false);
      _6.setTo(_8);
      _8.setParentContext(_6);
      _5.add(_6);
    }

    _4.setOperations(_5);
    
    _4 = new BPEL1AssignNode(); _4.setId("BpAss2"); _4.setParentBlockId("BpSeq1"); p.add(_4);
    // standard init
    _4.setLineNumber(150);
    _4.setLocation("AEC");
    _4.setName("Assign_KeyIdentifier");
    _4.setExitTokensVA("BpAss3");
    // specialized init
    _5 = new ArrayList<CXAssignFromToOp>(2);
    {
      CXAssignFromToOp _6;
      
      // copy 1
      _6 = new CXAssignFromToOp();
      _6.setLineNumber(156);
      _6.setLocation("AECA");
      _6.setParentContext(_4);
      _6.setOperation(CXAssignFromToOp.OP_COPY);
      
      CXFrom _7;
      _7 = new CXFrom();
      _7.setLineNumber(157);
      _7.setLocation("AECAA");
      _7.setExpression("concat('SOA-BIP-',xp20:current-dateTime())");
      _7.setExpressionLanguageURI("xpath");
      // from expr holder
      _7.setParentContext(_4);
      _6.setFrom(_7);
      _6.setIgnoreMissingFromData(false);
      _6.setInsertMissingToData(0);
      _6.setCopyQName(false);
      
      CXTo _8;
      _8 = new CXTo();
      _8.setLineNumber(158);
      _8.setLocation("AECAB");
      _8.setVariable("keyIdentifier");
      _8.setContiguousXPath(false);
      _6.setTo(_8);
      _8.setParentContext(_6);
      _5.add(_6);
      
      // copy 2
      _6 = new CXAssignFromToOp();
      _6.setLineNumber(160);
      _6.setLocation("AECB");
      _6.setParentContext(_4);
      _6.setOperation(CXAssignFromToOp.OP_COPY);
      
      _7 = new CXFrom();
      _7.setLineNumber(161);
      _7.setLocation("AECBA");
      _7.setVariable("keyIdentifier");
      _7.setParentContext(_4);
      _6.setFrom(_7);
      _6.setIgnoreMissingFromData(false);
      _6.setInsertMissingToData(0);
      _6.setCopyQName(false);
      
      _8 = new CXTo();
      _8.setLineNumber(163);
      _8.setLocation("AECBB");
      _8.setPart("payload");
      _8.setQuery("\/ns5:process\/ns5:identifier");
      _8.setVariable("InvokeBIPWrapper_process_InputVariable");
      _8.setContiguousXPath(false);
      _6.setTo(_8);
      _8.setParentContext(_6);
      _5.add(_6);
    }

    _4.setOperations(_5);
    
    _4 = new BPEL1AssignNode(); _4.setId("BpAss3"); _4.setParentBlockId("BpSeq1"); p.add(_4);
    // standard init
    _4.setLineNumber(166);
    _4.setLocation("AED");
    _4.setName("Insert_In_Cache");
    _4.setExitTokensVA("BpInv0");
    // specialized init
    _5 = new ArrayList<CXAssignFromToOp>(1);
    {
      CXAssignFromToOp _6;
      
      // copy 1
      _6 = new CXAssignFromToOp();
      _6.setLineNumber(167);
      _6.setLocation("AEDA");
      _6.setParentContext(_4);
      _6.setOperation(CXAssignFromToOp.OP_COPY);
      
      CXFrom _7;
      _7 = new CXFrom();
      _7.setLineNumber(168);
      _7.setLocation("AEDAA");
      _7.setExpression("snibpel:EnterpriseCachePutByCacheName('FNDCache-SOAIVPStatus',bpws:getVariableData('keyIdentifier'), 'Task Created', '172800000')");
      _7.setExpressionLanguageURI("xpath");
      // from expr holder
      _7.setParentContext(_4);
      _6.setFrom(_7);
      _6.setIgnoreMissingFromData(false);
      _6.setInsertMissingToData(0);
      _6.setCopyQName(false);
      
      CXTo _8;
      _8 = new CXTo();
      _8.setLineNumber(169);
      _8.setLocation("AEDAB");
      _8.setVariable("cacheStatus");
      _8.setContiguousXPath(false);
      _6.setTo(_8);
      _8.setParentContext(_6);
      _5.add(_6);
    }

    _4.setOperations(_5);
    
    BPEL1InvokeNode _6;
    _6 = new BPEL1InvokeNode(); _6.setId("BpInv0"); _6.setParentBlockId("BpSeq1"); p.add(_6);
    // standard init
    _6.setLineNumber(176);
    _6.setLocation("AEE");
    _6.setName("InvokeBIPWrapper");
    _6.setExitTokensVA("BpWhl0");
    _6.setEarlyPurgeVariables(new String[] {"InvokeBIPWrapper_process_InputVariable"});
    // specialized init
    _6.setPartnerLinkName("FndIntgBIPWrapperIVP.fndintgbipwrapperivp_client");
    _6.setOperationName("process");
    _6.setInputVariableName("InvokeBIPWrapper_process_InputVariable");
    _6.setInputMessageType(C0.Q__http_xmlns_schneider_com_SNIFndIntgIVPServices_FndIntgBIPWrapperIVP_FndIntgBI_6);
    
    BPELWhileBlock _7;
    _7 = new BPELWhileBlock(); _7.setId("BpWhl0"); _7.setParentBlockId("BpSeq1"); p.add(_7);
    // standard init
    _7.setLineNumber(177);
    _7.setLocation("AEF");
    _7.setName("While1");
    _7.setExitTokensVA("BpSwt1");
    _7.setEarlyPurgeVariables(new String[] {"keyIdentifier","iCounter"});
    // specialized init
    _7.setEntryTokensVA("BpWhN0");
    
    BPEL1WhileConditionNode _8;
    _8 = new BPEL1WhileConditionNode(); _8.setId("BpWhN0"); _8.setParentBlockId("BpWhl0"); p.add(_8);
    // standard init
    _8.setLineNumber(177);
    _8.setExitTokensVA("BpSeq2","BpWhl0");
    // specialized init
    
    CXExprHolderImpl _9;
    _9 = new CXExprHolderImpl();
    _9.setExpression("bpws:getVariableData('iCounter')<12");
    _9.setExpressionLanguageURI("xpath");
    _9.setExpressionType(2);
    _9.setName("BpWhN0");
    _9.setLineNumber(177);
    _8.setExpression(_9);
    _9.setParentContext(_8);
    
    _2 = new BPELSequenceBlock(); _2.setId("BpSeq2"); _2.setParentBlockId("BpWhl0"); p.add(_2);
    // standard init
    _2.setLineNumber(178);
    _2.setLocation("AEFA");
    _2.setExitTokensVA("BpWhN0");
    // specialized init
    _2.setEntryTokensVA("BpWai0");
    
    BPEL1WaitNode _10;
    _10 = new BPEL1WaitNode(); _10.setId("BpWai0"); _10.setParentBlockId("BpSeq2"); p.add(_10);
    // standard init
    _10.setLineNumber(179);
    _10.setLocation("AEFAA");
    _10.setName("Wait_For_20sec");
    _10.setExitTokensVA("BpAss4");
    // specialized init
    
    _9 = new CXExprHolderImpl();
    _9.setExpression("'PT20S'");
    _9.setExpressionLanguageURI("xpath");
    _9.setExpressionType(0);
    _9.setName("BpWai0");
    _9.setLineNumber(179);
    _10.setExpression(_9);
    _9.setParentContext(_10);
    
    _4 = new BPEL1AssignNode(); _4.setId("BpAss4"); _4.setParentBlockId("BpSeq2"); p.add(_4);
    // standard init
    _4.setLineNumber(180);
    _4.setLocation("AEFAB");
    _4.setName("CheckCacheStatus");
    _4.setExitTokensVA("BpSwt0");
    // specialized init
    _5 = new ArrayList<CXAssignFromToOp>(1);
    {
      CXAssignFromToOp _11;
      
      // copy 1
      _11 = new CXAssignFromToOp();
      _11.setLineNumber(186);
      _11.setLocation("AEFABA");
      _11.setParentContext(_4);
      _11.setOperation(CXAssignFromToOp.OP_COPY);
      
      CXFrom _12;
      _12 = new CXFrom();
      _12.setLineNumber(187);
      _12.setLocation("AEFABAA");
      _12.setExpression("snibpel:EnterpriseCacheGetByCacheName('FNDCache-SOAIVPStatus',bpws:getVariableData('keyIdentifier'))");
      _12.setExpressionLanguageURI("xpath");
      // from expr holder
      _12.setParentContext(_4);
      _11.setFrom(_12);
      _11.setIgnoreMissingFromData(false);
      _11.setInsertMissingToData(0);
      _11.setCopyQName(false);
      
      CXTo _13;
      _13 = new CXTo();
      _13.setLineNumber(188);
      _13.setLocation("AEFABAB");
      _13.setVariable("cacheStatus");
      _13.setContiguousXPath(false);
      _11.setTo(_13);
      _13.setParentContext(_11);
      _5.add(_11);
    }

    _4.setOperations(_5);
    
    BPELSwitchBlock _11;
    _11 = new BPELSwitchBlock(); _11.setId("BpSwt0"); _11.setParentBlockId("BpSeq2"); p.add(_11);
    // standard init
    _11.setLineNumber(191);
    _11.setLocation("AEFAC");
    _11.setName("Switch1");
    _11.setExitTokensVA("BpSeq2");
    // specialized init
    _11.setEntryTokensVA("BpSwN0");
    
    BPEL1SwitchConditionNode _12;
    _12 = new BPEL1SwitchConditionNode(); _12.setId("BpSwN0"); _12.setParentBlockId("BpSwt0"); p.add(_12);
    // standard init
    _12.setLineNumber(191);
    // specialized init
    
    List<CXExprHolder> _13;
    _13 = new ArrayList<CXExprHolder>(1);
    
    
    _9 = new CXExprHolderImpl();
    _9.setExpression("bpws:getVariableData('cacheStatus')='Task Created'");
    _9.setExpressionLanguageURI("xpath");
    _9.setExpressionType(2);
    _9.setName("expression");
    _9.setLineNumber(192);
    _9.setParentContext(_12);
    _13.add(_9);
    _13.add(null);
    _12.setConditions(_13);
    _12.setTargetTokens(new String[] {"BpAss5","BpAss6"});
    
    _4 = new BPEL1AssignNode(); _4.setId("BpAss5"); _4.setParentBlockId("BpSwt0"); p.add(_4);
    // standard init
    _4.setLineNumber(193);
    _4.setLocation("AEFACAA");
    _4.setName("Increment_Counter");
    _4.setExitTokensVA("BpSwt0");
    // specialized init
    _5 = new ArrayList<CXAssignFromToOp>(1);
    {
      CXAssignFromToOp _14;
      
      // copy 1
      _14 = new CXAssignFromToOp();
      _14.setLineNumber(194);
      _14.setLocation("AEFACAAA");
      _14.setParentContext(_4);
      _14.setOperation(CXAssignFromToOp.OP_COPY);
      
      CXFrom _15;
      _15 = new CXFrom();
      _15.setLineNumber(195);
      _15.setLocation("AEFACAAAA");
      _15.setExpression("bpws:getVariableData('iCounter')+1");
      _15.setExpressionLanguageURI("xpath");
      // from expr holder
      _15.setParentContext(_4);
      _14.setFrom(_15);
      _14.setIgnoreMissingFromData(false);
      _14.setInsertMissingToData(0);
      _14.setCopyQName(false);
      
      CXTo _16;
      _16 = new CXTo();
      _16.setLineNumber(196);
      _16.setLocation("AEFACAAAB");
      _16.setVariable("iCounter");
      _16.setContiguousXPath(false);
      _14.setTo(_16);
      _16.setParentContext(_14);
      _5.add(_14);
    }

    _4.setOperations(_5);
    
    _4 = new BPEL1AssignNode(); _4.setId("BpAss6"); _4.setParentBlockId("BpSwt0"); p.add(_4);
    // standard init
    _4.setLineNumber(201);
    _4.setLocation("AEFACBA");
    _4.setName("Increment_Counter");
    _4.setExitTokensVA("BpSwt0");
    // specialized init
    _5 = new ArrayList<CXAssignFromToOp>(1);
    {
      CXAssignFromToOp _14;
      
      // copy 1
      _14 = new CXAssignFromToOp();
      _14.setLineNumber(202);
      _14.setLocation("AEFACBAA");
      _14.setParentContext(_4);
      _14.setOperation(CXAssignFromToOp.OP_COPY);
      
      CXFrom _15;
      _15 = new CXFrom();
      _15.setLineNumber(203);
      _15.setLocation("AEFACBAAA");
      _15.setExpression("bpws:getVariableData('iCounter')+15");
      _15.setExpressionLanguageURI("xpath");
      // from expr holder
      _15.setParentContext(_4);
      _14.setFrom(_15);
      _14.setIgnoreMissingFromData(false);
      _14.setInsertMissingToData(0);
      _14.setCopyQName(false);
      
      CXTo _16;
      _16 = new CXTo();
      _16.setLineNumber(204);
      _16.setLocation("AEFACBAAB");
      _16.setVariable("iCounter");
      _16.setContiguousXPath(false);
      _14.setTo(_16);
      _16.setParentContext(_14);
      _5.add(_14);
    }

    _4.setOperations(_5);
    
    _11 = new BPELSwitchBlock(); _11.setId("BpSwt1"); _11.setParentBlockId("BpSeq1"); p.add(_11);
    // standard init
    _11.setLineNumber(211);
    _11.setLocation("AEG");
    _11.setName("Switch2");
    _11.setExitTokensVA("BpRpl1");
    _11.setEarlyPurgeVariables(new String[] {"cacheStatus"});
    // specialized init
    _11.setEntryTokensVA("BpSwN1");
    
    _12 = new BPEL1SwitchConditionNode(); _12.setId("BpSwN1"); _12.setParentBlockId("BpSwt1"); p.add(_12);
    // standard init
    _12.setLineNumber(211);
    // specialized init
    
    _13 = new ArrayList<CXExprHolder>(2);
    
    
    _9 = new CXExprHolderImpl();
    _9.setExpression("bpws:getVariableData('cacheStatus')='Task Created'");
    _9.setExpressionLanguageURI("xpath");
    _9.setExpressionType(2);
    _9.setName("expression");
    _9.setLineNumber(212);
    _9.setParentContext(_12);
    _13.add(_9);
    
    
    _9 = new CXExprHolderImpl();
    _9.setExpression("bpws:getVariableData('cacheStatus')='Task Completed'");
    _9.setExpressionLanguageURI("xpath");
    _9.setExpressionType(2);
    _9.setName("expression");
    _9.setLineNumber(226);
    _9.setParentContext(_12);
    _13.add(_9);
    _13.add(null);
    _12.setConditions(_13);
    _12.setTargetTokens(new String[] {"BpAss7","BpAss8","BpAss9"});
    
    _4 = new BPEL1AssignNode(); _4.setId("BpAss7"); _4.setParentBlockId("BpSwt1"); p.add(_4);
    // standard init
    _4.setLineNumber(213);
    _4.setLocation("AEGAA");
    _4.setName("Assign_Status");
    _4.setExitTokensVA("BpSwt1");
    // specialized init
    _5 = new ArrayList<CXAssignFromToOp>(2);
    {
      CXAssignFromToOp _14;
      
      // copy 1
      _14 = new CXAssignFromToOp();
      _14.setLineNumber(214);
      _14.setLocation("AEGAAA");
      _14.setParentContext(_4);
      _14.setOperation(CXAssignFromToOp.OP_COPY);
      
      CXFrom _15;
      _15 = new CXFrom();
      _15.setLineNumber(215);
      _15.setLocation("AEGAAAA");
      _15.setExpression("'Failure'");
      _15.setExpressionLanguageURI("xpath");
      // from expr holder
      _15.setParentContext(_4);
      _14.setFrom(_15);
      _14.setIgnoreMissingFromData(false);
      _14.setInsertMissingToData(0);
      _14.setCopyQName(false);
      
      CXTo _16;
      _16 = new CXTo();
      _16.setLineNumber(217);
      _16.setLocation("AEGAAAB");
      _16.setPart("payload");
      _16.setQuery("\/ns3:processResponse\/ns3:result");
      _16.setVariable("outputVariable");
      _16.setContiguousXPath(false);
      _14.setTo(_16);
      _16.setParentContext(_14);
      _5.add(_14);
      
      // copy 2
      _14 = new CXAssignFromToOp();
      _14.setLineNumber(219);
      _14.setLocation("AEGAAB");
      _14.setParentContext(_4);
      _14.setOperation(CXAssignFromToOp.OP_COPY);
      
      _15 = new CXFrom();
      _15.setLineNumber(220);
      _15.setLocation("AEGAABA");
      _15.setExpression("'Timeout value crossed, process not completed yet'");
      _15.setExpressionLanguageURI("xpath");
      // from expr holder
      _15.setParentContext(_4);
      _14.setFrom(_15);
      _14.setIgnoreMissingFromData(false);
      _14.setInsertMissingToData(0);
      _14.setCopyQName(false);
      
      _16 = new CXTo();
      _16.setLineNumber(222);
      _16.setLocation("AEGAABB");
      _16.setPart("payload");
      _16.setQuery("\/ns3:processResponse\/ns3:additionalInfo");
      _16.setVariable("outputVariable");
      _16.setContiguousXPath(false);
      _14.setTo(_16);
      _16.setParentContext(_14);
      _5.add(_14);
    }

    _4.setOperations(_5);
    
    _4 = new BPEL1AssignNode(); _4.setId("BpAss8"); _4.setParentBlockId("BpSwt1"); p.add(_4);
    // standard init
    _4.setLineNumber(227);
    _4.setLocation("AEGBA");
    _4.setName("Assign_Status");
    _4.setExitTokensVA("BpSwt1");
    // specialized init
    _5 = new ArrayList<CXAssignFromToOp>(1);
    {
      CXAssignFromToOp _14;
      
      // copy 1
      _14 = new CXAssignFromToOp();
      _14.setLineNumber(228);
      _14.setLocation("AEGBAA");
      _14.setParentContext(_4);
      _14.setOperation(CXAssignFromToOp.OP_COPY);
      
      CXFrom _15;
      _15 = new CXFrom();
      _15.setLineNumber(229);
      _15.setLocation("AEGBAAA");
      _15.setExpression("'Success'");
      _15.setExpressionLanguageURI("xpath");
      // from expr holder
      _15.setParentContext(_4);
      _14.setFrom(_15);
      _14.setIgnoreMissingFromData(false);
      _14.setInsertMissingToData(0);
      _14.setCopyQName(false);
      
      CXTo _16;
      _16 = new CXTo();
      _16.setLineNumber(231);
      _16.setLocation("AEGBAAB");
      _16.setPart("payload");
      _16.setQuery("\/ns3:processResponse\/ns3:result");
      _16.setVariable("outputVariable");
      _16.setContiguousXPath(false);
      _14.setTo(_16);
      _16.setParentContext(_14);
      _5.add(_14);
    }

    _4.setOperations(_5);
    
    _4 = new BPEL1AssignNode(); _4.setId("BpAss9"); _4.setParentBlockId("BpSwt1"); p.add(_4);
    // standard init
    _4.setLineNumber(236);
    _4.setLocation("AEGCA");
    _4.setName("Assign_Status");
    _4.setExitTokensVA("BpSwt1");
    // specialized init
    _5 = new ArrayList<CXAssignFromToOp>(2);
    {
      CXAssignFromToOp _14;
      
      // copy 1
      _14 = new CXAssignFromToOp();
      _14.setLineNumber(237);
      _14.setLocation("AEGCAA");
      _14.setParentContext(_4);
      _14.setOperation(CXAssignFromToOp.OP_COPY);
      
      CXFrom _15;
      _15 = new CXFrom();
      _15.setLineNumber(238);
      _15.setLocation("AEGCAAA");
      _15.setExpression("'Failure'");
      _15.setExpressionLanguageURI("xpath");
      // from expr holder
      _15.setParentContext(_4);
      _14.setFrom(_15);
      _14.setIgnoreMissingFromData(false);
      _14.setInsertMissingToData(0);
      _14.setCopyQName(false);
      
      CXTo _16;
      _16 = new CXTo();
      _16.setLineNumber(240);
      _16.setLocation("AEGCAAB");
      _16.setPart("payload");
      _16.setQuery("\/ns3:processResponse\/ns3:result");
      _16.setVariable("outputVariable");
      _16.setContiguousXPath(false);
      _14.setTo(_16);
      _16.setParentContext(_14);
      _5.add(_14);
      
      // copy 2
      _14 = new CXAssignFromToOp();
      _14.setLineNumber(242);
      _14.setLocation("AEGCAB");
      _14.setParentContext(_4);
      _14.setOperation(CXAssignFromToOp.OP_COPY);
      
      _15 = new CXFrom();
      _15.setLineNumber(243);
      _15.setLocation("AEGCABA");
      _15.setVariable("cacheStatus");
      _15.setParentContext(_4);
      _14.setFrom(_15);
      _14.setIgnoreMissingFromData(false);
      _14.setInsertMissingToData(0);
      _14.setCopyQName(false);
      
      _16 = new CXTo();
      _16.setLineNumber(245);
      _16.setLocation("AEGCABB");
      _16.setPart("payload");
      _16.setQuery("\/ns3:processResponse\/ns3:additionalInfo");
      _16.setVariable("outputVariable");
      _16.setContiguousXPath(false);
      _14.setTo(_16);
      _16.setParentContext(_14);
      _5.add(_14);
    }

    _4.setOperations(_5);
    
    BPEL1ReplyNode _14;
    _14 = new BPEL1ReplyNode(); _14.setId("BpRpl1"); _14.setParentBlockId("BpSeq1"); p.add(_14);
    // standard init
    _14.setLineNumber(253);
    _14.setLocation("AEH");
    _14.setName("replyOutput");
    _14.setExitTokensVA("BpSeq1");
    // specialized init
    /**
     * reply's variable name
     */
    _14.setVariableName("outputVariable");
    _14.setOperationName("process");
    /**
     * reply's partner name
     */
    _14.setPartnerLinkName("fndintgbipsvcivpinit_client");
    _14.setMessageType(C0.Q__http_xmlns_oracle_com_SOA_IVP_App_FndIntgBIPSvcIVPInit_FndIntgBIPSvcIVPInit_F_a);
    
    BPELCatchAllBlock _15;
    _15 = new BPELCatchAllBlock(); _15.setId("BpCAl0"); _15.setParentBlockId("BpPrc0"); p.add(_15);
    // standard init
    _15.setLineNumber(82);
    _15.setLocation("ADA");
    _15.setExitTokensVA("BpPrc0");
    // specialized init
    _15.setEntryTokensVA("BpSeq0");
    
    _2 = new BPELSequenceBlock(); _2.setId("BpSeq0"); _2.setParentBlockId("BpCAl0"); p.add(_2);
    // standard init
    _2.setLineNumber(83);
    _2.setLocation("ADAA");
    _2.setName("Sequence1");
    _2.setExitTokensVA("BpCAl0");
    // specialized init
    _2.setEntryTokensVA("BpAss0");
    
    _4 = new BPEL1AssignNode(); _4.setId("BpAss0"); _4.setParentBlockId("BpSeq0"); p.add(_4);
    // standard init
    _4.setLineNumber(84);
    _4.setLocation("ADAAA");
    _4.setName("Assign_Status");
    _4.setExitTokensVA("BpRpl0");
    // specialized init
    _5 = new ArrayList<CXAssignFromToOp>(2);
    {
      CXAssignFromToOp _16;
      
      // copy 1
      _16 = new CXAssignFromToOp();
      _16.setLineNumber(85);
      _16.setLocation("ADAAAA");
      _16.setParentContext(_4);
      _16.setOperation(CXAssignFromToOp.OP_COPY);
      
      CXFrom _17;
      _17 = new CXFrom();
      _17.setLineNumber(86);
      _17.setLocation("ADAAAAA");
      _17.setExpression("'Failure'");
      _17.setExpressionLanguageURI("xpath");
      // from expr holder
      _17.setParentContext(_4);
      _16.setFrom(_17);
      _16.setIgnoreMissingFromData(false);
      _16.setInsertMissingToData(0);
      _16.setCopyQName(false);
      
      CXTo _18;
      _18 = new CXTo();
      _18.setLineNumber(88);
      _18.setLocation("ADAAAAB");
      _18.setPart("payload");
      _18.setQuery("\/ns3:processResponse\/ns3:result");
      _18.setVariable("outputVariable");
      _18.setContiguousXPath(false);
      _16.setTo(_18);
      _18.setParentContext(_16);
      _5.add(_16);
      
      // copy 2
      _16 = new CXAssignFromToOp();
      _16.setLineNumber(90);
      _16.setLocation("ADAAAB");
      _16.setParentContext(_4);
      _16.setOperation(CXAssignFromToOp.OP_COPY);
      
      _17 = new CXFrom();
      _17.setLineNumber(91);
      _17.setLocation("ADAAABA");
      _17.setExpression("ora:getFaultAsString()");
      _17.setExpressionLanguageURI("xpath");
      // from expr holder
      _17.setParentContext(_4);
      _16.setFrom(_17);
      _16.setIgnoreMissingFromData(false);
      _16.setInsertMissingToData(0);
      _16.setCopyQName(false);
      
      _18 = new CXTo();
      _18.setLineNumber(93);
      _18.setLocation("ADAAABB");
      _18.setPart("payload");
      _18.setQuery("\/ns3:processResponse\/ns3:additionalInfo");
      _18.setVariable("outputVariable");
      _18.setContiguousXPath(false);
      _16.setTo(_18);
      _18.setParentContext(_16);
      _5.add(_16);
    }

    _4.setOperations(_5);
    
    _14 = new BPEL1ReplyNode(); _14.setId("BpRpl0"); _14.setParentBlockId("BpSeq0"); p.add(_14);
    // standard init
    _14.setLineNumber(98);
    _14.setLocation("ADAAB");
    _14.setName("Reply1");
    _14.setExitTokensVA("BpSeq0");
    _14.setEarlyPurgeVariables(new String[] {"outputVariable"});
    // specialized init
    /**
     * reply's variable name
     */
    _14.setVariableName("outputVariable");
    _14.setOperationName("process");
    /**
     * reply's partner name
     */
    _14.setPartnerLinkName("fndintgbipsvcivpinit_client");
    _14.setMessageType(C0.Q__http_xmlns_oracle_com_SOA_IVP_App_FndIntgBIPSvcIVPInit_FndIntgBIPSvcIVPInit_F_a);
    
  }

}

