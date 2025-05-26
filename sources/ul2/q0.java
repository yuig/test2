package ul2;

import kh2.g2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q0 extends h1 implements rl2.m {

    /* renamed from: o, reason: collision with root package name */
    public final xk2.k f122583o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(i0 container, am2.r0 descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f122583o = xk2.m.a(xk2.n.PUBLICATION, new g2(this, 8));
    }

    @Override // rl2.m
    public final rl2.h getSetter() {
        return (p0) this.f122583o.getValue();
    }
}
