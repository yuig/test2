package mm2;

import i2.j2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.p0;
import kotlin.collections.q0;
import kotlin.collections.s0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w extends j0 {

    /* renamed from: n, reason: collision with root package name */
    public final gm2.a0 f87734n;

    /* renamed from: o, reason: collision with root package name */
    public final r f87735o;

    /* renamed from: p, reason: collision with root package name */
    public final on2.j f87736p;

    /* renamed from: q, reason: collision with root package name */
    public final on2.m f87737q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(rg.a c13, gm2.a0 jPackage, r ownerDescriptor) {
        super(c13);
        Intrinsics.checkNotNullParameter(c13, "c");
        Intrinsics.checkNotNullParameter(jPackage, "jPackage");
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        this.f87734n = jPackage;
        this.f87735o = ownerDescriptor;
        on2.u c14 = c13.c();
        j2 j2Var = new j2(26, c13, this);
        on2.q qVar = (on2.q) c14;
        qVar.getClass();
        this.f87736p = new on2.j(qVar, j2Var);
        this.f87737q = ((on2.q) c13.c()).e(new br1.a0(8, this, c13));
    }

    public static final xm2.g v(w wVar) {
        return wn2.k.i(((lm2.a) wVar.f87643b.f107929a).f83934d.c().f84110c);
    }

    @Override // mm2.c0, in2.o, in2.n
    public final Collection d(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return q0.f80391a;
    }

    @Override // in2.o, in2.p
    public final am2.j e(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return w(name, null);
    }

    @Override // mm2.c0, in2.o, in2.p
    public final Collection g(in2.g kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        if (!kindFilter.a(in2.g.f72857k | in2.g.f72850d)) {
            return q0.f80391a;
        }
        Iterable iterable = (Iterable) this.f87645d.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            am2.m mVar = (am2.m) obj;
            if (mVar instanceof am2.g) {
                ym2.g name = ((am2.g) mVar).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (((Boolean) nameFilter.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // mm2.c0
    public final Set h(in2.g kindFilter, in2.k kVar) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        if (!kindFilter.a(in2.g.f72850d)) {
            return s0.f80394a;
        }
        Set set = (Set) this.f87736p.invoke();
        kotlin.jvm.internal.s nameFilter = kVar;
        if (set != null) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(ym2.g.e((String) it.next()));
            }
            return hashSet;
        }
        if (kVar == null) {
            nameFilter = wn2.b.f130594i;
        }
        this.f87734n.getClass();
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        q0 q0Var = q0.f80391a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        q0Var.getClass();
        p0.f80390a.getClass();
        return linkedHashSet;
    }

    @Override // mm2.c0
    public final Set i(in2.g kindFilter, in2.k kVar) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return s0.f80394a;
    }

    @Override // mm2.c0
    public final c k() {
        return b.f87640a;
    }

    @Override // mm2.c0
    public final void m(LinkedHashSet result, ym2.g name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
    }

    @Override // mm2.c0
    public final Set o(in2.g kindFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return s0.f80394a;
    }

    @Override // mm2.c0
    public final am2.m q() {
        return this.f87735o;
    }

    public final am2.g w(ym2.g name, pm2.g gVar) {
        ym2.g gVar2 = ym2.i.f139482a;
        Intrinsics.checkNotNullParameter(name, "name");
        String b13 = name.b();
        Intrinsics.checkNotNullExpressionValue(b13, "asString(...)");
        if (b13.length() <= 0 || name.f139479b) {
            return null;
        }
        Set set = (Set) this.f87736p.invoke();
        if (gVar != null || set == null || set.contains(name.b())) {
            return (am2.g) this.f87737q.invoke(new s(name, gVar));
        }
        return null;
    }
}
