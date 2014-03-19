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

package com.microsoft.windowsazure.management.websites.models;

import com.microsoft.windowsazure.core.OperationResponse;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

/**
* The Get Web Site Configuration operation response.
*/
public class WebSiteGetConfigurationResponse extends OperationResponse {
    private HashMap<String, String> appSettings;
    
    /**
    * Optional. A set of name/value pairs that contain application settings for
    * a site.
    * @return The AppSettings value.
    */
    public HashMap<String, String> getAppSettings() {
        return this.appSettings;
    }
    
    /**
    * Optional. A set of name/value pairs that contain application settings for
    * a site.
    * @param appSettingsValue The AppSettings value.
    */
    public void setAppSettings(final HashMap<String, String> appSettingsValue) {
        this.appSettings = appSettingsValue;
    }
    
    private ArrayList<WebSiteGetConfigurationResponse.ConnectionStringInfo> connectionStrings;
    
    /**
    * Optional. Contains connection strings for database and other external
    * resources.
    * @return The ConnectionStrings value.
    */
    public ArrayList<WebSiteGetConfigurationResponse.ConnectionStringInfo> getConnectionStrings() {
        return this.connectionStrings;
    }
    
    /**
    * Optional. Contains connection strings for database and other external
    * resources.
    * @param connectionStringsValue The ConnectionStrings value.
    */
    public void setConnectionStrings(final ArrayList<WebSiteGetConfigurationResponse.ConnectionStringInfo> connectionStringsValue) {
        this.connectionStrings = connectionStringsValue;
    }
    
    private ArrayList<String> defaultDocuments;
    
    /**
    * Optional. Contains one or more string elements that list, in order of
    * preference, the name of the file that a web site returns when the web
    * site's domain name is requested by itself. For example, if the default
    * document for http://contoso.com is default.htm, the page
    * http://www.contoso.com/default.htm is returned when the browser is
    * pointed to http://www.contoso.com.
    * @return The DefaultDocuments value.
    */
    public ArrayList<String> getDefaultDocuments() {
        return this.defaultDocuments;
    }
    
    /**
    * Optional. Contains one or more string elements that list, in order of
    * preference, the name of the file that a web site returns when the web
    * site's domain name is requested by itself. For example, if the default
    * document for http://contoso.com is default.htm, the page
    * http://www.contoso.com/default.htm is returned when the browser is
    * pointed to http://www.contoso.com.
    * @param defaultDocumentsValue The DefaultDocuments value.
    */
    public void setDefaultDocuments(final ArrayList<String> defaultDocumentsValue) {
        this.defaultDocuments = defaultDocumentsValue;
    }
    
    private Boolean detailedErrorLoggingEnabled;
    
    /**
    * Optional. True if detailed error logging is enabled; otherwise, false.
    * @return The DetailedErrorLoggingEnabled value.
    */
    public Boolean isDetailedErrorLoggingEnabled() {
        return this.detailedErrorLoggingEnabled;
    }
    
    /**
    * Optional. True if detailed error logging is enabled; otherwise, false.
    * @param detailedErrorLoggingEnabledValue The DetailedErrorLoggingEnabled
    * value.
    */
    public void setDetailedErrorLoggingEnabled(final Boolean detailedErrorLoggingEnabledValue) {
        this.detailedErrorLoggingEnabled = detailedErrorLoggingEnabledValue;
    }
    
    private String documentRoot;
    
    /**
    * Optional. The document root.
    * @return The DocumentRoot value.
    */
    public String getDocumentRoot() {
        return this.documentRoot;
    }
    
    /**
    * Optional. The document root.
    * @param documentRootValue The DocumentRoot value.
    */
    public void setDocumentRoot(final String documentRootValue) {
        this.documentRoot = documentRootValue;
    }
    
    private ArrayList<WebSiteGetConfigurationResponse.HandlerMapping> handlerMappings;
    
    /**
    * Optional. Specifies custom executable programs for handling requests for
    * specific file name extensions.
    * @return The HandlerMappings value.
    */
    public ArrayList<WebSiteGetConfigurationResponse.HandlerMapping> getHandlerMappings() {
        return this.handlerMappings;
    }
    
    /**
    * Optional. Specifies custom executable programs for handling requests for
    * specific file name extensions.
    * @param handlerMappingsValue The HandlerMappings value.
    */
    public void setHandlerMappings(final ArrayList<WebSiteGetConfigurationResponse.HandlerMapping> handlerMappingsValue) {
        this.handlerMappings = handlerMappingsValue;
    }
    
