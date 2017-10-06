<?xml version = '1.0' encoding = 'UTF-8'?>
<xsl:stylesheet version="1.0" xmlns:xp20="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.Xpath20" xmlns:sniadf="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIADFExtensionFunctions" xmlns:bpws="http://schemas.xmlsoap.org/ws/2003/03/business-process/" xmlns:bpel="http://docs.oasis-open.org/wsbpel/2.0/process/executable" xmlns:ns1="http://xmlns.schneider.com/EnterpriseObjects/Common/HumanTask/V1" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:ns0="http://xmlns.schneider.com/EnterpriseObjects/Core/Common/V1" xmlns:sniolock="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIOptimisticLockExtensionFunctions" xmlns:bpm="http://xmlns.oracle.com/bpmn20/extensions" xmlns:client="http://xmlns.oracle.com/SNIFndIntgIVPServices/FndIntgHumanTaskIVP/FndIntgHumanTaskIVP" xmlns:snifmt="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIFormatExtensionFunctions" xmlns:snibpel="http://xmlns.schneider.com/BPEL/sni/foundation/soa/extensions/xpath" xmlns:plnk="http://schemas.xmlsoap.org/ws/2003/05/partner-link/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:ora="http://schemas.oracle.com/xpath/extension" xmlns:socket="http://www.oracle.com/XSL/Transform/java/oracle.tip.adapter.socket.ProtocolTranslator" xmlns:snidb="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIDBExtensionFunctions" xmlns:mhdr="http://www.oracle.com/XSL/Transform/java/oracle.tip.mediator.service.common.functions.MediatorExtnFunction" xmlns:oraext="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.ExtFunc" xmlns:dvm="http://www.oracle.com/XSL/Transform/java/oracle.tip.dvm.LookupValue" xmlns:hwf="http://xmlns.oracle.com/bpel/workflow/xpath" xmlns:snixml="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIXMLDiffExtensionFunctions" xmlns:med="http://schemas.oracle.com/mediator/xpath" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:snidttm="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIDateTimeExtensionFunctions" xmlns:ids="http://xmlns.oracle.com/bpel/services/IdentityService/xpath" xmlns:snibam="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIBAMExtensionFunctions" xmlns:xdk="http://schemas.oracle.com/bpel/extension/xpath/function/xdk" xmlns:xref="http://www.oracle.com/XSL/Transform/java/oracle.tip.xref.xpath.XRefXPathFunctions" xmlns:sniprop="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIPropertyFileExtensionFunctions" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:snisec="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIEncryptDecryptUtilityExtensionFunctions" xmlns:sniutil="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.utils.SNIUtilityExtensionFunctions" xmlns:snidvm="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIDVMExtensionFunctions" xmlns:ldap="http://schemas.oracle.com/xpath/extension/ldap" xmlns:snixref="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIXRefExtensionFunctions" exclude-result-prefixes="xsi xsl ns1 ns0 client plnk wsdl xsd xp20 sniadf bpws bpel sniolock bpm snifmt snibpel ora socket snidb mhdr oraext dvm hwf snixml med snidttm ids snibam xdk xref sniprop snisec sniutil snidvm ldap snixref" xmlns:oracle-xsl-mapper="http://www.oracle.com/xsl/mapper/schemas">
  <oracle-xsl-mapper:schema>
      <!--SPECIFICATION OF MAP SOURCES AND TARGETS, DO NOT MODIFY.-->
      <oracle-xsl-mapper:mapSources>
         <oracle-xsl-mapper:source type="WSDL">
            <oracle-xsl-mapper:schema location="../../FndIntgHumanTaskIVP.wsdl"/>
            <oracle-xsl-mapper:rootElement name="HumanTaskRequest" namespace="http://xmlns.schneider.com/EnterpriseObjects/Common/HumanTask/V1"/>
         </oracle-xsl-mapper:source>
         <oracle-xsl-mapper:source type="WSDL">
            <oracle-xsl-mapper:schema location="../../FndIntgHumanTaskIVP.wsdl"/>
            <oracle-xsl-mapper:rootElement name="SNIHeader" namespace="http://xmlns.schneider.com/EnterpriseObjects/Core/Common/V1"/>
            <oracle-xsl-mapper:param name="sniHeader"/>
         </oracle-xsl-mapper:source>
      </oracle-xsl-mapper:mapSources>
      <oracle-xsl-mapper:mapTargets>
         <oracle-xsl-mapper:target type="WSDL">
            <oracle-xsl-mapper:schema location="../../FndIntgHumanTaskIVP.wsdl"/>
            <oracle-xsl-mapper:rootElement name="ManageHumanTaskRequest" namespace="http://xmlns.schneider.com/EnterpriseObjects/Common/HumanTask/V1"/>
         </oracle-xsl-mapper:target>
      </oracle-xsl-mapper:mapTargets>
      <oracle-xsl-mapper:mapShowPrefixes type="true"/>
      <!--GENERATED BY ORACLE XSL MAPPER 12.2.1.0.0(XSLT Build 151013.0700.0085) AT [WED OCT 04 06:47:18 CDT 2017].-->
   </oracle-xsl-mapper:schema>
   <!--User Editing allowed BELOW this line - DO NOT DELETE THIS LINE-->
   <xsl:param name="sniHeader"/>
  <xsl:template match="/">
    <ns1:ManageHumanTaskRequest>
      <ns0:SNIHeader>
        <ns0:MessageID>
          <xsl:value-of select="$sniHeader/ns0:SNIHeader/ns0:MessageID"/>
        </ns0:MessageID>
        <ns0:MessageName>
          <xsl:value-of select="$sniHeader/ns0:SNIHeader/ns0:MessageName"/>
        </ns0:MessageName>
        <ns0:BusinessKey>
          <xsl:value-of select="$sniHeader/ns0:SNIHeader/ns0:BusinessKey"/>
        </ns0:BusinessKey>
        <ns0:SessionID>
          <xsl:value-of select="$sniHeader/ns0:SNIHeader/ns0:SessionID"/>
        </ns0:SessionID>
        <ns0:CreatedDateTime>
          <xsl:value-of select="xp20:current-dateTime()"/>
        </ns0:CreatedDateTime>
        <ns0:RequestMessageID/>
      </ns0:SNIHeader>
      <ns1:KeyData1>
        <xsl:value-of select="/ns1:HumanTaskRequest/ns1:KeyData1"/>
      </ns1:KeyData1>
      <ns1:KeyData2>
        <xsl:value-of select="/ns1:HumanTaskRequest/ns1:KeyData2"/>
      </ns1:KeyData2>
      <ns1:KeyData3>
        <xsl:value-of select="/ns1:HumanTaskRequest/ns1:KeyData3"/>
      </ns1:KeyData3>
      <ns1:TaskDefinitionNames>
        <xsl:value-of select="/ns1:HumanTaskRequest/ns1:Title"/>
      </ns1:TaskDefinitionNames>
      <ns1:Operation>
        <xsl:value-of select="string(&quot;UPDATE_OUTCOME&quot;)"/>
      </ns1:Operation>
      <ns1:UserId>
        <xsl:value-of select="/ns1:HumanTaskRequest/ns1:Owner"/>
      </ns1:UserId>
      <ns1:PassWord>
        <xsl:value-of select="string(&quot;welcome1&quot;)"/>
      </ns1:PassWord>
      <ns1:UpdateData>
        <xsl:value-of select="string(&quot;APPROVE&quot;)"/>
      </ns1:UpdateData>
    </ns1:ManageHumanTaskRequest>
  </xsl:template>
</xsl:stylesheet>