package ads_mobile_sdk;

import a.zb;
import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r01 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f10410a;

    public r01(a.o8 o8Var) {
        this.f10410a = o8Var;
    }

    @Override // a.v7
    public final Object get() {
        zb clock = (zb) this.f10410a.get();
        Intrinsics.checkNotNullParameter(clock, "clock");
        clock.getClass();
        return Long.valueOf(SystemClock.elapsedRealtime());
    }
}
