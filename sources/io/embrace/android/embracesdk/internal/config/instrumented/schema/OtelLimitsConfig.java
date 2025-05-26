package io.embrace.android.embracesdk.internal.config.instrumented.schema;

import com.google.android.gms.ads.AdSize;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016¨\u0006\u000f"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/instrumented/schema/OtelLimitsConfig;", "", "getExceptionEventName", "", "getMaxCustomAttributeCount", "", "getMaxCustomAttributeKeyLength", "getMaxCustomAttributeValueLength", "getMaxCustomEventCount", "getMaxInternalAttributeKeyLength", "getMaxInternalAttributeValueLength", "getMaxInternalNameLength", "getMaxNameLength", "getMaxTotalAttributeCount", "getMaxTotalEventCount", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface OtelLimitsConfig {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static String getExceptionEventName(@NotNull OtelLimitsConfig otelLimitsConfig) {
            return "exception";
        }

        public static int getMaxCustomAttributeCount(@NotNull OtelLimitsConfig otelLimitsConfig) {
            return 50;
        }

        public static int getMaxCustomAttributeKeyLength(@NotNull OtelLimitsConfig otelLimitsConfig) {
            return 50;
        }

        public static int getMaxCustomAttributeValueLength(@NotNull OtelLimitsConfig otelLimitsConfig) {
            return 500;
        }

        public static int getMaxCustomEventCount(@NotNull OtelLimitsConfig otelLimitsConfig) {
            return 10;
        }

        public static int getMaxInternalAttributeKeyLength(@NotNull OtelLimitsConfig otelLimitsConfig) {
            return 1000;
        }

        public static int getMaxInternalAttributeValueLength(@NotNull OtelLimitsConfig otelLimitsConfig) {
            return 2000;
        }

        public static int getMaxInternalNameLength(@NotNull OtelLimitsConfig otelLimitsConfig) {
            return 2000;
        }

        public static int getMaxNameLength(@NotNull OtelLimitsConfig otelLimitsConfig) {
            return 50;
        }

        public static int getMaxTotalAttributeCount(@NotNull OtelLimitsConfig otelLimitsConfig) {
            return AdSize.MEDIUM_RECTANGLE_WIDTH;
        }

        public static int getMaxTotalEventCount(@NotNull OtelLimitsConfig otelLimitsConfig) {
            return 11000;
        }
    }

    @NotNull
    String getExceptionEventName();

    int getMaxCustomAttributeCount();

    int getMaxCustomAttributeKeyLength();

    int getMaxCustomAttributeValueLength();

    int getMaxCustomEventCount();

    int getMaxInternalAttributeKeyLength();

    int getMaxInternalAttributeValueLength();

    int getMaxInternalNameLength();

    int getMaxNameLength();

    int getMaxTotalAttributeCount();

    int getMaxTotalEventCount();
}
