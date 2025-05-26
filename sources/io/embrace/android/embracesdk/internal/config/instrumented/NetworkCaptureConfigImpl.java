package io.embrace.android.embracesdk.internal.config.instrumented;

import io.embrace.android.embracesdk.internal.config.instrumented.schema.NetworkCaptureConfig;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Swazzled
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lio/embrace/android/embracesdk/internal/config/instrumented/NetworkCaptureConfigImpl;", "Lio/embrace/android/embracesdk/internal/config/instrumented/schema/NetworkCaptureConfig;", "()V", "embrace-android-payload_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NetworkCaptureConfigImpl implements NetworkCaptureConfig {

    @NotNull
    public static final NetworkCaptureConfigImpl INSTANCE = new NetworkCaptureConfigImpl();

    private NetworkCaptureConfigImpl() {
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.NetworkCaptureConfig
    @NotNull
    public List<String> getIgnoredRequestPatternList() {
        return NetworkCaptureConfig.DefaultImpls.getIgnoredRequestPatternList(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.NetworkCaptureConfig
    @NotNull
    public Map<String, String> getLimitsByDomain() {
        return NetworkCaptureConfig.DefaultImpls.getLimitsByDomain(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.NetworkCaptureConfig
    public String getNetworkBodyCapturePublicKey() {
        return NetworkCaptureConfig.DefaultImpls.getNetworkBodyCapturePublicKey(this);
    }

    @Override // io.embrace.android.embracesdk.internal.config.instrumented.schema.NetworkCaptureConfig
    public int getRequestLimitPerDomain() {
        return NetworkCaptureConfig.DefaultImpls.getRequestLimitPerDomain(this);
    }
}
