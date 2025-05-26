package ul2;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v0 extends i0 {

    /* renamed from: b, reason: collision with root package name */
    public final Class f122618b;

    /* renamed from: c, reason: collision with root package name */
    public final xk2.k f122619c;

    public v0(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f122618b = jClass;
        this.f122619c = xk2.m.a(xk2.n.PUBLICATION, new tu1.u(this, 15));
    }

    @Override // kotlin.jvm.internal.g
    public final Class c() {
        return this.f122618b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v0) {
            if (Intrinsics.d(this.f122618b, ((v0) obj).f122618b)) {
                return true;
            }
        }
        return false;
    }

    @Override // ul2.i0
    public final Collection h() {
        return kotlin.collections.q0.f80391a;
    }

    public final int hashCode() {
        return this.f122618b.hashCode();
    }

    @Override // ul2.i0
    public final Collection i(ym2.g name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return ((t0) this.f122619c.getValue()).c().a(name, hm2.e.FROM_REFLECTION);
    }

    @Override // ul2.i0
    public final am2.r0 j(int i13) {
        xk2.w a13 = ((t0) this.f122619c.getValue()).a();
        if (a13 == null) {
            return null;
        }
        xm2.h hVar = (xm2.h) a13.f135234a;
        tm2.e0 e0Var = (tm2.e0) a13.f135235b;
        xm2.g gVar = (xm2.g) a13.f135236c;
        zm2.s packageLocalVariable = wm2.l.f130427n;
        Intrinsics.checkNotNullExpressionValue(packageLocalVariable, "packageLocalVariable");
        tm2.i0 i0Var = (tm2.i0) ao2.m0.x(e0Var, packageLocalVariable, i13);
        if (i0Var == null) {
            return null;
        }
        tm2.y0 y0Var = e0Var.f118228g;
        Intrinsics.checkNotNullExpressionValue(y0Var, "getTypeTable(...)");
        return (am2.r0) c2.f(this.f122618b, i0Var, hVar, new vm2.i(y0Var), gVar, u0.f122615a);
    }

    @Override // ul2.i0
    public final Class l() {
        Class b13 = ((t0) this.f122619c.getValue()).b();
        return b13 == null ? this.f122618b : b13;
    }

    @Override // ul2.i0
    public final Collection m(ym2.g name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return ((t0) this.f122619c.getValue()).c().d(name, hm2.e.FROM_REFLECTION);
    }

    public final String toString() {
        return "file class " + gm2.d.a(this.f122618b).b();
    }
}
