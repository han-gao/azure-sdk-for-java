// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.models;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurestack.fluent.models.LinkedSubscriptionInner;
import java.util.Map;

/** An immutable client-side representation of LinkedSubscription. */
public interface LinkedSubscription {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the linkedSubscriptionId property: The identifier associated with the device subscription.
     *
     * @return the linkedSubscriptionId value.
     */
    String linkedSubscriptionId();

    /**
     * Gets the registrationResourceId property: The identifier associated with the device registration.
     *
     * @return the registrationResourceId value.
     */
    String registrationResourceId();

    /**
     * Gets the deviceId property: The identifier of the Azure Stack device for remote management.
     *
     * @return the deviceId value.
     */
    String deviceId();

    /**
     * Gets the deviceObjectId property: The object identifier associated with the Azure Stack device connecting to
     * Azure.
     *
     * @return the deviceObjectId value.
     */
    String deviceObjectId();

    /**
     * Gets the deviceLinkState property: The connection state of the Azure Stack device.
     *
     * @return the deviceLinkState value.
     */
    String deviceLinkState();

    /**
     * Gets the lastConnectedTime property: The last remote management connection time for the Azure Stack device
     * connected to the linked subscription resource.
     *
     * @return the lastConnectedTime value.
     */
    String lastConnectedTime();

    /**
     * Gets the deviceConnectionStatus property: The status of the remote management connection of the Azure Stack
     * device.
     *
     * @return the deviceConnectionStatus value.
     */
    String deviceConnectionStatus();

    /**
     * Gets the kind property: The kind of the resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the etag property: The entity tag used for optimistic concurrency when modifying the resource.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.azurestack.fluent.models.LinkedSubscriptionInner object.
     *
     * @return the inner object.
     */
    LinkedSubscriptionInner innerModel();

    /** The entirety of the LinkedSubscription definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithLinkedSubscriptionId,
            DefinitionStages.WithRegistrationResourceId,
            DefinitionStages.WithCreate {
    }
    /** The LinkedSubscription definition stages. */
    interface DefinitionStages {
        /** The first stage of the LinkedSubscription definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the LinkedSubscription definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the location property: Location of the resource..
             *
             * @param location Location of the resource.
             * @return the next definition stage.
             */
            WithResourceGroup withLocation(Location location);
        }
        /** The stage of the LinkedSubscription definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroup.
             *
             * @param resourceGroup Name of the resource group.
             * @return the next definition stage.
             */
            WithLinkedSubscriptionId withExistingResourceGroup(String resourceGroup);
        }
        /** The stage of the LinkedSubscription definition allowing to specify linkedSubscriptionId. */
        interface WithLinkedSubscriptionId {
            /**
             * Specifies the linkedSubscriptionId property: The identifier associated with the device subscription..
             *
             * @param linkedSubscriptionId The identifier associated with the device subscription.
             * @return the next definition stage.
             */
            WithRegistrationResourceId withLinkedSubscriptionId(String linkedSubscriptionId);
        }
        /** The stage of the LinkedSubscription definition allowing to specify registrationResourceId. */
        interface WithRegistrationResourceId {
            /**
             * Specifies the registrationResourceId property: The identifier associated with the device registration..
             *
             * @param registrationResourceId The identifier associated with the device registration.
             * @return the next definition stage.
             */
            WithCreate withRegistrationResourceId(String registrationResourceId);
        }
        /**
         * The stage of the LinkedSubscription definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            LinkedSubscription create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            LinkedSubscription create(Context context);
        }
    }
    /**
     * Begins update for the LinkedSubscription resource.
     *
     * @return the stage of resource update.
     */
    LinkedSubscription.Update update();

    /** The template for LinkedSubscription update. */
    interface Update extends UpdateStages.WithLinkedSubscriptionId, UpdateStages.WithRegistrationResourceId {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        LinkedSubscription apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        LinkedSubscription apply(Context context);
    }
    /** The LinkedSubscription update stages. */
    interface UpdateStages {
        /** The stage of the LinkedSubscription update allowing to specify linkedSubscriptionId. */
        interface WithLinkedSubscriptionId {
            /**
             * Specifies the linkedSubscriptionId property: The identifier associated with the device subscription..
             *
             * @param linkedSubscriptionId The identifier associated with the device subscription.
             * @return the next definition stage.
             */
            Update withLinkedSubscriptionId(String linkedSubscriptionId);
        }
        /** The stage of the LinkedSubscription update allowing to specify registrationResourceId. */
        interface WithRegistrationResourceId {
            /**
             * Specifies the registrationResourceId property: The identifier associated with the device registration..
             *
             * @param registrationResourceId The identifier associated with the device registration.
             * @return the next definition stage.
             */
            Update withRegistrationResourceId(String registrationResourceId);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    LinkedSubscription refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    LinkedSubscription refresh(Context context);
}
