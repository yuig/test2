package tg2;

import io.embrace.android.embracesdk.internal.config.instrumented.InstrumentedConfigImpl;
import io.embrace.android.embracesdk.internal.config.instrumented.schema.EnabledFeatureConfig;
import io.embrace.android.embracesdk.internal.config.remote.NetworkSpanForwardingRemoteConfig;
import io.embrace.android.embracesdk.internal.config.remote.RemoteConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final g f117618a;

    /* renamed from: b, reason: collision with root package name */
    public final EnabledFeatureConfig f117619b;

    /* renamed from: c, reason: collision with root package name */
    public final NetworkSpanForwardingRemoteConfig f117620c;

    public n(g thresholdCheck, InstrumentedConfigImpl local, RemoteConfig remoteConfig) {
        Intrinsics.checkNotNullParameter(thresholdCheck, "thresholdCheck");
        Intrinsics.checkNotNullParameter(local, "local");
        this.f117618a = thresholdCheck;
        this.f117619b = local.getEnabledFeatures();
        this.f117620c = remoteConfig != null ? remoteConfig.f73061p : null;
    }
}
