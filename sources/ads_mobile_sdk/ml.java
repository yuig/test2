package ads_mobile_sdk;

import a.zb;
import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class ml {

    /* renamed from: a, reason: collision with root package name */
    public final zb f8270a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8271b;

    public ml(zb clock, long j13) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f8270a = clock;
        this.f8271b = j13;
    }

    public final boolean a() {
        zn2.a aVar = zn2.b.f142311b;
        this.f8270a.getClass();
        return zn2.b.c(dl2.b.Q2(SystemClock.elapsedRealtime(), zn2.d.MILLISECONDS), this.f8271b) >= 0;
    }

    public /* synthetic */ ml(zb zbVar, long j13, int i13) {
        this(zbVar, j13);
    }
}
