// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageimportexport.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storageimportexport.fluent.models.LocationInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Locations response. */
@Fluent
public final class LocationsResponse {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LocationsResponse.class);

    /*
     * locations
     */
    @JsonProperty(value = "value")
    private List<LocationInner> value;

    /**
     * Get the value property: locations.
     *
     * @return the value value.
     */
    public List<LocationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: locations.
     *
     * @param value the value value to set.
     * @return the LocationsResponse object itself.
     */
    public LocationsResponse withValue(List<LocationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
