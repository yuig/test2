package ul2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class e1 extends o1 implements rl2.t {

    /* renamed from: n, reason: collision with root package name */
    public final xk2.k f122516n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(i0 container, am2.r0 descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        xk2.n nVar = xk2.n.PUBLICATION;
        this.f122516n = xk2.m.a(nVar, new d1(this, 0));
        xk2.m.a(nVar, new d1(this, 1));
    }

    @Override // rl2.t
    public final Object get(Object obj) {
        return ((c1) this.f122516n.getValue()).call(obj);
    }

    @Override // rl2.t
    public final rl2.s getGetter() {
        return (c1) this.f122516n.getValue();
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // ul2.o1
    public final k1 w() {
        return (c1) this.f122516n.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(i0 container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        xk2.n nVar = xk2.n.PUBLICATION;
        this.f122516n = xk2.m.a(nVar, new d1(this, 0));
        xk2.m.a(nVar, new d1(this, 1));
    }
}
