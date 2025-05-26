package pn2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u extends l1 {

    /* renamed from: b, reason: collision with root package name */
    public final l1 f100846b;

    /* renamed from: c, reason: collision with root package name */
    public final l1 f100847c;

    public u(l1 l1Var, l1 l1Var2) {
        this.f100846b = l1Var;
        this.f100847c = l1Var2;
    }

    @Override // pn2.l1
    public final boolean a() {
        return this.f100846b.a() || this.f100847c.a();
    }

    @Override // pn2.l1
    public final boolean b() {
        return this.f100846b.b() || this.f100847c.b();
    }

    @Override // pn2.l1
    public final bm2.i d(bm2.i annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return this.f100847c.d(this.f100846b.d(annotations));
    }

    @Override // pn2.l1
    public final g1 e(b0 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        g1 e13 = this.f100846b.e(key);
        return e13 == null ? this.f100847c.e(key) : e13;
    }

    @Override // pn2.l1
    public final b0 g(b0 topLevelType, w1 position) {
        Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
        Intrinsics.checkNotNullParameter(position, "position");
        return this.f100847c.g(this.f100846b.g(topLevelType, position), position);
    }
}
