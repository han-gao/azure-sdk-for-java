// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The role assignment. */
@JsonFlatten
@Fluent
public class BillingRoleAssignmentInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BillingRoleAssignmentInner.class);

    /*
     * The date the role assignment was created.
     */
    @JsonProperty(value = "properties.createdOn", access = JsonProperty.Access.WRITE_ONLY)
    private String createdOn;

    /*
     * The tenant Id of the user who created the role assignment.
     */
    @JsonProperty(value = "properties.createdByPrincipalTenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String createdByPrincipalTenantId;

    /*
     * The principal Id of the user who created the role assignment.
     */
    @JsonProperty(value = "properties.createdByPrincipalId", access = JsonProperty.Access.WRITE_ONLY)
    private String createdByPrincipalId;

    /*
     * The email address of the user who created the role assignment.
     */
    @JsonProperty(value = "properties.createdByUserEmailAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String createdByUserEmailAddress;

    /*
     * The principal id of the user to whom the role was assigned.
     */
    @JsonProperty(value = "properties.principalId")
    private String principalId;

    /*
     * The principal tenant id of the user to whom the role was assigned.
     */
    @JsonProperty(value = "properties.principalTenantId")
    private String principalTenantId;

    /*
     * The ID of the role definition.
     */
    @JsonProperty(value = "properties.roleDefinitionId")
    private String roleDefinitionId;

    /*
     * The scope at which the role was assigned.
     */
    @JsonProperty(value = "properties.scope", access = JsonProperty.Access.WRITE_ONLY)
    private String scope;

    /*
     * The authentication type.
     */
    @JsonProperty(value = "properties.userAuthenticationType")
    private String userAuthenticationType;

    /*
     * The email address of the user.
     */
    @JsonProperty(value = "properties.userEmailAddress")
    private String userEmailAddress;

    /**
     * Get the createdOn property: The date the role assignment was created.
     *
     * @return the createdOn value.
     */
    public String createdOn() {
        return this.createdOn;
    }

    /**
     * Get the createdByPrincipalTenantId property: The tenant Id of the user who created the role assignment.
     *
     * @return the createdByPrincipalTenantId value.
     */
    public String createdByPrincipalTenantId() {
        return this.createdByPrincipalTenantId;
    }

    /**
     * Get the createdByPrincipalId property: The principal Id of the user who created the role assignment.
     *
     * @return the createdByPrincipalId value.
     */
    public String createdByPrincipalId() {
        return this.createdByPrincipalId;
    }

    /**
     * Get the createdByUserEmailAddress property: The email address of the user who created the role assignment.
     *
     * @return the createdByUserEmailAddress value.
     */
    public String createdByUserEmailAddress() {
        return this.createdByUserEmailAddress;
    }

    /**
     * Get the principalId property: The principal id of the user to whom the role was assigned.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: The principal id of the user to whom the role was assigned.
     *
     * @param principalId the principalId value to set.
     * @return the BillingRoleAssignmentInner object itself.
     */
    public BillingRoleAssignmentInner withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the principalTenantId property: The principal tenant id of the user to whom the role was assigned.
     *
     * @return the principalTenantId value.
     */
    public String principalTenantId() {
        return this.principalTenantId;
    }

    /**
     * Set the principalTenantId property: The principal tenant id of the user to whom the role was assigned.
     *
     * @param principalTenantId the principalTenantId value to set.
     * @return the BillingRoleAssignmentInner object itself.
     */
    public BillingRoleAssignmentInner withPrincipalTenantId(String principalTenantId) {
        this.principalTenantId = principalTenantId;
        return this;
    }

    /**
     * Get the roleDefinitionId property: The ID of the role definition.
     *
     * @return the roleDefinitionId value.
     */
    public String roleDefinitionId() {
        return this.roleDefinitionId;
    }

    /**
     * Set the roleDefinitionId property: The ID of the role definition.
     *
     * @param roleDefinitionId the roleDefinitionId value to set.
     * @return the BillingRoleAssignmentInner object itself.
     */
    public BillingRoleAssignmentInner withRoleDefinitionId(String roleDefinitionId) {
        this.roleDefinitionId = roleDefinitionId;
        return this;
    }

    /**
     * Get the scope property: The scope at which the role was assigned.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Get the userAuthenticationType property: The authentication type.
     *
     * @return the userAuthenticationType value.
     */
    public String userAuthenticationType() {
        return this.userAuthenticationType;
    }

    /**
     * Set the userAuthenticationType property: The authentication type.
     *
     * @param userAuthenticationType the userAuthenticationType value to set.
     * @return the BillingRoleAssignmentInner object itself.
     */
    public BillingRoleAssignmentInner withUserAuthenticationType(String userAuthenticationType) {
        this.userAuthenticationType = userAuthenticationType;
        return this;
    }

    /**
     * Get the userEmailAddress property: The email address of the user.
     *
     * @return the userEmailAddress value.
     */
    public String userEmailAddress() {
        return this.userEmailAddress;
    }

    /**
     * Set the userEmailAddress property: The email address of the user.
     *
     * @param userEmailAddress the userEmailAddress value to set.
     * @return the BillingRoleAssignmentInner object itself.
     */
    public BillingRoleAssignmentInner withUserEmailAddress(String userEmailAddress) {
        this.userEmailAddress = userEmailAddress;
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
