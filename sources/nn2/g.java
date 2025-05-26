package nn2;

import am2.c0;
import am2.e0;
import am2.i1;
import am2.w0;
import am2.y;
import dm2.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import lb.p0;
import ln2.a0;
import pn2.h0;
import t3.s1;
import tm2.s0;

/* loaded from: classes2.dex */
public final class g extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91591i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f91592j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(j jVar, int i13) {
        super(0);
        this.f91591i = i13;
        this.f91592j = jVar;
    }

    public final Collection b() {
        int i13 = this.f91591i;
        j jVar = this.f91592j;
        switch (i13) {
            case 3:
                List list = jVar.f91594e.f118362p;
                Intrinsics.checkNotNullExpressionValue(list, "getConstructorList(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (s1.k(vm2.e.f126232n, ((tm2.m) obj).f118390d, "get(...)")) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(g0.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    p0 p0Var = jVar.f91601l;
                    if (!hasNext) {
                        return CollectionsKt.l0(((ln2.o) p0Var.f82653b).f84120m.a(jVar), CollectionsKt.l0(f0.k(jVar.u()), arrayList2));
                    }
                    tm2.m mVar = (tm2.m) it.next();
                    a0 a0Var = (a0) p0Var.f82660i;
                    Intrinsics.f(mVar);
                    arrayList2.add(a0Var.d(mVar, false));
                }
            default:
                if (jVar.f91598i != c0.SEALED) {
                    return q0.f80391a;
                }
                List<Integer> list2 = jVar.f91594e.f118367u;
                Intrinsics.f(list2);
                if (!(!list2.isEmpty())) {
                    return bn2.a.h1(jVar);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Integer num : list2) {
                    p0 p0Var2 = jVar.f91601l;
                    ln2.o oVar = (ln2.o) p0Var2.f82653b;
                    vm2.f fVar = (vm2.f) p0Var2.f82654c;
                    Intrinsics.f(num);
                    am2.g b13 = oVar.b(bs1.c.s0(fVar, num.intValue()));
                    if (b13 != null) {
                        arrayList3.add(b13);
                    }
                }
                return arrayList3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        am2.r rVar;
        Object obj2;
        sn2.g gVar;
        ?? r23;
        int i13 = this.f91591i;
        int i14 = 1;
        j jVar = this.f91592j;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        return l0.M(jVar);
                    default:
                        return CollectionsKt.F0(((ln2.o) jVar.f91601l.f82653b).f84112e.f(jVar.f91612w));
                }
            case 1:
                switch (i13) {
                    case 0:
                        return l0.M(jVar);
                    default:
                        return CollectionsKt.F0(((ln2.o) jVar.f91601l.f82653b).f84112e.f(jVar.f91612w));
                }
            case 2:
                tm2.k kVar = jVar.f91594e;
                if ((kVar.f118349c & 4) != 4) {
                    return null;
                }
                am2.j e13 = jVar.u0().e(bs1.c.L0((vm2.f) jVar.f91601l.f82654c, kVar.f118352f), hm2.e.FROM_DESERIALIZATION);
                if (e13 instanceof am2.g) {
                    return (am2.g) e13;
                }
                return null;
            case 3:
                return b();
            case 4:
                if (!jVar.f91600k.isSingleton()) {
                    List list = jVar.f91594e.f118362p;
                    Intrinsics.checkNotNullExpressionValue(list, "getConstructorList(...)");
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (!vm2.e.f126232n.c(((tm2.m) obj).f118390d).booleanValue()) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    tm2.m mVar = (tm2.m) obj;
                    return mVar != null ? ((a0) jVar.f91601l.f82660i).d(mVar, true) : null;
                }
                bn2.d dVar = new bn2.d(jVar, null, bm2.h.f23540a, true, am2.c.DECLARATION, w0.f15602a);
                List emptyList = Collections.emptyList();
                int i15 = bn2.e.f23579a;
                am2.h hVar = am2.h.ENUM_CLASS;
                am2.h hVar2 = jVar.f91600k;
                if (hVar2 == hVar || hVar2.isSingleton()) {
                    rVar = am2.s.f15573a;
                    if (rVar == null) {
                        bn2.e.a(49);
                        throw null;
                    }
                } else if (bn2.e.s(jVar)) {
                    rVar = am2.s.f15573a;
                    if (rVar == null) {
                        bn2.e.a(51);
                        throw null;
                    }
                } else if (bn2.e.m(jVar)) {
                    rVar = am2.s.f15583k;
                    if (rVar == null) {
                        bn2.e.a(52);
                        throw null;
                    }
                } else {
                    rVar = am2.s.f15577e;
                    if (rVar == null) {
                        bn2.e.a(53);
                        throw null;
                    }
                }
                dVar.H0(emptyList, rVar);
                dVar.D0(jVar.j());
                return dVar;
            case 5:
                return b();
            default:
                if (!jVar.isInline() && !jVar.Y()) {
                    return null;
                }
                p0 p0Var = jVar.f91601l;
                vm2.f nameResolver = (vm2.f) p0Var.f82654c;
                vm2.i typeTable = (vm2.i) p0Var.f82656e;
                h typeDeserializer = new h((ln2.l0) p0Var.f82659h, 0);
                h typeOfPublicProperty = new h(jVar, i14);
                tm2.k kVar2 = jVar.f91594e;
                Intrinsics.checkNotNullParameter(kVar2, "<this>");
                Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
                Intrinsics.checkNotNullParameter(typeTable, "typeTable");
                Intrinsics.checkNotNullParameter(typeDeserializer, "typeDeserializer");
                Intrinsics.checkNotNullParameter(typeOfPublicProperty, "typeOfPublicProperty");
                if (kVar2.f118372z.size() > 0) {
                    List list2 = kVar2.f118372z;
                    Intrinsics.checkNotNullExpressionValue(list2, "getMultiFieldValueClassUnderlyingNameList(...)");
                    List<Integer> list3 = list2;
                    ArrayList arrayList = new ArrayList(g0.q(list3, 10));
                    for (Integer num : list3) {
                        Intrinsics.f(num);
                        arrayList.add(bs1.c.L0(nameResolver, num.intValue()));
                    }
                    Pair pair = new Pair(Integer.valueOf(kVar2.C.size()), Integer.valueOf(kVar2.B.size()));
                    if (Intrinsics.d(pair, new Pair(Integer.valueOf(arrayList.size()), 0))) {
                        List list4 = kVar2.C;
                        Intrinsics.checkNotNullExpressionValue(list4, "getMultiFieldValueClassUnderlyingTypeIdList(...)");
                        List<Integer> list5 = list4;
                        r23 = new ArrayList(g0.q(list5, 10));
                        for (Integer num2 : list5) {
                            Intrinsics.f(num2);
                            r23.add(typeTable.a(num2.intValue()));
                        }
                    } else {
                        if (!Intrinsics.d(pair, new Pair(0, Integer.valueOf(arrayList.size())))) {
                            throw new IllegalStateException(("class " + bs1.c.L0(nameResolver, kVar2.f118351e) + " has illegal multi-field value class representation").toString());
                        }
                        r23 = kVar2.B;
                    }
                    Intrinsics.f(r23);
                    Iterable iterable = (Iterable) r23;
                    ArrayList arrayList2 = new ArrayList(g0.q(iterable, 10));
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(typeDeserializer.invoke(it2.next()));
                    }
                    obj2 = new e0(CollectionsKt.N0(arrayList, arrayList2));
                } else if (kVar2.t()) {
                    ym2.g L0 = bs1.c.L0(nameResolver, kVar2.f118369w);
                    Intrinsics.checkNotNullParameter(kVar2, "<this>");
                    Intrinsics.checkNotNullParameter(typeTable, "typeTable");
                    s0 a13 = (kVar2.f118349c & 16) == 16 ? kVar2.f118370x : kVar2.u() ? typeTable.a(kVar2.f118371y) : null;
                    if ((a13 == null || (gVar = (sn2.g) typeDeserializer.invoke(a13)) == null) && (gVar = (sn2.g) typeOfPublicProperty.invoke(L0)) == null) {
                        throw new IllegalStateException(("cannot determine underlying type for value class " + bs1.c.L0(nameResolver, kVar2.f118351e) + " with property " + L0).toString());
                    }
                    obj2 = new y(L0, gVar);
                } else {
                    obj2 = null;
                }
                if (obj2 != null) {
                    return obj2;
                }
                if (jVar.f91595f.a(1, 5, 1)) {
                    return null;
                }
                am2.p u13 = jVar.u();
                if (u13 == null) {
                    throw new IllegalStateException(("Inline class has no primary constructor: " + jVar).toString());
                }
                List x13 = ((z) u13).x();
                Intrinsics.checkNotNullExpressionValue(x13, "getValueParameters(...)");
                ym2.g name = ((dm2.o) ((i1) CollectionsKt.S(x13))).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                h0 v03 = jVar.v0(name);
                if (v03 != null) {
                    return new y(name, v03);
                }
                throw new IllegalStateException(("Value class has no underlying property: " + jVar).toString());
        }
    }
}
