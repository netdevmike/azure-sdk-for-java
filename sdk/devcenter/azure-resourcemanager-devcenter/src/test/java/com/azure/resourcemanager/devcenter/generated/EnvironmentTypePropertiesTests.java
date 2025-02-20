// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.fluent.models.EnvironmentTypeProperties;
import org.junit.jupiter.api.Test;

public final class EnvironmentTypePropertiesTests {
    @Test
    public void testDeserialize() {
        EnvironmentTypeProperties model =
            BinaryData.fromString("{\"provisioningState\":\"kcxywnyt\"}").toObject(EnvironmentTypeProperties.class);
    }

    @Test
    public void testSerialize() {
        EnvironmentTypeProperties model = new EnvironmentTypeProperties();
        model = BinaryData.fromObject(model).toObject(EnvironmentTypeProperties.class);
    }
}
