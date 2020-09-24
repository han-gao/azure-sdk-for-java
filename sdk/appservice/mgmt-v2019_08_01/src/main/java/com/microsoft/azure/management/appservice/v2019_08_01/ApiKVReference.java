/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Description of site key vault references.
 */
public class ApiKVReference {
    /**
     * The reference property.
     */
    @JsonProperty(value = "reference")
    private String reference;

    /**
     * Possible values include: 'Initialized', 'Resolved', 'InvalidSyntax',
     * 'MSINotEnabled', 'VaultNotFound', 'SecretNotFound',
     * 'SecretVersionNotFound', 'AccessToKeyVaultDenied', 'OtherReasons'.
     */
    @JsonProperty(value = "status")
    private ResolveStatus status;

    /**
     * The vaultName property.
     */
    @JsonProperty(value = "vaultName")
    private String vaultName;

    /**
     * The secretName property.
     */
    @JsonProperty(value = "secretName")
    private String secretName;

    /**
     * The secretVersion property.
     */
    @JsonProperty(value = "secretVersion")
    private String secretVersion;

    /**
     * Possible values include: 'SystemAssigned', 'UserAssigned',
     * 'SystemAssigned, UserAssigned', 'None'.
     */
    @JsonProperty(value = "identityType")
    private ManagedServiceIdentityType identityType;

    /**
     * The details property.
     */
    @JsonProperty(value = "details")
    private String details;

    /**
     * Possible values include: 'KeyVault'.
     */
    @JsonProperty(value = "source")
    private ConfigReferenceSource source;

    /**
     * Possible values include: 'ApplicationSetting'.
     */
    @JsonProperty(value = "location")
    private ConfigReferenceLocation location;

    /**
     * Get the reference value.
     *
     * @return the reference value
     */
    public String reference() {
        return this.reference;
    }

    /**
     * Set the reference value.
     *
     * @param reference the reference value to set
     * @return the ApiKVReference object itself.
     */
    public ApiKVReference withReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Get possible values include: 'Initialized', 'Resolved', 'InvalidSyntax', 'MSINotEnabled', 'VaultNotFound', 'SecretNotFound', 'SecretVersionNotFound', 'AccessToKeyVaultDenied', 'OtherReasons'.
     *
     * @return the status value
     */
    public ResolveStatus status() {
        return this.status;
    }

    /**
     * Set possible values include: 'Initialized', 'Resolved', 'InvalidSyntax', 'MSINotEnabled', 'VaultNotFound', 'SecretNotFound', 'SecretVersionNotFound', 'AccessToKeyVaultDenied', 'OtherReasons'.
     *
     * @param status the status value to set
     * @return the ApiKVReference object itself.
     */
    public ApiKVReference withStatus(ResolveStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the vaultName value.
     *
     * @return the vaultName value
     */
    public String vaultName() {
        return this.vaultName;
    }

    /**
     * Set the vaultName value.
     *
     * @param vaultName the vaultName value to set
     * @return the ApiKVReference object itself.
     */
    public ApiKVReference withVaultName(String vaultName) {
        this.vaultName = vaultName;
        return this;
    }

    /**
     * Get the secretName value.
     *
     * @return the secretName value
     */
    public String secretName() {
        return this.secretName;
    }

    /**
     * Set the secretName value.
     *
     * @param secretName the secretName value to set
     * @return the ApiKVReference object itself.
     */
    public ApiKVReference withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * Get the secretVersion value.
     *
     * @return the secretVersion value
     */
    public String secretVersion() {
        return this.secretVersion;
    }

    /**
     * Set the secretVersion value.
     *
     * @param secretVersion the secretVersion value to set
     * @return the ApiKVReference object itself.
     */
    public ApiKVReference withSecretVersion(String secretVersion) {
        this.secretVersion = secretVersion;
        return this;
    }

    /**
     * Get possible values include: 'SystemAssigned', 'UserAssigned', 'SystemAssigned, UserAssigned', 'None'.
     *
     * @return the identityType value
     */
    public ManagedServiceIdentityType identityType() {
        return this.identityType;
    }

    /**
     * Set possible values include: 'SystemAssigned', 'UserAssigned', 'SystemAssigned, UserAssigned', 'None'.
     *
     * @param identityType the identityType value to set
     * @return the ApiKVReference object itself.
     */
    public ApiKVReference withIdentityType(ManagedServiceIdentityType identityType) {
        this.identityType = identityType;
        return this;
    }

    /**
     * Get the details value.
     *
     * @return the details value
     */
    public String details() {
        return this.details;
    }

    /**
     * Set the details value.
     *
     * @param details the details value to set
     * @return the ApiKVReference object itself.
     */
    public ApiKVReference withDetails(String details) {
        this.details = details;
        return this;
    }

    /**
     * Get possible values include: 'KeyVault'.
     *
     * @return the source value
     */
    public ConfigReferenceSource source() {
        return this.source;
    }

    /**
     * Set possible values include: 'KeyVault'.
     *
     * @param source the source value to set
     * @return the ApiKVReference object itself.
     */
    public ApiKVReference withSource(ConfigReferenceSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get possible values include: 'ApplicationSetting'.
     *
     * @return the location value
     */
    public ConfigReferenceLocation location() {
        return this.location;
    }

    /**
     * Set possible values include: 'ApplicationSetting'.
     *
     * @param location the location value to set
     * @return the ApiKVReference object itself.
     */
    public ApiKVReference withLocation(ConfigReferenceLocation location) {
        this.location = location;
        return this;
    }

}