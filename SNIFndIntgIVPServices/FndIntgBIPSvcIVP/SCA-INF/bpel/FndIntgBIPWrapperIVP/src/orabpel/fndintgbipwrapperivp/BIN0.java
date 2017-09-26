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
    _0.setLineNumber(31);
    _0.setLocation("A");
    _0.setName("FndIntgBIPWrapperIVP");
    _0.registerNSPrefix("","http:\/\/schemas.xmlsoap.org\/ws\/2003\/03\/business-process\/");
    _0.registerNSPrefix("xref","http:\/\/www.oracle.com\/XSL\/Transform\/java\/oracle.tip.xref.xpath.XRefXPathFunctions");
    _0.registerNSPrefix("bpws","http:\/\/schemas.xmlsoap.org\/ws\/2003\/03\/business-process\/");
    _0.registerNSPrefix("bpel2","http:\/\/docs.oasis-open.org\/wsbpel\/2.0\/process\/executable");
    _0.registerNSPrefix("xsd","http:\/\/www.w3.org\/2001\/XMLSchema");
    _0.registerNSPrefix("ns1","http:\/\/xmlns.oracle.com\/SNIFndIntgIVPServices\/FndIntgBIPIVP\/FndIntgBIPIVP");
    _0.registerNSPrefix("xp20","http:\/\/www.oracle.com\/XSL\/Transform\/java\/oracle.tip.pc.services.functions.Xpath20");
    _0.registerNSPrefix("snibpel","http:\/\/xmlns.schneider.com\/BPEL\/sni\/foundation\/soa\/extensions\/xpath");
    _0.registerNSPrefix("ldap","http:\/\/schemas.oracle.com\/xpath\/extension\/ldap");
    _0.registerNSPrefix("hwf","http:\/\/xmlns.oracle.com\/bpel\/workflow\/xpath");
    _0.registerNSPrefix("client","http:\/\/xmlns.schneider.com\/SNIFndIntgIVPServices\/FndIntgBIPWrapperIVP\/FndIntgBIPWrapperIVP");
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
    _1.setLineNumber(31);
    _1.setExitTokensVA("BpCAl0","BpPrc0");
    // specialized init
    _1.setEntryTokensVA("BpSeq0");
    _1.setHasEventHandlers(false);
    _1.addCatchTransition(null, null, "BpCAl0");
    
    BPELSequenceBlock _2;
    _2 = new BPELSequenceBlock(); _2.setId("BpSeq0"); _2.setParentBlockId("BpTry0"); p.add(_2);
    // standard init
    _2.setLineNumber(94);
    _2.setLocation("AE");
    _2.setName("main");
    _2.setExitTokensVA("BpTry0");
    // specialized init
    _2.setEntryTokensVA("BpRcv0");
    
    BPEL1ReceiveNode _3;
    _3 = new BPEL1ReceiveNode(); _3.setId("BpRcv0"); _3.setParentBlockId("BpSeq0"); p.add(_3);
    // standard init
    _3.setLineNumber(96);
    _3.setLocation("AEA");
    _3.setName("receiveInput");
    _3.setExitTokensVA("BpAss1");
    // specialized init
    _3.setIsCreateInstance(true);
    _3.setPartnerLinkName("fndintgbipwrapperivp_client");
    _3.setOperationName("process");
    _3.setVariableName("inputVariable");
    _3.setInputMessageType(C0.Q__http_xmlns_schneider_com_SNIFndIntgIVPServices_FndIntgBIPWrapperIVP_FndIntgBI_0);
    _3.setPortType(C0.Q__http_xmlns_schneider_com_SNIFndIntgIVPServices_FndIntgBIPWrapperIVP_FndIntgBI_4);
    _3.setMyRole("FndIntgBIPWrapperIVPProvider");
    _3.setIsVariableReadOnly(true);
    
    BPEL1AssignNode _4;
    _4 = new BPEL1AssignNode(); _4.setId("BpAss1"); _4.setParentBlockId("BpSeq0"); p.add(_4);
    // standard init
    _4.setLineNumber(97);
    _4.setLocation("AEB");
    _4.setName("PasInput");
    _4.setExitTokensVA("BpInv0");
    _4.setEarlyPurgeVariables(new String[] {"inputVariable"});
    // specialized init
    List<CXAssignFromToOp> _5;
    _5 = new ArrayList<CXAssignFromToOp>(5);
    {
      CXAssignFromToOp _6;
      
      // copy 1
      _6 = new CXAssignFromToOp();
      _6.setLineNumber(98);
      _6.setLocation("AEBA");
      _6.setParentContext(_4);
      _6.setOperation(CXAssignFromToOp.OP_COPY);
      
      CXFrom _7;
      _7 = new CXFrom();
      _7.setLineNumber(100);
      _7.setLocation("AEBAA");
      _7.setPart("payload");
      _7.setQuery("\/client:process\/client:ReportURL");
      _7.setVariable("inputVariable");
      _7.setParentContext(_4);
      _6.setFrom(_7);
      _6.setIgnoreMissingFromData(false);
      _6.setInsertMissingToData(0);
      _6.setCopyQName(false);
      
      CXTo _8;
      _8 = new CXTo();
      _8.setLineNumber(102);
      _8.setLocation("AEBAB");
      _8.setPart("payload");
      _8.setQuery("\/ns1:process\/ns1:ReportURL");
      _8.setVariable("InvokeBIPIVP_process_InputVariable");
      _8.setContiguousXPath(false);
      _6.setTo(_8);
      _8.setParentContext(_6);
      _5.add(_6);
      
      // copy 2
      _6 = new CXAssignFromToOp();
      _6.setLineNumber(104);
      _6.setLocation("AEBB");
      _6.setParentContext(_4);
      _6.setOperation(CXAssignFromToOp.OP_COPY);
      
      _7 = new CXFrom();
      _7.setLineNumber(106);
      _7.setLocation("AEBBA");
      _7.setPart("payload");
      _7.setQuery("\/client:process\/client:email");
      _7.setVariable("inputVariable");
      _7.setParentContext(_4);
      _6.setFrom(_7);
      _6.setIgnoreMissingFromData(false);
      _6.setInsertMissingToData(0);
      _6.setCopyQName(false);
      
      _8 = new CXTo();
      _8.setLineNumber(108);
      _8.setLocation("AEBBB");
      _8.setPart("payload");
      _8.setQuery("\/ns1:process\/ns1:email");
      _8.setVariable("InvokeBIPIVP_process_InputVariable");
      _8.setContiguousXPath(false);
      _6.setTo(_8);
      _8.setParentContext(_6);
      _5.add(_6);
      
      // copy 3
      _6 = new CXAssignFromToOp();
      _6.setLineNumber(110);
      _6.setLocation("AEBC");
      _6.setParentContext(_4);
      _6.setOperation(CXAssignFromToOp.OP_COPY);
      
      _7 = new CXFrom();
      _7.setLineNumber(112);
      _7.setLocation("AEBCA");
      _7.setPart("payload");
      _7.setQuery("\/client:process\/client:user");
      _7.setVariable("inputVariable");
      _7.setParentContext(_4);
      _6.setFrom(_7);
      _6.setIgnoreMissingFromData(false);
      _6.setInsertMissingToData(0);
      _6.setCopyQName(false);
      
      _8 = new CXTo();
      _8.setLineNumber(114);
      _8.setLocation("AEBCB");
      _8.setPart("payload");
      _8.setQuery("\/ns1:process\/ns1:user");
      _8.setVariable("InvokeBIPIVP_process_InputVariable");
      _8.setContiguousXPath(false);
      _6.setTo(_8);
      _8.setParentContext(_6);
      _5.add(_6);
      
      // copy 4
      _6 = new CXAssignFromToOp();
      _6.setLineNumber(116);
      _6.setLocation("AEBD");
      _6.setParentContext(_4);
      _6.setOperation(CXAssignFromToOp.OP_COPY);
      
      _7 = new CXFrom();
      _7.setLineNumber(118);
      _7.setLocation("AEBDA");
      _7.setPart("payload");
      _7.setQuery("\/client:process\/client:password");
      _7.setVariable("inputVariable");
      _7.setParentContext(_4);
      _6.setFrom(_7);
      _6.setIgnoreMissingFromData(false);
      _6.setInsertMissingToData(0);
      _6.setCopyQName(false);
      
      _8 = new CXTo();
      _8.setLineNumber(120);
      _8.setLocation("AEBDB");
      _8.setPart("payload");
      _8.setQuery("\/ns1:process\/ns1:password");
      _8.setVariable("InvokeBIPIVP_process_InputVariable");
      _8.setContiguousXPath(false);
      _6.setTo(_8);
      _8.setParentContext(_6);
      _5.add(_6);
      
      // copy 5
      _6 = new CXAssignFromToOp();
      _6.setLineNumber(122);
      _6.setLocation("AEBE");
      _6.setParentContext(_4);
      _6.setOperation(CXAssignFromToOp.OP_COPY);
      
      _7 = new CXFrom();
      _7.setLineNumber(123);
      _7.setLocation("AEBEA");
      _7.setExpression("bpws:getVariableData('inputVariable','payload','\/client:process\/client:identifier')");
      _7.setExpressionLanguageURI("xpath");
      // from expr holder
      _7.setParentContext(_4);
      _6.setFrom(_7);
      _6.setIgnoreMissingFromData(false);
      _6.setInsertMissingToData(0);
      _6.setCopyQName(false);
      
      _8 = new CXTo();
      _8.setLineNumber(124);
      _8.setLocation("AEBEB");
      _8.setVariable("keyIdentifier");
      _8.setContiguousXPath(false);
      _6.setTo(_8);
      _8.setParentContext(_6);
      _5.add(_6);
    }

    _4.setOperations(_5);
    
    BPEL1InvokeNode _6;
    _6 = new BPEL1InvokeNode(); _6.setId("BpInv0"); _6.setParentBlockId("BpSeq0"); p.add(_6);
    // standard init
    _6.setLineNumber(130);
    _6.setLocation("AEC");
    _6.setName("InvokeBIPIVP");
    _6.setExitTokensVA("BpRcv1");
    _6.setEarlyPurgeVariables(new String[] {"InvokeBIPIVP_process_InputVariable"});
    // specialized init
    _6.setPartnerLinkName("BIP");
    _6.setOperationName("process");
    _6.setInputVariableName("InvokeBIPIVP_process_InputVariable");
    _6.setInputMessageType(C0.Q__http_xmlns_oracle_com_SNIFndIntgIVPServices_FndIntgBIPIVP_FndIntgBIPIVP_FndIn_6);
    
    _3 = new BPEL1ReceiveNode(); _3.setId("BpRcv1"); _3.setParentBlockId("BpSeq0"); p.add(_3);
    // standard init
    _3.setLineNumber(134);
    _3.setLocation("AED");
    _3.setName("ReceiveResponse");
    _3.setExitTokensVA("BpSwt0");
    // specialized init
    _3.setPartnerLinkName("BIP");
    _3.setOperationName("processResponse");
    _3.setVariableName("ReceiveResponse_processResponse_InputVariable");
    _3.setInputMessageType(C0.Q__http_xmlns_oracle_com_SNIFndIntgIVPServices_FndIntgBIPIVP_FndIntgBIPIVP_FndIn_a);
    _3.setPortType(C0.Q__http_xmlns_oracle_com_SNIFndIntgIVPServices_FndIntgBIPIVP_FndIntgBIPIVP_FndIn_c);
    _3.setMyRole("FndIntgBIPIVPRequester");
    _3.setIsVariableReadOnly(true);
    
    CXExprHolderImpl _7;
    _7 = new CXExprHolderImpl();
    _7.setExpression("'PT4M'");
    _7.setExpressionLanguageURI("xpath");
    _7.setExpressionType(0);
    _7.setName("BpRcv1");
    _7.setLineNumber(134);
    _3.setForExpr(_7);
    _7.setParentContext(_3);
    
    BPELSwitchBlock _8;
    _8 = new BPELSwitchBlock(); _8.setId("BpSwt0"); _8.setParentBlockId("BpSeq0"); p.add(_8);
    // standard init
    _8.setLineNumber(135);
    _8.setLocation("AEE");
    _8.setName("Switch1");
    _8.setExitTokensVA("BpSeq0");
    _8.setEarlyPurgeVariables(new String[] {"ReceiveResponse_processResponse_InputVariable"});
    // specialized init
    _8.setEntryTokensVA("BpSwN0");
    
    BPEL1SwitchConditionNode _9;
    _9 = new BPEL1SwitchConditionNode(); _9.setId("BpSwN0"); _9.setParentBlockId("BpSwt0"); p.add(_9);
    // standard init
    _9.setLineNumber(135);
    // specialized init
    
    List<CXExprHolder> _10;
    _10 = new ArrayList<CXExprHolder>(1);
    
    
    _7 = new CXExprHolderImpl();
    _7.setExpression("contains(xp20:lower-case(string(bpws:getVariableData('ReceiveResponse_processResponse_InputVariable','payload','\/ns1:processResponse\/ns1:result'))),'error')");
    _7.setExpressionLanguageURI("xpath");
    _7.setExpressionType(2);
    _7.setName("expression");
    _7.setLineNumber(136);
    _7.setParentContext(_9);
    _10.add(_7);
    _10.add(null);
    _9.setConditions(_10);
    _9.setTargetTokens(new String[] {"BpAss2","BpAss3"});
    
    _4 = new BPEL1AssignNode(); _4.setId("BpAss2"); _4.setParentBlockId("BpSwt0"); p.add(_4);
    // standard init
    _4.setLineNumber(142);
    _4.setLocation("AEEAB");
    _4.setName("cacheUpd");
    _4.registerNSPrefix("","http:\/\/schemas.xmlsoap.org\/ws\/2003\/03\/business-process\/");
    _4.setExitTokensVA("BpSwt0");
    // specialized init
    _5 = new ArrayList<CXAssignFromToOp>(1);
    {
      CXAssignFromToOp _11;
      
      // copy 1
      _11 = new CXAssignFromToOp();
      _11.setLineNumber(143);
      _11.setLocation("AEEABA");
      _11.setParentContext(_4);
      _11.setOperation(CXAssignFromToOp.OP_COPY);
      
      CXFrom _12;
      _12 = new CXFrom();
      _12.setLineNumber(144);
      _12.setLocation("AEEABAA");
      _12.setExpression("snibpel:EnterpriseCachePutByCacheName('FNDCache-SOAIVPStatus',bpws:getVariableData('keyIdentifier'), string(bpws:getVariableData('ReceiveResponse_processResponse_InputVariable','payload','\/ns1:processResponse\/ns1:result')), '172800000')");
      _12.setExpressionLanguageURI("xpath");
      // from expr holder
      _12.setParentContext(_4);
      _11.setFrom(_12);
      _11.setIgnoreMissingFromData(false);
      _11.setInsertMissingToData(0);
      _11.setCopyQName(false);
      
      CXTo _13;
      _13 = new CXTo();
      _13.setLineNumber(145);
      _13.setLocation("AEEABAB");
      _13.setVariable("cachestatuspd");
      _13.setContiguousXPath(false);
      _11.setTo(_13);
      _13.setParentContext(_11);
      _5.add(_11);
    }

    _4.setOperations(_5);
    
    _4 = new BPEL1AssignNode(); _4.setId("BpAss3"); _4.setParentBlockId("BpSwt0"); p.add(_4);
    // standard init
    _4.setLineNumber(149);
    _4.setLocation("AEEBA");
    _4.setName("cacheUpd");
    _4.setExitTokensVA("BpSwt0");
    // specialized init
    _5 = new ArrayList<CXAssignFromToOp>(1);
    {
      CXAssignFromToOp _11;
      
      // copy 1
      _11 = new CXAssignFromToOp();
      _11.setLineNumber(150);
      _11.setLocation("AEEBAA");
      _11.setParentContext(_4);
      _11.setOperation(CXAssignFromToOp.OP_COPY);
      
      CXFrom _12;
      _12 = new CXFrom();
      _12.setLineNumber(151);
      _12.setLocation("AEEBAAA");
      _12.setExpression("snibpel:EnterpriseCachePutByCacheName('FNDCache-SOAIVPStatus',bpws:getVariableData('keyIdentifier'), 'Task Completed', '300000')");
      _12.setExpressionLanguageURI("xpath");
      // from expr holder
      _12.setParentContext(_4);
      _11.setFrom(_12);
      _11.setIgnoreMissingFromData(false);
      _11.setInsertMissingToData(0);
      _11.setCopyQName(false);
      
      CXTo _13;
      _13 = new CXTo();
      _13.setLineNumber(152);
      _13.setLocation("AEEBAAB");
      _13.setVariable("cachestatuspd");
      _13.setContiguousXPath(false);
      _11.setTo(_13);
      _13.setParentContext(_11);
      _5.add(_11);
    }

    _4.setOperations(_5);
    
    BPELCatchAllBlock _11;
    _11 = new BPELCatchAllBlock(); _11.setId("BpCAl0"); _11.setParentBlockId("BpPrc0"); p.add(_11);
    // standard init
    _11.setLineNumber(78);
    _11.setLocation("ADA");
    _11.setExitTokensVA("BpPrc0");
    // specialized init
    _11.setEntryTokensVA("BpAss0");
    
    _4 = new BPEL1AssignNode(); _4.setId("BpAss0"); _4.setParentBlockId("BpCAl0"); p.add(_4);
    // standard init
    _4.setLineNumber(79);
    _4.setLocation("ADAA");
    _4.setName("cacheUpd");
    _4.setExitTokensVA("BpCAl0");
    _4.setEarlyPurgeVariables(new String[] {"keyIdentifier","cachestatuspd"});
    // specialized init
    _5 = new ArrayList<CXAssignFromToOp>(1);
    {
      CXAssignFromToOp _12;
      
      // copy 1
      _12 = new CXAssignFromToOp();
      _12.setLineNumber(80);
      _12.setLocation("ADAAA");
      _12.setParentContext(_4);
      _12.setOperation(CXAssignFromToOp.OP_COPY);
      
      CXFrom _13;
      _13 = new CXFrom();
      _13.setLineNumber(81);
      _13.setLocation("ADAAAA");
      _13.setExpression("snibpel:EnterpriseCachePutByCacheName('FNDCache-SOAIVPStatus',bpws:getVariableData('keyIdentifier'), 'Failed To Invoke BIP Service', '172800000')");
      _13.setExpressionLanguageURI("xpath");
      // from expr holder
      _13.setParentContext(_4);
      _12.setFrom(_13);
      _12.setIgnoreMissingFromData(false);
      _12.setInsertMissingToData(0);
      _12.setCopyQName(false);
      
      CXTo _14;
      _14 = new CXTo();
      _14.setLineNumber(82);
      _14.setLocation("ADAAAB");
      _14.setVariable("cachestatuspd");
      _14.setContiguousXPath(false);
      _12.setTo(_14);
      _14.setParentContext(_12);
      _5.add(_12);
    }

    _4.setOperations(_5);
    
  }

}

