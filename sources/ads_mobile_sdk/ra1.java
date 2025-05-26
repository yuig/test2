package ads_mobile_sdk;

import a.j9;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ra1 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final long f10559a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10560b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10561c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10562d;

    public ra1(long j13, long j14, long j15, int i13) {
        this.f10559a = j13;
        this.f10560b = j14;
        this.f10561c = j15;
        this.f10562d = i13;
    }

    @Override // a.j9
    public final void a(aj.r signals) {
        Intrinsics.checkNotNullParameter(signals, "signals");
        aj.j jVar = signals.deviceSignals.memorySignals;
        jVar.runtimeFreeMemory = Long.valueOf(this.f10559a);
        jVar.runtimeMaxMemory = Long.valueOf(this.f10560b);
        jVar.runtimeTotalMemory = Long.valueOf(this.f10561c);
        jVar.webviewCount = Integer.valueOf(this.f10562d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra1)) {
            return false;
        }
        ra1 ra1Var = (ra1) obj;
        return this.f10559a == ra1Var.f10559a && this.f10560b == ra1Var.f10560b && this.f10561c == ra1Var.f10561c && this.f10562d == ra1Var.f10562d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10562d) + a.a.c(this.f10561c, a.a.c(this.f10560b, Long.hashCode(this.f10559a) * 31, 31), 31);
    }

    public final String toString() {
        long j13 = this.f10559a;
        long j14 = this.f10560b;
        long j15 = this.f10561c;
        int i13 = this.f10562d;
        StringBuilder u13 = a.a.u("MemorySignal(runtimeFreeMemory=", j13, ", runtimeMaxMemory=");
        u13.append(j14);
        a.cb.v(u13, ", runtimeTotalMemory=", j15, ", webviewCount=");
        return a.a.n(u13, i13, ")");
    }
}
