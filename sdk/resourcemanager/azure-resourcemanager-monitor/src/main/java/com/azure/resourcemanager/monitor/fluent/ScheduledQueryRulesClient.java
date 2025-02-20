// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.fluent.models.LogSearchRuleResourceInner;
import com.azure.resourcemanager.monitor.models.LogSearchRuleResourcePatch;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ScheduledQueryRulesClient. */
public interface ScheduledQueryRulesClient
    extends InnerSupportsGet<LogSearchRuleResourceInner>,
        InnerSupportsListing<LogSearchRuleResourceInner>,
        InnerSupportsDelete<Void> {
    /**
     * Creates or updates an log search rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @param parameters The parameters of the rule to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Log Search Rule resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<LogSearchRuleResourceInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String ruleName, LogSearchRuleResourceInner parameters);

    /**
     * Creates or updates an log search rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @param parameters The parameters of the rule to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Log Search Rule resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<LogSearchRuleResourceInner> createOrUpdateAsync(
        String resourceGroupName, String ruleName, LogSearchRuleResourceInner parameters);

    /**
     * Creates or updates an log search rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @param parameters The parameters of the rule to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Log Search Rule resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LogSearchRuleResourceInner createOrUpdate(
        String resourceGroupName, String ruleName, LogSearchRuleResourceInner parameters);

    /**
     * Creates or updates an log search rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @param parameters The parameters of the rule to create or update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Log Search Rule resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LogSearchRuleResourceInner> createOrUpdateWithResponse(
        String resourceGroupName, String ruleName, LogSearchRuleResourceInner parameters, Context context);

    /**
     * Gets an Log Search rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Log Search rule along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<LogSearchRuleResourceInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String ruleName);

    /**
     * Gets an Log Search rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Log Search rule on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<LogSearchRuleResourceInner> getByResourceGroupAsync(String resourceGroupName, String ruleName);

    /**
     * Gets an Log Search rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Log Search rule.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LogSearchRuleResourceInner getByResourceGroup(String resourceGroupName, String ruleName);

    /**
     * Gets an Log Search rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Log Search rule along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LogSearchRuleResourceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String ruleName, Context context);

    /**
     * Update log search Rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @param parameters The parameters of the rule to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Log Search Rule resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<LogSearchRuleResourceInner>> updateWithResponseAsync(
        String resourceGroupName, String ruleName, LogSearchRuleResourcePatch parameters);

    /**
     * Update log search Rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @param parameters The parameters of the rule to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Log Search Rule resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<LogSearchRuleResourceInner> updateAsync(
        String resourceGroupName, String ruleName, LogSearchRuleResourcePatch parameters);

    /**
     * Update log search Rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @param parameters The parameters of the rule to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Log Search Rule resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    LogSearchRuleResourceInner update(String resourceGroupName, String ruleName, LogSearchRuleResourcePatch parameters);

    /**
     * Update log search Rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @param parameters The parameters of the rule to update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Log Search Rule resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<LogSearchRuleResourceInner> updateWithResponse(
        String resourceGroupName, String ruleName, LogSearchRuleResourcePatch parameters, Context context);

    /**
     * Deletes a Log Search rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(String resourceGroupName, String ruleName);

    /**
     * Deletes a Log Search rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String ruleName);

    /**
     * Deletes a Log Search rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String ruleName);

    /**
     * Deletes a Log Search rule.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String ruleName, Context context);

    /**
     * List the Log Search rules within a subscription group.
     *
     * @param filter The filter to apply on the operation. For more information please see
     *     https://msdn.microsoft.com/en-us/library/azure/dn931934.aspx.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of Log Search rule resources as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<LogSearchRuleResourceInner> listAsync(String filter);

    /**
     * List the Log Search rules within a subscription group.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of Log Search rule resources as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<LogSearchRuleResourceInner> listAsync();

    /**
     * List the Log Search rules within a subscription group.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of Log Search rule resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LogSearchRuleResourceInner> list();

    /**
     * List the Log Search rules within a subscription group.
     *
     * @param filter The filter to apply on the operation. For more information please see
     *     https://msdn.microsoft.com/en-us/library/azure/dn931934.aspx.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of Log Search rule resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LogSearchRuleResourceInner> list(String filter, Context context);

    /**
     * List the Log Search rules within a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param filter The filter to apply on the operation. For more information please see
     *     https://msdn.microsoft.com/en-us/library/azure/dn931934.aspx.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of Log Search rule resources as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<LogSearchRuleResourceInner> listByResourceGroupAsync(String resourceGroupName, String filter);

    /**
     * List the Log Search rules within a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of Log Search rule resources as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<LogSearchRuleResourceInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * List the Log Search rules within a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of Log Search rule resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LogSearchRuleResourceInner> listByResourceGroup(String resourceGroupName);

    /**
     * List the Log Search rules within a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param filter The filter to apply on the operation. For more information please see
     *     https://msdn.microsoft.com/en-us/library/azure/dn931934.aspx.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of Log Search rule resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<LogSearchRuleResourceInner> listByResourceGroup(
        String resourceGroupName, String filter, Context context);
}
