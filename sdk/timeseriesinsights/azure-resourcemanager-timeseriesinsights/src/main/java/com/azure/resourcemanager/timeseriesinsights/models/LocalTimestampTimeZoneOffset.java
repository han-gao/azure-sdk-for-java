// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object that represents the offset information for the local timestamp format specified. Should not be specified
 * for LocalTimestampFormat - Embedded.
 */
@Fluent
public final class LocalTimestampTimeZoneOffset {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LocalTimestampTimeZoneOffset.class);

    /*
     * The event property that will be contain the offset information to
     * calculate the local timestamp. When the LocalTimestampFormat is Iana,
     * the property name will contain the name of the column which contains
     * IANA Timezone Name (eg: Americas/Los Angeles). When LocalTimestampFormat
     * is Timespan, it contains the name of property which contains values
     * representing the offset (eg: P1D or 1.00:00:00)
     */
    @JsonProperty(value = "propertyName")
    private String propertyName;

    /**
     * Get the propertyName property: The event property that will be contain the offset information to calculate the
     * local timestamp. When the LocalTimestampFormat is Iana, the property name will contain the name of the column
     * which contains IANA Timezone Name (eg: Americas/Los Angeles). When LocalTimestampFormat is Timespan, it contains
     * the name of property which contains values representing the offset (eg: P1D or 1.00:00:00).
     *
     * @return the propertyName value.
     */
    public String propertyName() {
        return this.propertyName;
    }

    /**
     * Set the propertyName property: The event property that will be contain the offset information to calculate the
     * local timestamp. When the LocalTimestampFormat is Iana, the property name will contain the name of the column
     * which contains IANA Timezone Name (eg: Americas/Los Angeles). When LocalTimestampFormat is Timespan, it contains
     * the name of property which contains values representing the offset (eg: P1D or 1.00:00:00).
     *
     * @param propertyName the propertyName value to set.
     * @return the LocalTimestampTimeZoneOffset object itself.
     */
    public LocalTimestampTimeZoneOffset withPropertyName(String propertyName) {
        this.propertyName = propertyName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
