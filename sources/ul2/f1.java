package ul2;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f1 extends k1 implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public final h1 f122518j;

    public f1(h1 property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.f122518j = property;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f1) this.f122518j.f122529n.getValue()).call(obj, obj2);
    }

    @Override // ul2.i1
    public final o1 v() {
        return this.f122518j;
    }
}
