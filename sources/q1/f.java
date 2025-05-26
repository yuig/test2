package q1;

import kotlin.collections.CollectionsKt;
import q3.f1;

/* loaded from: classes2.dex */
public final class f implements androidx.compose.foundation.lazy.layout.n {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f101895a;

    /* renamed from: b, reason: collision with root package name */
    public final int f101896b;

    public f(h0 h0Var, int i13) {
        this.f101895a = h0Var;
        this.f101896b = i13;
    }

    @Override // androidx.compose.foundation.lazy.layout.n
    public final int a() {
        return ((v) this.f101895a.i()).f102012m;
    }

    @Override // androidx.compose.foundation.lazy.layout.n
    public final void b() {
        f1 f1Var = this.f101895a.f101917j;
        if (f1Var != null) {
            ((s3.k0) f1Var).k();
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.n
    public final boolean c() {
        return !((v) this.f101895a.i()).f102009j.isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.n
    public final int d() {
        return Math.max(0, this.f101895a.f101911d.a() - this.f101896b);
    }

    @Override // androidx.compose.foundation.lazy.layout.n
    public final int e() {
        return Math.min(a() - 1, ((w) ((j) CollectionsKt.b0(((v) this.f101895a.i()).f102009j))).f102017a + this.f101896b);
    }
}
