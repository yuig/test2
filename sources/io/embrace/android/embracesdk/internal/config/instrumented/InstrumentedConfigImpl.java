package io.embrace.android.embracesdk.internal.config.instrumented;

import io.embrace.android.embracesdk.internal.config.instrumented.schema.BaseUrlConfig;
import io.embrace.android.embracesdk.internal.config.instrumented.schema.EnabledFeatureConfig;
import io.embrace.android.embracesdk.internal.config.instrumented.schema.InstrumentedConfig;
import io.embrace.android.embracesdk.internal.config.instrumented.schema.NetworkCaptureConfig;
import io.embrace.android.embracesdk.internal.config.instrumented.schema.OtelLimitsConfig;
import io.embrace.android.embracesdk.internal.config.instrumented.schema.ProjectConfig;
import io.embrace.android.embracesdk.internal.config.instrumented.schema.RedactionConfig;
import io.embrace.android.embracesdk.internal.config.instrumented.schema.SessionConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Swazzled
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001cX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/instrumented/InstrumentedConfigImpl;", "Lio/embrace/android/embracesdk/internal/config/instrumented/schema/InstrumentedConfig;", "()V", "baseUrls", "Lio/embrace/android/embracesdk/internal/config/instrumented/schema/BaseUrlConfig;", "getBaseUrls", "()Lio/embrace/android/embracesdk/internal/config/instrumented/schema/BaseUrlConfig;", "enabledFeatures", "Lio/embrace/android/embracesdk/internal/config/instrumented/schema/EnabledFeatureConfig;", "getEnabledFeatures", "()Lio/embrace/android/embracesdk/internal/config/instrumented/schema/EnabledFeatureConfig;", "networkCapture", "Lio/embrace/android/embracesdk/internal/config/instrumented/schema/NetworkCaptureConfig;", "getNetworkCapture", "()Lio/embrace/android/embracesdk/internal/config/instrumented/schema/NetworkCaptureConfig;", "otelLimits", "Lio/embrace/android/embracesdk/internal/config/instrumented/schema/OtelLimitsConfig;", "getOtelLimits", "()Lio/embrace/android/embracesdk/internal/config/instrumented/schema/OtelLimitsConfig;", "project", "Lio/embrace/android/embracesdk/internal/config/instrumented/schema/ProjectConfig;", "getProject", "()Lio/embrace/android/embracesdk/internal/config/instrumented/schema/ProjectConfig;", "redaction", "Lio/embrace/android/embracesdk/internal/config/instrumented/schema/RedactionConfig;", "getRedaction", "()Lio/embrace/android/embracesdk/internal/config/instrumented/schema/RedactionConfig;", "session", "Lio/embrace/android/embracesdk/internal/config/instrumented/schema/SessionConfig;", "getSession", "()Lio/embrace/android/embracesdk/internal/config/instrumented/schema/SessionConfig;", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InstrumentedConfigImpl implements InstrumentedConfig {

    @NotNull
    public static final InstrumentedConfigImpl INSTANCE = new InstrumentedConfigImpl();

    @NotNull
    private static final BaseUrlConfig baseUrls = BaseUrlConfigImpl.INSTANCE;

    @NotNull
    private static final EnabledFeatureConfig enabledFeatures = EnabledFeatureConfigImpl.INSTANCE;

    @NotNull
    private static final NetworkCaptureConfig networkCapture = NetworkCaptureConfigImpl.INSTANCE;

    @NotNull
    private static final OtelLimitsConfig otelLimits = OtelLimitsConfigImpl.INSTANCE;

    @NotNull
    private static final ProjectConfig project = ProjectConfigImpl.INSTANCE;

    @NotNull
    private static final RedactionConfig redaction = RedactionConfigImpl.INSTANCE;

    @NotNull
    private static final SessionConfig session = SessionConfigImpl.INSTANCE;

    private InstrumentedConfigImpl() {
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.InstrumentedConfig
    @NotNull
    public BaseUrlConfig getBaseUrls() {
        return baseUrls;
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.InstrumentedConfig
    @NotNull
    public EnabledFeatureConfig getEnabledFeatures() {
        return enabledFeatures;
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.InstrumentedConfig
    @NotNull
    public NetworkCaptureConfig getNetworkCapture() {
        return networkCapture;
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.InstrumentedConfig
    @NotNull
    public OtelLimitsConfig getOtelLimits() {
        return otelLimits;
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.InstrumentedConfig
    @NotNull
    public ProjectConfig getProject() {
        return project;
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.InstrumentedConfig
    @NotNull
    public RedactionConfig getRedaction() {
        return redaction;
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.InstrumentedConfig
    @NotNull
    public SessionConfig getSession() {
        return session;
    }
}
