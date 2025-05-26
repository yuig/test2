package ul2;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n0 extends m1 implements rl2.k {

    /* renamed from: j, reason: collision with root package name */
    public final o0 f122560j;

    public n0(o0 property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.f122560j = property;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((n0) this.f122560j.f122565o.getValue()).call(obj, obj2);
        return Unit.f80348a;
    }

    @Override // ul2.i1
    public final o1 v() {
        return this.f122560j;
    }
}
