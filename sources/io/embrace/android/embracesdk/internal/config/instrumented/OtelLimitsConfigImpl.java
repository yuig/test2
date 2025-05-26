package io.embrace.android.embracesdk.internal.config.instrumented;

import io.embrace.android.embracesdk.internal.config.instrumented.schema.OtelLimitsConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Swazzled
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/instrumented/OtelLimitsConfigImpl;", "Lio/embrace/android/embracesdk/internal/config/instrumented/schema/OtelLimitsConfig;", "()V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OtelLimitsConfigImpl implements OtelLimitsConfig {

    @NotNull
    public static final OtelLimitsConfigImpl INSTANCE = new OtelLimitsConfigImpl();

    private OtelLimitsConfigImpl() {
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.OtelLimitsConfig
    @NotNull
    public String getExceptionEventName() {
        return OtelLimitsConfig.DefaultImpls.getExceptionEventName(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.OtelLimitsConfig
    public int getMaxCustomAttributeCount() {
        return OtelLimitsConfig.DefaultImpls.getMaxCustomAttributeCount(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.OtelLimitsConfig
    public int getMaxCustomAttributeKeyLength() {
        return OtelLimitsConfig.DefaultImpls.getMaxCustomAttributeKeyLength(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.OtelLimitsConfig
    public int getMaxCustomAttributeValueLength() {
        return OtelLimitsConfig.DefaultImpls.getMaxCustomAttributeValueLength(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.OtelLimitsConfig
    public int getMaxCustomEventCount() {
        return OtelLimitsConfig.DefaultImpls.getMaxCustomEventCount(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.OtelLimitsConfig
    public int getMaxInternalAttributeKeyLength() {
        return OtelLimitsConfig.DefaultImpls.getMaxInternalAttributeKeyLength(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.OtelLimitsConfig
    public int getMaxInternalAttributeValueLength() {
        return OtelLimitsConfig.DefaultImpls.getMaxInternalAttributeValueLength(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.OtelLimitsConfig
    public int getMaxInternalNameLength() {
        return OtelLimitsConfig.DefaultImpls.getMaxInternalNameLength(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.OtelLimitsConfig
    public int getMaxNameLength() {
        return OtelLimitsConfig.DefaultImpls.getMaxNameLength(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.OtelLimitsConfig
    public int getMaxTotalAttributeCount() {
        return OtelLimitsConfig.DefaultImpls.getMaxTotalAttributeCount(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.OtelLimitsConfig
    public int getMaxTotalEventCount() {
        return OtelLimitsConfig.DefaultImpls.getMaxTotalEventCount(this);
    }
}
