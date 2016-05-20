<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://www.webserviceX.NET/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://www.webserviceX.NET/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://www.webserviceX.NET/">
      <s:element name="ConvertSpeed">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="speed" type="s:double" />
            <s:element minOccurs="1" maxOccurs="1" name="FromUnit" type="tns:SpeedUnit" />
            <s:element minOccurs="1" maxOccurs="1" name="ToUnit" type="tns:SpeedUnit" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:simpleType name="SpeedUnit">
        <s:restriction base="s:string">
          <s:enumeration value="centimetersPersecond" />
          <s:enumeration value="metersPersecond" />
          <s:enumeration value="feetPersecond" />
          <s:enumeration value="feetPerminute" />
          <s:enumeration value="milesPerhour" />
          <s:enumeration value="kilometersPerhour" />
          <s:enumeration value="furlongsPermin" />
          <s:enumeration value="knots" />
          <s:enumeration value="leaguesPerday" />
          <s:enumeration value="Mach" />
        </s:restriction>
      </s:simpleType>
      <s:element name="ConvertSpeedResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="1" maxOccurs="1" name="ConvertSpeedResult" type="s:double" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="double" type="s:double" />
    </s:schema>
  </wsdl:types>
  <wsdl:message name="ConvertSpeedSoapIn">
    <wsdl:part name="parameters" element="tns:ConvertSpeed" />
  </wsdl:message>
  <wsdl:message name="ConvertSpeedSoapOut">
    <wsdl:part name="parameters" element="tns:ConvertSpeedResponse" />
  </wsdl:message>
  <wsdl:message name="ConvertSpeedHttpGetIn">
    <wsdl:part name="speed" type="s:string" />
    <wsdl:part name="FromUnit" type="s:string" />
    <wsdl:part name="ToUnit" type="s:string" />
  </wsdl:message>
  <wsdl:message name="ConvertSpeedHttpGetOut">
    <wsdl:part name="Body" element="tns:double" />
  </wsdl:message>
  <wsdl:message name="ConvertSpeedHttpPostIn">
    <wsdl:part name="speed" type="s:string" />
    <wsdl:part name="FromUnit" type="s:string" />
    <wsdl:part name="ToUnit" type="s:string" />
  </wsdl:message>
  <wsdl:message name="ConvertSpeedHttpPostOut">
    <wsdl:part name="Body" element="tns:double" />
  </wsdl:message>
  <wsdl:portType name="ConvertSpeedsSoap">
    <wsdl:operation name="ConvertSpeed">
      <wsdl:input message="tns:ConvertSpeedSoapIn" />
      <wsdl:output message="tns:ConvertSpeedSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:portType name="ConvertSpeedsHttpGet">
    <wsdl:operation name="ConvertSpeed">
      <wsdl:input message="tns:ConvertSpeedHttpGetIn" />
      <wsdl:output message="tns:ConvertSpeedHttpGetOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:portType name="ConvertSpeedsHttpPost">
    <wsdl:operation name="ConvertSpeed">
      <wsdl:input message="tns:ConvertSpeedHttpPostIn" />
      <wsdl:output message="tns:ConvertSpeedHttpPostOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="ConvertSpeedsSoap" type="tns:ConvertSpeedsSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="ConvertSpeed">
      <soap:operation soapAction="http://www.webserviceX.NET/ConvertSpeed" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="ConvertSpeedsSoap12" type="tns:ConvertSpeedsSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="ConvertSpeed">
      <soap12:operation soapAction="http://www.webserviceX.NET/ConvertSpeed" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="ConvertSpeedsHttpGet" type="tns:ConvertSpeedsHttpGet">
    <http:binding verb="GET" />
    <wsdl:operation name="ConvertSpeed">
      <http:operation location="/ConvertSpeed" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="ConvertSpeedsHttpPost" type="tns:ConvertSpeedsHttpPost">
    <http:binding verb="POST" />
    <wsdl:operation name="ConvertSpeed">
      <http:operation location="/ConvertSpeed" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="ConvertSpeeds">
    <wsdl:port name="ConvertSpeedsSoap" binding="tns:ConvertSpeedsSoap">
      <soap:address location="http://www.webservicex.net/ConvertSpeed.asmx" />
    </wsdl:port>
    <wsdl:port name="ConvertSpeedsSoap12" binding="tns:ConvertSpeedsSoap12">
      <soap12:address location="http://www.webservicex.net/ConvertSpeed.asmx" />
    </wsdl:port>
    <wsdl:port name="ConvertSpeedsHttpGet" binding="tns:ConvertSpeedsHttpGet">
      <http:address location="http://www.webservicex.net/ConvertSpeed.asmx" />
    </wsdl:port>
    <wsdl:port name="ConvertSpeedsHttpPost" binding="tns:ConvertSpeedsHttpPost">
      <http:address location="http://www.webservicex.net/ConvertSpeed.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>