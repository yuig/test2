package mm2;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kh2.p2;
import kotlin.collections.q0;
import kotlin.collections.s0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;

/* loaded from: classes2.dex */
public final class d implements in2.n {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f87654f;

    /* renamed from: b, reason: collision with root package name */
    public final rg.a f87655b;

    /* renamed from: c, reason: collision with root package name */
    public final r f87656c;

    /* renamed from: d, reason: collision with root package name */
    public final w f87657d;

    /* renamed from: e, reason: collision with root package name */
    public final on2.l f87658e;

    static {
        l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        f87654f = new rl2.u[]{l0Var.g(new kotlin.jvm.internal.d0(l0Var.b(d.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
    }

    public d(rg.a c13, gm2.a0 jPackage, r packageFragment) {
        Intrinsics.checkNotNullParameter(c13, "c");
        Intrinsics.checkNotNullParameter(jPackage, "jPackage");
        Intrinsics.checkNotNullParameter(packageFragment, "packageFragment");
        this.f87655b = c13;
        this.f87656c = packageFragment;
        this.f87657d = new w(c13, jPackage, packageFragment);
        on2.u c14 = c13.c();
        tu1.u uVar = new tu1.u(this, 22);
        on2.q qVar = (on2.q) c14;
        qVar.getClass();
        this.f87658e = new on2.l(qVar, uVar);
    }

    @Override // in2.n
    public final Collection a(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        i(name, location);
        in2.n[] h10 = h();
        Collection a13 = this.f87657d.a(name, location);
        for (in2.n nVar : h10) {
            a13 = ue.c.k(a13, nVar.a(name, location));
        }
        return a13 == null ? s0.f80394a : a13;
    }

    @Override // in2.n
    public final Set b() {
        in2.n[] h10 = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (in2.n nVar : h10) {
            kotlin.collections.k0.u(nVar.b(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f87657d.b());
        return linkedHashSet;
    }

    @Override // in2.n
    public final Set c() {
        in2.n[] h10 = h();
        Intrinsics.checkNotNullParameter(h10, "<this>");
        HashSet g03 = p2.g0(h10.length == 0 ? q0.f80391a : new kotlin.collections.a0(h10, 0));
        if (g03 == null) {
            return null;
        }
        g03.addAll(this.f87657d.c());
        return g03;
    }

    @Override // in2.n
    public final Collection d(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        i(name, location);
        in2.n[] h10 = h();
        Collection d2 = this.f87657d.d(name, location);
        for (in2.n nVar : h10) {
            d2 = ue.c.k(d2, nVar.d(name, location));
        }
        return d2 == null ? s0.f80394a : d2;
    }

    @Override // in2.p
    public final am2.j e(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        i(name, location);
        w wVar = this.f87657d;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        am2.j jVar = null;
        am2.g w13 = wVar.w(name, null);
        if (w13 != null) {
            return w13;
        }
        for (in2.n nVar : h()) {
            am2.j e13 = nVar.e(name, location);
            if (e13 != null) {
                if (!(e13 instanceof am2.k) || !((am2.k) e13).Z()) {
                    return e13;
                }
                if (jVar == null) {
                    jVar = e13;
                }
            }
        }
        return jVar;
    }

    @Override // in2.n
    public final Set f() {
        in2.n[] h10 = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (in2.n nVar : h10) {
            kotlin.collections.k0.u(nVar.f(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f87657d.f());
        return linkedHashSet;
    }

    @Override // in2.p
    public final Collection g(in2.g kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        in2.n[] h10 = h();
        Collection g13 = this.f87657d.g(kindFilter, nameFilter);
        for (in2.n nVar : h10) {
            g13 = ue.c.k(g13, nVar.g(kindFilter, nameFilter));
        }
        return g13 == null ? s0.f80394a : g13;
    }

    public final in2.n[] h() {
        return (in2.n[]) lb.l0.B0(this.f87658e, f87654f[0]);
    }

    public final void i(ym2.g name, hm2.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        dl2.b.q2(((lm2.a) this.f87655b.f107929a).f83944n, (hm2.e) location, this.f87656c, name);
    }

    public final String toString() {
        return "scope for " + this.f87656c;
    }
}
