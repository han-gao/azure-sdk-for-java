// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.vmwarecloudsimple.fluent.models.VirtualMachineInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of virtual machines. */
@Fluent
public final class VirtualMachineListResponse {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineListResponse.class);

    /*
     * Link for next list of VirtualMachines
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * Results of the VirtualMachine list
     */
    @JsonProperty(value = "value")
    private List<VirtualMachineInner> value;

    /**
     * Get the nextLink property: Link for next list of VirtualMachines.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link for next list of VirtualMachines.
     *
     * @param nextLink the nextLink value to set.
     * @return the VirtualMachineListResponse object itself.
     */
    public VirtualMachineListResponse withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: Results of the VirtualMachine list.
     *
     * @return the value value.
     */
    public List<VirtualMachineInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Results of the VirtualMachine list.
     *
     * @param value the value value to set.
     * @return the VirtualMachineListResponse object itself.
     */
    public VirtualMachineListResponse withValue(List<VirtualMachineInner> value) {
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
