package ul2;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class h1 extends o1 implements Function2 {

    /* renamed from: n, reason: collision with root package name */
    public final xk2.k f122529n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(i0 container, am2.r0 descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        xk2.n nVar = xk2.n.PUBLICATION;
        this.f122529n = xk2.m.a(nVar, new g1(this, 0));
        xk2.m.a(nVar, new g1(this, 1));
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f1) this.f122529n.getValue()).call(obj, obj2);
    }

    @Override // ul2.o1
    public final k1 w() {
        return (f1) this.f122529n.getValue();
    }
}
