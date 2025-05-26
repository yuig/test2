package nn2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.k0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pn2.b0;

/* loaded from: classes2.dex */
public final class f extends q {

    /* renamed from: g, reason: collision with root package name */
    public final qn2.i f91587g;

    /* renamed from: h, reason: collision with root package name */
    public final on2.l f91588h;

    /* renamed from: i, reason: collision with root package name */
    public final on2.l f91589i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f91590j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(nn2.j r8, qn2.i r9) {
        /*
            r7 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r7.f91590j = r8
            lb.p0 r0 = r8.f91601l
            tm2.k r1 = r8.f91594e
            java.util.List r3 = r1.f118363q
            java.lang.String r2 = "getFunctionList(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            java.util.List r4 = r1.f118364r
            java.lang.String r2 = "getPropertyList(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r2)
            java.util.List r5 = r1.f118365s
            java.lang.String r2 = "getTypeAliasList(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            java.util.List r1 = r1.f118357k
            java.lang.String r2 = "getNestedClassNameList(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            lb.p0 r8 = r8.f91601l
            java.lang.Object r8 = r8.f82654c
            vm2.f r8 = (vm2.f) r8
            java.util.ArrayList r2 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.g0.q(r1, r6)
            r2.<init>(r6)
            java.util.Iterator r1 = r1.iterator()
        L3e:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L56
            java.lang.Object r6 = r1.next()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            ym2.g r6 = bs1.c.L0(r8, r6)
            r2.add(r6)
            goto L3e
        L56:
            tu1.u r6 = new tu1.u
            r8 = 27
            r6.<init>(r2, r8)
            r1 = r7
            r2 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f91587g = r9
            on2.u r8 = r0.d()
            nn2.d r9 = new nn2.d
            r1 = 0
            r9.<init>(r7, r1)
            on2.q r8 = (on2.q) r8
            r8.getClass()
            on2.l r1 = new on2.l
            r1.<init>(r8, r9)
            r7.f91588h = r1
            on2.u r8 = r0.d()
            nn2.d r9 = new nn2.d
            r0 = 1
            r9.<init>(r7, r0)
            on2.q r8 = (on2.q) r8
            r8.getClass()
            on2.l r0 = new on2.l
            r0.<init>(r8, r9)
            r7.f91589i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nn2.f.<init>(nn2.j, qn2.i):void");
    }

    @Override // nn2.q, in2.o, in2.n
    public final Collection a(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        t(name, location);
        return super.a(name, location);
    }

    @Override // nn2.q, in2.o, in2.n
    public final Collection d(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        t(name, location);
        return super.d(name, location);
    }

    @Override // nn2.q, in2.o, in2.p
    public final am2.j e(ym2.g name, hm2.e location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        t(name, location);
        com.google.firebase.messaging.q qVar = this.f91590j.f91605p;
        if (qVar != null) {
            Intrinsics.checkNotNullParameter(name, "name");
            am2.g gVar = (am2.g) ((on2.m) qVar.f33804b).invoke(name);
            if (gVar != null) {
                return gVar;
            }
        }
        return super.e(name, location);
    }

    @Override // in2.o, in2.p
    public final Collection g(in2.g kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return (Collection) this.f91588h.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    @Override // nn2.q
    public final void h(ArrayList result, Function1 nameFilter) {
        ?? r13;
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        com.google.firebase.messaging.q qVar = this.f91590j.f91605p;
        if (qVar != null) {
            Set<ym2.g> keySet = ((Map) qVar.f33803a).keySet();
            r13 = new ArrayList();
            for (ym2.g name : keySet) {
                Intrinsics.checkNotNullParameter(name, "name");
                am2.g gVar = (am2.g) ((on2.m) qVar.f33804b).invoke(name);
                if (gVar != null) {
                    r13.add(gVar);
                }
            }
        } else {
            r13 = 0;
        }
        if (r13 == 0) {
            r13 = q0.f80391a;
        }
        result.addAll(r13);
    }

    @Override // nn2.q
    public final void j(ym2.g name, ArrayList functions) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(functions, "functions");
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Collection) this.f91589i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList.addAll(((b0) it.next()).w().a(name, hm2.e.FOR_ALREADY_TRACKED));
        }
        functions.addAll(((ln2.o) this.f91630b.f82653b).f84120m.e(name, this.f91590j));
        s(name, arrayList, functions);
    }

    @Override // nn2.q
    public final void k(ym2.g name, ArrayList descriptors) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Collection) this.f91589i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList.addAll(((b0) it.next()).w().d(name, hm2.e.FOR_ALREADY_TRACKED));
        }
        s(name, arrayList, descriptors);
    }

    @Override // nn2.q
    public final ym2.b l(ym2.g name) {
        Intrinsics.checkNotNullParameter(name, "name");
        ym2.b d2 = this.f91590j.f91597h.d(name);
        Intrinsics.checkNotNullExpressionValue(d2, "createNestedClassId(...)");
        return d2;
    }

    @Override // nn2.q
    public final Set n() {
        List c13 = this.f91590j.f91603n.c();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = c13.iterator();
        while (it.hasNext()) {
            Set c14 = ((b0) it.next()).w().c();
            if (c14 == null) {
                return null;
            }
            k0.u(c14, linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // nn2.q
    public final Set o() {
        j jVar = this.f91590j;
        List c13 = jVar.f91603n.c();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = c13.iterator();
        while (it.hasNext()) {
            k0.u(((b0) it.next()).w().b(), linkedHashSet);
        }
        linkedHashSet.addAll(((ln2.o) this.f91630b.f82653b).f84120m.c(jVar));
        return linkedHashSet;
    }

    @Override // nn2.q
    public final Set p() {
        List c13 = this.f91590j.f91603n.c();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = c13.iterator();
        while (it.hasNext()) {
            k0.u(((b0) it.next()).w().f(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // nn2.q
    public final boolean r(t function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return ((ln2.o) this.f91630b.f82653b).f84121n.d(this.f91590j, function);
    }

    public final void s(ym2.g gVar, ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList(arrayList2);
        ((qn2.o) ((ln2.o) this.f91630b.f82653b).f84123p).f104515d.i(gVar, arrayList, arrayList3, this.f91590j, new e(arrayList2));
    }

    public final void t(ym2.g name, hm2.b location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        dl2.b.p2(((ln2.o) this.f91630b.f82653b).f84115h, (hm2.e) location, this.f91590j, name);
    }
}
