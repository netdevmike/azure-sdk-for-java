// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.exception.ManagementError;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Error details. */
@Immutable
public final class ErrorDetails extends ManagementError {
    /*
     * The HTTP status code.
     */
    @JsonProperty(value = "httpStatusCode", access = JsonProperty.Access.WRITE_ONLY)
    private String httpStatusCode;

    /**
     * Get the httpStatusCode property: The HTTP status code.
     *
     * @return the httpStatusCode value.
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
