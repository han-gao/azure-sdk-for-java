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

import com.microsoft.windowsazure.core.LazyArrayList;
import com.microsoft.windowsazure.core.OperationResponse;
import java.util.ArrayList;

/**
* A standard service response including an HTTP status code and request ID.
*/
public class SlotConfigNames extends OperationResponse {
    private ArrayList<String> appSettingNames;
    
    /**
    * Optional. One or more string elements that list the name of the app
    * setting that will not be moved durig site swap. For example, if slot
    * named staging has setting EnableVerboseLogging=1, it shouldn't be moved
    * when swapped with production slot but should take the current value from
    * production.
    * @return The AppSettingNames value.
    */
    public ArrayList<String> getAppSettingNames() {
        return this.appSettingNames;
    }
    
    /**
    * Optional. One or more string elements that list the name of the app
    * setting that will not be moved durig site swap. For example, if slot
    * named staging has setting EnableVerboseLogging=1, it shouldn't be moved
    * when swapped with production slot but should take the current value from
    * production.
    * @param appSettingNamesValue The AppSettingNames value.
    */
    public void setAppSettingNames(final ArrayList<String> appSettingNamesValue) {
        this.appSettingNames = appSettingNamesValue;
    }
    
    private ArrayList<String> connectionStringNames;
    
    /**
    * Optional. One or more string elements that list the name of the
    * connection string setting that will not be moved durig site swap. For
    * example, if slot named staging has connection UsersDatabase that points
    * to staging test database, it shouldn't be moved when swapped with
    * production slot but should take the current value from production.
    * @return The ConnectionStringNames value.
    */
    public ArrayList<String> getConnectionStringNames() {
        return this.connectionStringNames;
    }
    
    /**
    * Optional. One or more string elements that list the name of the
    * connection string setting that will not be moved durig site swap. For
    * example, if slot named staging has connection UsersDatabase that points
    * to staging test database, it shouldn't be moved when swapped with
    * production slot but should take the current value from production.
    * @param connectionStringNamesValue The ConnectionStringNames value.
    */
    public void setConnectionStringNames(final ArrayList<String> connectionStringNamesValue) {
        this.connectionStringNames = connectionStringNamesValue;
    }
    
    /**
    * Initializes a new instance of the SlotConfigNames class.
    *
    */
    public SlotConfigNames() {
        super();
        this.setAppSettingNames(new LazyArrayList<String>());
        this.setConnectionStringNames(new LazyArrayList<String>());
    }
}
