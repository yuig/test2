package nn2;

import am2.b1;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.l0;
import tm2.a0;
import tm2.i0;
import tm2.u0;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ rl2.u[] f91619j;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f91620a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f91621b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f91622c;

    /* renamed from: d, reason: collision with root package name */
    public final on2.n f91623d;

    /* renamed from: e, reason: collision with root package name */
    public final on2.n f91624e;

    /* renamed from: f, reason: collision with root package name */
    public final on2.m f91625f;

    /* renamed from: g, reason: collision with root package name */
    public final on2.l f91626g;

    /* renamed from: h, reason: collision with root package name */
    public final on2.l f91627h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q f91628i;

    static {
        l0 l0Var = k0.f80436a;
        f91619j = new rl2.u[]{l0Var.g(new d0(l0Var.b(p.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), l0Var.g(new d0(l0Var.b(p.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};
    }

    public p(q qVar, List functionList, List propertyList, List typeAliasList) {
        Intrinsics.checkNotNullParameter(functionList, "functionList");
        Intrinsics.checkNotNullParameter(propertyList, "propertyList");
        Intrinsics.checkNotNullParameter(typeAliasList, "typeAliasList");
        this.f91628i = qVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : functionList) {
            ym2.g L0 = bs1.c.L0((vm2.f) qVar.f91630b.f82654c, ((a0) ((zm2.c) obj)).f118148f);
            Object obj2 = linkedHashMap.get(L0);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(L0, obj2);
            }
            ((List) obj2).add(obj);
        }
        this.f91620a = d(linkedHashMap);
        q qVar2 = this.f91628i;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj3 : propertyList) {
            ym2.g L02 = bs1.c.L0((vm2.f) qVar2.f91630b.f82654c, ((i0) ((zm2.c) obj3)).f118328f);
            Object obj4 = linkedHashMap2.get(L02);
            if (obj4 == null) {
                obj4 = new ArrayList();
                linkedHashMap2.put(L02, obj4);
            }
            ((List) obj4).add(obj3);
        }
        this.f91621b = d(linkedHashMap2);
        ((ln2.o) this.f91628i.f91630b.f82653b).f84110c.getClass();
        q qVar3 = this.f91628i;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj5 : typeAliasList) {
            ym2.g L03 = bs1.c.L0((vm2.f) qVar3.f91630b.f82654c, ((u0) ((zm2.c) obj5)).p());
            Object obj6 = linkedHashMap3.get(L03);
            if (obj6 == null) {
                obj6 = new ArrayList();
                linkedHashMap3.put(L03, obj6);
            }
            ((List) obj6).add(obj5);
        }
        this.f91622c = d(linkedHashMap3);
        int i13 = 0;
        this.f91623d = ((on2.q) this.f91628i.f91630b.d()).d(new o(this, i13));
        int i14 = 1;
        this.f91624e = ((on2.q) this.f91628i.f91630b.d()).d(new o(this, i14));
        this.f91625f = ((on2.q) this.f91628i.f91630b.d()).e(new o(this, 2));
        on2.u d2 = this.f91628i.f91630b.d();
        n nVar = new n(this, this.f91628i, i13);
        on2.q qVar4 = (on2.q) d2;
        qVar4.getClass();
        this.f91626g = new on2.l(qVar4, nVar);
        on2.u d13 = this.f91628i.f91630b.d();
        n nVar2 = new n(this, this.f91628i, i14);
        on2.q qVar5 = (on2.q) d13;
        qVar5.getClass();
        this.f91627h = new on2.l(qVar5, nVar2);
    }

    public static LinkedHashMap d(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(y0.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<zm2.c> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(g0.q(iterable, 10));
            for (zm2.c cVar : iterable) {
                int a13 = cVar.a();
                int k13 = zm2.i.k(a13) + a13;
                if (k13 > 4096) {
                    k13 = 4096;
                }
                zm2.i u13 = zm2.i.u(byteArrayOutputStream, k13);
                u13.P(a13);
                cVar.d(u13);
                u13.t();
                arrayList.add(Unit.f80348a);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }

    public final Collection a(ym2.g name, hm2.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return !((Set) lb.l0.B0(this.f91626g, f91619j[0])).contains(name) ? q0.f80391a : (Collection) this.f91623d.invoke(name);
    }

    public final Collection b(ym2.g name, hm2.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return !((Set) lb.l0.B0(this.f91627h, f91619j[1])).contains(name) ? q0.f80391a : (Collection) this.f91624e.invoke(name);
    }

    public final b1 c(ym2.g name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (b1) this.f91625f.invoke(name);
    }
}
