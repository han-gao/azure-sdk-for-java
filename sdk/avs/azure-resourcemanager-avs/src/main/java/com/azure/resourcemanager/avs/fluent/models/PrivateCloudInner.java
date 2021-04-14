// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.avs.models.Circuit;
import com.azure.resourcemanager.avs.models.Endpoints;
import com.azure.resourcemanager.avs.models.IdentitySource;
import com.azure.resourcemanager.avs.models.InternetEnum;
import com.azure.resourcemanager.avs.models.ManagementCluster;
import com.azure.resourcemanager.avs.models.PrivateCloudProvisioningState;
import com.azure.resourcemanager.avs.models.Sku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** A private cloud resource. */
@JsonFlatten
@Fluent
public class PrivateCloudInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateCloudInner.class);

    /*
     * The private cloud SKU
     */
    @JsonProperty(value = "sku", required = true)
    private Sku sku;

    /*
     * The default cluster used for management
     */
    @JsonProperty(value = "properties.managementCluster")
    private ManagementCluster managementCluster;

    /*
     * Connectivity to internet is enabled or disabled
     */
    @JsonProperty(value = "properties.internet")
    private InternetEnum internet;

    /*
     * vCenter Single Sign On Identity Sources
     */
    @JsonProperty(value = "properties.identitySources")
    private List<IdentitySource> identitySources;

    /*
     * The provisioning state
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private PrivateCloudProvisioningState provisioningState;

    /*
     * An ExpressRoute Circuit
     */
    @JsonProperty(value = "properties.circuit")
    private Circuit circuit;

    /*
     * The endpoints
     */
    @JsonProperty(value = "properties.endpoints", access = JsonProperty.Access.WRITE_ONLY)
    private Endpoints endpoints;

    /*
     * The block of addresses should be unique across VNet in your subscription
     * as well as on-premise. Make sure the CIDR format is conformed to
     * (A.B.C.D/X) where A,B,C,D are between 0 and 255, and X is between 0 and
     * 22
     */
    @JsonProperty(value = "properties.networkBlock", required = true)
    private String networkBlock;

    /*
     * Network used to access vCenter Server and NSX-T Manager
     */
    @JsonProperty(value = "properties.managementNetwork", access = JsonProperty.Access.WRITE_ONLY)
    private String managementNetwork;

    /*
     * Used for virtual machine cold migration, cloning, and snapshot migration
     */
    @JsonProperty(value = "properties.provisioningNetwork", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningNetwork;

    /*
     * Used for live migration of virtual machines
     */
    @JsonProperty(value = "properties.vmotionNetwork", access = JsonProperty.Access.WRITE_ONLY)
    private String vmotionNetwork;

    /*
     * Optionally, set the vCenter admin password when the private cloud is
     * created
     */
    @JsonProperty(value = "properties.vcenterPassword")
    private String vcenterPassword;

    /*
     * Optionally, set the NSX-T Manager password when the private cloud is
     * created
     */
    @JsonProperty(value = "properties.nsxtPassword")
    private String nsxtPassword;

    /*
     * Thumbprint of the vCenter Server SSL certificate
     */
    @JsonProperty(value = "properties.vcenterCertificateThumbprint", access = JsonProperty.Access.WRITE_ONLY)
    private String vcenterCertificateThumbprint;

    /*
     * Thumbprint of the NSX-T Manager SSL certificate
     */
    @JsonProperty(value = "properties.nsxtCertificateThumbprint", access = JsonProperty.Access.WRITE_ONLY)
    private String nsxtCertificateThumbprint;

    /**
     * Get the sku property: The private cloud SKU.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The private cloud SKU.
     *
     * @param sku the sku value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the managementCluster property: The default cluster used for management.
     *
     * @return the managementCluster value.
     */
    public ManagementCluster managementCluster() {
        return this.managementCluster;
    }

    /**
     * Set the managementCluster property: The default cluster used for management.
     *
     * @param managementCluster the managementCluster value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withManagementCluster(ManagementCluster managementCluster) {
        this.managementCluster = managementCluster;
        return this;
    }

    /**
     * Get the internet property: Connectivity to internet is enabled or disabled.
     *
     * @return the internet value.
     */
    public InternetEnum internet() {
        return this.internet;
    }

    /**
     * Set the internet property: Connectivity to internet is enabled or disabled.
     *
     * @param internet the internet value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withInternet(InternetEnum internet) {
        this.internet = internet;
        return this;
    }

    /**
     * Get the identitySources property: vCenter Single Sign On Identity Sources.
     *
     * @return the identitySources value.
     */
    public List<IdentitySource> identitySources() {
        return this.identitySources;
    }

    /**
     * Set the identitySources property: vCenter Single Sign On Identity Sources.
     *
     * @param identitySources the identitySources value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withIdentitySources(List<IdentitySource> identitySources) {
        this.identitySources = identitySources;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state.
     *
     * @return the provisioningState value.
     */
    public PrivateCloudProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the circuit property: An ExpressRoute Circuit.
     *
     * @return the circuit value.
     */
    public Circuit circuit() {
        return this.circuit;
    }

    /**
     * Set the circuit property: An ExpressRoute Circuit.
     *
     * @param circuit the circuit value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withCircuit(Circuit circuit) {
        this.circuit = circuit;
        return this;
    }

    /**
     * Get the endpoints property: The endpoints.
     *
     * @return the endpoints value.
     */
    public Endpoints endpoints() {
        return this.endpoints;
    }

    /**
     * Get the networkBlock property: The block of addresses should be unique across VNet in your subscription as well
     * as on-premise. Make sure the CIDR format is conformed to (A.B.C.D/X) where A,B,C,D are between 0 and 255, and X
     * is between 0 and 22.
     *
     * @return the networkBlock value.
     */
    public String networkBlock() {
        return this.networkBlock;
    }

    /**
     * Set the networkBlock property: The block of addresses should be unique across VNet in your subscription as well
     * as on-premise. Make sure the CIDR format is conformed to (A.B.C.D/X) where A,B,C,D are between 0 and 255, and X
     * is between 0 and 22.
     *
     * @param networkBlock the networkBlock value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withNetworkBlock(String networkBlock) {
        this.networkBlock = networkBlock;
        return this;
    }

    /**
     * Get the managementNetwork property: Network used to access vCenter Server and NSX-T Manager.
     *
     * @return the managementNetwork value.
     */
    public String managementNetwork() {
        return this.managementNetwork;
    }

    /**
     * Get the provisioningNetwork property: Used for virtual machine cold migration, cloning, and snapshot migration.
     *
     * @return the provisioningNetwork value.
     */
    public String provisioningNetwork() {
        return this.provisioningNetwork;
    }

    /**
     * Get the vmotionNetwork property: Used for live migration of virtual machines.
     *
     * @return the vmotionNetwork value.
     */
    public String vmotionNetwork() {
        return this.vmotionNetwork;
    }

    /**
     * Get the vcenterPassword property: Optionally, set the vCenter admin password when the private cloud is created.
     *
     * @return the vcenterPassword value.
     */
    public String vcenterPassword() {
        return this.vcenterPassword;
    }

    /**
     * Set the vcenterPassword property: Optionally, set the vCenter admin password when the private cloud is created.
     *
     * @param vcenterPassword the vcenterPassword value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withVcenterPassword(String vcenterPassword) {
        this.vcenterPassword = vcenterPassword;
        return this;
    }

    /**
     * Get the nsxtPassword property: Optionally, set the NSX-T Manager password when the private cloud is created.
     *
     * @return the nsxtPassword value.
     */
    public String nsxtPassword() {
        return this.nsxtPassword;
    }

    /**
     * Set the nsxtPassword property: Optionally, set the NSX-T Manager password when the private cloud is created.
     *
     * @param nsxtPassword the nsxtPassword value to set.
     * @return the PrivateCloudInner object itself.
     */
    public PrivateCloudInner withNsxtPassword(String nsxtPassword) {
        this.nsxtPassword = nsxtPassword;
        return this;
    }

    /**
     * Get the vcenterCertificateThumbprint property: Thumbprint of the vCenter Server SSL certificate.
     *
     * @return the vcenterCertificateThumbprint value.
     */
    public String vcenterCertificateThumbprint() {
        return this.vcenterCertificateThumbprint;
    }

    /**
     * Get the nsxtCertificateThumbprint property: Thumbprint of the NSX-T Manager SSL certificate.
     *
     * @return the nsxtCertificateThumbprint value.
     */
    public String nsxtCertificateThumbprint() {
        return this.nsxtCertificateThumbprint;
    }

    /** {@inheritDoc} */
    @Override
    public PrivateCloudInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PrivateCloudInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sku in model PrivateCloudInner"));
        } else {
            sku().validate();
        }
        if (managementCluster() != null) {
            managementCluster().validate();
        }
        if (identitySources() != null) {
            identitySources().forEach(e -> e.validate());
        }
        if (circuit() != null) {
            circuit().validate();
        }
        if (endpoints() != null) {
            endpoints().validate();
        }
        if (networkBlock() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property networkBlock in model PrivateCloudInner"));
        }
    }
}
