// Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
// SPDX-License-Identifier: Apache-2.0
// THIS FILE IS GENERATED! DO NOT EDIT BY HAND!
@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package software.aws.toolkits.telemetry

import com.intellij.openapi.project.Project
import java.time.Instant
import kotlin.Boolean
import kotlin.Double
import kotlin.Suppress
import software.amazon.awssdk.services.toolkittelemetry.model.Unit
import software.aws.toolkits.core.ConnectionSettings
import software.aws.toolkits.jetbrains.services.telemetry.MetricEventMetadata
import software.aws.toolkits.jetbrains.services.telemetry.TelemetryService

public object NoTelemetry {
    /**
     * called when invoking lambdas remotely
     */
    public fun metadata(
        project: Project?,
        duration: Double? = null,
        passive: Boolean = false,
        `value`: Double = 1.0,
        createTime: Instant = Instant.now(),
    ) {
        TelemetryService.getInstance().record(project) {
            datum("no_metadata") {
                createTime(createTime)
                unit(Unit.NONE)
                value(value)
                passive(passive)
                if(duration != null) {
                    metadata("duration", duration.toString())
                }
            }
        }
    }

    /**
     * called when invoking lambdas remotely
     */
    public fun metadata(
        connectionSettings: ConnectionSettings? = null,
        duration: Double? = null,
        passive: Boolean = false,
        `value`: Double = 1.0,
        createTime: Instant = Instant.now(),
    ) {
        TelemetryService.getInstance().record(connectionSettings) {
            datum("no_metadata") {
                createTime(createTime)
                unit(Unit.NONE)
                value(value)
                passive(passive)
                if(duration != null) {
                    metadata("duration", duration.toString())
                }
            }
        }
    }

    /**
     * called when invoking lambdas remotely
     */
    public fun metadata(
        metadata: MetricEventMetadata,
        duration: Double? = null,
        passive: Boolean = false,
        `value`: Double = 1.0,
        createTime: Instant = Instant.now(),
    ) {
        TelemetryService.getInstance().record(metadata) {
            datum("no_metadata") {
                createTime(createTime)
                unit(Unit.NONE)
                value(value)
                passive(passive)
                if(duration != null) {
                    metadata("duration", duration.toString())
                }
            }
        }
    }
}