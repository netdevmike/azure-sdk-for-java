// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.FeaturizationSettings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FeaturizationSettingsTests {
    @Test
    public void testDeserialize() {
        FeaturizationSettings model =
            BinaryData.fromString("{\"datasetLanguage\":\"hwtbbaedorvvm\"}").toObject(FeaturizationSettings.class);
        Assertions.assertEquals("hwtbbaedorvvm", model.datasetLanguage());
    }

    @Test
    public void testSerialize() {
        FeaturizationSettings model = new FeaturizationSettings().withDatasetLanguage("hwtbbaedorvvm");
        model = BinaryData.fromObject(model).toObject(FeaturizationSettings.class);
        Assertions.assertEquals("hwtbbaedorvvm", model.datasetLanguage());
    }
}
