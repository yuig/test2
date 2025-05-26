package tg2;

import io.embrace.android.embracesdk.internal.config.instrumented.InstrumentedConfigImpl;
import io.embrace.android.embracesdk.internal.config.instrumented.schema.EnabledFeatureConfig;
import io.embrace.android.embracesdk.internal.config.remote.AppExitInfoConfig;
import io.embrace.android.embracesdk.internal.config.remote.RemoteConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final g f117595a;

    /* renamed from: b, reason: collision with root package name */
    public final EnabledFeatureConfig f117596b;

    /* renamed from: c, reason: collision with root package name */
    public final AppExitInfoConfig f117597c;

    public c(g thresholdCheck, InstrumentedConfigImpl local, RemoteConfig remoteConfig) {
        Intrinsics.checkNotNullParameter(thresholdCheck, "thresholdCheck");
        Intrinsics.checkNotNullParameter(local, "local");
        this.f117595a = thresholdCheck;
        this.f117596b = local.getEnabledFeatures();
        this.f117597c = remoteConfig != null ? remoteConfig.f73058m : null;
    }
}
