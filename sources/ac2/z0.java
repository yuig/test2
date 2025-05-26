package ac2;

import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final pb0.a f2073a;

    /* renamed from: b, reason: collision with root package name */
    public long f2074b;

    /* renamed from: c, reason: collision with root package name */
    public int f2075c;

    /* renamed from: d, reason: collision with root package name */
    public int f2076d;

    /* renamed from: e, reason: collision with root package name */
    public nc2.i f2077e;

    public z0(pb0.a clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f2073a = clock;
        ((pb0.g) clock).getClass();
        this.f2074b = SystemClock.elapsedRealtime();
    }

    public final nc2.i a() {
        return this.f2077e;
    }

    public final void b() {
        ((pb0.g) this.f2073a).getClass();
        this.f2074b = SystemClock.elapsedRealtime();
    }
}
