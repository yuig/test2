package dm2;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f implements pn2.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f55417a;

    public f(g gVar) {
        this.f55417a = gVar;
    }

    @Override // pn2.b1
    public final am2.j b() {
        return this.f55417a;
    }

    @Override // pn2.b1
    public final Collection c() {
        Collection c13 = ((nn2.u) this.f55417a).v0().w0().c();
        Intrinsics.checkNotNullExpressionValue(c13, "getSupertypes(...)");
        return c13;
    }

    @Override // pn2.b1
    public final boolean d() {
        return true;
    }

    @Override // pn2.b1
    public final xl2.l f() {
        return fn2.d.e(this.f55417a);
    }

    @Override // pn2.b1
    public final List getParameters() {
        List list = ((nn2.u) this.f55417a).f91644p;
        if (list != null) {
            return list;
        }
        Intrinsics.r("typeConstructorParameters");
        throw null;
    }

    public final String toString() {
        return "[typealias " + this.f55417a.getName().b() + ']';
    }
}
