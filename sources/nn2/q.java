package nn2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import lb.p0;

/* loaded from: classes2.dex */
public abstract class q extends in2.o {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f91629f;

    /* renamed from: b, reason: collision with root package name */
    public final p0 f91630b;

    /* renamed from: c, reason: collision with root package name */
    public final p f91631c;

    /* renamed from: d, reason: collision with root package name */
    public final on2.l f91632d;

    /* renamed from: e, reason: collision with root package name */
    public final on2.j f91633e;

    static {
        l0 l0Var = k0.f80436a;
        f91629f = new rl2.u[]{l0Var.g(new d0(l0Var.b(q.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), l0Var.g(new d0(l0Var.b(q.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};
    }

    public q(p0 c13, List functionList, List propertyList, List typeAliasList, Function0 classNames) {
        Intrinsics.checkNotNullParameter(c13, "c");
        Intrinsics.checkNotNullParameter(functionList, "functionList");
        Intrinsics.checkNotNullParameter(propertyList, "propertyList");
        Intrinsics.checkNotNullParameter(typeAliasList, "typeAliasList");
        Intrinsics.checkNotNullParameter(classNames, "classNames");
        this.f91630b = c13;
        ((ln2.o) c13.f82653b).f84110c.getClass();
        this.f91631c = new p(this, functionList, propertyList, typeAliasList);
        on2.u d2 = c13.d();
        d6.e eVar = new d6.e(6, classNames);
        on2.q qVar = (on2.q) d2;
        qVar.getClass();
        this.f91632d = new on2.l(qVar, eVar);
        on2.u d13 = c13.d();
        tu1.u uVar = new tu1.u(this, 29);
        on2.q qVar2 = (on2.q) d13;
        qVar2.getClass();
        this.f91633e = new on2.j(qVar2, uVar);
    }

    @Override // in2.o, in2.n
    public Collection a(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return this.f91631c.a(name, location);
    }

    @Override // in2.o, in2.n
    public final Set b() {
        return (Set) lb.l0.B0(this.f91631c.f91626g, p.f91619j[0]);
    }

    @Override // in2.o, in2.n
    public final Set c() {
        on2.j jVar = this.f91633e;
        rl2.u p13 = f91629f[1];
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(p13, "p");
        return (Set) jVar.invoke();
    }

    @Override // in2.o, in2.n
    public Collection d(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return this.f91631c.b(name, location);
    }

    @Override // in2.o, in2.p
    public am2.j e(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        if (q(name)) {
            return ((ln2.o) this.f91630b.f82653b).b(l(name));
        }
        p pVar = this.f91631c;
        if (pVar.f91622c.keySet().contains(name)) {
            return pVar.c(name);
        }
        return null;
    }

    @Override // in2.o, in2.n
    public final Set f() {
        return (Set) lb.l0.B0(this.f91631c.f91627h, p.f91619j[1]);
    }

    public abstract void h(ArrayList arrayList, Function1 function1);

    public final Collection i(in2.g kindFilter, Function1 nameFilter, hm2.e location) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        Intrinsics.checkNotNullParameter(location, "location");
        ArrayList result = new ArrayList(0);
        if (kindFilter.a(in2.g.f72851e)) {
            h(result, nameFilter);
        }
        p pVar = this.f91631c;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        Intrinsics.checkNotNullParameter(location, "location");
        boolean a13 = kindFilter.a(in2.g.f72855i);
        bn2.j INSTANCE = bn2.j.f23581a;
        if (a13) {
            Set<ym2.g> set = (Set) lb.l0.B0(pVar.f91627h, p.f91619j[1]);
            ArrayList arrayList = new ArrayList();
            for (ym2.g gVar : set) {
                if (((Boolean) nameFilter.invoke(gVar)).booleanValue()) {
                    arrayList.addAll(pVar.b(gVar, location));
                }
            }
            Intrinsics.checkNotNullExpressionValue(INSTANCE, "INSTANCE");
            j0.t(arrayList, INSTANCE);
            result.addAll(arrayList);
        }
        if (kindFilter.a(in2.g.f72854h)) {
            Set<ym2.g> set2 = (Set) lb.l0.B0(pVar.f91626g, p.f91619j[0]);
            ArrayList arrayList2 = new ArrayList();
            for (ym2.g gVar2 : set2) {
                if (((Boolean) nameFilter.invoke(gVar2)).booleanValue()) {
                    arrayList2.addAll(pVar.a(gVar2, location));
                }
            }
            Intrinsics.checkNotNullExpressionValue(INSTANCE, "INSTANCE");
            j0.t(arrayList2, INSTANCE);
            result.addAll(arrayList2);
        }
        if (kindFilter.a(in2.g.f72857k)) {
            for (ym2.g gVar3 : m()) {
                if (((Boolean) nameFilter.invoke(gVar3)).booleanValue()) {
                    wn2.k.b(((ln2.o) this.f91630b.f82653b).b(l(gVar3)), result);
                }
            }
        }
        if (kindFilter.a(in2.g.f72852f)) {
            for (ym2.g gVar4 : pVar.f91622c.keySet()) {
                if (((Boolean) nameFilter.invoke(gVar4)).booleanValue()) {
                    wn2.k.b(pVar.c(gVar4), result);
                }
            }
        }
        return wn2.k.e(result);
    }

    public void j(ym2.g name, ArrayList functions) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(functions, "functions");
    }

    public void k(ym2.g name, ArrayList descriptors) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
    }

    public abstract ym2.b l(ym2.g gVar);

    public final Set m() {
        return (Set) lb.l0.B0(this.f91632d, f91629f[0]);
    }

    public abstract Set n();

    public abstract Set o();

    public abstract Set p();

    public boolean q(ym2.g name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return m().contains(name);
    }

    public boolean r(t function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return true;
    }
}
