package kh2;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g2 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79511i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f79512j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2(Object obj, int i13) {
        super(0);
        this.f79511i = i13;
        this.f79512j = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.ArrayList] */
    public final List b() {
        Collection collection;
        int i13 = this.f79511i;
        Object obj = this.f79512j;
        switch (i13) {
            case 10:
                ul2.w1 w1Var = ((ul2.q1) obj).f122586b;
                Type type = w1Var != null ? (Type) w1Var.invoke() : null;
                Intrinsics.f(type);
                return gm2.d.c(type);
            case 11:
                List upperBounds = ((ul2.s1) obj).f122599a.getUpperBounds();
                Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                List list = upperBounds;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new ul2.q1((pn2.b0) it.next(), null));
                }
                return arrayList;
            case 13:
                return ((dm2.a1) obj).w0();
            case 18:
                dn2.o oVar = (dn2.o) obj;
                pn2.h0 j13 = oVar.f55631b.f().j("Comparable").j();
                Intrinsics.checkNotNullExpressionValue(j13, "getDefaultType(...)");
                ArrayList l13 = kotlin.collections.f0.l(lb.l0.Z0(j13, kotlin.collections.e0.b(new pn2.i1(oVar.f55633d, pn2.w1.IN_VARIANCE)), null, 2));
                am2.d0 d0Var = oVar.f55631b;
                Collection E = j.E(d0Var);
                if (!(E instanceof Collection) || !E.isEmpty()) {
                    Iterator it2 = E.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!(!oVar.f55632c.contains((pn2.b0) it2.next()))) {
                                pn2.h0 j14 = d0Var.f().j("Number").j();
                                if (j14 == null) {
                                    xl2.l.a(56);
                                    throw null;
                                }
                                l13.add(j14);
                            }
                        }
                    }
                }
                return l13;
            case 19:
                in2.h hVar = (in2.h) obj;
                List h10 = hVar.h();
                List list2 = h10;
                ArrayList arrayList2 = new ArrayList(3);
                Collection c13 = hVar.f72868b.e().c();
                Intrinsics.checkNotNullExpressionValue(c13, "getSupertypes(...)");
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = c13.iterator();
                while (it3.hasNext()) {
                    kotlin.collections.k0.u(ue.c.s(((pn2.b0) it3.next()).w(), null, 3), arrayList3);
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    Object next = it4.next();
                    if (next instanceof am2.d) {
                        arrayList4.add(next);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    Object next2 = it5.next();
                    ym2.g name = ((am2.d) next2).getName();
                    Object obj2 = linkedHashMap.get(name);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(name, obj2);
                    }
                    ((List) obj2).add(next2);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    ym2.g gVar = (ym2.g) entry.getKey();
                    List list3 = (List) entry.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj3 : list3) {
                        Boolean valueOf = Boolean.valueOf(((am2.d) obj3) instanceof am2.x);
                        Object obj4 = linkedHashMap2.get(valueOf);
                        if (obj4 == null) {
                            obj4 = new ArrayList();
                            linkedHashMap2.put(valueOf, obj4);
                        }
                        ((List) obj4).add(obj3);
                    }
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                        List list4 = (List) entry2.getValue();
                        bn2.o oVar2 = bn2.o.f23590d;
                        List list5 = list4;
                        if (booleanValue) {
                            collection = new ArrayList();
                            for (Object obj5 : h10) {
                                if (Intrinsics.d(((dm2.o) ((am2.x) obj5)).getName(), gVar)) {
                                    collection.add(obj5);
                                }
                            }
                        } else {
                            collection = kotlin.collections.q0.f80391a;
                        }
                        oVar2.i(gVar, list5, collection, hVar.f72868b, new dm2.t(arrayList2, hVar));
                    }
                }
                return CollectionsKt.l0(wn2.k.e(arrayList2), list2);
            default:
                Function0 function0 = ((qn2.l) obj).f104507b;
                if (function0 != null) {
                    return (List) function0.invoke();
                }
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a4  */
    /* JADX WARN: Type inference failed for: r1v8, types: [xk2.r] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map e() {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.g2.e():java.util.Map");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0210 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke() {
        /*
            Method dump skipped, instructions count: 704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.g2.invoke():java.lang.Object");
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m175invoke() {
        int i13 = this.f79511i;
        Object obj = this.f79512j;
        switch (i13) {
            case 0:
                ((zg2.a) obj).f141965e.set(true);
                return;
            default:
                oh2.d dVar = (oh2.d) obj;
                dVar.getClass();
                try {
                    c0.d.M2("native-install-handlers");
                    oh2.g gVar = dVar.f94613f;
                    dVar.f94611d.installSignalHandlers(gVar.f94626a, gVar.f94627b, gVar.f94628c, gVar.f94629d, gVar.f94630e, false);
                    Unit unit = Unit.f80348a;
                    return;
                } finally {
                }
        }
    }
}
