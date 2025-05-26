package tg2;

import io.embrace.android.embracesdk.internal.config.instrumented.InstrumentedConfigImpl;
import io.embrace.android.embracesdk.internal.config.instrumented.schema.EnabledFeatureConfig;
import io.embrace.android.embracesdk.internal.config.remote.RemoteConfig;
import kotlin.jvm.internal.Intrinsics;
import xk2.v;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final g f117600a;

    /* renamed from: b, reason: collision with root package name */
    public final RemoteConfig f117601b;

    /* renamed from: c, reason: collision with root package name */
    public final EnabledFeatureConfig f117602c;

    /* renamed from: d, reason: collision with root package name */
    public final v f117603d;

    /* renamed from: e, reason: collision with root package name */
    public final v f117604e;

    public e(g thresholdCheck, InstrumentedConfigImpl local, RemoteConfig remoteConfig) {
        Intrinsics.checkNotNullParameter(thresholdCheck, "thresholdCheck");
        Intrinsics.checkNotNullParameter(local, "local");
        this.f117600a = thresholdCheck;
        this.f117601b = remoteConfig;
        this.f117602c = local.getEnabledFeatures();
        this.f117603d = xk2.m.b(new d(this, 1));
        this.f117604e = xk2.m.b(new d(this, 0));
    }
}
