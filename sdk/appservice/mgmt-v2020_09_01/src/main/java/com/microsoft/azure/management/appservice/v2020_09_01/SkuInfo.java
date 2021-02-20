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
import com.microsoft.azure.management.appservice.v2020_09_01.implementation.SkuInfoInner;

/**
 * Type representing SkuInfo.
 */
public interface SkuInfo extends HasInner<SkuInfoInner>, HasManager<AppServiceManager> {
    /**
     * @return the capacity value.
     */
    SkuCapacity capacity();

    /**
     * @return the resourceType value.
     */
    String resourceType();

    /**
     * @return the sku value.
     */
    SkuDescription sku();

}
