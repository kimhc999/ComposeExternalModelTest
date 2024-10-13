package com.sample.composeexternalmodeltest.ui

import com.sample.composeexternalmodeltest.model.InternalTestModel
import com.sample.external.model.ExternalTestModel

data class MainState(
    val internalModel: InternalTestModel,
    val externalTestModel: ExternalTestModel
)