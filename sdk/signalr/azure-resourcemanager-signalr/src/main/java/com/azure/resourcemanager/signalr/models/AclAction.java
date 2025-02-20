// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Azure Networking ACL Action. */
public final class AclAction extends ExpandableStringEnum<AclAction> {
    /** Static value Allow for AclAction. */
    public static final AclAction ALLOW = fromString("Allow");

    /** Static value Deny for AclAction. */
    public static final AclAction DENY = fromString("Deny");

    /**
     * Creates or finds a AclAction from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AclAction.
     */
    @JsonCreator
    public static AclAction fromString(String name) {
        return fromString(name, AclAction.class);
    }

    /**
     * Gets known AclAction values.
     *
     * @return known AclAction values.
     */
    public static Collection<AclAction> values() {
        return values(AclAction.class);
    }
}
