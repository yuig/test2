package ul2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z0 extends k1 implements rl2.q {

    /* renamed from: j, reason: collision with root package name */
    public final b1 f122649j;

    public z0(b1 property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.f122649j = property;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f122649j.get();
    }

    @Override // ul2.i1
    public final o1 v() {
        return this.f122649j;
    }
}
