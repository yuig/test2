package tg2;

import io.embrace.android.embracesdk.internal.config.instrumented.InstrumentedConfigImpl;
import io.embrace.android.embracesdk.internal.config.instrumented.schema.EnabledFeatureConfig;
import io.embrace.android.embracesdk.internal.config.remote.BackgroundActivityRemoteConfig;
import io.embrace.android.embracesdk.internal.config.remote.RemoteConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final g f117605a;

    /* renamed from: b, reason: collision with root package name */
    public final EnabledFeatureConfig f117606b;

    /* renamed from: c, reason: collision with root package name */
    public final BackgroundActivityRemoteConfig f117607c;

    public f(g thresholdCheck, InstrumentedConfigImpl local, RemoteConfig remoteConfig) {
        Intrinsics.checkNotNullParameter(thresholdCheck, "thresholdCheck");
        Intrinsics.checkNotNullParameter(local, "local");
        this.f117605a = thresholdCheck;
        this.f117606b = local.getEnabledFeatures();
        this.f117607c = remoteConfig != null ? remoteConfig.f73059n : null;
    }
}
