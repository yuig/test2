package io.embrace.android.embracesdk.internal.config.instrumented.schema;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/instrumented/schema/InstrumentedConfig;", "", "baseUrls", "Lio/embrace/android/embracesdk/internal/config/instrumented/schema/BaseUrlConfig;", "getBaseUrls", "()Lio/embrace/android/embracesdk/internal/config/instrumented/schema/BaseUrlConfig;", "enabledFeatures", "Lio/embrace/android/embracesdk/internal/config/instrumented/schema/EnabledFeatureConfig;", "getEnabledFeatures", "()Lio/embrace/android/embracesdk/internal/config/instrumented/schema/EnabledFeatureConfig;", "networkCapture", "Lio/embrace/android/embracesdk/internal/config/instrumented/schema/NetworkCaptureConfig;", "getNetworkCapture", "()Lio/embrace/android/embracesdk/internal/config/instrumented/schema/NetworkCaptureConfig;", "otelLimits", "Lio/embrace/android/embracesdk/internal/config/instrumented/schema/OtelLimitsConfig;", "getOtelLimits", "()Lio/embrace/android/embracesdk/internal/config/instrumented/schema/OtelLimitsConfig;", "project", "Lio/embrace/android/embracesdk/internal/config/instrumented/schema/ProjectConfig;", "getProject", "()Lio/embrace/android/embracesdk/internal/config/instrumented/schema/ProjectConfig;", "redaction", "Lio/embrace/android/embracesdk/internal/config/instrumented/schema/RedactionConfig;", "getRedaction", "()Lio/embrace/android/embracesdk/internal/config/instrumented/schema/RedactionConfig;", "session", "Lio/embrace/android/embracesdk/internal/config/instrumented/schema/SessionConfig;", "getSession", "()Lio/embrace/android/embracesdk/internal/config/instrumented/schema/SessionConfig;", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface InstrumentedConfig {
    @NotNull
    BaseUrlConfig getBaseUrls();

    @NotNull
    EnabledFeatureConfig getEnabledFeatures();

    @NotNull
    NetworkCaptureConfig getNetworkCapture();

    @NotNull
    OtelLimitsConfig getOtelLimits();

    @NotNull
    ProjectConfig getProject();

    @NotNull
    RedactionConfig getRedaction();

    @NotNull
    SessionConfig getSession();
}
