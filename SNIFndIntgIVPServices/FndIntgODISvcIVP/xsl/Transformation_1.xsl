<?xml version = '1.0' encoding = 'UTF-8'?>
<xsl:stylesheet version="1.0" xmlns:xp20="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.Xpath20" xmlns:sniadf="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIADFExtensionFunctions" xmlns:bpws="http://schemas.xmlsoap.org/ws/2003/03/business-process/" xmlns:bpel="http://docs.oasis-open.org/wsbpel/2.0/process/executable" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:ns0="http://xmlns.schneider.com/EnterpriseObjects/Core/Common/V1" xmlns:sniolock="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIOptimisticLockExtensionFunctions" xmlns:bpm="http://xmlns.oracle.com/bpmn20/extensions" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:snifmt="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIFormatExtensionFunctions" xmlns:snibpel="http://xmlns.schneider.com/BPEL/sni/foundation/soa/extensions/xpath" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:ora="http://schemas.oracle.com/xpath/extension" xmlns:socket="http://www.oracle.com/XSL/Transform/java/oracle.tip.adapter.socket.ProtocolTranslator" xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:mhdr="http://www.oracle.com/XSL/Transform/java/oracle.tip.mediator.service.common.functions.MediatorExtnFunction" xmlns:oraext="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.ExtFunc" xmlns:dvm="http://www.oracle.com/XSL/Transform/java/oracle.tip.dvm.LookupValue" xmlns:hwf="http://xmlns.oracle.com/bpel/workflow/xpath" xmlns:med="http://schemas.oracle.com/mediator/xpath" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:snidttm="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIDateTimeExtensionFunctions" xmlns:ids="http://xmlns.oracle.com/bpel/services/IdentityService/xpath" xmlns:xdk="http://schemas.oracle.com/bpel/extension/xpath/function/xdk" xmlns:xref="http://www.oracle.com/XSL/Transform/java/oracle.tip.xref.xpath.XRefXPathFunctions" xmlns:sniprop="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIPropertyFileExtensionFunctions" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:ns1="xmlns.oracle.com/odi/OdiInvoke/" xmlns:sniutil="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.utils.SNIUtilityExtensionFunctions" xmlns:snidvm="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIDVMExtensionFunctions" xmlns:wsam="http://www.w3.org/2007/05/addressing/metadata" xmlns:snixref="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIXRefExtensionFunctions" xmlns:ldap="http://schemas.oracle.com/xpath/extension/ldap" exclude-result-prefixes="xsi xsl ns0 xsd soap12 soap mime wsdl wsaw http ns1 wsam xp20 sniadf bpws bpel sniolock bpm snifmt snibpel ora socket mhdr oraext dvm hwf med snidttm ids xdk xref sniprop sniutil snidvm snixref ldap" xmlns:oracle-xsl-mapper="http://www.oracle.com/xsl/mapper/schemas">
  <oracle-xsl-mapper:schema>
      <!--SPECIFICATION OF MAP SOURCES AND TARGETS, DO NOT MODIFY.-->
      <oracle-xsl-mapper:mapSources>
         <oracle-xsl-mapper:source type="XSD">
            <oracle-xsl-mapper:schema location="oramds:/apps/SNIComponents/EnterpriseObjectLibrary/Core/Common/V1/SNIODICore.xsd"/>
            <oracle-xsl-mapper:rootElement name="invokeScenario" namespace="http://xmlns.schneider.com/EnterpriseObjects/Core/Common/V1"/>
         </oracle-xsl-mapper:source>
      </oracle-xsl-mapper:mapSources>
      <oracle-xsl-mapper:mapTargets>
         <oracle-xsl-mapper:target type="WSDL">
            <oracle-xsl-mapper:schema location="../../ODIServiceWrapper.wsdl"/>
            <oracle-xsl-mapper:rootElement name="OdiStartScenWithCallbackRequest" namespace="xmlns.oracle.com/odi/OdiInvoke/"/>
         </oracle-xsl-mapper:target>
      </oracle-xsl-mapper:mapTargets>
      <oracle-xsl-mapper:mapShowPrefixes type="true"/>
      <!--GENERATED BY ORACLE XSL MAPPER 12.2.1.0.0(XSLT Build 151013.0700.0085) AT [THU OCT 05 03:15:47 CDT 2017].-->
   </oracle-xsl-mapper:schema>
   <!--User Editing allowed BELOW this line - DO NOT DELETE THIS LINE-->
   <xsl:template match="/">
    <ns1:OdiStartScenWithCallbackRequest>
      <Credentials>
        <OdiUser>
          <xsl:value-of select="/ns0:invokeScenario/ns0:RepositoryConnection/ns0:OdiUser"/>
        </OdiUser>
        <OdiPassword>
          <xsl:value-of select="/ns0:invokeScenario/ns0:RepositoryConnection/ns0:OdiPassword"/>
        </OdiPassword>
        <WorkRepository>
          <xsl:value-of select="/ns0:invokeScenario/ns0:RepositoryConnection/ns0:WorkRepository"/>
        </WorkRepository>
      </Credentials>
      <Request>
        <ScenarioName>
          <xsl:value-of select="/ns0:invokeScenario/ns0:Command/ns0:ScenName"/>
        </ScenarioName>
        <ScenarioVersion>
          <xsl:value-of select="/ns0:invokeScenario/ns0:Command/ns0:ScenVersion"/>
        </ScenarioVersion>
        <Context>
          <xsl:value-of select="/ns0:invokeScenario/ns0:Command/ns0:Context"/>
        </Context>
        <Synchronous>
          <xsl:value-of select="/ns0:invokeScenario/ns0:Command/ns0:SyncMode"/>
        </Synchronous>
        <xsl:for-each select="/ns0:invokeScenario/ns0:Command/ns0:Variables">
          <Variables>
            <Name>
              <xsl:value-of select="ns0:Name"/>
            </Name>
            <Value>
              <xsl:value-of select="ns0:Value"/>
            </Value>
          </Variables>
        </xsl:for-each>
        <LogLevel>
          <xsl:value-of select="/ns0:invokeScenario/ns0:Command/ns0:LogLevel"/>
        </LogLevel>
      </Request>
    </ns1:OdiStartScenWithCallbackRequest>
  </xsl:template>
</xsl:stylesheet>