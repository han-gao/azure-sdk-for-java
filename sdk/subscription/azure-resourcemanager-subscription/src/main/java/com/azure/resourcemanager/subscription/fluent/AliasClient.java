// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.subscription.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.subscription.fluent.models.PutAliasListResultInner;
import com.azure.resourcemanager.subscription.fluent.models.PutAliasResponseInner;
import com.azure.resourcemanager.subscription.models.PutAliasRequest;

/** An instance of this class provides access to all the operations defined in AliasClient. */
public interface AliasClient {
    /**
     * Create Alias Subscription.
     *
     * @param aliasName Alias Name.
     * @param body The parameters required to create a new subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subscription Information with the alias.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<PutAliasResponseInner>, PutAliasResponseInner> beginCreate(
        String aliasName, PutAliasRequest body);

    /**
     * Create Alias Subscription.
     *
     * @param aliasName Alias Name.
     * @param body The parameters required to create a new subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subscription Information with the alias.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<PutAliasResponseInner>, PutAliasResponseInner> beginCreate(
        String aliasName, PutAliasRequest body, Context context);

    /**
     * Create Alias Subscription.
     *
     * @param aliasName Alias Name.
     * @param body The parameters required to create a new subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subscription Information with the alias.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PutAliasResponseInner create(String aliasName, PutAliasRequest body);

    /**
     * Create Alias Subscription.
     *
     * @param aliasName Alias Name.
     * @param body The parameters required to create a new subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subscription Information with the alias.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PutAliasResponseInner create(String aliasName, PutAliasRequest body, Context context);

    /**
     * Get Alias Subscription.
     *
     * @param aliasName Alias Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return alias Subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PutAliasResponseInner get(String aliasName);

    /**
     * Get Alias Subscription.
     *
     * @param aliasName Alias Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return alias Subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PutAliasResponseInner> getWithResponse(String aliasName, Context context);

    /**
     * Delete Alias.
     *
     * @param aliasName Alias Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String aliasName);

    /**
     * Delete Alias.
     *
     * @param aliasName Alias Name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String aliasName, Context context);

    /**
     * Get Alias Subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return alias Subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PutAliasListResultInner list();

    /**
     * Get Alias Subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return alias Subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PutAliasListResultInner> listWithResponse(Context context);
}
