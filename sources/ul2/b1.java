package ul2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class b1 extends o1 implements rl2.r {

    /* renamed from: n, reason: collision with root package name */
    public final xk2.k f122496n;

    /* renamed from: o, reason: collision with root package name */
    public final xk2.k f122497o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(i0 container, am2.r0 descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        xk2.n nVar = xk2.n.PUBLICATION;
        this.f122496n = xk2.m.a(nVar, new a1(this, 0));
        this.f122497o = xk2.m.a(nVar, new a1(this, 1));
    }

    @Override // rl2.r
    public final Object get() {
        return ((z0) this.f122496n.getValue()).call(new Object[0]);
    }

    @Override // rl2.r
    public final Object getDelegate() {
        return this.f122497o.getValue();
    }

    @Override // rl2.r
    public final rl2.q getGetter() {
        return (z0) this.f122496n.getValue();
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return get();
    }

    @Override // ul2.o1
    public final k1 w() {
        return (z0) this.f122496n.getValue();
    }

    public final rl2.p x() {
        return (z0) this.f122496n.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(i0 container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        xk2.n nVar = xk2.n.PUBLICATION;
        this.f122496n = xk2.m.a(nVar, new a1(this, 0));
        this.f122497o = xk2.m.a(nVar, new a1(this, 1));
    }
}
