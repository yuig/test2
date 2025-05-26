package io.embrace.android.embracesdk.internal.config.instrumented;

import io.embrace.android.embracesdk.internal.config.instrumented.schema.OtelLimitsConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001H\u0000\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001H\u0000¨\u0006\t"}, d2 = {"isAttributeValid", "", "Lio/embrace/android/embracesdk/internal/config/instrumented/schema/OtelLimitsConfig;", "key", "", "value", "internal", "isNameValid", "str", "embrace-android-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OtelLimitsConfigExtKt {
    public static final boolean isAttributeValid(@NotNull OtelLimitsConfig otelLimitsConfig, @NotNull String key, @NotNull String value, boolean z13) {
        Intrinsics.checkNotNullParameter(otelLimitsConfig, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return ((z13 && key.length() <= otelLimitsConfig.getMaxInternalAttributeKeyLength()) || key.length() <= otelLimitsConfig.getMaxCustomAttributeKeyLength()) && ((z13 && value.length() <= otelLimitsConfig.getMaxInternalAttributeValueLength()) || value.length() <= otelLimitsConfig.getMaxCustomAttributeValueLength());
    }

    public static final boolean isNameValid(@NotNull OtelLimitsConfig otelLimitsConfig, @NotNull String str, boolean z13) {
        Intrinsics.checkNotNullParameter(otelLimitsConfig, "<this>");
        Intrinsics.checkNotNullParameter(str, "str");
        return (z.j(str) ^ true) && ((z13 && str.length() <= otelLimitsConfig.getMaxInternalNameLength()) || str.length() <= otelLimitsConfig.getMaxNameLength());
    }
}