    private Boolean httpLoggingEnabled;
    
    /**
    * Optional. True if HTTP error logging is enabled; otherwise, false.
    * @return The HttpLoggingEnabled value.
    */
    public Boolean isHttpLoggingEnabled() {
        return this.httpLoggingEnabled;
    }
    
    /**
    * Optional. True if HTTP error logging is enabled; otherwise, false.
    * @param httpLoggingEnabledValue The HttpLoggingEnabled value.
    */
    public void setHttpLoggingEnabled(final Boolean httpLoggingEnabledValue) {
        this.httpLoggingEnabled = httpLoggingEnabledValue;
    }
    
    private Integer logsDirectorySizeLimit;
    
    /**
    * Optional. The limit of the logs directory.
    * @return The LogsDirectorySizeLimit value.
    */
    public Integer getLogsDirectorySizeLimit() {
        return this.logsDirectorySizeLimit;
    }
    
    /**
    * Optional. The limit of the logs directory.
    * @param logsDirectorySizeLimitValue The LogsDirectorySizeLimit value.
    */
    public void setLogsDirectorySizeLimit(final Integer logsDirectorySizeLimitValue) {
        this.logsDirectorySizeLimit = logsDirectorySizeLimitValue;
    }
    
    private ManagedPipelineMode managedPipelineMode;
    
    /**
    * Optional. Managed pipeline modes.
    * @return The ManagedPipelineMode value.
    */
    public ManagedPipelineMode getManagedPipelineMode() {
        return this.managedPipelineMode;
    }
    
    /**
    * Optional. Managed pipeline modes.
    * @param managedPipelineModeValue The ManagedPipelineMode value.
    */
    public void setManagedPipelineMode(final ManagedPipelineMode managedPipelineModeValue) {
        this.managedPipelineMode = managedPipelineModeValue;
    }
    
    private HashMap<String, String> metadata;
    
    /**
    * Optional. Contains name/value pairs for source control or other
    * information.
    * @return The Metadata value.
    */
    public HashMap<String, String> getMetadata() {
        return this.metadata;
    }
    
    /**
    * Optional. Contains name/value pairs for source control or other
    * information.
    * @param metadataValue The Metadata value.
    */
    public void setMetadata(final HashMap<String, String> metadataValue) {
        this.metadata = metadataValue;
    }
    
    private String netFrameworkVersion;
    
    /**
    * Optional. The .NET Framework version. Supported values are v2.0 and v4.0.
    * @return The NetFrameworkVersion value.
    */
    public String getNetFrameworkVersion() {
        return this.netFrameworkVersion;
    }
    
    /**
    * Optional. The .NET Framework version. Supported values are v2.0 and v4.0.
    * @param netFrameworkVersionValue The NetFrameworkVersion value.
    */
    public void setNetFrameworkVersion(final String netFrameworkVersionValue) {
        this.netFrameworkVersion = netFrameworkVersionValue;
    }
    
    private Integer numberOfWorkers;
    
    /**
    * Optional. The number of web workers allotted to the web site. If the site
    * mode is Free, this value is 1. If the site mode is Shared, this value
    * can range from 1 through 6. If the site mode is Standard, this value can
    * range from 1 through 10.
    * @return The NumberOfWorkers value.
    */
    public Integer getNumberOfWorkers() {
        return this.numberOfWorkers;
    }
    
    /**
    * Optional. The number of web workers allotted to the web site. If the site
    * mode is Free, this value is 1. If the site mode is Shared, this value
    * can range from 1 through 6. If the site mode is Standard, this value can
    * range from 1 through 10.
    * @param numberOfWorkersValue The NumberOfWorkers value.
    */
    public void setNumberOfWorkers(final Integer numberOfWorkersValue) {
        this.numberOfWorkers = numberOfWorkersValue;
    }
    
    private String phpVersion;
    
    /**
    * Optional. Supported values are an empty string (an empty string disables
    * PHP), 5.3, and 5.4.
    * @return The PhpVersion value.
    */
    public String getPhpVersion() {
        return this.phpVersion;
    }
    
    /**
    * Optional. Supported values are an empty string (an empty string disables
    * PHP), 5.3, and 5.4.
    * @param phpVersionValue The PhpVersion value.
    */
    public void setPhpVersion(final String phpVersionValue) {
        this.phpVersion = phpVersionValue;
    }
    
    private String publishingPassword;
    
    /**
    * Optional. Hash value of the password used for publishing the web site.
    * @return The PublishingPassword value.
    */
    public String getPublishingPassword() {
        return this.publishingPassword;
    }
    
