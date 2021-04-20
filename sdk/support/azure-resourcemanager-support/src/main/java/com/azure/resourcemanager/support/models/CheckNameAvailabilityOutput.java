// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.models;

import com.azure.resourcemanager.support.fluent.models.CheckNameAvailabilityOutputInner;

/** An immutable client-side representation of CheckNameAvailabilityOutput. */
public interface CheckNameAvailabilityOutput {
    /**
     * Gets the nameAvailable property: Indicates whether the name is available.
     *
     * @return the nameAvailable value.
     */
    Boolean nameAvailable();

    /**
     * Gets the reason property: The reason why the name is not available.
     *
     * @return the reason value.
     */
    String reason();

    /**
     * Gets the message property: The detailed error message describing why the name is not available.
     *
     * @return the message value.
     */
    String message();

    /**
     * Gets the inner com.azure.resourcemanager.support.fluent.models.CheckNameAvailabilityOutputInner object.
     *
     * @return the inner object.
     */
    CheckNameAvailabilityOutputInner innerModel();
}
