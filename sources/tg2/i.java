package tg2;

import io.embrace.android.embracesdk.internal.config.instrumented.InstrumentedConfigImpl;
import io.embrace.android.embracesdk.internal.config.instrumented.schema.EnabledFeatureConfig;
import io.embrace.android.embracesdk.internal.config.remote.RemoteConfig;
import io.embrace.android.embracesdk.internal.config.remote.UiRemoteConfig;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    public final RemoteConfig f117609a;

    /* renamed from: b, reason: collision with root package name */
    public final EnabledFeatureConfig f117610b;

    public i(InstrumentedConfigImpl local, RemoteConfig remoteConfig) {
        Intrinsics.checkNotNullParameter(local, "local");
        this.f117609a = remoteConfig;
        this.f117610b = local.getEnabledFeatures();
    }

    public final int a() {
        UiRemoteConfig uiRemoteConfig;
        Integer num;
        RemoteConfig remoteConfig = this.f117609a;
        if (remoteConfig == null || (uiRemoteConfig = remoteConfig.f73050e) == null || (num = uiRemoteConfig.f73088a) == null) {
            return 100;
        }
        return num.intValue();
    }
}
