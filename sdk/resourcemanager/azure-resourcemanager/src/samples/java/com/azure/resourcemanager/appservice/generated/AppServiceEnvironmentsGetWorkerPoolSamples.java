// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.util.Context;

/** Samples for AppServiceEnvironments GetWorkerPool. */
public final class AppServiceEnvironmentsGetWorkerPoolSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2022-03-01/examples/AppServiceEnvironments_GetWorkerPool.json
     */
    /**
     * Sample code: Get properties of a worker pool.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getPropertiesOfAWorkerPool(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getAppServiceEnvironments()
            .getWorkerPoolWithResponse("test-rg", "test-ase", "workerPool1", Context.NONE);
    }
}
