package ul2;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p0 extends m1 implements kl2.l {

    /* renamed from: j, reason: collision with root package name */
    public final q0 f122579j;

    public p0(q0 property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.f122579j = property;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((p0) this.f122579j.f122583o.getValue()).call(obj, obj2, obj3);
        return Unit.f80348a;
    }

    @Override // ul2.i1
    public final o1 v() {
        return this.f122579j;
    }
}
