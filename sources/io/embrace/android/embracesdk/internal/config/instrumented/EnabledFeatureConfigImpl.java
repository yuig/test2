package io.embrace.android.embracesdk.internal.config.instrumented;

import io.embrace.android.embracesdk.internal.config.instrumented.schema.EnabledFeatureConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import xk2.d;

@Swazzled
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/instrumented/EnabledFeatureConfigImpl;", "Lio/embrace/android/embracesdk/internal/config/instrumented/schema/EnabledFeatureConfig;", "()V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EnabledFeatureConfigImpl implements EnabledFeatureConfig {

    @NotNull
    public static final EnabledFeatureConfigImpl INSTANCE = new EnabledFeatureConfigImpl();

    private EnabledFeatureConfigImpl() {
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.EnabledFeatureConfig
    public boolean is3rdPartySigHandlerDetectionEnabled() {
        return EnabledFeatureConfig.DefaultImpls.is3rdPartySigHandlerDetectionEnabled(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.EnabledFeatureConfig
    public boolean isActivityBreadcrumbCaptureEnabled() {
        return EnabledFeatureConfig.DefaultImpls.isActivityBreadcrumbCaptureEnabled(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.EnabledFeatureConfig
    public boolean isAeiCaptureEnabled() {
        return EnabledFeatureConfig.DefaultImpls.isAeiCaptureEnabled(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.EnabledFeatureConfig
    public boolean isAnrCaptureEnabled() {
        return EnabledFeatureConfig.DefaultImpls.isAnrCaptureEnabled(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.EnabledFeatureConfig
    public boolean isBackgroundActivityCaptureEnabled() {
        return EnabledFeatureConfig.DefaultImpls.isBackgroundActivityCaptureEnabled(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.EnabledFeatureConfig
    public boolean isComposeClickCaptureEnabled() {
        return EnabledFeatureConfig.DefaultImpls.isComposeClickCaptureEnabled(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.EnabledFeatureConfig
    public boolean isDiskUsageCaptureEnabled() {
        return EnabledFeatureConfig.DefaultImpls.isDiskUsageCaptureEnabled(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.EnabledFeatureConfig
    public boolean isFcmPiiDataCaptureEnabled() {
        return EnabledFeatureConfig.DefaultImpls.isFcmPiiDataCaptureEnabled(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.EnabledFeatureConfig
    public boolean isHttpUrlConnectionCaptureEnabled() {
        return EnabledFeatureConfig.DefaultImpls.isHttpUrlConnectionCaptureEnabled(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.EnabledFeatureConfig
    public boolean isJvmCrashCaptureEnabled() {
        return EnabledFeatureConfig.DefaultImpls.isJvmCrashCaptureEnabled(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.EnabledFeatureConfig
    @d
    public boolean isMemoryWarningCaptureEnabled() {
        return EnabledFeatureConfig.DefaultImpls.isMemoryWarningCaptureEnabled(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.EnabledFeatureConfig
    public boolean isNativeCrashCaptureEnabled() {
        EnabledFeatureConfig.DefaultImpls.isNativeCrashCaptureEnabled(this);
        return false;
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.EnabledFeatureConfig
    public boolean isNetworkConnectivityCaptureEnabled() {
        return EnabledFeatureConfig.DefaultImpls.isNetworkConnectivityCaptureEnabled(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.EnabledFeatureConfig
    public boolean isNetworkSpanForwardingEnabled() {
        return EnabledFeatureConfig.DefaultImpls.isNetworkSpanForwardingEnabled(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.EnabledFeatureConfig
    public boolean isPowerSaveModeCaptureEnabled() {
        return EnabledFeatureConfig.DefaultImpls.isPowerSaveModeCaptureEnabled(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.EnabledFeatureConfig
    public boolean isRequestContentLengthCaptureEnabled() {
        return EnabledFeatureConfig.DefaultImpls.isRequestContentLengthCaptureEnabled(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.EnabledFeatureConfig
    public boolean isUiLoadTracingEnabled() {
        return EnabledFeatureConfig.DefaultImpls.isUiLoadTracingEnabled(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.EnabledFeatureConfig
    public boolean isUiLoadTracingTraceAll() {
        return EnabledFeatureConfig.DefaultImpls.isUiLoadTracingTraceAll(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.EnabledFeatureConfig
    public boolean isUnityAnrCaptureEnabled() {
        return EnabledFeatureConfig.DefaultImpls.isUnityAnrCaptureEnabled(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.EnabledFeatureConfig
    public boolean isViewClickCoordinateCaptureEnabled() {
        return EnabledFeatureConfig.DefaultImpls.isViewClickCoordinateCaptureEnabled(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.EnabledFeatureConfig
    public boolean isWebViewBreadcrumbCaptureEnabled() {
        return EnabledFeatureConfig.DefaultImpls.isWebViewBreadcrumbCaptureEnabled(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.EnabledFeatureConfig
    public boolean isWebViewBreadcrumbQueryParamCaptureEnabled() {
        return EnabledFeatureConfig.DefaultImpls.isWebViewBreadcrumbQueryParamCaptureEnabled(this);
    }
}
