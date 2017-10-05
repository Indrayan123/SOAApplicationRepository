<?xml version = '1.0' encoding = 'UTF-8'?>
<xsl:stylesheet version="1.0" xmlns:xp20="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.Xpath20" xmlns:bpws="http://schemas.xmlsoap.org/ws/2003/03/business-process/" xmlns:bpel="http://docs.oasis-open.org/wsbpel/2.0/process/executable" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:ns1="http://xmlns.schneider.com/EnterpriseObjects/Core/Common/V1" xmlns:ns2="http://xmlns.schneider.com/SNIFndIntgIVPServices/ChkFaultSOAIVP" xmlns:tns="http://xmlns.schneider.com/SNIFndIntgIVPServices/ChkAdapterIntgSOAIVPSvc" xmlns:ns7="http://xmlns.schneider.com/SNIFndIntgIVPServices/ChkSecuritySOAIVPSvc" xmlns:ns9="http://xmlns.schneider.com/SNIFndIntgIVPServices/ChkServiceIntSOAIVPSvc" xmlns:bpm="http://xmlns.oracle.com/bpmn20/extensions" xmlns:ns10="http://xmlns.schneider.com/SNIFndIntgIVPServices/ChkServiceIntSOAIVP" xmlns:plnk="http://schemas.xmlsoap.org/ws/2003/05/partner-link/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:ns11="http://xmlns.schneider.com/SNIFndIntgIVPServices/ChkXpathSOAIVP" xmlns:ora="http://schemas.oracle.com/xpath/extension" xmlns:ns14="http://xmlns.schneider.com/SNIFndIntgIVPServices/ValidateALLSOAIVP" xmlns:socket="http://www.oracle.com/XSL/Transform/java/oracle.tip.adapter.socket.ProtocolTranslator" xmlns:ns6="http://xmlns.schneider.com/SNIFndIntgIVPServices/ChkSecuritySOAIVP" xmlns:mhdr="http://www.oracle.com/XSL/Transform/java/oracle.tip.mediator.service.common.functions.MediatorExtnFunction" xmlns:oraext="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.ExtFunc" xmlns:dvm="http://www.oracle.com/XSL/Transform/java/oracle.tip.dvm.LookupValue" xmlns:ns12="http://xmlns.schneider.com/SNIFndIntgIVPServices/ChkXpathSOAIVPSvc" xmlns:hwf="http://xmlns.oracle.com/bpel/workflow/xpath" xmlns:med="http://schemas.oracle.com/mediator/xpath" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:ids="http://xmlns.oracle.com/bpel/services/IdentityService/xpath" xmlns:xdk="http://schemas.oracle.com/bpel/extension/xpath/function/xdk" xmlns:ns4="http://xmlns.schneider.com/SNIFndIntgIVPServices/ChkLookupSOAIVP" xmlns:xref="http://www.oracle.com/XSL/Transform/java/oracle.tip.xref.xpath.XRefXPathFunctions" xmlns:inp1="http://xmlns.schneider.com/SNIFndIntgIVPServices/ChkAdapterIntgSOAIVP" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:ns3="http://xmlns.schneider.com/SNIFndIntgIVPServices/ChkLookupSOAIVPSvc" xmlns:ns8="http://schemas.oracle.com/bpel/extension" xmlns:ns0="http://xmlns.schneider.com/SNIFndIntgIVPServices/ChkFaultSOAIVPSvc" xmlns:ns5="http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd" xmlns:ns13="http://xmlns.schneider.com/SNIFndIntgUPGIVPServices/UPG/FndIntgValidateSOAUPGIVP" xmlns:ldap="http://schemas.oracle.com/xpath/extension/ldap" exclude-result-prefixes="xsi xsl ns1 ns2 tns ns7 ns9 ns10 plnk wsdl ns11 ns14 ns6 ns12 ns4 inp1 xsd ns3 ns8 ns0 ns5 ns13 xp20 bpws bpel bpm ora socket mhdr oraext dvm hwf med ids xdk xref ldap" xmlns:oracle-xsl-mapper="http://www.oracle.com/xsl/mapper/schemas">
  <oracle-xsl-mapper:schema>
      <!--SPECIFICATION OF MAP SOURCES AND TARGETS, DO NOT MODIFY.-->
      <oracle-xsl-mapper:mapSources>
         <oracle-xsl-mapper:source type="WSDL">
            <oracle-xsl-mapper:schema location="oramds:/apps/SNIComponents/FoundationServiceLibrary/IVP/ChkAdapterIntgSOAIVPSvc.wsdl"/>
            <oracle-xsl-mapper:rootElement name="Output" namespace="http://xmlns.schneider.com/SNIFndIntgIVPServices/ChkAdapterIntgSOAIVP"/>
         </oracle-xsl-mapper:source>
         <oracle-xsl-mapper:source type="WSDL">
            <oracle-xsl-mapper:schema location="oramds:/apps/SNIComponents/FoundationServiceLibrary/IVP/ChkFaultSOAIVP.wsdl"/>
            <oracle-xsl-mapper:rootElement name="Output" namespace="http://xmlns.schneider.com/SNIFndIntgIVPServices/ChkFaultSOAIVP"/>
            <oracle-xsl-mapper:param name="ValidateFaultHandlingIVPResMsg.part"/>
         </oracle-xsl-mapper:source>
         <oracle-xsl-mapper:source type="WSDL">
            <oracle-xsl-mapper:schema location="oramds:/apps/SNIComponents/FoundationServiceLibrary/IVP/ChkLookupSOAIVP.wsdl"/>
            <oracle-xsl-mapper:rootElement name="Output" namespace="http://xmlns.schneider.com/SNIFndIntgIVPServices/ChkLookupSOAIVP"/>
            <oracle-xsl-mapper:param name="ValidateLookupFunctionIVPResMsg.part"/>
         </oracle-xsl-mapper:source>
         <oracle-xsl-mapper:source type="WSDL">
            <oracle-xsl-mapper:schema location="oramds:/apps/SNIComponents/FoundationServiceLibrary/IVP/ChkSecuritySOAIVP.wsdl"/>
            <oracle-xsl-mapper:rootElement name="Output" namespace="http://xmlns.schneider.com/SNIFndIntgIVPServices/ChkSecuritySOAIVP"/>
            <oracle-xsl-mapper:param name="ValidateSecurityIVPResMsg.part"/>
         </oracle-xsl-mapper:source>
         <oracle-xsl-mapper:source type="WSDL">
            <oracle-xsl-mapper:schema location="oramds:/apps/SNIComponents/FoundationServiceLibrary/IVP/ChkServiceIntSOAIVP.wsdl"/>
            <oracle-xsl-mapper:rootElement name="Output" namespace="http://xmlns.schneider.com/SNIFndIntgIVPServices/ChkServiceIntSOAIVP"/>
            <oracle-xsl-mapper:param name="ValidateServiceInteractionIVPResMsg.part"/>
         </oracle-xsl-mapper:source>
         <oracle-xsl-mapper:source type="WSDL">
            <oracle-xsl-mapper:schema location="oramds:/apps/SNIComponents/FoundationServiceLibrary/IVP/ChkXpathSOAIVP.wsdl"/>
            <oracle-xsl-mapper:rootElement name="Output" namespace="http://xmlns.schneider.com/SNIFndIntgIVPServices/ChkXpathSOAIVP"/>
            <oracle-xsl-mapper:param name="ValidateXpathFunctionIVPResMsg.part"/>
         </oracle-xsl-mapper:source>
         <oracle-xsl-mapper:source type="WSDL">
            <oracle-xsl-mapper:schema location="oramds:/apps/SNIComponents/FoundationServiceLibrary/IVP/FndIntgValidateSOAUPGIVP.wsdl"/>
            <oracle-xsl-mapper:rootElement name="Output" namespace="http://xmlns.schneider.com/SNIFndIntgUPGIVPServices/UPG/FndIntgValidateSOAUPGIVP"/>
            <oracle-xsl-mapper:param name="InvokeFndIntgValidateSOAUPGIVP_OutputVariable.part"/>
         </oracle-xsl-mapper:source>
      </oracle-xsl-mapper:mapSources>
      <oracle-xsl-mapper:mapTargets>
         <oracle-xsl-mapper:target type="WSDL">
            <oracle-xsl-mapper:schema location="oramds:/apps/SNIComponents/FoundationServiceLibrary/IVP/FndIntgValidateALLSOAIVPsvc.wsdl"/>
            <oracle-xsl-mapper:rootElement name="Output" namespace="http://xmlns.schneider.com/SNIFndIntgIVPServices/ValidateALLSOAIVP"/>
         </oracle-xsl-mapper:target>
      </oracle-xsl-mapper:mapTargets>
      <oracle-xsl-mapper:mapShowPrefixes type="true"/>
      <!--GENERATED BY ORACLE XSL MAPPER 12.2.1.0.0(XSLT Build 151013.0700.0085) AT [THU OCT 05 04:06:08 CDT 2017].-->
   </oracle-xsl-mapper:schema>
   <!--User Editing allowed BELOW this line - DO NOT DELETE THIS LINE-->
   <xsl:param name="ValidateFaultHandlingIVPResMsg.part"/>
  <xsl:param name="ValidateLookupFunctionIVPResMsg.part"/>
  <xsl:param name="ValidateSecurityIVPResMsg.part"/>
  <xsl:param name="ValidateServiceInteractionIVPResMsg.part"/>
  <xsl:param name="ValidateXpathFunctionIVPResMsg.part"/>
  <xsl:param name="InvokeFndIntgValidateSOAUPGIVP_OutputVariable.part"/>
  <xsl:template match="/">
    <ns14:Output>
      <ns14:ValidateAdapterIntegrationIVPRes>
        <ns14:fndintgappsadapterivp>
          <ns14:Status>
            <xsl:value-of select="/inp1:Output/inp1:ValidateAdapterIntgRes/inp1:fndintgappsadapterivp/inp1:Status"/>
          </ns14:Status>
          <xsl:if test="/inp1:Output/inp1:ValidateAdapterIntgRes/inp1:fndintgappsadapterivp/inp1:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="/inp1:Output/inp1:ValidateAdapterIntgRes/inp1:fndintgappsadapterivp/inp1:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgappsadapterivp>
        <ns14:fndintgaqenqivp>
          <ns14:Status>
            <xsl:value-of select="/inp1:Output/inp1:ValidateAdapterIntgRes/inp1:fndintgaqenqivp/inp1:Status"/>
          </ns14:Status>
          <xsl:if test="/inp1:Output/inp1:ValidateAdapterIntgRes/inp1:fndintgaqenqivp/inp1:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="/inp1:Output/inp1:ValidateAdapterIntgRes/inp1:fndintgaqenqivp/inp1:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgaqenqivp>
        <ns14:fndintgdbadapterivp>
          <ns14:Status>
            <xsl:value-of select="/inp1:Output/inp1:ValidateAdapterIntgRes/inp1:fndintgdbadapterivp/inp1:Status"/>
          </ns14:Status>
          <xsl:if test="/inp1:Output/inp1:ValidateAdapterIntgRes/inp1:fndintgdbadapterivp/inp1:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="/inp1:Output/inp1:ValidateAdapterIntgRes/inp1:fndintgdbadapterivp/inp1:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgdbadapterivp>
        <ns14:fndintgjmsrqenqueue>
          <ns14:Status>
            <xsl:value-of select="/inp1:Output/inp1:ValidateAdapterIntgRes/inp1:fndintgjmsrqenqueue/inp1:Status"/>
          </ns14:Status>
          <xsl:if test="/inp1:Output/inp1:ValidateAdapterIntgRes/inp1:fndintgjmsrqenqueue/inp1:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="/inp1:Output/inp1:ValidateAdapterIntgRes/inp1:fndintgjmsrqenqueue/inp1:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgjmsrqenqueue>
        <ns14:fndintgtopicpublisherivp>
          <ns14:Status>
            <xsl:value-of select="/inp1:Output/inp1:ValidateAdapterIntgRes/inp1:fndintgtopicpublisherivp/inp1:Status"/>
          </ns14:Status>
          <xsl:if test="/inp1:Output/inp1:ValidateAdapterIntgRes/inp1:fndintgtopicpublisherivp/inp1:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="/inp1:Output/inp1:ValidateAdapterIntgRes/inp1:fndintgtopicpublisherivp/inp1:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgtopicpublisherivp>
        <ns14:fndintguooqueuepublisher>
          <ns14:Status>
            <xsl:value-of select="/inp1:Output/inp1:ValidateAdapterIntgRes/inp1:fndintguooqueuepublisher/inp1:Status"/>
          </ns14:Status>
          <xsl:if test="/inp1:Output/inp1:ValidateAdapterIntgRes/inp1:fndintguooqueuepublisher/inp1:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="/inp1:Output/inp1:ValidateAdapterIntgRes/inp1:fndintguooqueuepublisher/inp1:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintguooqueuepublisher>
      </ns14:ValidateAdapterIntegrationIVPRes>
      <ns14:ValidateFaultHandlingIVPRes>
        <ns14:fndintgfaulthandlingivp>
          <ns14:Status>
            <xsl:value-of select="$ValidateFaultHandlingIVPResMsg.part/ns2:Output/ns2:ValidateFaultHandlingRes/ns2:fndintgfaulthandlingivp/ns2:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateFaultHandlingIVPResMsg.part/ns2:Output/ns2:ValidateFaultHandlingRes/ns2:fndintgfaulthandlingivp/ns2:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateFaultHandlingIVPResMsg.part/ns2:Output/ns2:ValidateFaultHandlingRes/ns2:fndintgfaulthandlingivp/ns2:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgfaulthandlingivp>
        <ns14:fndintghandlesnifaultivp>
          <ns14:Status>
            <xsl:value-of select="$ValidateFaultHandlingIVPResMsg.part/ns2:Output/ns2:ValidateFaultHandlingRes/ns2:fndintghandlesnifaultivp/ns2:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateFaultHandlingIVPResMsg.part/ns2:Output/ns2:ValidateFaultHandlingRes/ns2:fndintghandlesnifaultivp/ns2:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateFaultHandlingIVPResMsg.part/ns2:Output/ns2:ValidateFaultHandlingRes/ns2:fndintghandlesnifaultivp/ns2:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintghandlesnifaultivp>
        <ns14:fndintgheaderxpath>
          <ns14:Status>
            <xsl:value-of select="$ValidateFaultHandlingIVPResMsg.part/ns2:Output/ns2:ValidateFaultHandlingRes/ns2:fndintgheaderxpath/ns2:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateFaultHandlingIVPResMsg.part/ns2:Output/ns2:ValidateFaultHandlingRes/ns2:fndintgheaderxpath/ns2:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateFaultHandlingIVPResMsg.part/ns2:Output/ns2:ValidateFaultHandlingRes/ns2:fndintgheaderxpath/ns2:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgheaderxpath>
        <ns14:fndintglogsnimessageivp>
          <ns14:Status>
            <xsl:value-of select="$ValidateFaultHandlingIVPResMsg.part/ns2:Output/ns2:ValidateFaultHandlingRes/ns2:fndintglogsnimessageivp/ns2:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateFaultHandlingIVPResMsg.part/ns2:Output/ns2:ValidateFaultHandlingRes/ns2:fndintglogsnimessageivp/ns2:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateFaultHandlingIVPResMsg.part/ns2:Output/ns2:ValidateFaultHandlingRes/ns2:fndintglogsnimessageivp/ns2:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintglogsnimessageivp>
      </ns14:ValidateFaultHandlingIVPRes>
      <ns14:ValidateLookupFunctionIVPRes>
        <ns14:fndintglookupxrefivp>
          <ns14:Status>
            <xsl:value-of select="$ValidateLookupFunctionIVPResMsg.part/ns4:Output/ns4:ValidateLookupFunctionRes/ns4:fndintglookupxrefivp/ns4:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateLookupFunctionIVPResMsg.part/ns4:Output/ns4:ValidateLookupFunctionRes/ns4:fndintglookupxrefivp/ns4:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateLookupFunctionIVPResMsg.part/ns4:Output/ns4:ValidateLookupFunctionRes/ns4:fndintglookupxrefivp/ns4:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintglookupxrefivp>
        <ns14:fndintgPopulatexrefivp>
          <ns14:Status>
            <xsl:value-of select="$ValidateLookupFunctionIVPResMsg.part/ns4:Output/ns4:ValidateLookupFunctionRes/ns4:fndintgPopulatexrefivp/ns4:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateLookupFunctionIVPResMsg.part/ns4:Output/ns4:ValidateLookupFunctionRes/ns4:fndintgPopulatexrefivp/ns4:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateLookupFunctionIVPResMsg.part/ns4:Output/ns4:ValidateLookupFunctionRes/ns4:fndintgPopulatexrefivp/ns4:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgPopulatexrefivp>
        <ns14:fndintgSNICreatexrefrowivp>
          <ns14:Status>
            <xsl:value-of select="$ValidateLookupFunctionIVPResMsg.part/ns4:Output/ns4:ValidateLookupFunctionRes/ns4:fndintgSNICreatexrefrowivp/ns4:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateLookupFunctionIVPResMsg.part/ns4:Output/ns4:ValidateLookupFunctionRes/ns4:fndintgSNICreatexrefrowivp/ns4:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateLookupFunctionIVPResMsg.part/ns4:Output/ns4:ValidateLookupFunctionRes/ns4:fndintgSNICreatexrefrowivp/ns4:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgSNICreatexrefrowivp>
        <ns14:fndintgBCSlookupivp>
          <ns14:Status>
            <xsl:value-of select="$ValidateLookupFunctionIVPResMsg.part/ns4:Output/ns4:ValidateLookupFunctionRes/ns4:fndintgBCSlookupivp/ns4:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateLookupFunctionIVPResMsg.part/ns4:Output/ns4:ValidateLookupFunctionRes/ns4:fndintgBCSlookupivp/ns4:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateLookupFunctionIVPResMsg.part/ns4:Output/ns4:ValidateLookupFunctionRes/ns4:fndintgBCSlookupivp/ns4:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgBCSlookupivp>
        <ns14:fndintgLookupDVMivp>
          <ns14:Status>
            <xsl:value-of select="$ValidateLookupFunctionIVPResMsg.part/ns4:Output/ns4:ValidateLookupFunctionRes/ns4:fndintgLookupDVMivp/ns4:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateLookupFunctionIVPResMsg.part/ns4:Output/ns4:ValidateLookupFunctionRes/ns4:fndintgLookupDVMivp/ns4:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateLookupFunctionIVPResMsg.part/ns4:Output/ns4:ValidateLookupFunctionRes/ns4:fndintgLookupDVMivp/ns4:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgLookupDVMivp>
      </ns14:ValidateLookupFunctionIVPRes>
      <ns14:ValidateSecurityIVPRes>
        <ns14:fndintgSecurityivp>
          <ns14:Status>
            <xsl:value-of select="$ValidateSecurityIVPResMsg.part/ns6:Output/ns6:ValidateSecurityRes/ns6:fndintgSecurityivp/ns6:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateSecurityIVPResMsg.part/ns6:Output/ns6:ValidateSecurityRes/ns6:fndintgSecurityivp/ns6:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateSecurityIVPResMsg.part/ns6:Output/ns6:ValidateSecurityRes/ns6:fndintgSecurityivp/ns6:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgSecurityivp>
        <ns14:fndintgContExecutorivp>
          <ns14:Status>
            <xsl:value-of select="$ValidateSecurityIVPResMsg.part/ns6:Output/ns6:ValidateSecurityRes/ns6:fndintgContExecutorivp/ns6:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateSecurityIVPResMsg.part/ns6:Output/ns6:ValidateSecurityRes/ns6:fndintgContExecutorivp/ns6:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateSecurityIVPResMsg.part/ns6:Output/ns6:ValidateSecurityRes/ns6:fndintgContExecutorivp/ns6:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgContExecutorivp>
        <ns14:fndintgSiebelSecivp>
          <ns14:Status>
            <xsl:value-of select="$ValidateSecurityIVPResMsg.part/ns6:Output/ns6:ValidateSecurityRes/ns6:fndintgSiebelSecivp/ns6:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateSecurityIVPResMsg.part/ns6:Output/ns6:ValidateSecurityRes/ns6:fndintgSiebelSecivp/ns6:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateSecurityIVPResMsg.part/ns6:Output/ns6:ValidateSecurityRes/ns6:fndintgSiebelSecivp/ns6:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgSiebelSecivp>
        <ns14:fndintgOWSMivpAuthResult>
          <ns14:Status>
            <xsl:value-of select="$ValidateSecurityIVPResMsg.part/ns6:Output/ns6:ValidateSecurityRes/ns6:fndintgOWSMivpAuthResult/ns6:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateSecurityIVPResMsg.part/ns6:Output/ns6:ValidateSecurityRes/ns6:fndintgOWSMivpAuthResult/ns6:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateSecurityIVPResMsg.part/ns6:Output/ns6:ValidateSecurityRes/ns6:fndintgOWSMivpAuthResult/ns6:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgOWSMivpAuthResult>
      </ns14:ValidateSecurityIVPRes>
      <ns14:ValidateServiceInteractionIVPRes>
        <ns14:fndintglargepayloadBRivp>
          <ns14:Status>
            <xsl:value-of select="$ValidateServiceInteractionIVPResMsg.part/ns10:Output/ns10:ValidateServiceIntRes/ns10:fndintglargepayloadBRivp/ns10:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateServiceInteractionIVPResMsg.part/ns10:Output/ns10:ValidateServiceIntRes/ns10:fndintglargepayloadBRivp/ns10:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateServiceInteractionIVPResMsg.part/ns10:Output/ns10:ValidateServiceIntRes/ns10:fndintglargepayloadBRivp/ns10:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintglargepayloadBRivp>
        <ns14:fndintgsimpleBRivp>
          <ns14:Status>
            <xsl:value-of select="$ValidateServiceInteractionIVPResMsg.part/ns10:Output/ns10:ValidateServiceIntRes/ns10:fndintgsimpleBRivp/ns10:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateServiceInteractionIVPResMsg.part/ns10:Output/ns10:ValidateServiceIntRes/ns10:fndintgsimpleBRivp/ns10:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateServiceInteractionIVPResMsg.part/ns10:Output/ns10:ValidateServiceIntRes/ns10:fndintgsimpleBRivp/ns10:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgsimpleBRivp>
        <ns14:fndintgbipivp>
          <ns14:Status>
            <xsl:value-of select="$ValidateServiceInteractionIVPResMsg.part/ns10:Output/ns10:ValidateServiceIntRes/ns10:fndintgbipivp/ns10:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateServiceInteractionIVPResMsg.part/ns10:Output/ns10:ValidateServiceIntRes/ns10:fndintgbipivp/ns10:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateServiceInteractionIVPResMsg.part/ns10:Output/ns10:ValidateServiceIntRes/ns10:fndintgbipivp/ns10:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgbipivp>
        <ns14:fndintgbpelmediatorcompositeivp>
          <ns14:Status>
            <xsl:value-of select="$ValidateServiceInteractionIVPResMsg.part/ns10:Output/ns10:ValidateServiceIntRes/ns10:fndintgbpelmediatorcompositeivp/ns10:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateServiceInteractionIVPResMsg.part/ns10:Output/ns10:ValidateServiceIntRes/ns10:fndintgbpelmediatorcompositeivp/ns10:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateServiceInteractionIVPResMsg.part/ns10:Output/ns10:ValidateServiceIntRes/ns10:fndintgbpelmediatorcompositeivp/ns10:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgbpelmediatorcompositeivp>
        <ns14:fndintgmediatortoexternalbpelivp>
          <ns14:Status>
            <xsl:value-of select="$ValidateServiceInteractionIVPResMsg.part/ns10:Output/ns10:ValidateServiceIntRes/ns10:fndintgmediatortoexternalbpelivp/ns10:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateServiceInteractionIVPResMsg.part/ns10:Output/ns10:ValidateServiceIntRes/ns10:fndintgmediatortoexternalbpelivp/ns10:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateServiceInteractionIVPResMsg.part/ns10:Output/ns10:ValidateServiceIntRes/ns10:fndintgmediatortoexternalbpelivp/ns10:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgmediatortoexternalbpelivp>
        <ns14:fndintgsynctToonewayivp>
          <ns14:Status>
            <xsl:value-of select="$ValidateServiceInteractionIVPResMsg.part/ns10:Output/ns10:ValidateServiceIntRes/ns10:fndintgsynctToonewayivp/ns10:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateServiceInteractionIVPResMsg.part/ns10:Output/ns10:ValidateServiceIntRes/ns10:fndintgsynctToonewayivp/ns10:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateServiceInteractionIVPResMsg.part/ns10:Output/ns10:ValidateServiceIntRes/ns10:fndintgsynctToonewayivp/ns10:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgsynctToonewayivp>
         <ns14:fndintgsoatoosbintgivp>
          <ns14:Status>
            <xsl:value-of select="$ValidateServiceInteractionIVPResMsg.part/ns10:Output/ns10:ValidateServiceIntRes/ns10:fndintgsoatoosbintgivp/ns10:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateServiceInteractionIVPResMsg.part/ns10:Output/ns10:ValidateServiceIntRes/ns10:fndintgsoatoosbintgivp/ns10:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateServiceInteractionIVPResMsg.part/ns10:Output/ns10:ValidateServiceIntRes/ns10:fndintgsoatoosbintgivp/ns10:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgsoatoosbintgivp>
        <ns14:fndintgumsmailprocessivp>
          <ns14:Status>
            <xsl:value-of select="$ValidateServiceInteractionIVPResMsg.part/ns10:Output/ns10:ValidateServiceIntRes/ns10:fndintgumsmailprocessivp/ns10:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateServiceInteractionIVPResMsg.part/ns10:Output/ns10:ValidateServiceIntRes/ns10:fndintgumsmailprocessivp/ns10:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateServiceInteractionIVPResMsg.part/ns10:Output/ns10:ValidateServiceIntRes/ns10:fndintgumsmailprocessivp/ns10:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgumsmailprocessivp>
        <ns14:fndintgodiivp>
          <ns14:Status>
            <xsl:value-of select="$ValidateServiceInteractionIVPResMsg.part/ns10:Output/ns10:ValidateServiceIntRes/ns10:fndintgodiivp/ns10:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateServiceInteractionIVPResMsg.part/ns10:Output/ns10:ValidateServiceIntRes/ns10:fndintgodiivp/ns10:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateServiceInteractionIVPResMsg.part/ns10:Output/ns10:ValidateServiceIntRes/ns10:fndintgodiivp/ns10:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgodiivp>
        <ns14:fndintghumantaskivp>
          <ns14:Status>
            <xsl:value-of select="$ValidateServiceInteractionIVPResMsg.part/ns10:Output/ns10:ValidateServiceIntRes/ns10:fndintghumantaskivp/ns10:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateServiceInteractionIVPResMsg.part/ns10:Output/ns10:ValidateServiceIntRes/ns10:fndintghumantaskivp/ns10:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateServiceInteractionIVPResMsg.part/ns10:Output/ns10:ValidateServiceIntRes/ns10:fndintghumantaskivp/ns10:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintghumantaskivp>
      </ns14:ValidateServiceInteractionIVPRes>
      <ns14:ValidateXpathFunctionIVPRes>
        <ns14:fndintgmiscellaneousivp>
          <ns14:Status>
            <xsl:value-of select="$ValidateXpathFunctionIVPResMsg.part/ns11:Output/ns11:ValidateXpathFunctionRes/ns11:fndintgmiscellaneousivp/ns11:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateXpathFunctionIVPResMsg.part/ns11:Output/ns11:ValidateXpathFunctionRes/ns11:fndintgmiscellaneousivp/ns11:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateXpathFunctionIVPResMsg.part/ns11:Output/ns11:ValidateXpathFunctionRes/ns11:fndintgmiscellaneousivp/ns11:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgmiscellaneousivp>
        <ns14:fndintgsniconfigtableivp>
          <ns14:Status>
            <xsl:value-of select="$ValidateXpathFunctionIVPResMsg.part/ns11:Output/ns11:ValidateXpathFunctionRes/ns11:fndintgsniconfigtableivp/ns11:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateXpathFunctionIVPResMsg.part/ns11:Output/ns11:ValidateXpathFunctionRes/ns11:fndintgsniconfigtableivp/ns11:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateXpathFunctionIVPResMsg.part/ns11:Output/ns11:ValidateXpathFunctionRes/ns11:fndintgsniconfigtableivp/ns11:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgsniconfigtableivp>
        <ns14:fndintgenterprisecacheivp>
          <ns14:Status>
            <xsl:value-of select="$ValidateXpathFunctionIVPResMsg.part/ns11:Output/ns11:ValidateXpathFunctionRes/ns11:fndintgenterprisecacheivp/ns11:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateXpathFunctionIVPResMsg.part/ns11:Output/ns11:ValidateXpathFunctionRes/ns11:fndintgenterprisecacheivp/ns11:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateXpathFunctionIVPResMsg.part/ns11:Output/ns11:ValidateXpathFunctionRes/ns11:fndintgenterprisecacheivp/ns11:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgenterprisecacheivp>
        <ns14:fndintgvisibiltydatalookupivp>
          <ns14:Status>
            <xsl:value-of select="$ValidateXpathFunctionIVPResMsg.part/ns11:Output/ns11:ValidateXpathFunctionRes/ns11:fndintgvisibiltydatalookupivp/ns11:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateXpathFunctionIVPResMsg.part/ns11:Output/ns11:ValidateXpathFunctionRes/ns11:fndintgvisibiltydatalookupivp/ns11:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateXpathFunctionIVPResMsg.part/ns11:Output/ns11:ValidateXpathFunctionRes/ns11:fndintgvisibiltydatalookupivp/ns11:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgvisibiltydatalookupivp>
        <ns14:fndintgcomparexmlivp>
          <ns14:Status>
            <xsl:value-of select="$ValidateXpathFunctionIVPResMsg.part/ns11:Output/ns11:ValidateXpathFunctionRes/ns11:fndintgcomparexmlivp/ns11:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateXpathFunctionIVPResMsg.part/ns11:Output/ns11:ValidateXpathFunctionRes/ns11:fndintgcomparexmlivp/ns11:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateXpathFunctionIVPResMsg.part/ns11:Output/ns11:ValidateXpathFunctionRes/ns11:fndintgcomparexmlivp/ns11:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgcomparexmlivp>
        <ns14:fndintgdatexpathivp>
          <ns14:Status>
            <xsl:value-of select="$ValidateXpathFunctionIVPResMsg.part/ns11:Output/ns11:ValidateXpathFunctionRes/ns11:fndintgdatexpathivp/ns11:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateXpathFunctionIVPResMsg.part/ns11:Output/ns11:ValidateXpathFunctionRes/ns11:fndintgdatexpathivp/ns11:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateXpathFunctionIVPResMsg.part/ns11:Output/ns11:ValidateXpathFunctionRes/ns11:fndintgdatexpathivp/ns11:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgdatexpathivp>
        <ns14:fndintgsendemailivp>
          <ns14:Status>
            <xsl:value-of select="$ValidateXpathFunctionIVPResMsg.part/ns11:Output/ns11:ValidateXpathFunctionRes/ns11:fndintgsendemailivp/ns11:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateXpathFunctionIVPResMsg.part/ns11:Output/ns11:ValidateXpathFunctionRes/ns11:fndintgsendemailivp/ns11:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateXpathFunctionIVPResMsg.part/ns11:Output/ns11:ValidateXpathFunctionRes/ns11:fndintgsendemailivp/ns11:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgsendemailivp>
        <ns14:fndintgoptimisticlockivp>
          <ns14:Status>
            <xsl:value-of select="$ValidateXpathFunctionIVPResMsg.part/ns11:Output/ns11:ValidateXpathFunctionRes/ns11:fndintgoptimisticlockivp/ns11:Status"/>
          </ns14:Status>
          <xsl:if test="$ValidateXpathFunctionIVPResMsg.part/ns11:Output/ns11:ValidateXpathFunctionRes/ns11:fndintgoptimisticlockivp/ns11:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$ValidateXpathFunctionIVPResMsg.part/ns11:Output/ns11:ValidateXpathFunctionRes/ns11:fndintgoptimisticlockivp/ns11:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:fndintgoptimisticlockivp>
      </ns14:ValidateXpathFunctionIVPRes>
      <ns14:ValidateSOAUPGIVPRes>
        <ns14:FndIntgUPGCheckDynamicPatnerlinkFaultIVP>
          <ns14:Status>
            <xsl:value-of select="$InvokeFndIntgValidateSOAUPGIVP_OutputVariable.part/ns13:Output/ns13:ValidateSOAUPGIVPRes/ns13:FndIntgUPGCheckDynamicPatnerlinkFaultIVP/ns13:Status"/>
          </ns14:Status>
          <xsl:if test="$InvokeFndIntgValidateSOAUPGIVP_OutputVariable.part/ns13:Output/ns13:ValidateSOAUPGIVPRes/ns13:FndIntgUPGCheckDynamicPatnerlinkFaultIVP/ns13:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$InvokeFndIntgValidateSOAUPGIVP_OutputVariable.part/ns13:Output/ns13:ValidateSOAUPGIVPRes/ns13:FndIntgUPGCheckDynamicPatnerlinkFaultIVP/ns13:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:FndIntgUPGCheckDynamicPatnerlinkFaultIVP>
        <ns14:FndIntgUPGCheckNamespaceIVP>
          <ns14:Status>
            <xsl:value-of select="$InvokeFndIntgValidateSOAUPGIVP_OutputVariable.part/ns13:Output/ns13:ValidateSOAUPGIVPRes/ns13:FndIntgUPGCheckNamespaceIVP/ns13:Status"/>
          </ns14:Status>
          <xsl:if test="$InvokeFndIntgValidateSOAUPGIVP_OutputVariable.part/ns13:Output/ns13:ValidateSOAUPGIVPRes/ns13:FndIntgUPGCheckNamespaceIVP/ns13:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$InvokeFndIntgValidateSOAUPGIVP_OutputVariable.part/ns13:Output/ns13:ValidateSOAUPGIVPRes/ns13:FndIntgUPGCheckNamespaceIVP/ns13:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:FndIntgUPGCheckNamespaceIVP>
        <ns14:FndIntgUPGCheckXSlEmptyValueIVP>
          <ns14:Status>
            <xsl:value-of select="$InvokeFndIntgValidateSOAUPGIVP_OutputVariable.part/ns13:Output/ns13:ValidateSOAUPGIVPRes/ns13:FndIntgUPGCheckXSlEmptyValueIVP/ns13:Status"/>
          </ns14:Status>
          <xsl:if test="$InvokeFndIntgValidateSOAUPGIVP_OutputVariable.part/ns13:Output/ns13:ValidateSOAUPGIVPRes/ns13:FndIntgUPGCheckXSlEmptyValueIVP/ns13:AdditionalNote">
            <ns14:AdditionalNote>
              <xsl:value-of select="$InvokeFndIntgValidateSOAUPGIVP_OutputVariable.part/ns13:Output/ns13:ValidateSOAUPGIVPRes/ns13:FndIntgUPGCheckXSlEmptyValueIVP/ns13:AdditionalNote"/>
            </ns14:AdditionalNote>
          </xsl:if>
        </ns14:FndIntgUPGCheckXSlEmptyValueIVP>
      </ns14:ValidateSOAUPGIVPRes>
      <ns14:OtherDetails>
        <ns14:ExecutionStartTime/>          
        <ns14:ExecutionEndTime/>         
        <ns14:ServerName/>          
      </ns14:OtherDetails>
    </ns14:Output>
  </xsl:template>
</xsl:stylesheet>