package io.embrace.android.embracesdk.internal.config.instrumented.schema;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import xk2.d;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0017J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016¨\u0006\u0019"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/instrumented/schema/EnabledFeatureConfig;", "", "is3rdPartySigHandlerDetectionEnabled", "", "isActivityBreadcrumbCaptureEnabled", "isAeiCaptureEnabled", "isAnrCaptureEnabled", "isBackgroundActivityCaptureEnabled", "isComposeClickCaptureEnabled", "isDiskUsageCaptureEnabled", "isFcmPiiDataCaptureEnabled", "isHttpUrlConnectionCaptureEnabled", "isJvmCrashCaptureEnabled", "isMemoryWarningCaptureEnabled", "isNativeCrashCaptureEnabled", "isNetworkConnectivityCaptureEnabled", "isNetworkSpanForwardingEnabled", "isPowerSaveModeCaptureEnabled", "isRequestContentLengthCaptureEnabled", "isUiLoadTracingEnabled", "isUiLoadTracingTraceAll", "isUnityAnrCaptureEnabled", "isViewClickCoordinateCaptureEnabled", "isWebViewBreadcrumbCaptureEnabled", "isWebViewBreadcrumbQueryParamCaptureEnabled", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface EnabledFeatureConfig {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean is3rdPartySigHandlerDetectionEnabled(@NotNull EnabledFeatureConfig enabledFeatureConfig) {
            return false;
        }

        public static boolean isActivityBreadcrumbCaptureEnabled(@NotNull EnabledFeatureConfig enabledFeatureConfig) {
            return true;
        }

        public static boolean isAeiCaptureEnabled(@NotNull EnabledFeatureConfig enabledFeatureConfig) {
            return true;
        }

        public static boolean isAnrCaptureEnabled(@NotNull EnabledFeatureConfig enabledFeatureConfig) {
            return true;
        }

        public static boolean isBackgroundActivityCaptureEnabled(@NotNull EnabledFeatureConfig enabledFeatureConfig) {
            return false;
        }

        public static boolean isComposeClickCaptureEnabled(@NotNull EnabledFeatureConfig enabledFeatureConfig) {
            return false;
        }

        public static boolean isDiskUsageCaptureEnabled(@NotNull EnabledFeatureConfig enabledFeatureConfig) {
            return true;
        }

        public static boolean isFcmPiiDataCaptureEnabled(@NotNull EnabledFeatureConfig enabledFeatureConfig) {
            return false;
        }

        public static boolean isHttpUrlConnectionCaptureEnabled(@NotNull EnabledFeatureConfig enabledFeatureConfig) {
            return true;
        }

        public static boolean isJvmCrashCaptureEnabled(@NotNull EnabledFeatureConfig enabledFeatureConfig) {
            return true;
        }

        @d
        public static boolean isMemoryWarningCaptureEnabled(@NotNull EnabledFeatureConfig enabledFeatureConfig) {
            return true;
        }

        public static boolean isNativeCrashCaptureEnabled(@NotNull EnabledFeatureConfig enabledFeatureConfig) {
            return false;
        }

        public static boolean isNetworkConnectivityCaptureEnabled(@NotNull EnabledFeatureConfig enabledFeatureConfig) {
            return true;
        }

        public static boolean isNetworkSpanForwardingEnabled(@NotNull EnabledFeatureConfig enabledFeatureConfig) {
            return false;
        }

        public static boolean isPowerSaveModeCaptureEnabled(@NotNull EnabledFeatureConfig enabledFeatureConfig) {
            return true;
        }

        public static boolean isRequestContentLengthCaptureEnabled(@NotNull EnabledFeatureConfig enabledFeatureConfig) {
            return false;
        }

        public static boolean isUiLoadTracingEnabled(@NotNull EnabledFeatureConfig enabledFeatureConfig) {
            return true;
        }

        public static boolean isUiLoadTracingTraceAll(@NotNull EnabledFeatureConfig enabledFeatureConfig) {
            return true;
        }

        public static boolean isUnityAnrCaptureEnabled(@NotNull EnabledFeatureConfig enabledFeatureConfig) {
            return false;
        }

        public static boolean isViewClickCoordinateCaptureEnabled(@NotNull EnabledFeatureConfig enabledFeatureConfig) {
            return false;
        }

        public static boolean isWebViewBreadcrumbCaptureEnabled(@NotNull EnabledFeatureConfig enabledFeatureConfig) {
            return true;
        }

        public static boolean isWebViewBreadcrumbQueryParamCaptureEnabled(@NotNull EnabledFeatureConfig enabledFeatureConfig) {
            return true;
        }
    }

    boolean is3rdPartySigHandlerDetectionEnabled();

    boolean isActivityBreadcrumbCaptureEnabled();

    boolean isAeiCaptureEnabled();

    boolean isAnrCaptureEnabled();

    boolean isBackgroundActivityCaptureEnabled();

    boolean isComposeClickCaptureEnabled();

    boolean isDiskUsageCaptureEnabled();

    boolean isFcmPiiDataCaptureEnabled();

    boolean isHttpUrlConnectionCaptureEnabled();

    boolean isJvmCrashCaptureEnabled();

    @d
    boolean isMemoryWarningCaptureEnabled();

    boolean isNativeCrashCaptureEnabled();

    boolean isNetworkConnectivityCaptureEnabled();

    boolean isNetworkSpanForwardingEnabled();

    boolean isPowerSaveModeCaptureEnabled();

    boolean isRequestContentLengthCaptureEnabled();

    boolean isUiLoadTracingEnabled();

    boolean isUiLoadTracingTraceAll();

    boolean isUnityAnrCaptureEnabled();

    boolean isViewClickCoordinateCaptureEnabled();

    boolean isWebViewBreadcrumbCaptureEnabled();

    boolean isWebViewBreadcrumbQueryParamCaptureEnabled();
}
