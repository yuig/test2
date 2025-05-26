package s80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y5 implements z5 {

    /* renamed from: a, reason: collision with root package name */
    public final b7 f111858a;

    /* renamed from: b, reason: collision with root package name */
    public final long f111859b;

    public y5(b7 step, long j13) {
        Intrinsics.checkNotNullParameter(step, "step");
        this.f111858a = step;
        this.f111859b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5)) {
            return false;
        }
        y5 y5Var = (y5) obj;
        return this.f111858a == y5Var.f111858a && zn2.b.d(this.f111859b, y5Var.f111859b);
    }

    public final int hashCode() {
        int hashCode = this.f111858a.hashCode() * 31;
        zn2.a aVar = zn2.b.f142311b;
        return Long.hashCode(this.f111859b) + hashCode;
    }

    public final String toString() {
        return "ScheduleOnboardingStep(step=" + this.f111858a + ", duration=" + zn2.b.o(this.f111859b) + ")";
    }
}
