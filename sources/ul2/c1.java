package ul2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c1 extends k1 implements rl2.s {

    /* renamed from: j, reason: collision with root package name */
    public final e1 f122504j;

    public c1(e1 property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.f122504j = property;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return this.f122504j.get(obj);
    }

    @Override // ul2.i1
    public final o1 v() {
        return this.f122504j;
    }
}
