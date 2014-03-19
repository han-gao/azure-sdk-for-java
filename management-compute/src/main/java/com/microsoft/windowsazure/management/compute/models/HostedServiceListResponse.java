/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.compute.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;

/**
* The Get Hosted Service operation response.
*/
public class HostedServiceListResponse extends OperationResponse implements Iterable<HostedServiceListResponse.HostedService> {
    private ArrayList<HostedServiceListResponse.HostedService> hostedServices;
    
    /**
    * Optional. The hosted services associated with your subscription.
    * @return The HostedServices value.
    */
    public ArrayList<HostedServiceListResponse.HostedService> getHostedServices() {
        return this.hostedServices;
    }
    
    /**
    * Optional. The hosted services associated with your subscription.
    * @param hostedServicesValue The HostedServices value.
    */
    public void setHostedServices(final ArrayList<HostedServiceListResponse.HostedService> hostedServicesValue) {
        this.hostedServices = hostedServicesValue;
    }
    
    /**
    * Initializes a new instance of the HostedServiceListResponse class.
    *
    */
    public HostedServiceListResponse() {
        super();
        this.hostedServices = new ArrayList<HostedServiceListResponse.HostedService>();
    }
    
    /**
    * Gets the sequence of HostedServices.
    *
    */
    public Iterator<HostedServiceListResponse.HostedService> iterator() {
        return this.getHostedServices().iterator();
    }
    
    /**
    * A hosted service associated with your subscription.
    */
    public static class HostedService {
        private HostedServiceProperties properties;
        
        /**
        * Optional. The properties that are assigned to the cloud service.
        * @return The Properties value.
        */
        public HostedServiceProperties getProperties() {
            return this.properties;
        }
        
        /**
        * Optional. The properties that are assigned to the cloud service.
        * @param propertiesValue The Properties value.
        */
        public void setProperties(final HostedServiceProperties propertiesValue) {
            this.properties = propertiesValue;
        }
        
        private String serviceName;
        
        /**
        * Optional. The name of the cloud service. This name is the DNS prefix
        * name and can be used to access the cloud service. For example, if
        * the cloud service name is MyService you could access the cloud
        * service by calling: http://MyService.cloudapp.net
        * @return The ServiceName value.
        */
        public String getServiceName() {
            return this.serviceName;
        }
        
        /**
        * Optional. The name of the cloud service. This name is the DNS prefix
        * name and can be used to access the cloud service. For example, if
        * the cloud service name is MyService you could access the cloud
        * service by calling: http://MyService.cloudapp.net
        * @param serviceNameValue The ServiceName value.
        */
        public void setServiceName(final String serviceNameValue) {
            this.serviceName = serviceNameValue;
        }
        
        private URI uri;
        
        /**
        * Optional. The Service Management API request URI used to perform Get
        * Hosted Service Properties requests against the cloud service.
        * @return The Uri value.
        */
        public URI getUri() {
            return this.uri;
        }
        
        /**
        * Optional. The Service Management API request URI used to perform Get
        * Hosted Service Properties requests against the cloud service.
        * @param uriValue The Uri value.
        */
        public void setUri(final URI uriValue) {
            this.uri = uriValue;
        }
    }
}