    /**
    * Optional. Hash value of the password used for publishing the web site.
    * @param publishingPasswordValue The PublishingPassword value.
    */
    public void setPublishingPassword(final String publishingPasswordValue) {
        this.publishingPassword = publishingPasswordValue;
    }
    
    private String publishingUserName;
    
    /**
    * Optional. The username used for publishing the web site. This is normally
    * a dollar sign prepended to the web site name (for example, “$contoso”).
    * @return The PublishingUserName value.
    */
    public String getPublishingUserName() {
        return this.publishingUserName;
    }
    
    /**
    * Optional. The username used for publishing the web site. This is normally
    * a dollar sign prepended to the web site name (for example, “$contoso”).
    * @param publishingUserNameValue The PublishingUserName value.
    */
    public void setPublishingUserName(final String publishingUserNameValue) {
        this.publishingUserName = publishingUserNameValue;
    }
    
    private Boolean remoteDebuggingEnabled;
    
    /**
    * Optional. True remote debugging is enabled; otherwise, false.
    * @return The RemoteDebuggingEnabled value.
    */
    public Boolean isRemoteDebuggingEnabled() {
        return this.remoteDebuggingEnabled;
    }
    
    /**
    * Optional. True remote debugging is enabled; otherwise, false.
    * @param remoteDebuggingEnabledValue The RemoteDebuggingEnabled value.
    */
    public void setRemoteDebuggingEnabled(final Boolean remoteDebuggingEnabledValue) {
        this.remoteDebuggingEnabled = remoteDebuggingEnabledValue;
    }
    
    private RemoteDebuggingVersion remoteDebuggingVersion;
    
    /**
    * Optional. True remote debugging version.
    * @return The RemoteDebuggingVersion value.
    */
    public RemoteDebuggingVersion getRemoteDebuggingVersion() {
        return this.remoteDebuggingVersion;
    }
    
    /**
    * Optional. True remote debugging version.
    * @param remoteDebuggingVersionValue The RemoteDebuggingVersion value.
    */
    public void setRemoteDebuggingVersion(final RemoteDebuggingVersion remoteDebuggingVersionValue) {
        this.remoteDebuggingVersion = remoteDebuggingVersionValue;
    }
    
    private Boolean requestTracingEnabled;
    
    /**
    * Optional. True if request tracing is enabled; otherwise, false.
    * @return The RequestTracingEnabled value.
    */
    public Boolean isRequestTracingEnabled() {
        return this.requestTracingEnabled;
    }
    
    /**
    * Optional. True if request tracing is enabled; otherwise, false.
    * @param requestTracingEnabledValue The RequestTracingEnabled value.
    */
    public void setRequestTracingEnabled(final Boolean requestTracingEnabledValue) {
        this.requestTracingEnabled = requestTracingEnabledValue;
    }
    
    private Calendar requestTracingExpirationTime;
    
    /**
    * Optional. Time remaining until request tracing expires.
    * @return The RequestTracingExpirationTime value.
    */
    public Calendar getRequestTracingExpirationTime() {
        return this.requestTracingExpirationTime;
    }
    
    /**
    * Optional. Time remaining until request tracing expires.
    * @param requestTracingExpirationTimeValue The RequestTracingExpirationTime
    * value.
    */
    public void setRequestTracingExpirationTime(final Calendar requestTracingExpirationTimeValue) {
        this.requestTracingExpirationTime = requestTracingExpirationTimeValue;
    }
    
    private String scmType;
    
    /**
    * Optional. The source control method that the web site is using (for
    * example, Local Git). If deployment from source control has not been set
    * up for the web site, this value is None.
    * @return The ScmType value.
    */
    public String getScmType() {
        return this.scmType;
    }
    
    /**
    * Optional. The source control method that the web site is using (for
    * example, Local Git). If deployment from source control has not been set
    * up for the web site, this value is None.
    * @param scmTypeValue The ScmType value.
    */
    public void setScmType(final String scmTypeValue) {
        this.scmType = scmTypeValue;
    }
    
    private Boolean use32BitWorkerProcess;
    
    /**
    * Optional. True if 32-bit mode is enabled; otherwise, false.
    * @return The Use32BitWorkerProcess value.
    */
    public Boolean isUse32BitWorkerProcess() {
        return this.use32BitWorkerProcess;
    }
    
