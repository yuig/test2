package s1;

import kotlin.collections.CollectionsKt;
import q3.f1;

/* loaded from: classes2.dex */
public final class q implements androidx.compose.foundation.lazy.layout.n {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f110517a;

    /* renamed from: b, reason: collision with root package name */
    public final int f110518b;

    public q(o0 o0Var, int i13) {
        this.f110517a = o0Var;
        this.f110518b = i13;
    }

    @Override // androidx.compose.foundation.lazy.layout.n
    public final int a() {
        return this.f110517a.n();
    }

    @Override // androidx.compose.foundation.lazy.layout.n
    public final void b() {
        f1 f1Var = (f1) this.f110517a.f110513w.getValue();
        if (f1Var != null) {
            ((s3.k0) f1Var).k();
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.n
    public final boolean c() {
        return !((f0) this.f110517a.m()).f110418a.isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.n
    public final int d() {
        return Math.max(0, this.f110517a.f110494d - this.f110518b);
    }

    @Override // androidx.compose.foundation.lazy.layout.n
    public final int e() {
        return Math.min(r0.n() - 1, ((l) ((m) CollectionsKt.b0(((f0) this.f110517a.m()).f110418a))).f110458a + this.f110518b);
    }
}
