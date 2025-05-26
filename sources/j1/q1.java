package j1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q1 implements r2 {

    /* renamed from: a, reason: collision with root package name */
    public final r2 f74203a;

    /* renamed from: b, reason: collision with root package name */
    public final long f74204b;

    public q1(r2 r2Var, long j13) {
        this.f74203a = r2Var;
        this.f74204b = j13;
    }

    @Override // j1.r2
    public final boolean a() {
        return this.f74203a.a();
    }

    @Override // j1.r2
    public final long b(t tVar, t tVar2, t tVar3) {
        return this.f74203a.b(tVar, tVar2, tVar3) + this.f74204b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return q1Var.f74204b == this.f74204b && Intrinsics.d(q1Var.f74203a, this.f74203a);
    }

    @Override // j1.r2
    public final t g(long j13, t tVar, t tVar2, t tVar3) {
        long j14 = this.f74204b;
        return j13 < j14 ? tVar3 : this.f74203a.g(j13 - j14, tVar, tVar2, tVar3);
    }

    public final int hashCode() {
        return Long.hashCode(this.f74204b) + (this.f74203a.hashCode() * 31);
    }

    @Override // j1.r2
    public final t o(long j13, t tVar, t tVar2, t tVar3) {
        long j14 = this.f74204b;
        return j13 < j14 ? tVar : this.f74203a.o(j13 - j14, tVar, tVar2, tVar3);
    }
}