    /**
    * Optional. True if 32-bit mode is enabled; otherwise, false.
    * @param use32BitWorkerProcessValue The Use32BitWorkerProcess value.
    */
    public void setUse32BitWorkerProcess(final Boolean use32BitWorkerProcessValue) {
        this.use32BitWorkerProcess = use32BitWorkerProcessValue;
    }
    
    private Boolean webSocketsEnabled;
    
    /**
    * Optional. True if Web Sockets are enabled; otherwise, false.
    * @return The WebSocketsEnabled value.
    */
    public Boolean isWebSocketsEnabled() {
        return this.webSocketsEnabled;
    }
    
    /**
    * Optional. True if Web Sockets are enabled; otherwise, false.
    * @param webSocketsEnabledValue The WebSocketsEnabled value.
    */
    public void setWebSocketsEnabled(final Boolean webSocketsEnabledValue) {
        this.webSocketsEnabled = webSocketsEnabledValue;
    }
    
    /**
    * Initializes a new instance of the WebSiteGetConfigurationResponse class.
    *
    */
    public WebSiteGetConfigurationResponse() {
        super();
        this.appSettings = new HashMap<String, String>();
        this.connectionStrings = new ArrayList<WebSiteGetConfigurationResponse.ConnectionStringInfo>();
        this.defaultDocuments = new ArrayList<String>();
        this.handlerMappings = new ArrayList<WebSiteGetConfigurationResponse.HandlerMapping>();
        this.metadata = new HashMap<String, String>();
    }
    
    /**
    * Connection string for database and other external resources.
    */
    public static class ConnectionStringInfo {
        private String connectionString;
        
        /**
        * Optional. A database connection string.
        * @return The ConnectionString value.
        */
        public String getConnectionString() {
            return this.connectionString;
        }
        
        /**
        * Optional. A database connection string.
        * @param connectionStringValue The ConnectionString value.
        */
        public void setConnectionString(final String connectionStringValue) {
            this.connectionString = connectionStringValue;
        }
        
        private String name;
        
        /**
        * Optional. The name of the connection string.
        * @return The Name value.
        */
        public String getName() {
            return this.name;
        }
        
        /**
        * Optional. The name of the connection string.
        * @param nameValue The Name value.
        */
        public void setName(final String nameValue) {
            this.name = nameValue;
        }
        
        private String type;
        
        /**
        * Optional. The type of the connection string (for example, "MySQL").
        * @return The Type value.
        */
        public String getType() {
            return this.type;
        }
        
        /**
        * Optional. The type of the connection string (for example, "MySQL").
        * @param typeValue The Type value.
        */
        public void setType(final String typeValue) {
            this.type = typeValue;
        }
    }
    
    /**
    * Specifies a custom executable program for handling requests for specific
    * file name extensions.
    */
    public static class HandlerMapping {
        private String arguments;
        
        /**
        * Optional. A string that contains optional arguments for the script
        * processor specified by the
        * SiteConfig.HandlerMappings.HandlerMapping.ScriptProcessor element.
        * @return The Arguments value.
        */
        public String getArguments() {
            return this.arguments;
        }
        
        /**
        * Optional. A string that contains optional arguments for the script
        * processor specified by the
        * SiteConfig.HandlerMappings.HandlerMapping.ScriptProcessor element.
        * @param argumentsValue The Arguments value.
        */
        public void setArguments(final String argumentsValue) {
            this.arguments = argumentsValue;
        }
        
        private String extension;
        
        /**
        * Optional. A string that specifies the extension of the file type that
        * the script processor will handle (for example, *.php).
        * @return The Extension value.
        */
        public String getExtension() {
            return this.extension;
        }
        
        /**
        * Optional. A string that specifies the extension of the file type that
        * the script processor will handle (for example, *.php).
        * @param extensionValue The Extension value.
        */
        public void setExtension(final String extensionValue) {
            this.extension = extensionValue;
        }
        
        private String scriptProcessor;
        
        /**
        * Optional. The absolute path to the location of the executable file
        * that will handle the files specified in the
        * SiteConfig.HandlerMappings.HandlerMapping.Extension element.
        * @return The ScriptProcessor value.
        */
        public String getScriptProcessor() {
            return this.scriptProcessor;
        }
        
        /**
        * Optional. The absolute path to the location of the executable file
        * that will handle the files specified in the
        * SiteConfig.HandlerMappings.HandlerMapping.Extension element.
        * @param scriptProcessorValue The ScriptProcessor value.
        */
        public void setScriptProcessor(final String scriptProcessorValue) {
            this.scriptProcessor = scriptProcessorValue;
        }
    }
}
