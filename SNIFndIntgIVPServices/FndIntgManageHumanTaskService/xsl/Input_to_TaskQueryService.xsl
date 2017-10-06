<?xml version = '1.0' encoding = 'UTF-8'?>
<xsl:stylesheet version="1.0" xmlns:xp20="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.Xpath20" xmlns:sniadf="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIADFExtensionFunctions" xmlns:bpws="http://schemas.xmlsoap.org/ws/2003/03/business-process/" xmlns:bpel="http://docs.oasis-open.org/wsbpel/2.0/process/executable" xmlns:ns0="http://xmlns.schneider.com/EnterpriseObjects/Common/HumanTask/V1" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:ns4="http://xmlns.oracle.com/bpel/workflow/common/tsc" xmlns:java="http://schemas.xmlsoap.org/wsdl/java/" xmlns:common="http://xmlns.oracle.com/bpel/workflow/common" xmlns:ns1="http://xmlns.schneider.com/EnterpriseObjects/Core/Common/V1" xmlns:ns5="http://xmlns.oracle.com/bpel/workflow/TaskEvidenceService" xmlns:sniolock="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIOptimisticLockExtensionFunctions" xmlns:bpm="http://xmlns.oracle.com/bpmn20/extensions" xmlns:snifmt="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIFormatExtensionFunctions" xmlns:snibpel="http://xmlns.schneider.com/BPEL/sni/foundation/soa/extensions/xpath" xmlns:format="http://schemas.xmlsoap.org/wsdl/formatbinding/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:ora="http://schemas.oracle.com/xpath/extension" xmlns:socket="http://www.oracle.com/XSL/Transform/java/oracle.tip.adapter.socket.ProtocolTranslator" xmlns:ns2="http://xmlns.oracle.com/bpel/workflow/taskError" xmlns:mhdr="http://www.oracle.com/XSL/Transform/java/oracle.tip.mediator.service.common.functions.MediatorExtnFunction" xmlns:oraext="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.ExtFunc" xmlns:dvm="http://www.oracle.com/XSL/Transform/java/oracle.tip.dvm.LookupValue" xmlns:user="http://xmlns.oracle.com/bpel/workflow/userMetadata" xmlns:ns6="http://xmlns.oracle.com/bpel/workflow/taskQueryService/schema" xmlns:hwf="http://xmlns.oracle.com/bpel/workflow/xpath" xmlns:med="http://schemas.oracle.com/mediator/xpath" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:snidttm="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIDateTimeExtensionFunctions" xmlns:ids="http://xmlns.oracle.com/bpel/services/IdentityService/xpath" xmlns:xdk="http://schemas.oracle.com/bpel/extension/xpath/function/xdk" xmlns:xref="http://www.oracle.com/XSL/Transform/java/oracle.tip.xref.xpath.XRefXPathFunctions" xmlns:sniprop="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIPropertyFileExtensionFunctions" xmlns:ns3="http://xmlns.oracle.com/bpel/workflow/taskQuery" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:tns="http://xmlns.oracle.com/bpel/workflow/taskQueryService" xmlns:task="http://xmlns.oracle.com/bpel/workflow/task" xmlns:sniutil="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.utils.SNIUtilityExtensionFunctions" xmlns:snidvm="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIDVMExtensionFunctions" xmlns:snixref="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIXRefExtensionFunctions" xmlns:ldap="http://schemas.oracle.com/xpath/extension/ldap" exclude-result-prefixes="xsi xsl ns0 ns1 xsd ns4 java common ns5 format soap ns2 user ns6 ns3 tns task xp20 sniadf bpws bpel sniolock bpm snifmt snibpel ora socket mhdr oraext dvm hwf med snidttm ids xdk xref sniprop sniutil snidvm snixref ldap">
   <xsl:template match="/">
      <tns:taskListRequest>
         <common:workflowContext>
            <common:credential>
               <common:login>
                  <xsl:value-of select="/payload/ns0:UserId"/>
               </common:login>
               <common:password>
                  <xsl:value-of select="/payload/ns0:PassWord"/>
               </common:password>
               <common:identityContext>
                  <xsl:text disable-output-escaping="no">jazn.com</xsl:text>
               </common:identityContext>
            </common:credential>
         </common:workflowContext>
         <ns3:taskPredicateQuery>
            <xsl:attribute name="startRow">
               <xsl:text disable-output-escaping="no">0</xsl:text>
            </xsl:attribute>
            <xsl:attribute name="endRow">
               <xsl:text disable-output-escaping="no">0</xsl:text>
            </xsl:attribute>
            <ns3:displayColumnList>
               <ns3:displayColumn>
                  <xsl:text disable-output-escaping="no">TITLE</xsl:text>
               </ns3:displayColumn>
               <ns3:displayColumn>
                  <xsl:text disable-output-escaping="no">CREATOR</xsl:text>
               </ns3:displayColumn>
               <ns3:displayColumn>
                  <xsl:text disable-output-escaping="no">STATE</xsl:text>
               </ns3:displayColumn>
               <ns3:displayColumn>
                  <xsl:text disable-output-escaping="no">ACQUIREDBY</xsl:text>
               </ns3:displayColumn>
               <ns3:displayColumn>
                  <xsl:text disable-output-escaping="no">TEXTATTRIBUTE1</xsl:text>
               </ns3:displayColumn>
               <ns3:displayColumn>
                  <xsl:text disable-output-escaping="no">TEXTATTRIBUTE2</xsl:text>
               </ns3:displayColumn>
               <ns3:displayColumn>
                  <xsl:text disable-output-escaping="no">TEXTATTRIBUTE3</xsl:text>
               </ns3:displayColumn>
            </ns3:displayColumnList>
            <ns3:optionalInfoList>
               <ns3:taskOptionalInfo>
                  <xsl:text disable-output-escaping="no">Actions</xsl:text>
               </ns3:taskOptionalInfo>
            </ns3:optionalInfoList>
            <ns3:predicate>
               <ns3:assignmentFilter>
                  <xsl:text disable-output-escaping="no">Creator</xsl:text>
               </ns3:assignmentFilter>
               <ns3:clause>
                  <xsl:attribute name="joinOperator">
                     <xsl:text disable-output-escaping="no">AND</xsl:text>
                  </xsl:attribute>
                  <xsl:attribute name="ignoreCase">
                     <xsl:text disable-output-escaping="no">true</xsl:text>
                  </xsl:attribute>
                  <ns3:column>
                     <xsl:text disable-output-escaping="no">STATE</xsl:text>
                  </ns3:column>
                  <ns3:operator>
                     <xsl:text disable-output-escaping="no">EQ</xsl:text>
                  </ns3:operator>
                  <ns3:value>
                     <xsl:text disable-output-escaping="no">ASSIGNED</xsl:text>
                  </ns3:value>
               </ns3:clause>
               <xsl:if test="/payload/ns0:KeyData1 != ''">
                  <ns3:clause>
                     <xsl:attribute name="joinOperator">
                        <xsl:text disable-output-escaping="no">AND</xsl:text>
                     </xsl:attribute>
                     <xsl:attribute name="ignoreCase">
                        <xsl:text disable-output-escaping="no">true</xsl:text>
                     </xsl:attribute>
                     <ns3:column>
                        <xsl:text disable-output-escaping="no">TEXTATTRIBUTE1</xsl:text>
                     </ns3:column>
                     <ns3:operator>
                        <xsl:text disable-output-escaping="no">EQ</xsl:text>
                     </ns3:operator>
                     <ns3:value>
                        <xsl:value-of select="/payload/ns0:KeyData1"/>
                     </ns3:value>
                  </ns3:clause>
               </xsl:if>
               <xsl:if test="/payload/ns0:KeyData2 != ''">
                  <ns3:clause>
                     <xsl:attribute name="joinOperator">
                        <xsl:text disable-output-escaping="no">AND</xsl:text>
                     </xsl:attribute>
                     <xsl:attribute name="ignoreCase">
                        <xsl:text disable-output-escaping="no">true</xsl:text>
                     </xsl:attribute>
                     <ns3:column>
                        <xsl:text disable-output-escaping="no">TEXTATTRIBUTE2</xsl:text>
                     </ns3:column>
                     <ns3:operator>
                        <xsl:text disable-output-escaping="no">EQ</xsl:text>
                     </ns3:operator>
                     <ns3:value>
                        <xsl:value-of select="/payload/ns0:KeyData2"/>
                     </ns3:value>
                  </ns3:clause>
               </xsl:if>
               <xsl:if test="/payload/ns0:KeyData3 != ''">
                  <ns3:clause>
                     <xsl:attribute name="joinOperator">
                        <xsl:text disable-output-escaping="no">AND</xsl:text>
                     </xsl:attribute>
                     <xsl:attribute name="ignoreCase">
                        <xsl:text disable-output-escaping="no">true</xsl:text>
                     </xsl:attribute>
                     <ns3:column>
                        <xsl:text disable-output-escaping="no">TEXTATTRIBUTE3</xsl:text>
                     </ns3:column>
                     <ns3:operator>
                        <xsl:text disable-output-escaping="no">EQ</xsl:text>
                     </ns3:operator>
                     <ns3:value>
                        <xsl:value-of select="/payload/ns0:KeyData3"/>
                     </ns3:value>
                  </ns3:clause>
               </xsl:if>
            </ns3:predicate>
         </ns3:taskPredicateQuery>
      </tns:taskListRequest>
   </xsl:template>
</xsl:stylesheet>