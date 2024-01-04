//place groovy-wslite-1.1.3.jar inside <Root>\SmartBear\SoapUI-5.4.0\bin\ext
//In windows, root will be C:\Program Files (x86)\

import wslite.soap.*
 
log.info("Retrieve Contacts...")
def payload = mockRequest.getRequestContent()
log.info("Request : "+payload)
 
def serviceURL = "Actual_API_GOES_HERE"
 
def client = new SOAPClient(serviceURL)

def response = client.send(payload)

def resp = response.getText()

log.info("Response : "+resp)
 
requestContext.responseMessage = resp
// use ${responseMessage} in the response file - See image