package nf2;

import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m implements zi2.b {

    /* renamed from: a, reason: collision with root package name */
    public final og2.a f90504a;

    public m(og2.a embraceClock) {
        Intrinsics.checkNotNullParameter(embraceClock, "embraceClock");
        this.f90504a = embraceClock;
    }

    @Override // zi2.b
    public final long a() {
        return SystemClock.elapsedRealtimeNanos();
    }

    @Override // zi2.b
    public final long now() {
        return this.f90504a.a();
    }
}
