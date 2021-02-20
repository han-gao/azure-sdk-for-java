/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2020_09_01.implementation.AppServiceManager;
import com.microsoft.azure.management.appservice.v2020_09_01.implementation.MSDeployStatusInner;
import org.joda.time.DateTime;

/**
 * Type representing MSDeployStatus.
 */
public interface MSDeployStatus extends HasInner<MSDeployStatusInner>, HasManager<AppServiceManager> {
    /**
     * @return the complete value.
     */
    Boolean complete();

    /**
     * @return the deployer value.
     */
    String deployer();

    /**
     * @return the endTime value.
     */
    DateTime endTime();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    MSDeployProvisioningState provisioningState();

    /**
     * @return the startTime value.
     */
    DateTime startTime();

    /**
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * @return the type value.
     */
    String type();

}
