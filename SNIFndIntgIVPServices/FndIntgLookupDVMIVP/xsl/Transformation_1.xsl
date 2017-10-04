<?xml version = '1.0' encoding = 'UTF-8'?>
<xsl:stylesheet version="1.0" xmlns:xpath20="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.Xpath20" xmlns:bpws="http://schemas.xmlsoap.org/ws/2003/03/business-process/" xmlns:sniadf="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIADFExtensionFunctions" xmlns:client="http://xmlns.oracle.com/SNIFndIntgIVP_jws/FndIntgLookupDVMIVP/FndIntgLookupDVM" xmlns:bpel2="http://docs.oasis-open.org/wsbpel/2.0/process/executable" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:ns1="http://xmlns.schneider.com/EnterpriseObjects/Core/Common/V1" xmlns:sniolock="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIOptimisticLockExtensionFunctions" xmlns:bpm="http://xmlns.oracle.com/bpmn20/extensions" xmlns:snifmt="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIFormatExtensionFunctions" xmlns:snibpel="http://xmlns.schneider.com/BPEL/sni/foundation/soa/extensions/xpath" xmlns:plnk="http://schemas.xmlsoap.org/ws/2003/05/partner-link/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:ora="http://schemas.oracle.com/xpath/extension" xmlns:socket="http://www.oracle.com/XSL/Transform/java/oracle.tip.adapter.socket.ProtocolTranslator" xmlns:mhdr="http://www.oracle.com/XSL/Transform/java/oracle.tip.mediator.service.common.functions.MediatorExtnFunction" xmlns:oraext="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.ExtFunc" xmlns:dvm="http://www.oracle.com/XSL/Transform/java/oracle.tip.dvm.LookupValue" xmlns:hwf="http://xmlns.oracle.com/bpel/workflow/xpath" xmlns:med="http://schemas.oracle.com/mediator/xpath" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:snidttm="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIDateTimeExtensionFunctions" xmlns:ids="http://xmlns.oracle.com/bpel/services/IdentityService/xpath" xmlns:xdk="http://schemas.oracle.com/bpel/extension/xpath/function/xdk" xmlns:xref="http://www.oracle.com/XSL/Transform/java/oracle.tip.xref.xpath.XRefXPathFunctions" xmlns:sniprop="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIPropertyFileExtensionFunctions" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:sniutil="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.utils.SNIUtilityExtensionFunctions" xmlns:snidvm="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIDVMExtensionFunctions" xmlns:snixref="http://www.oracle.com/XSL/Transform/java/sni.foundation.soa.extensions.xpath.SNIXRefExtensionFunctions" xmlns:ldap="http://schemas.oracle.com/xpath/extension/ldap" exclude-result-prefixes="xsi xsl client ns1 plnk wsdl xsd xpath20 bpws bpel2 bpm ora socket mhdr oraext dvm hwf med ids xdk xref ldap" xmlns:oracle-xsl-mapper="http://www.oracle.com/xsl/mapper/schemas">
  <oracle-xsl-mapper:schema>
      <!--SPECIFICATION OF MAP SOURCES AND TARGETS, DO NOT MODIFY.-->
      <oracle-xsl-mapper:mapSources>
         <oracle-xsl-mapper:source type="WSDL">
            <oracle-xsl-mapper:schema location="oramds:/apps/SNIComponents/FoundationServiceLibrary/IVP/FndIntgLookupDVM.wsdl"/>
            <oracle-xsl-mapper:rootElement name="process" namespace="http://xmlns.oracle.com/SNIFndIntgIVP_jws/FndIntgLookupDVMIVP/FndIntgLookupDVM"/>
         </oracle-xsl-mapper:source>
      </oracle-xsl-mapper:mapSources>
      <oracle-xsl-mapper:mapTargets>
         <oracle-xsl-mapper:target type="WSDL">
            <oracle-xsl-mapper:schema location="oramds:/apps/SNIComponents/FoundationServiceLibrary/IVP/FndIntgLookupDVM.wsdl"/>
            <oracle-xsl-mapper:rootElement name="processResponse" namespace="http://xmlns.oracle.com/SNIFndIntgIVP_jws/FndIntgLookupDVMIVP/FndIntgLookupDVM"/>
         </oracle-xsl-mapper:target>
      </oracle-xsl-mapper:mapTargets>
      <oracle-xsl-mapper:mapShowPrefixes type="true"/>
      <!--GENERATED BY ORACLE XSL MAPPER 12.2.1.0.0(XSLT Build 151013.0700.0085) AT [THU JUL 20 07:58:29 CDT 2017].-->
   </oracle-xsl-mapper:schema>
   <!--User Editing allowed BELOW this line - DO NOT DELETE THIS LINE-->
   <xsl:template match="/">
    <client:processResponse>
      <client:result>
        <xsl:value-of select="dvm:lookupValue(/client:process/client:DVMLocation,/client:process/client:sourceColumnName,/client:process/client:sourceValue,/client:process/client:targetColumnName,&quot;NoResult&quot;)"/>
      </client:result>
    </client:processResponse>
  </xsl:template>
</xsl:stylesheet>