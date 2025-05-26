package ads_mobile_sdk;

import android.os.Bundle;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q71 implements a.cd {

    /* renamed from: a, reason: collision with root package name */
    public final fd0 f9971a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f9972b;

    public q71(fd0 firebaseAnalyticsAdapter, r0 adConfiguration) {
        Intrinsics.checkNotNullParameter(firebaseAnalyticsAdapter, "firebaseAnalyticsAdapter");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f9971a = firebaseAnalyticsAdapter;
        this.f9972b = adConfiguration;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        String str;
        String str2 = (String) map.get("eventName");
        if (str2 != null && (str = (String) map.get("eventId")) != null) {
            cd0 cd0Var = cd0.f3865b;
            if (!Intrinsics.d(str2, "_ac")) {
                cd0Var = cd0.f3866c;
                if (!Intrinsics.d(str2, "_ai")) {
                    return Unit.f80348a;
                }
            }
            fd0 fd0Var = this.f9971a;
            Bundle bundle = this.f9972b.f10387q;
            fd0Var.getClass();
            Unit a13 = fd0.a(fd0Var, cd0Var, bundle, str);
            return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
        }
        return Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_LOG_SCION_EVENT;
    }
}
