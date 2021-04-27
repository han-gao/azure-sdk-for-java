// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties that are associated with an Event Hub output. */
@Fluent
public final class EventHubOutputDataSourceProperties extends EventHubDataSourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EventHubOutputDataSourceProperties.class);

    /*
     * The key/column that is used to determine to which partition to send
     * event data.
     */
    @JsonProperty(value = "partitionKey")
    private String partitionKey;

    /*
     * The propertyColumns property.
     */
    @JsonProperty(value = "propertyColumns")
    private List<String> propertyColumns;

    /**
     * Get the partitionKey property: The key/column that is used to determine to which partition to send event data.
     *
     * @return the partitionKey value.
     */
    public String partitionKey() {
        return this.partitionKey;
    }

    /**
     * Set the partitionKey property: The key/column that is used to determine to which partition to send event data.
     *
     * @param partitionKey the partitionKey value to set.
     * @return the EventHubOutputDataSourceProperties object itself.
     */
    public EventHubOutputDataSourceProperties withPartitionKey(String partitionKey) {
        this.partitionKey = partitionKey;
        return this;
    }

    /**
     * Get the propertyColumns property: The propertyColumns property.
     *
     * @return the propertyColumns value.
     */
    public List<String> propertyColumns() {
        return this.propertyColumns;
    }

    /**
     * Set the propertyColumns property: The propertyColumns property.
     *
     * @param propertyColumns the propertyColumns value to set.
     * @return the EventHubOutputDataSourceProperties object itself.
     */
    public EventHubOutputDataSourceProperties withPropertyColumns(List<String> propertyColumns) {
        this.propertyColumns = propertyColumns;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EventHubOutputDataSourceProperties withEventHubName(String eventHubName) {
        super.withEventHubName(eventHubName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EventHubOutputDataSourceProperties withServiceBusNamespace(String serviceBusNamespace) {
        super.withServiceBusNamespace(serviceBusNamespace);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EventHubOutputDataSourceProperties withSharedAccessPolicyName(String sharedAccessPolicyName) {
        super.withSharedAccessPolicyName(sharedAccessPolicyName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EventHubOutputDataSourceProperties withSharedAccessPolicyKey(String sharedAccessPolicyKey) {
        super.withSharedAccessPolicyKey(sharedAccessPolicyKey);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EventHubOutputDataSourceProperties withAuthenticationMode(AuthenticationMode authenticationMode) {
        super.withAuthenticationMode(authenticationMode);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
