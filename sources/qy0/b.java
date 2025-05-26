package qy0;

import do2.t2;
import do2.u2;
import kotlin.collections.q0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final pb0.a f105349a;

    /* renamed from: b, reason: collision with root package name */
    public final t2 f105350b;

    public b(pb0.a clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f105349a = clock;
        this.f105350b = u2.a(new a(z0.d(), q0.f80391a, z0.d(), 3));
    }

    public final a a() {
        return (a) this.f105350b.getValue();
    }
}
