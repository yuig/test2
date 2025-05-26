package ul2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o0 extends e1 implements rl2.l {

    /* renamed from: o, reason: collision with root package name */
    public final xk2.k f122565o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(i0 container, am2.r0 descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f122565o = xk2.m.a(xk2.n.PUBLICATION, new tu1.u(this, 14));
    }

    @Override // rl2.m
    public final rl2.h getSetter() {
        return (n0) this.f122565o.getValue();
    }

    @Override // rl2.l, rl2.m
    public final rl2.k getSetter() {
        return (n0) this.f122565o.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(i0 container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.f122565o = xk2.m.a(xk2.n.PUBLICATION, new tu1.u(this, 14));
    }
}
