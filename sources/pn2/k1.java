package pn2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k1 extends l1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f100812b;

    public k1(l1 l1Var) {
        this.f100812b = l1Var;
    }

    @Override // pn2.l1
    public final bm2.i d(bm2.i annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return this.f100812b.d(annotations);
    }

    @Override // pn2.l1
    public final g1 e(b0 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f100812b.e(key);
    }

    @Override // pn2.l1
    public final boolean f() {
        return this.f100812b.f();
    }

    @Override // pn2.l1
    public final b0 g(b0 topLevelType, w1 position) {
        Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
        Intrinsics.checkNotNullParameter(position, "position");
        return this.f100812b.g(topLevelType, position);
    }
}
