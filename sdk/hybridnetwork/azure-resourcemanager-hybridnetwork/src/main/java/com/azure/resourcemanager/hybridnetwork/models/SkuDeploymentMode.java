// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The sku deployment mode. */
public final class SkuDeploymentMode extends ExpandableStringEnum<SkuDeploymentMode> {
    /** Static value Unknown for SkuDeploymentMode. */
    public static final SkuDeploymentMode UNKNOWN = fromString("Unknown");

    /** Static value Azure for SkuDeploymentMode. */
    public static final SkuDeploymentMode AZURE = fromString("Azure");

    /** Static value PrivateEdgeZone for SkuDeploymentMode. */
    public static final SkuDeploymentMode PRIVATE_EDGE_ZONE = fromString("PrivateEdgeZone");

    /**
     * Creates or finds a SkuDeploymentMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SkuDeploymentMode.
     */
    @JsonCreator
    public static SkuDeploymentMode fromString(String name) {
        return fromString(name, SkuDeploymentMode.class);
    }

    /**
     * Gets known SkuDeploymentMode values.
     *
     * @return known SkuDeploymentMode values.
     */
    public static Collection<SkuDeploymentMode> values() {
        return values(SkuDeploymentMode.class);
    }
}
