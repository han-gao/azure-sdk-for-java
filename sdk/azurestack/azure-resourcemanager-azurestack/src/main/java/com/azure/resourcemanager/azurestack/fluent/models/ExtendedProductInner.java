// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurestack.models.ComputeRole;
import com.azure.resourcemanager.azurestack.models.DataDiskImage;
import com.azure.resourcemanager.azurestack.models.OperatingSystem;
import com.azure.resourcemanager.azurestack.models.OsDiskImage;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Extended description about the product required for installing it into Azure Stack. */
@JsonFlatten
@Immutable
public class ExtendedProductInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExtendedProductInner.class);

    /*
     * The URI to the .azpkg file that provides information required for
     * showing product in the gallery.
     */
    @JsonProperty(value = "galleryPackageBlobSasUri", access = JsonProperty.Access.WRITE_ONLY)
    private String galleryPackageBlobSasUri;

    /*
     * Specifies the kind of the product (virtualMachine or
     * virtualMachineExtension).
     */
    @JsonProperty(value = "productKind", access = JsonProperty.Access.WRITE_ONLY)
    private String productKind;

    /*
     * Specifies kind of compute role included in the package.
     */
    @JsonProperty(value = "properties.computeRole", access = JsonProperty.Access.WRITE_ONLY)
    private ComputeRole computeRole;

    /*
     * Specifies if product is a Virtual Machine Extension.
     */
    @JsonProperty(value = "properties.isSystemExtension", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isSystemExtension;

    /*
     * Indicates if specified product supports multiple extensions.
     */
    @JsonProperty(value = "properties.supportMultipleExtensions", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean supportMultipleExtensions;

    /*
     * Specifies product version.
     */
    @JsonProperty(value = "properties.version", access = JsonProperty.Access.WRITE_ONLY)
    private String versionPropertiesVersion;

    /*
     * Specifies operating system used by the product.
     */
    @JsonProperty(value = "properties.vmOsType", access = JsonProperty.Access.WRITE_ONLY)
    private OperatingSystem vmOsType;

    /*
     * Indicates if virtual machine Scale Set is enabled in the specified
     * product.
     */
    @JsonProperty(value = "properties.vmScaleSetEnabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean vmScaleSetEnabled;

    /*
     * The URI.
     */
    @JsonProperty(value = "properties.sourceBlob.uri", access = JsonProperty.Access.WRITE_ONLY)
    private String uri;

    /*
     * Specifies product version.
     */
    @JsonProperty(value = "properties.version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /*
     * OS disk image used by product.
     */
    @JsonProperty(value = "properties.osDiskImage", access = JsonProperty.Access.WRITE_ONLY)
    private OsDiskImage osDiskImage;

    /*
     * List of attached data disks.
     */
    @JsonProperty(value = "properties.dataDiskImages", access = JsonProperty.Access.WRITE_ONLY)
    private List<DataDiskImage> dataDiskImages;

    /**
     * Get the galleryPackageBlobSasUri property: The URI to the .azpkg file that provides information required for
     * showing product in the gallery.
     *
     * @return the galleryPackageBlobSasUri value.
     */
    public String galleryPackageBlobSasUri() {
        return this.galleryPackageBlobSasUri;
    }

    /**
     * Get the productKind property: Specifies the kind of the product (virtualMachine or virtualMachineExtension).
     *
     * @return the productKind value.
     */
    public String productKind() {
        return this.productKind;
    }

    /**
     * Get the computeRole property: Specifies kind of compute role included in the package.
     *
     * @return the computeRole value.
     */
    public ComputeRole computeRole() {
        return this.computeRole;
    }

    /**
     * Get the isSystemExtension property: Specifies if product is a Virtual Machine Extension.
     *
     * @return the isSystemExtension value.
     */
    public Boolean isSystemExtension() {
        return this.isSystemExtension;
    }

    /**
     * Get the supportMultipleExtensions property: Indicates if specified product supports multiple extensions.
     *
     * @return the supportMultipleExtensions value.
     */
    public Boolean supportMultipleExtensions() {
        return this.supportMultipleExtensions;
    }

    /**
     * Get the versionPropertiesVersion property: Specifies product version.
     *
     * @return the versionPropertiesVersion value.
     */
    public String versionPropertiesVersion() {
        return this.versionPropertiesVersion;
    }

    /**
     * Get the vmOsType property: Specifies operating system used by the product.
     *
     * @return the vmOsType value.
     */
    public OperatingSystem vmOsType() {
        return this.vmOsType;
    }

    /**
     * Get the vmScaleSetEnabled property: Indicates if virtual machine Scale Set is enabled in the specified product.
     *
     * @return the vmScaleSetEnabled value.
     */
    public Boolean vmScaleSetEnabled() {
        return this.vmScaleSetEnabled;
    }

    /**
     * Get the uri property: The URI.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Get the version property: Specifies product version.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Get the osDiskImage property: OS disk image used by product.
     *
     * @return the osDiskImage value.
     */
    public OsDiskImage osDiskImage() {
        return this.osDiskImage;
    }

    /**
     * Get the dataDiskImages property: List of attached data disks.
     *
     * @return the dataDiskImages value.
     */
    public List<DataDiskImage> dataDiskImages() {
        return this.dataDiskImages;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (osDiskImage() != null) {
            osDiskImage().validate();
        }
        if (dataDiskImages() != null) {
            dataDiskImages().forEach(e -> e.validate());
        }
    }
}
