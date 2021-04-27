// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.Resource;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.containerinstance.fluent.models.ContainerGroupInner;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ContainerGroupsClient. */
public interface ContainerGroupsClient
    extends InnerSupportsGet<ContainerGroupInner>,
        InnerSupportsListing<ContainerGroupInner>,
        InnerSupportsDelete<ContainerGroupInner> {
    /**
     * Get a list of container groups in the specified subscription. This operation returns properties of each container
     * group including containers, image registry credentials, restart policy, IP address type, OS type, state, and
     * volumes.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of container groups in the specified subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ContainerGroupInner> listAsync();

    /**
     * Get a list of container groups in the specified subscription. This operation returns properties of each container
     * group including containers, image registry credentials, restart policy, IP address type, OS type, state, and
     * volumes.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of container groups in the specified subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ContainerGroupInner> list();

    /**
     * Get a list of container groups in the specified subscription. This operation returns properties of each container
     * group including containers, image registry credentials, restart policy, IP address type, OS type, state, and
     * volumes.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of container groups in the specified subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ContainerGroupInner> list(Context context);

    /**
     * Get a list of container groups in a specified subscription and resource group. This operation returns properties
     * of each container group including containers, image registry credentials, restart policy, IP address type, OS
     * type, state, and volumes.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of container groups in a specified subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ContainerGroupInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Get a list of container groups in a specified subscription and resource group. This operation returns properties
     * of each container group including containers, image registry credentials, restart policy, IP address type, OS
     * type, state, and volumes.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of container groups in a specified subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ContainerGroupInner> listByResourceGroup(String resourceGroupName);

    /**
     * Get a list of container groups in a specified subscription and resource group. This operation returns properties
     * of each container group including containers, image registry credentials, restart policy, IP address type, OS
     * type, state, and volumes.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of container groups in a specified subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ContainerGroupInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets the properties of the specified container group in the specified subscription and resource group. The
     * operation returns the properties of each container group including containers, image registry credentials,
     * restart policy, IP address type, OS type, state, and volumes.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified container group in the specified subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ContainerGroupInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String containerGroupName);

    /**
     * Gets the properties of the specified container group in the specified subscription and resource group. The
     * operation returns the properties of each container group including containers, image registry credentials,
     * restart policy, IP address type, OS type, state, and volumes.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified container group in the specified subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ContainerGroupInner> getByResourceGroupAsync(String resourceGroupName, String containerGroupName);

    /**
     * Gets the properties of the specified container group in the specified subscription and resource group. The
     * operation returns the properties of each container group including containers, image registry credentials,
     * restart policy, IP address type, OS type, state, and volumes.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified container group in the specified subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ContainerGroupInner getByResourceGroup(String resourceGroupName, String containerGroupName);

    /**
     * Gets the properties of the specified container group in the specified subscription and resource group. The
     * operation returns the properties of each container group including containers, image registry credentials,
     * restart policy, IP address type, OS type, state, and volumes.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified container group in the specified subscription and resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ContainerGroupInner> getByResourceGroupWithResponse(
        String resourceGroupName, String containerGroupName, Context context);

    /**
     * Create or update container groups with specified configurations.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerGroup The properties of the container group to be created or updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String containerGroupName, ContainerGroupInner containerGroup);

    /**
     * Create or update container groups with specified configurations.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerGroup The properties of the container group to be created or updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<ContainerGroupInner>, ContainerGroupInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String containerGroupName, ContainerGroupInner containerGroup);

    /**
     * Create or update container groups with specified configurations.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerGroup The properties of the container group to be created or updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ContainerGroupInner>, ContainerGroupInner> beginCreateOrUpdate(
        String resourceGroupName, String containerGroupName, ContainerGroupInner containerGroup);

    /**
     * Create or update container groups with specified configurations.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerGroup The properties of the container group to be created or updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ContainerGroupInner>, ContainerGroupInner> beginCreateOrUpdate(
        String resourceGroupName, String containerGroupName, ContainerGroupInner containerGroup, Context context);

    /**
     * Create or update container groups with specified configurations.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerGroup The properties of the container group to be created or updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ContainerGroupInner> createOrUpdateAsync(
        String resourceGroupName, String containerGroupName, ContainerGroupInner containerGroup);

    /**
     * Create or update container groups with specified configurations.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerGroup The properties of the container group to be created or updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ContainerGroupInner createOrUpdate(
        String resourceGroupName, String containerGroupName, ContainerGroupInner containerGroup);

    /**
     * Create or update container groups with specified configurations.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param containerGroup The properties of the container group to be created or updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ContainerGroupInner createOrUpdate(
        String resourceGroupName, String containerGroupName, ContainerGroupInner containerGroup, Context context);

    /**
     * Updates container group tags with specified values.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param resource The container group resource with just the tags to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ContainerGroupInner>> updateWithResponseAsync(
        String resourceGroupName, String containerGroupName, Resource resource);

    /**
     * Updates container group tags with specified values.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param resource The container group resource with just the tags to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ContainerGroupInner> updateAsync(String resourceGroupName, String containerGroupName, Resource resource);

    /**
     * Updates container group tags with specified values.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param resource The container group resource with just the tags to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ContainerGroupInner update(String resourceGroupName, String containerGroupName, Resource resource);

    /**
     * Updates container group tags with specified values.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param resource The container group resource with just the tags to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ContainerGroupInner> updateWithResponse(
        String resourceGroupName, String containerGroupName, Resource resource, Context context);

    /**
     * Delete the specified container group in the specified subscription and resource group. The operation does not
     * delete other resources provided by the user, such as volumes.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String containerGroupName);

    /**
     * Delete the specified container group in the specified subscription and resource group. The operation does not
     * delete other resources provided by the user, such as volumes.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<ContainerGroupInner>, ContainerGroupInner> beginDeleteAsync(
        String resourceGroupName, String containerGroupName);

    /**
     * Delete the specified container group in the specified subscription and resource group. The operation does not
     * delete other resources provided by the user, such as volumes.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ContainerGroupInner>, ContainerGroupInner> beginDelete(
        String resourceGroupName, String containerGroupName);

    /**
     * Delete the specified container group in the specified subscription and resource group. The operation does not
     * delete other resources provided by the user, such as volumes.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ContainerGroupInner>, ContainerGroupInner> beginDelete(
        String resourceGroupName, String containerGroupName, Context context);

    /**
     * Delete the specified container group in the specified subscription and resource group. The operation does not
     * delete other resources provided by the user, such as volumes.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<ContainerGroupInner> deleteAsync(String resourceGroupName, String containerGroupName);

    /**
     * Delete the specified container group in the specified subscription and resource group. The operation does not
     * delete other resources provided by the user, such as volumes.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ContainerGroupInner delete(String resourceGroupName, String containerGroupName);

    /**
     * Delete the specified container group in the specified subscription and resource group. The operation does not
     * delete other resources provided by the user, such as volumes.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a container group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ContainerGroupInner delete(String resourceGroupName, String containerGroupName, Context context);

    /**
     * Restarts all containers in a container group in place. If container image has updates, new image will be
     * downloaded.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> restartWithResponseAsync(String resourceGroupName, String containerGroupName);

    /**
     * Restarts all containers in a container group in place. If container image has updates, new image will be
     * downloaded.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginRestartAsync(String resourceGroupName, String containerGroupName);

    /**
     * Restarts all containers in a container group in place. If container image has updates, new image will be
     * downloaded.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginRestart(String resourceGroupName, String containerGroupName);

    /**
     * Restarts all containers in a container group in place. If container image has updates, new image will be
     * downloaded.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginRestart(
        String resourceGroupName, String containerGroupName, Context context);

    /**
     * Restarts all containers in a container group in place. If container image has updates, new image will be
     * downloaded.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> restartAsync(String resourceGroupName, String containerGroupName);

    /**
     * Restarts all containers in a container group in place. If container image has updates, new image will be
     * downloaded.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void restart(String resourceGroupName, String containerGroupName);

    /**
     * Restarts all containers in a container group in place. If container image has updates, new image will be
     * downloaded.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void restart(String resourceGroupName, String containerGroupName, Context context);

    /**
     * Stops all containers in a container group. Compute resources will be deallocated and billing will stop.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> stopWithResponseAsync(String resourceGroupName, String containerGroupName);

    /**
     * Stops all containers in a container group. Compute resources will be deallocated and billing will stop.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> stopAsync(String resourceGroupName, String containerGroupName);

    /**
     * Stops all containers in a container group. Compute resources will be deallocated and billing will stop.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void stop(String resourceGroupName, String containerGroupName);

    /**
     * Stops all containers in a container group. Compute resources will be deallocated and billing will stop.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> stopWithResponse(String resourceGroupName, String containerGroupName, Context context);

    /**
     * Starts all containers in a container group. Compute resources will be allocated and billing will start.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> startWithResponseAsync(String resourceGroupName, String containerGroupName);

    /**
     * Starts all containers in a container group. Compute resources will be allocated and billing will start.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginStartAsync(String resourceGroupName, String containerGroupName);

    /**
     * Starts all containers in a container group. Compute resources will be allocated and billing will start.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginStart(String resourceGroupName, String containerGroupName);

    /**
     * Starts all containers in a container group. Compute resources will be allocated and billing will start.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginStart(String resourceGroupName, String containerGroupName, Context context);

    /**
     * Starts all containers in a container group. Compute resources will be allocated and billing will start.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> startAsync(String resourceGroupName, String containerGroupName);

    /**
     * Starts all containers in a container group. Compute resources will be allocated and billing will start.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void start(String resourceGroupName, String containerGroupName);

    /**
     * Starts all containers in a container group. Compute resources will be allocated and billing will start.
     *
     * @param resourceGroupName The name of the resource group.
     * @param containerGroupName The name of the container group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void start(String resourceGroupName, String containerGroupName, Context context);
}
