// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Gets or sets the virtual machine resource settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "resourceType")
@JsonTypeName("Microsoft.Compute/virtualMachines")
@Fluent
public final class VirtualMachineResourceSettings extends ResourceSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineResourceSettings.class);

    /*
     * Gets or sets the target availability zone.
     */
    @JsonProperty(value = "targetAvailabilityZone")
    private TargetAvailabilityZone targetAvailabilityZone;

    /*
     * Gets or sets the target virtual machine size.
     */
    @JsonProperty(value = "targetVmSize")
    private String targetVmSize;

    /*
     * Gets or sets the target availability set id for virtual machines not in
     * an availability set at source.
     */
    @JsonProperty(value = "targetAvailabilitySetId")
    private String targetAvailabilitySetId;

    /**
     * Get the targetAvailabilityZone property: Gets or sets the target availability zone.
     *
     * @return the targetAvailabilityZone value.
     */
    public TargetAvailabilityZone targetAvailabilityZone() {
        return this.targetAvailabilityZone;
    }

    /**
     * Set the targetAvailabilityZone property: Gets or sets the target availability zone.
     *
     * @param targetAvailabilityZone the targetAvailabilityZone value to set.
     * @return the VirtualMachineResourceSettings object itself.
     */
    public VirtualMachineResourceSettings withTargetAvailabilityZone(TargetAvailabilityZone targetAvailabilityZone) {
        this.targetAvailabilityZone = targetAvailabilityZone;
        return this;
    }

    /**
     * Get the targetVmSize property: Gets or sets the target virtual machine size.
     *
     * @return the targetVmSize value.
     */
    public String targetVmSize() {
        return this.targetVmSize;
    }

    /**
     * Set the targetVmSize property: Gets or sets the target virtual machine size.
     *
     * @param targetVmSize the targetVmSize value to set.
     * @return the VirtualMachineResourceSettings object itself.
     */
    public VirtualMachineResourceSettings withTargetVmSize(String targetVmSize) {
        this.targetVmSize = targetVmSize;
        return this;
    }

    /**
     * Get the targetAvailabilitySetId property: Gets or sets the target availability set id for virtual machines not in
     * an availability set at source.
     *
     * @return the targetAvailabilitySetId value.
     */
    public String targetAvailabilitySetId() {
        return this.targetAvailabilitySetId;
    }

    /**
     * Set the targetAvailabilitySetId property: Gets or sets the target availability set id for virtual machines not in
     * an availability set at source.
     *
     * @param targetAvailabilitySetId the targetAvailabilitySetId value to set.
     * @return the VirtualMachineResourceSettings object itself.
     */
    public VirtualMachineResourceSettings withTargetAvailabilitySetId(String targetAvailabilitySetId) {
        this.targetAvailabilitySetId = targetAvailabilitySetId;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualMachineResourceSettings withTargetResourceName(String targetResourceName) {
        super.withTargetResourceName(targetResourceName);
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
