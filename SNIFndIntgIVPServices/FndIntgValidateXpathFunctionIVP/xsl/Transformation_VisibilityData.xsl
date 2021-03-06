<?xml version = '1.0' encoding = 'UTF-8'?>
<xsl:stylesheet version="1.0" xmlns:bpws="http://schemas.xmlsoap.org/ws/2003/03/business-process/" xmlns:xp20="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.Xpath20" xmlns:mhdr="http://www.oracle.com/XSL/Transform/java/oracle.tip.mediator.service.common.functions.MediatorExtnFunction" xmlns:bpel="http://docs.oasis-open.org/wsbpel/2.0/process/executable" xmlns:oraext="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.ExtFunc" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:ns1="http://xmlns.schneider.com/EnterpriseObjects/Core/Common/V1" xmlns:dvm="http://www.oracle.com/XSL/Transform/java/oracle.tip.dvm.LookupValue" xmlns:tns="http://xmlns.schneider.com/SNIFndIntgIVPServices/ChkXpathSOAIVPSvc" xmlns:hwf="http://xmlns.oracle.com/bpel/workflow/xpath" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:med="http://schemas.oracle.com/mediator/xpath" xmlns:ids="http://xmlns.oracle.com/bpel/services/IdentityService/xpath" xmlns:bpm="http://xmlns.oracle.com/bpmn20/extensions" xmlns:xdk="http://schemas.oracle.com/bpel/extension/xpath/function/xdk" xmlns:xref="http://www.oracle.com/XSL/Transform/java/oracle.tip.xref.xpath.XRefXPathFunctions" xmlns:plnk="http://schemas.xmlsoap.org/ws/2003/05/partner-link/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:client="http://xmlns.oracle.com/SNIFndIntgIVPServices/FndIntgVisibiltyDataLookupIVP/FndIntgVisibiltyDataLookupIVP" xmlns:inp1="http://xmlns.schneider.com/SNIFndIntgIVPServices/ChkXpathSOAIVP" xmlns:ora="http://schemas.oracle.com/xpath/extension" xmlns:socket="http://www.oracle.com/XSL/Transform/java/oracle.tip.adapter.socket.ProtocolTranslator" xmlns:ldap="http://schemas.oracle.com/xpath/extension/ldap" exclude-result-prefixes="xsi xsl ns1 tns xsd wsdl inp1 plnk client bpws xp20 mhdr bpel oraext dvm hwf med ids bpm xdk xref ora socket ldap" xmlns:oracle-xsl-mapper="http://www.oracle.com/xsl/mapper/schemas">
  <oracle-xsl-mapper:schema>
      <!--SPECIFICATION OF MAP SOURCES AND TARGETS, DO NOT MODIFY.-->
      <oracle-xsl-mapper:mapSources>
         <oracle-xsl-mapper:source type="WSDL">
            <oracle-xsl-mapper:schema location="oramds:/apps/SNIComponents/FoundationServiceLibrary/IVP/ChkXpathSOAIVP.wsdl"/>
            <oracle-xsl-mapper:rootElement name="Input" namespace="http://xmlns.schneider.com/SNIFndIntgIVPServices/ChkXpathSOAIVP"/>
         </oracle-xsl-mapper:source>
      </oracle-xsl-mapper:mapSources>
      <oracle-xsl-mapper:mapTargets>
         <oracle-xsl-mapper:target type="WSDL">
            <oracle-xsl-mapper:schema location="oramds:/apps/SNIComponents/FoundationServiceLibrary/IVP/FndIntgVisibiltyDataLookupIVP.wsdl"/>
            <oracle-xsl-mapper:rootElement name="process" namespace="http://xmlns.oracle.com/SNIFndIntgIVPServices/FndIntgVisibiltyDataLookupIVP/FndIntgVisibiltyDataLookupIVP"/>
         </oracle-xsl-mapper:target>
      </oracle-xsl-mapper:mapTargets>
      <oracle-xsl-mapper:mapShowPrefixes type="true"/>
      <!--GENERATED BY ORACLE XSL MAPPER 12.2.1.0.0(XSLT Build 151013.0700.0085) AT [THU OCT 05 03:56:17 CDT 2017].-->
   </oracle-xsl-mapper:schema>
   <!--User Editing allowed BELOW this line - DO NOT DELETE THIS LINE-->
   <xsl:template match="/">
    <client:process>
      <client:visibilityMessageTypeCode>
        <xsl:text disable-output-escaping="no">214_SHIPMENT_STATUS</xsl:text>
      </client:visibilityMessageTypeCode>
      <client:visibilityMessageId>
        <xsl:text disable-output-escaping="no">FNDINTGIVP</xsl:text>
      </client:visibilityMessageId>
      <client:messageTrackingId>
        <xsl:text disable-output-escaping="no"/>
      </client:messageTrackingId>
      <client:numberOfMessages>
        <xsl:text disable-output-escaping="no">-1</xsl:text>
      </client:numberOfMessages>
      <client:messageQualificationCode>
        <xsl:text disable-output-escaping="no">OUTBOUND</xsl:text>
      </client:messageQualificationCode>
      <client:messageStageCode>
        <xsl:text disable-output-escaping="no">PRE_BCS</xsl:text>
      </client:messageStageCode>
      <client:lobId>
        <xsl:text disable-output-escaping="no"/>
      </client:lobId>
      <client:receiverId>
        <xsl:text disable-output-escaping="no"/>
      </client:receiverId>
      <client:senderId>
        <xsl:text disable-output-escaping="no"/>
      </client:senderId>
      <client:messageId>
        <xsl:text disable-output-escaping="no"/>
      </client:messageId>
      <client:searchValue1>
        <xsl:text disable-output-escaping="no">FNDINTGIVP</xsl:text>
      </client:searchValue1>
      <client:searchValue2>
        <xsl:text disable-output-escaping="no">FNDINTGIVP</xsl:text>
      </client:searchValue2>
      <client:searchValue3>
        <xsl:text disable-output-escaping="no"/>
      </client:searchValue3>
      <client:searchValue4>
        <xsl:text disable-output-escaping="no">FNDINTGIVP</xsl:text>
      </client:searchValue4>
      <client:searchValue5>
        <xsl:text disable-output-escaping="no"/>
      </client:searchValue5>
      <client:displayValue1>
        <xsl:text disable-output-escaping="no"/>
      </client:displayValue1>
      <client:displayValue2>
        <xsl:text disable-output-escaping="no"/>
      </client:displayValue2>
      <client:displayValue3>
        <xsl:text disable-output-escaping="no"/>
      </client:displayValue3>
      <client:displayValue4>
        <xsl:text disable-output-escaping="no"/>
      </client:displayValue4>
      <client:displayValue5>
        <xsl:text disable-output-escaping="no"/>
      </client:displayValue5>
    </client:process>
  </xsl:template>
</xsl:stylesheet>