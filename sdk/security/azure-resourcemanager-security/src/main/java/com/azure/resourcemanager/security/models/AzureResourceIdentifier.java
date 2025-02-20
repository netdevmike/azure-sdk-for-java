// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Azure resource identifier. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureResource")
@Immutable
public final class AzureResourceIdentifier extends ResourceIdentifier {
    /*
     * ARM resource identifier for the cloud resource being alerted on
     */
    @JsonProperty(value = "azureResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String azureResourceId;

    /** Creates an instance of AzureResourceIdentifier class. */
    public AzureResourceIdentifier() {
    }

    /**
     * Get the azureResourceId property: ARM resource identifier for the cloud resource being alerted on.
     *
     * @return the azureResourceId value.
     */
    public String azureResourceId() {
        return this.azureResourceId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
