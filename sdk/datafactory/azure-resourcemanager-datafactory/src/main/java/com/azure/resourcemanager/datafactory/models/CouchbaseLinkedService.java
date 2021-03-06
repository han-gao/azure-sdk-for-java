// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Couchbase server linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Couchbase")
@JsonFlatten
@Fluent
public class CouchbaseLinkedService extends LinkedService {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CouchbaseLinkedService.class);

    /*
     * An ODBC connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     */
    @JsonProperty(value = "typeProperties.connectionString")
    private Object connectionString;

    /*
     * The Azure key vault secret reference of credString in connection string.
     */
    @JsonProperty(value = "typeProperties.credString")
    private AzureKeyVaultSecretReference credString;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the connectionString property: An ODBC connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     *
     * @return the connectionString value.
     */
    public Object connectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: An ODBC connection string. Type: string, SecureString or
     * AzureKeyVaultSecretReference.
     *
     * @param connectionString the connectionString value to set.
     * @return the CouchbaseLinkedService object itself.
     */
    public CouchbaseLinkedService withConnectionString(Object connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the credString property: The Azure key vault secret reference of credString in connection string.
     *
     * @return the credString value.
     */
    public AzureKeyVaultSecretReference credString() {
        return this.credString;
    }

    /**
     * Set the credString property: The Azure key vault secret reference of credString in connection string.
     *
     * @param credString the credString value to set.
     * @return the CouchbaseLinkedService object itself.
     */
    public CouchbaseLinkedService withCredString(AzureKeyVaultSecretReference credString) {
        this.credString = credString;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the CouchbaseLinkedService object itself.
     */
    public CouchbaseLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CouchbaseLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CouchbaseLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CouchbaseLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CouchbaseLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
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
        if (credString() != null) {
            credString().validate();
        }
    }
}
