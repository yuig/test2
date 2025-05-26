package nn2;

import am2.c0;
import am2.u0;
import am2.w0;
import br1.a0;
import dm2.t0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import lb.p0;
import ln2.f0;
import ln2.l0;
import pn2.b1;
import t3.s1;
import tm2.f1;
import tm2.g1;
import tm2.s0;
import tm2.y0;

/* loaded from: classes2.dex */
public final class j extends dm2.b implements am2.m {

    /* renamed from: e, reason: collision with root package name */
    public final tm2.k f91594e;

    /* renamed from: f, reason: collision with root package name */
    public final vm2.a f91595f;

    /* renamed from: g, reason: collision with root package name */
    public final w0 f91596g;

    /* renamed from: h, reason: collision with root package name */
    public final ym2.b f91597h;

    /* renamed from: i, reason: collision with root package name */
    public final c0 f91598i;

    /* renamed from: j, reason: collision with root package name */
    public final am2.r f91599j;

    /* renamed from: k, reason: collision with root package name */
    public final am2.h f91600k;

    /* renamed from: l, reason: collision with root package name */
    public final p0 f91601l;

    /* renamed from: m, reason: collision with root package name */
    public final in2.o f91602m;

    /* renamed from: n, reason: collision with root package name */
    public final mm2.h f91603n;

    /* renamed from: o, reason: collision with root package name */
    public final u0 f91604o;

    /* renamed from: p, reason: collision with root package name */
    public final com.google.firebase.messaging.q f91605p;

    /* renamed from: q, reason: collision with root package name */
    public final am2.m f91606q;

    /* renamed from: r, reason: collision with root package name */
    public final on2.j f91607r;

    /* renamed from: s, reason: collision with root package name */
    public final on2.l f91608s;

    /* renamed from: t, reason: collision with root package name */
    public final on2.j f91609t;

    /* renamed from: u, reason: collision with root package name */
    public final on2.l f91610u;

    /* renamed from: v, reason: collision with root package name */
    public final on2.j f91611v;

    /* renamed from: w, reason: collision with root package name */
    public final ln2.c0 f91612w;

