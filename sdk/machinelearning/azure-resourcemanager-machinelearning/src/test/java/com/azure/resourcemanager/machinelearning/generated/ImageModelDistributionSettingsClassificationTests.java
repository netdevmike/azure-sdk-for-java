// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.ImageModelDistributionSettingsClassification;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ImageModelDistributionSettingsClassificationTests {
    @Test
    public void testDeserialize() {
        ImageModelDistributionSettingsClassification model =
            BinaryData
                .fromString(
                    "{\"trainingCropSize\":\"jmfczlfsyqkf\",\"validationCropSize\":\"zgowox\",\"validationResizeSize\":\"je\",\"weightedLoss\":\"cxn\",\"amsGradient\":\"gxhlusr\",\"augmentations\":\"i\",\"beta1\":\"mjceagbjqvls\",\"beta2\":\"ywzash\",\"distributed\":\"onoyjf\",\"earlyStopping\":\"puby\",\"earlyStoppingDelay\":\"clkfkee\",\"earlyStoppingPatience\":\"vop\",\"enableOnnxNormalization\":\"tuoqujlyegqavni\",\"evaluationFrequency\":\"lqqbtnyjpylxdbfv\",\"gradientAccumulationStep\":\"mvmsxbae\",\"layersToFreeze\":\"jcnkottlwu\",\"learningRate\":\"ajmailfemjjza\",\"learningRateScheduler\":\"wjiqullqxb\",\"modelName\":\"vr\",\"momentum\":\"mqerndb\",\"nesterov\":\"yeofltfnnxrkad\",\"numberOfEpochs\":\"ynnfmuiii\",\"numberOfWorkers\":\"pfoh\",\"optimizer\":\"fkx\",\"randomSeed\":\"cbrwjiutgnjizbe\",\"stepLRGamma\":\"oiymrvzbjuyrsrzi\",\"stepLRStepSize\":\"tixgbd\",\"trainingBatchSize\":\"ifrevk\",\"validationBatchSize\":\"pezkis\",\"warmupCosineLRCycles\":\"jm\",\"warmupCosineLRWarmupEpochs\":\"hsyparybjuf\",\"weightDecay\":\"bjczjnciuiyqvlda\"}")
                .toObject(ImageModelDistributionSettingsClassification.class);
        Assertions.assertEquals("gxhlusr", model.amsGradient());
        Assertions.assertEquals("i", model.augmentations());
        Assertions.assertEquals("mjceagbjqvls", model.beta1());
        Assertions.assertEquals("ywzash", model.beta2());
        Assertions.assertEquals("onoyjf", model.distributed());
        Assertions.assertEquals("puby", model.earlyStopping());
        Assertions.assertEquals("clkfkee", model.earlyStoppingDelay());
        Assertions.assertEquals("vop", model.earlyStoppingPatience());
        Assertions.assertEquals("tuoqujlyegqavni", model.enableOnnxNormalization());
        Assertions.assertEquals("lqqbtnyjpylxdbfv", model.evaluationFrequency());
        Assertions.assertEquals("mvmsxbae", model.gradientAccumulationStep());
        Assertions.assertEquals("jcnkottlwu", model.layersToFreeze());
        Assertions.assertEquals("ajmailfemjjza", model.learningRate());
        Assertions.assertEquals("wjiqullqxb", model.learningRateScheduler());
        Assertions.assertEquals("vr", model.modelName());
        Assertions.assertEquals("mqerndb", model.momentum());
        Assertions.assertEquals("yeofltfnnxrkad", model.nesterov());
        Assertions.assertEquals("ynnfmuiii", model.numberOfEpochs());
        Assertions.assertEquals("pfoh", model.numberOfWorkers());
        Assertions.assertEquals("fkx", model.optimizer());
        Assertions.assertEquals("cbrwjiutgnjizbe", model.randomSeed());
        Assertions.assertEquals("oiymrvzbjuyrsrzi", model.stepLRGamma());
        Assertions.assertEquals("tixgbd", model.stepLRStepSize());
        Assertions.assertEquals("ifrevk", model.trainingBatchSize());
        Assertions.assertEquals("pezkis", model.validationBatchSize());
        Assertions.assertEquals("jm", model.warmupCosineLRCycles());
        Assertions.assertEquals("hsyparybjuf", model.warmupCosineLRWarmupEpochs());
        Assertions.assertEquals("bjczjnciuiyqvlda", model.weightDecay());
        Assertions.assertEquals("jmfczlfsyqkf", model.trainingCropSize());
        Assertions.assertEquals("zgowox", model.validationCropSize());
        Assertions.assertEquals("je", model.validationResizeSize());
        Assertions.assertEquals("cxn", model.weightedLoss());
    }

    @Test
    public void testSerialize() {
        ImageModelDistributionSettingsClassification model =
            new ImageModelDistributionSettingsClassification()
                .withAmsGradient("gxhlusr")
                .withAugmentations("i")
                .withBeta1("mjceagbjqvls")
                .withBeta2("ywzash")
                .withDistributed("onoyjf")
                .withEarlyStopping("puby")
                .withEarlyStoppingDelay("clkfkee")
                .withEarlyStoppingPatience("vop")
                .withEnableOnnxNormalization("tuoqujlyegqavni")
                .withEvaluationFrequency("lqqbtnyjpylxdbfv")
                .withGradientAccumulationStep("mvmsxbae")
                .withLayersToFreeze("jcnkottlwu")
                .withLearningRate("ajmailfemjjza")
                .withLearningRateScheduler("wjiqullqxb")
                .withModelName("vr")
                .withMomentum("mqerndb")
                .withNesterov("yeofltfnnxrkad")
                .withNumberOfEpochs("ynnfmuiii")
                .withNumberOfWorkers("pfoh")
                .withOptimizer("fkx")
                .withRandomSeed("cbrwjiutgnjizbe")
                .withStepLRGamma("oiymrvzbjuyrsrzi")
                .withStepLRStepSize("tixgbd")
                .withTrainingBatchSize("ifrevk")
                .withValidationBatchSize("pezkis")
                .withWarmupCosineLRCycles("jm")
                .withWarmupCosineLRWarmupEpochs("hsyparybjuf")
                .withWeightDecay("bjczjnciuiyqvlda")
                .withTrainingCropSize("jmfczlfsyqkf")
                .withValidationCropSize("zgowox")
                .withValidationResizeSize("je")
                .withWeightedLoss("cxn");
        model = BinaryData.fromObject(model).toObject(ImageModelDistributionSettingsClassification.class);
        Assertions.assertEquals("gxhlusr", model.amsGradient());
        Assertions.assertEquals("i", model.augmentations());
        Assertions.assertEquals("mjceagbjqvls", model.beta1());
        Assertions.assertEquals("ywzash", model.beta2());
        Assertions.assertEquals("onoyjf", model.distributed());
        Assertions.assertEquals("puby", model.earlyStopping());
        Assertions.assertEquals("clkfkee", model.earlyStoppingDelay());
        Assertions.assertEquals("vop", model.earlyStoppingPatience());
        Assertions.assertEquals("tuoqujlyegqavni", model.enableOnnxNormalization());
        Assertions.assertEquals("lqqbtnyjpylxdbfv", model.evaluationFrequency());
        Assertions.assertEquals("mvmsxbae", model.gradientAccumulationStep());
        Assertions.assertEquals("jcnkottlwu", model.layersToFreeze());
        Assertions.assertEquals("ajmailfemjjza", model.learningRate());
        Assertions.assertEquals("wjiqullqxb", model.learningRateScheduler());
        Assertions.assertEquals("vr", model.modelName());
        Assertions.assertEquals("mqerndb", model.momentum());
        Assertions.assertEquals("yeofltfnnxrkad", model.nesterov());
        Assertions.assertEquals("ynnfmuiii", model.numberOfEpochs());
        Assertions.assertEquals("pfoh", model.numberOfWorkers());
        Assertions.assertEquals("fkx", model.optimizer());
        Assertions.assertEquals("cbrwjiutgnjizbe", model.randomSeed());
        Assertions.assertEquals("oiymrvzbjuyrsrzi", model.stepLRGamma());
        Assertions.assertEquals("tixgbd", model.stepLRStepSize());
        Assertions.assertEquals("ifrevk", model.trainingBatchSize());
        Assertions.assertEquals("pezkis", model.validationBatchSize());
        Assertions.assertEquals("jm", model.warmupCosineLRCycles());
        Assertions.assertEquals("hsyparybjuf", model.warmupCosineLRWarmupEpochs());
        Assertions.assertEquals("bjczjnciuiyqvlda", model.weightDecay());
        Assertions.assertEquals("jmfczlfsyqkf", model.trainingCropSize());
        Assertions.assertEquals("zgowox", model.validationCropSize());
        Assertions.assertEquals("je", model.validationResizeSize());
        Assertions.assertEquals("cxn", model.weightedLoss());
    }
}
