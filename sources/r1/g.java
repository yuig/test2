package r1;

import kotlin.collections.CollectionsKt;
import q3.f1;

/* loaded from: classes2.dex */
public final class g implements androidx.compose.foundation.lazy.layout.n {

    /* renamed from: a, reason: collision with root package name */
    public final p0 f105893a;

    public g(p0 p0Var) {
        this.f105893a = p0Var;
    }

    @Override // androidx.compose.foundation.lazy.layout.n
    public final int a() {
        return ((a0) this.f105893a.i()).f105844j;
    }

    @Override // androidx.compose.foundation.lazy.layout.n
    public final void b() {
        f1 f1Var = this.f105893a.f105961h;
        if (f1Var != null) {
            ((s3.k0) f1Var).k();
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.n
    public final boolean c() {
        return !((a0) this.f105893a.i()).f105841g.isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.n
    public final int d() {
        return this.f105893a.f105955b.a();
    }

    @Override // androidx.compose.foundation.lazy.layout.n
    public final int e() {
        return ((b0) ((m) CollectionsKt.b0(((a0) this.f105893a.i()).f105841g))).f105850a;
    }
}
