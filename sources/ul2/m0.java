package ul2;

import kh2.g2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m0 extends b1 implements rl2.j {

    /* renamed from: p, reason: collision with root package name */
    public final xk2.k f122555p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(i0 container, am2.r0 descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f122555p = xk2.m.a(xk2.n.PUBLICATION, new g2(this, 7));
    }

    @Override // rl2.m
    public final rl2.h getSetter() {
        return (l0) this.f122555p.getValue();
    }

    @Override // rl2.j
    public final void set(Object obj) {
        ((l0) this.f122555p.getValue()).call(obj);
    }

    @Override // rl2.j, rl2.m
    public final rl2.i getSetter() {
        return (l0) this.f122555p.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(i0 container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.f122555p = xk2.m.a(xk2.n.PUBLICATION, new g2(this, 7));
    }
}
