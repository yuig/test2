package tg2;

import io.embrace.android.embracesdk.internal.config.instrumented.InstrumentedConfigImpl;
import io.embrace.android.embracesdk.internal.config.instrumented.schema.EnabledFeatureConfig;
import io.embrace.android.embracesdk.internal.config.remote.AllowedNdkSampleMethod;
import io.embrace.android.embracesdk.internal.config.remote.AnrRemoteConfig;
import io.embrace.android.embracesdk.internal.config.remote.RemoteConfig;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final List f117591d = e0.b(new AllowedNdkSampleMethod("UnityPlayer", "pauseUnity"));

    /* renamed from: a, reason: collision with root package name */
    public final g f117592a;

    /* renamed from: b, reason: collision with root package name */
    public final EnabledFeatureConfig f117593b;

    /* renamed from: c, reason: collision with root package name */
    public final AnrRemoteConfig f117594c;

    public a(g thresholdCheck, InstrumentedConfigImpl local, RemoteConfig remoteConfig) {
        Intrinsics.checkNotNullParameter(thresholdCheck, "thresholdCheck");
        Intrinsics.checkNotNullParameter(local, "local");
        this.f117592a = thresholdCheck;
        this.f117593b = local.getEnabledFeatures();
        this.f117594c = remoteConfig != null ? remoteConfig.f73054i : null;
    }

    public final ug2.a a() {
        Object m13;
        try {
            xk2.q qVar = xk2.s.f135225b;
            ug2.a[] values = ug2.a.values();
            int length = values.length;
            int i13 = 0;
            while (true) {
                m13 = null;
                if (i13 >= length) {
                    break;
                }
                ug2.a aVar = values[i13];
                String name = aVar.name();
                AnrRemoteConfig anrRemoteConfig = this.f117594c;
                if (z.i(name, anrRemoteConfig != null ? anrRemoteConfig.f72977h : null, true)) {
                    m13 = aVar;
                    break;
                }
                i13++;
            }
            if (m13 == null) {
                m13 = ug2.a.LIBUNWIND;
            }
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            m13 = ue.c.m(th3);
        }
        Object obj = ug2.a.LIBUNWIND;
        xk2.q qVar3 = xk2.s.f135225b;
        boolean z13 = m13 instanceof xk2.r;
        Object obj2 = m13;
        if (z13) {
            obj2 = obj;
        }
        return (ug2.a) obj2;
    }

    public final long b() {
        Long l13;
        AnrRemoteConfig anrRemoteConfig = this.f117594c;
        if (anrRemoteConfig == null || (l13 = anrRemoteConfig.f72971b) == null) {
            return 100L;
        }
        return l13.longValue();
    }

    public final boolean c() {
        Float f13 = null;
        AnrRemoteConfig anrRemoteConfig = this.f117594c;
        Integer num = anrRemoteConfig != null ? anrRemoteConfig.f72970a : null;
        g gVar = this.f117592a;
        if (num != null) {
            gVar.getClass();
            f13 = Float.valueOf(num.intValue());
        }
        Boolean a13 = gVar.a(f13);
        if (a13 != null) {
            return a13.booleanValue();
        }
        return true;
    }

    public final boolean d() {
        AnrRemoteConfig anrRemoteConfig = this.f117594c;
        Boolean a13 = this.f117592a.a(anrRemoteConfig != null ? anrRemoteConfig.f72978i : null);
        return a13 != null ? a13.booleanValue() : this.f117593b.isUnityAnrCaptureEnabled();
    }
}