    /* renamed from: x, reason: collision with root package name */
    public final bm2.i f91613x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p0 outerContext, tm2.k classProto, vm2.f nameResolver, vm2.a metadataVersion, w0 sourceElement) {
        super(outerContext.d(), bs1.c.s0(nameResolver, classProto.f118351e).i());
        am2.h hVar;
        com.google.firebase.messaging.q qVar;
        Intrinsics.checkNotNullParameter(outerContext, "outerContext");
        Intrinsics.checkNotNullParameter(classProto, "classProto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(sourceElement, "sourceElement");
        this.f91594e = classProto;
        this.f91595f = metadataVersion;
        this.f91596g = sourceElement;
        this.f91597h = bs1.c.s0(nameResolver, classProto.f118351e);
        this.f91598i = ln2.p.f((tm2.c0) vm2.e.f126223e.d(classProto.f118350d));
        this.f91599j = dl2.b.f0((g1) vm2.e.f126222d.d(classProto.f118350d));
        tm2.j jVar = (tm2.j) vm2.e.f126224f.d(classProto.f118350d);
        switch (jVar == null ? -1 : f0.f84079b[jVar.ordinal()]) {
            case 1:
                hVar = am2.h.CLASS;
                break;
            case 2:
                hVar = am2.h.INTERFACE;
                break;
            case 3:
                hVar = am2.h.ENUM_CLASS;
                break;
            case 4:
                hVar = am2.h.ENUM_ENTRY;
                break;
            case 5:
                hVar = am2.h.ANNOTATION_CLASS;
                break;
            case 6:
            case 7:
                hVar = am2.h.OBJECT;
                break;
            default:
                hVar = am2.h.CLASS;
                break;
        }
        this.f91600k = hVar;
        List list = classProto.f118353g;
        Intrinsics.checkNotNullExpressionValue(list, "getTypeParameterList(...)");
        y0 y0Var = classProto.E;
        Intrinsics.checkNotNullExpressionValue(y0Var, "getTypeTable(...)");
        vm2.i iVar = new vm2.i(y0Var);
        vm2.j jVar2 = vm2.j.f126249b;
        f1 f1Var = classProto.G;
        Intrinsics.checkNotNullExpressionValue(f1Var, "getVersionRequirementTable(...)");
        p0 a13 = outerContext.a(this, list, nameResolver, iVar, re2.h.h(f1Var), metadataVersion);
        this.f91601l = a13;
        am2.h hVar2 = am2.h.ENUM_CLASS;
        int i13 = 1;
        Object obj = a13.f82653b;
        this.f91602m = hVar == hVar2 ? new in2.r(a13.d(), this, s1.k(vm2.e.f126231m, classProto.f118350d, "get(...)") || Intrinsics.d(((ln2.o) obj).f84125r.d(), Boolean.TRUE)) : in2.m.f72874b;
        this.f91603n = new mm2.h(this);
        re2.f fVar = u0.f15593e;
        on2.u storageManager = a13.d();
        ((qn2.o) ((ln2.o) obj).f84123p).getClass();
        i scopeFactory = new i(1, this);
        fVar.getClass();
        qn2.h kotlinTypeRefinerForOwnerModule = qn2.h.f104498a;
        Intrinsics.checkNotNullParameter(this, "classDescriptor");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(kotlinTypeRefinerForOwnerModule, "kotlinTypeRefinerForOwnerModule");
        Intrinsics.checkNotNullParameter(scopeFactory, "scopeFactory");
        this.f91604o = new u0(this, storageManager, scopeFactory);
        if (hVar == hVar2) {
            qVar = new com.google.firebase.messaging.q();
            qVar.f33806d = this;
            List list2 = classProto.f118366t;
            Intrinsics.checkNotNullExpressionValue(list2, "getEnumEntryList(...)");
            List list3 = list2;
            j jVar3 = (j) qVar.f33806d;
            int a14 = kotlin.collections.y0.a(g0.q(list3, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(a14 < 16 ? 16 : a14);
            for (Object obj2 : list3) {
                linkedHashMap.put(bs1.c.L0((vm2.f) jVar3.f91601l.f82654c, ((tm2.v) obj2).f118511d), obj2);
            }
            qVar.f33803a = linkedHashMap;
            qVar.f33804b = ((on2.q) ((j) qVar.f33806d).f91601l.d()).e(new a0(12, qVar, (j) qVar.f33806d));
            on2.u d2 = ((j) qVar.f33806d).f91601l.d();
            tu1.u uVar = new tu1.u(qVar, 28);
            on2.q qVar2 = (on2.q) d2;
            qVar2.getClass();
            qVar.f33805c = new on2.l(qVar2, uVar);
        } else {
            qVar = null;
        }
        this.f91605p = qVar;
        am2.m mVar = (am2.m) outerContext.f82655d;
        this.f91606q = mVar;
        on2.u d13 = this.f91601l.d();
        g gVar = new g(this, 4);
        on2.q qVar3 = (on2.q) d13;
        qVar3.getClass();
        this.f91607r = new on2.j(qVar3, gVar);
        on2.u d14 = this.f91601l.d();
        g gVar2 = new g(this, 3);
        on2.q qVar4 = (on2.q) d14;
        qVar4.getClass();
        this.f91608s = new on2.l(qVar4, gVar2);
        on2.u d15 = this.f91601l.d();
        g gVar3 = new g(this, 2);
        on2.q qVar5 = (on2.q) d15;
        qVar5.getClass();
        this.f91609t = new on2.j(qVar5, gVar3);
        on2.u d16 = this.f91601l.d();
        g gVar4 = new g(this, 5);
        on2.q qVar6 = (on2.q) d16;
        qVar6.getClass();
        this.f91610u = new on2.l(qVar6, gVar4);
        on2.u d17 = this.f91601l.d();
        g gVar5 = new g(this, 6);
        on2.q qVar7 = (on2.q) d17;
        qVar7.getClass();
        this.f91611v = new on2.j(qVar7, gVar5);
        tm2.k kVar = this.f91594e;
        p0 p0Var = this.f91601l;
        vm2.f fVar2 = (vm2.f) p0Var.f82654c;
        vm2.i iVar2 = (vm2.i) p0Var.f82656e;
        w0 w0Var = this.f91596g;
        j jVar4 = mVar instanceof j ? (j) mVar : null;
        this.f91612w = new ln2.c0(kVar, fVar2, iVar2, w0Var, jVar4 != null ? jVar4.f91612w : null);
        this.f91613x = !vm2.e.f126221c.c(this.f91594e.f118350d).booleanValue() ? bm2.h.f23540a : new x(this.f91601l.d(), new g(this, i13));
    }

    @Override // am2.g
    public final am2.g1 J() {
        return (am2.g1) this.f91611v.invoke();
    }

    @Override // am2.a0
    public final boolean M() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // dm2.b, am2.g
    public final List N() {
        p0 p0Var = this.f91601l;
        vm2.i typeTable = (vm2.i) p0Var.f82656e;
        tm2.k kVar = this.f91594e;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List list = kVar.f118359m;
        boolean z13 = !list.isEmpty();
        ?? r33 = list;
        if (!z13) {
            r33 = 0;
        }
        if (r33 == 0) {
            List list2 = kVar.f118360n;
            Intrinsics.checkNotNullExpressionValue(list2, "getContextReceiverTypeIdList(...)");
            List<Integer> list3 = list2;
            r33 = new ArrayList(g0.q(list3, 10));
            for (Integer num : list3) {
                Intrinsics.f(num);
                r33.add(typeTable.a(num.intValue()));
            }
        }
        Iterable iterable = (Iterable) r33;
        ArrayList arrayList = new ArrayList(g0.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new t0(t0(), new jn2.b(this, ((l0) p0Var.f82659h).g((s0) it.next()), (ym2.g) null), bm2.h.f23540a));
        }
        return arrayList;
    }

    @Override // am2.g
    public final boolean P() {
        return vm2.e.f126224f.d(this.f91594e.f118350d) == tm2.j.COMPANION_OBJECT;
    }

    @Override // am2.g
    public final boolean S() {
        return s1.k(vm2.e.f126230l, this.f91594e.f118350d, "get(...)");
    }

    @Override // am2.g
    public final boolean Y() {
        return s1.k(vm2.e.f126229k, this.f91594e.f118350d, "get(...)") && this.f91595f.a(1, 4, 2);
    }

    @Override // am2.a0
    public final boolean Z() {
        return s1.k(vm2.e.f126228j, this.f91594e.f118350d, "get(...)");
    }

    @Override // dm2.f0
    public final in2.n a0(qn2.i kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f91604o.a(kotlinTypeRefiner);
    }

    @Override // am2.n
    public final w0 b() {
        return this.f91596g;
    }

    @Override // am2.g
    public final in2.n b0() {
        return this.f91602m;
    }

    @Override // am2.g
    public final am2.h c() {
        return this.f91600k;
    }

    @Override // am2.g
    public final am2.g c0() {
        return (am2.g) this.f91609t.invoke();
    }

    @Override // am2.j
    public final b1 e() {
        return this.f91603n;
    }

    @Override // am2.m
    public final am2.m g() {
        return this.f91606q;
    }

    @Override // bm2.a
    public final bm2.i getAnnotations() {
        return this.f91613x;
    }

    @Override // am2.g, am2.p
    public final am2.q getVisibility() {
        return this.f91599j;
    }

    @Override // am2.a0
    public final boolean isExternal() {
        return s1.k(vm2.e.f126227i, this.f91594e.f118350d, "get(...)");
    }

    @Override // am2.g
    public final boolean isInline() {
        return s1.k(vm2.e.f126229k, this.f91594e.f118350d, "get(...)") && this.f91595f.b();
    }

    @Override // am2.g, am2.k
    public final List k() {
        return ((l0) this.f91601l.f82659h).b();
    }

    @Override // am2.g, am2.a0
    public final c0 l() {
        return this.f91598i;
    }

    @Override // am2.g
    public final Collection n() {
        return (Collection) this.f91608s.invoke();
    }

    @Override // am2.g
    public final Collection p() {
        return (Collection) this.f91610u.invoke();
    }

    @Override // am2.k
    public final boolean q() {
        return s1.k(vm2.e.f126225g, this.f91594e.f118350d, "get(...)");
    }

    @Override // am2.g
    public final boolean s0() {
        return s1.k(vm2.e.f126226h, this.f91594e.f118350d, "get(...)");
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("deserialized ");
        sb3.append(Z() ? "expect " : "");
        sb3.append("class ");
        sb3.append(getName());
        return sb3.toString();
    }

    @Override // am2.g
    public final am2.f u() {
        return (am2.f) this.f91607r.invoke();
    }

    public final f u0() {
        ((qn2.o) ((ln2.o) this.f91601l.f82653b).f84123p).getClass();
        return (f) this.f91604o.a(qn2.h.f104498a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
    
        if (r1 == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final pn2.h0 v0(ym2.g r6) {
        /*
            r5 = this;
            nn2.f r0 = r5.u0()
            hm2.e r1 = hm2.e.FROM_DESERIALIZATION
            java.util.Collection r6 = r0.d(r6, r1)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
            r0 = 0
            r1 = 0
            r2 = r0
        L13:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r6.next()
            r4 = r3
            am2.r0 r4 = (am2.r0) r4
            dm2.d r4 = r4.D()
            if (r4 != 0) goto L13
            if (r1 == 0) goto L2a
        L28:
            r2 = r0
            goto L30
        L2a:
            r1 = 1
            r2 = r3
            goto L13
        L2d:
            if (r1 != 0) goto L30
            goto L28
        L30:
            am2.r0 r2 = (am2.r0) r2
            if (r2 == 0) goto L38
            pn2.b0 r0 = r2.getType()
        L38:
            pn2.h0 r0 = (pn2.h0) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nn2.j.v0(ym2.g):pn2.h0");
    }
}
