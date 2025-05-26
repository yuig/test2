package kb;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f79030a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f79031b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f79032c;

    /* renamed from: d, reason: collision with root package name */
    public final l f79033d;

    /* renamed from: e, reason: collision with root package name */
    public final l f79034e;

    /* renamed from: f, reason: collision with root package name */
    public final int f79035f;

    /* renamed from: g, reason: collision with root package name */
    public final int f79036g;

    /* renamed from: h, reason: collision with root package name */
    public final g f79037h;

    /* renamed from: i, reason: collision with root package name */
    public final long f79038i;

    /* renamed from: j, reason: collision with root package name */
    public final r0 f79039j;

    /* renamed from: k, reason: collision with root package name */
    public final long f79040k;

    /* renamed from: l, reason: collision with root package name */
    public final int f79041l;

    public t0(UUID id3, s0 state, HashSet tags, l outputData, l progress, int i13, int i14, g constraints, long j13, r0 r0Var, long j14, int i15) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tags, "tags");
        Intrinsics.checkNotNullParameter(outputData, "outputData");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        this.f79030a = id3;
        this.f79031b = state;
        this.f79032c = tags;
        this.f79033d = outputData;
        this.f79034e = progress;
        this.f79035f = i13;
        this.f79036g = i14;
        this.f79037h = constraints;
        this.f79038i = j13;
        this.f79039j = r0Var;
        this.f79040k = j14;
        this.f79041l = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(t0.class, obj.getClass())) {
            return false;
        }
        t0 t0Var = (t0) obj;
        if (this.f79035f == t0Var.f79035f && this.f79036g == t0Var.f79036g && Intrinsics.d(this.f79030a, t0Var.f79030a) && this.f79031b == t0Var.f79031b && Intrinsics.d(this.f79033d, t0Var.f79033d) && Intrinsics.d(this.f79037h, t0Var.f79037h) && this.f79038i == t0Var.f79038i && Intrinsics.d(this.f79039j, t0Var.f79039j) && this.f79040k == t0Var.f79040k && this.f79041l == t0Var.f79041l && Intrinsics.d(this.f79032c, t0Var.f79032c)) {
            return Intrinsics.d(this.f79034e, t0Var.f79034e);
        }
        return false;
    }

    public final int hashCode() {
        int c13 = a.a.c(this.f79038i, (this.f79037h.hashCode() + ((((((this.f79034e.hashCode() + ((this.f79032c.hashCode() + ((this.f79033d.hashCode() + ((this.f79031b.hashCode() + (this.f79030a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f79035f) * 31) + this.f79036g) * 31)) * 31, 31);
        r0 r0Var = this.f79039j;
        return Integer.hashCode(this.f79041l) + a.a.c(this.f79040k, (c13 + (r0Var != null ? r0Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "WorkInfo{id='" + this.f79030a + "', state=" + this.f79031b + ", outputData=" + this.f79033d + ", tags=" + this.f79032c + ", progress=" + this.f79034e + ", runAttemptCount=" + this.f79035f + ", generation=" + this.f79036g + ", constraints=" + this.f79037h + ", initialDelayMillis=" + this.f79038i + ", periodicityInfo=" + this.f79039j + ", nextScheduleTimeMillis=" + this.f79040k + "}, stopReason=" + this.f79041l;
    }
}
