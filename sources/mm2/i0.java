package mm2;

import am2.r0;
import dm2.u0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes2.dex */
public final class i0 extends j0 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f87697p = 0;

    /* renamed from: n, reason: collision with root package name */
    public final pm2.g f87698n;

    /* renamed from: o, reason: collision with root package name */
    public final km2.c f87699o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(rg.a c13, pm2.g jClass, km2.c ownerDescriptor) {
        super(c13);
        Intrinsics.checkNotNullParameter(c13, "c");
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        this.f87698n = jClass;
        this.f87699o = ownerDescriptor;
    }

    public static r0 v(r0 r0Var) {
        if (r0Var.c().isReal()) {
            return r0Var;
        }
        Collection h10 = r0Var.h();
        Intrinsics.checkNotNullExpressionValue(h10, "getOverriddenDescriptors(...)");
        Collection<r0> collection = h10;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(collection, 10));
        for (r0 r0Var2 : collection) {
            Intrinsics.f(r0Var2);
            arrayList.add(v(r0Var2));
        }
        return (r0) CollectionsKt.s0(CollectionsKt.M(arrayList));
    }

    @Override // in2.o, in2.p
    public final am2.j e(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return null;
    }

    @Override // mm2.c0
    public final Set h(in2.g kindFilter, in2.k kVar) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return s0.f80394a;
    }

    @Override // mm2.c0
    public final Set i(in2.g kindFilter, in2.k kVar) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        LinkedHashSet I0 = CollectionsKt.I0(((c) this.f87646e.invoke()).a());
        km2.c cVar = this.f87699o;
        i0 t13 = ue.c.t(cVar);
        Set b13 = t13 != null ? t13.b() : null;
        if (b13 == null) {
            b13 = s0.f80394a;
        }
        I0.addAll(b13);
        if (((gm2.q) this.f87698n).f65786a.isEnum()) {
            I0.addAll(kotlin.collections.f0.j(xl2.r.f135323c, xl2.r.f135321a));
        }
        rg.a aVar = this.f87643b;
        I0.addAll(((gn2.a) ((lm2.a) aVar.f107929a).f83954x).g(aVar, cVar));
        return I0;
    }

    @Override // mm2.c0
    public final void j(ArrayList result, ym2.g name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        rg.a aVar = this.f87643b;
        ((gn2.a) ((lm2.a) aVar.f107929a).f83954x).d(aVar, this.f87699o, name, result);
    }

    @Override // mm2.c0
    public final c k() {
        return new a(this.f87698n, e0.f87662i);
    }

    @Override // mm2.c0
    public final void m(LinkedHashSet result, ym2.g name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        km2.c cVar = this.f87699o;
        i0 t13 = ue.c.t(cVar);
        Collection J0 = t13 == null ? s0.f80394a : CollectionsKt.J0(t13.a(name, hm2.e.WHEN_GET_SUPER_MEMBERS));
        lm2.a aVar = (lm2.a) this.f87643b.f107929a;
        LinkedHashSet d13 = l0.d1(name, J0, result, this.f87699o, aVar.f83936f, ((qn2.o) aVar.f83951u).f104515d);
        Intrinsics.checkNotNullExpressionValue(d13, "resolveOverridesForStaticMembers(...)");
        result.addAll(d13);
        if (((gm2.q) this.f87698n).f65786a.isEnum()) {
            if (Intrinsics.d(name, xl2.r.f135323c)) {
                u0 T = dl2.b.T(cVar);
                Intrinsics.checkNotNullExpressionValue(T, "createEnumValueOfMethod(...)");
                result.add(T);
            } else if (Intrinsics.d(name, xl2.r.f135321a)) {
                u0 U = dl2.b.U(cVar);
                Intrinsics.checkNotNullExpressionValue(U, "createEnumValuesMethod(...)");
                result.add(U);
            }
        }
    }

    @Override // mm2.j0, mm2.c0
    public final void n(ArrayList result, ym2.g name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        cd2.n nVar = new cd2.n(name, 12);
        km2.c cVar = this.f87699o;
        wn2.k.f(kotlin.collections.e0.b(cVar), d0.f87659a, new h0(cVar, linkedHashSet, nVar));
        boolean z13 = !result.isEmpty();
        rg.a aVar = this.f87643b;
        if (z13) {
            lm2.a aVar2 = (lm2.a) aVar.f107929a;
            LinkedHashSet d13 = l0.d1(name, linkedHashSet, result, this.f87699o, aVar2.f83936f, ((qn2.o) aVar2.f83951u).f104515d);
            Intrinsics.checkNotNullExpressionValue(d13, "resolveOverridesForStaticMembers(...)");
            result.addAll(d13);
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                r0 v13 = v((r0) obj);
                Object obj2 = linkedHashMap.get(v13);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(v13, obj2);
                }
                ((List) obj2).add(obj);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
                lm2.a aVar3 = (lm2.a) aVar.f107929a;
                LinkedHashSet d14 = l0.d1(name, collection, result, this.f87699o, aVar3.f83936f, ((qn2.o) aVar3.f83951u).f104515d);
                Intrinsics.checkNotNullExpressionValue(d14, "resolveOverridesForStaticMembers(...)");
                kotlin.collections.k0.u(d14, arrayList);
            }
            result.addAll(arrayList);
        }
        if (((gm2.q) this.f87698n).f65786a.isEnum() && Intrinsics.d(name, xl2.r.f135322b)) {
            wn2.k.b(dl2.b.S(cVar), result);
        }
    }

    @Override // mm2.c0
    public final Set o(in2.g kindFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        LinkedHashSet I0 = CollectionsKt.I0(((c) this.f87646e.invoke()).e());
        f0 f0Var = f0.f87671i;
        km2.c cVar = this.f87699o;
        wn2.k.f(kotlin.collections.e0.b(cVar), d0.f87659a, new h0(cVar, I0, f0Var));
        if (((gm2.q) this.f87698n).f65786a.isEnum()) {
            I0.add(xl2.r.f135322b);
        }
        return I0;
    }

    @Override // mm2.c0
    public final am2.m q() {
        return this.f87699o;
    }
}
