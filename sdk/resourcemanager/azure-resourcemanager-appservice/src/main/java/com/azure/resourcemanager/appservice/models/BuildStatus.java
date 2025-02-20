// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for BuildStatus. */
public final class BuildStatus extends ExpandableStringEnum<BuildStatus> {
    /** Static value WaitingForDeployment for BuildStatus. */
    public static final BuildStatus WAITING_FOR_DEPLOYMENT = fromString("WaitingForDeployment");

    /** Static value Uploading for BuildStatus. */
    public static final BuildStatus UPLOADING = fromString("Uploading");

    /** Static value Deploying for BuildStatus. */
    public static final BuildStatus DEPLOYING = fromString("Deploying");

    /** Static value Ready for BuildStatus. */
    public static final BuildStatus READY = fromString("Ready");

    /** Static value Failed for BuildStatus. */
    public static final BuildStatus FAILED = fromString("Failed");

    /** Static value Deleting for BuildStatus. */
    public static final BuildStatus DELETING = fromString("Deleting");

    /** Static value Detached for BuildStatus. */
    public static final BuildStatus DETACHED = fromString("Detached");

    /**
     * Creates or finds a BuildStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BuildStatus.
     */
    @JsonCreator
    public static BuildStatus fromString(String name) {
        return fromString(name, BuildStatus.class);
    }

    /**
     * Gets known BuildStatus values.
     *
     * @return known BuildStatus values.
     */
    public static Collection<BuildStatus> values() {
        return values(BuildStatus.class);
    }
}
