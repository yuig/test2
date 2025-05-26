package o82;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i0 extends l82.d {

    /* renamed from: b, reason: collision with root package name */
    public final List f93616b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f93617c;

    public i0(List nestedTransformers, Set sectionIds) {
        Intrinsics.checkNotNullParameter(nestedTransformers, "nestedTransformers");
        Intrinsics.checkNotNullParameter(sectionIds, "sectionIds");
        this.f93616b = nestedTransformers;
        this.f93617c = sectionIds;
    }

    @Override // l82.d
    public final l82.c0 c(l82.i0 i0Var) {
        j0 vmState = (j0) i0Var;
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f93616b.iterator();
        int i13 = 0;
        int i14 = 0;
        boolean z13 = false;
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((y0) ((l82.c0) it2.next()).f82212a);
                }
                a0 a0Var = new a0(arrayList2);
                ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList3.add((i2) ((l82.c0) it3.next()).f82213b);
                }
                j0 j0Var = new j0(arrayList3);
                ArrayList arrayList4 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    Object next = it4.next();
                    int i15 = i13 + 1;
                    if (i13 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    arrayList4.add(new h0(i13, ((l82.c0) next).f82214c));
                    i13 = i15;
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    Object next2 = it5.next();
                    if (!((h0) next2).f93608b.isEmpty()) {
                        arrayList5.add(next2);
                    }
                }
                return new l82.c0(a0Var, j0Var, arrayList5);
            }
            Object next3 = it.next();
            int i16 = i14 + 1;
            if (i14 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            l82.d dVar = (l82.d) next3;
            List list = vmState.f93634a;
            l82.c0 c13 = dVar.c((l82.i0) ((i14 < 0 || i14 > kotlin.collections.f0.i(list)) ? new i2(obj, 3) : list.get(i14)));
            if (z13 || !Intrinsics.d(((i2) c13.f82213b).f93620b, l.f93651a)) {
                arrayList.add(c13);
            } else {
                arrayList.add(dVar.e(h1.f93609a, c13.f82212a, c13.f82213b));
                z13 = true;
            }
            i14 = i16;
        }
    }

    @Override // l82.d
    public final l82.c0 f(u50.s sVar, u50.o oVar, l82.i0 i0Var, l82.e resultBuilder) {
        l82.c0 c0Var;
        Object obj;
        g0 event = (g0) sVar;
        a0 priorDisplayState = (a0) oVar;
        j0 priorVMState = (j0) i0Var;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(priorDisplayState, "priorDisplayState");
        Intrinsics.checkNotNullParameter(priorVMState, "priorVMState");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        boolean z13 = event instanceof c0;
        int i13 = -1;
        List list = this.f93616b;
        int i14 = 0;
        if (z13) {
            boolean c13 = kh2.g0.c(priorDisplayState.f93524a);
            List list2 = priorDisplayState.f93524a;
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((y0) it.next()).f93758c) {
                    i13 = i14;
                    break;
                }
                i14++;
            }
            if (kotlin.collections.f0.h(list).f(i13) && !c13) {
                l82.c0 e13 = ((l82.d) list.get(i13)).e(h1.f93609a, (u50.o) list2.get(i13), (l82.i0) priorVMState.f93634a.get(i13));
                y0 y0Var = (y0) e13.f82212a;
                ArrayList H0 = CollectionsKt.H0(list2);
                H0.set(i13, y0Var);
                a0 a0Var = new a0(H0);
                i2 i2Var = (i2) e13.f82213b;
                ArrayList H02 = CollectionsKt.H0(priorVMState.f93634a);
                H02.set(i13, i2Var);
                return new l82.c0(a0Var, new j0(H02), kotlin.collections.e0.b(new h0(i13, e13.f82214c)));
            }
            c0Var = new l82.c0(priorDisplayState, priorVMState, kotlin.collections.q0.f80391a);
        } else if (event instanceof d0) {
            if (!kh2.g0.c(priorDisplayState.f93524a)) {
                ArrayList arrayList = new ArrayList();
                List list3 = priorVMState.f93634a;
                Iterator it2 = list3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (Intrinsics.d(((i2) obj).f93620b, l.f93651a)) {
                        break;
                    }
                }
                int W = CollectionsKt.W(obj, list3);
                if (W == -1) {
                    W = 0;
                }
                int i15 = 0;
                for (Object obj2 : list) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    l82.d dVar = (l82.d) obj2;
                    List list4 = priorDisplayState.f93524a;
                    List list5 = priorVMState.f93634a;
                    if (i15 == W) {
                        arrayList.add(dVar.e(k1.f93643a, (u50.o) list4.get(i15), (l82.i0) list5.get(i15)));
                    } else {
                        arrayList.add(dVar.e(new a1(true), (u50.o) list4.get(i15), (l82.i0) list5.get(i15)));
                    }
                    i15 = i16;
                }
                ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add((y0) ((l82.c0) it3.next()).f82212a);
                }
                a0 a0Var2 = new a0(arrayList2);
                ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    arrayList3.add((i2) ((l82.c0) it4.next()).f82213b);
                }
                j0 j0Var = new j0(arrayList3);
                ArrayList arrayList4 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    Object next = it5.next();
                    int i17 = i14 + 1;
                    if (i14 < 0) {
                        kotlin.collections.f0.p();
                        throw null;
                    }
                    arrayList4.add(new h0(i14, ((l82.c0) next).f82214c));
                    i14 = i17;
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it6 = arrayList4.iterator();
                while (it6.hasNext()) {
                    Object next2 = it6.next();
                    if (!((h0) next2).f93608b.isEmpty()) {
                        arrayList5.add(next2);
                    }
                }
                return new l82.c0(a0Var2, j0Var, arrayList5);
            }
            c0Var = new l82.c0(priorDisplayState, priorVMState, kotlin.collections.q0.f80391a);
        } else if (event instanceof b0) {
            ArrayList arrayList6 = new ArrayList();
            int i18 = 0;
            for (Object obj3 : list) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kotlin.collections.f0.p();
                    throw null;
                }
                arrayList6.add(((l82.d) obj3).e(new a1(((b0) event).f93535a), (u50.o) priorDisplayState.f93524a.get(i18), (l82.i0) priorVMState.f93634a.get(i18)));
                i18 = i19;
            }
            ArrayList arrayList7 = new ArrayList(kotlin.collections.g0.q(arrayList6, 10));
            Iterator it7 = arrayList6.iterator();
            while (it7.hasNext()) {
                arrayList7.add((y0) ((l82.c0) it7.next()).f82212a);
            }
            a0 a0Var3 = new a0(arrayList7);
            ArrayList arrayList8 = new ArrayList(kotlin.collections.g0.q(arrayList6, 10));
            Iterator it8 = arrayList6.iterator();
            while (it8.hasNext()) {
                arrayList8.add((i2) ((l82.c0) it8.next()).f82213b);
            }
            j0 j0Var2 = new j0(arrayList8);
            ArrayList arrayList9 = new ArrayList(kotlin.collections.g0.q(arrayList6, 10));
            Iterator it9 = arrayList6.iterator();
            while (it9.hasNext()) {
                Object next3 = it9.next();
                int i23 = i14 + 1;
                if (i14 < 0) {
                    kotlin.collections.f0.p();
                    throw null;
                }
                arrayList9.add(new h0(i14, ((l82.c0) next3).f82214c));
                i14 = i23;
            }
            ArrayList arrayList10 = new ArrayList();
            Iterator it10 = arrayList9.iterator();
            while (it10.hasNext()) {
                Object next4 = it10.next();
                if (!((h0) next4).f93608b.isEmpty()) {
                    arrayList10.add(next4);
                }
            }
            c0Var = new l82.c0(a0Var3, j0Var2, arrayList10);
        } else if (event instanceof f0) {
            ArrayList arrayList11 = new ArrayList();
            int i24 = 0;
            for (Object obj4 : list) {
                int i25 = i24 + 1;
                if (i24 < 0) {
                    kotlin.collections.f0.p();
                    throw null;
                }
                l82.d dVar2 = (l82.d) obj4;
                f0 f0Var = (f0) event;
                if (i24 == f0Var.f93579a) {
                    arrayList11.add(dVar2.e(f0Var.f93580b, (u50.o) priorDisplayState.f93524a.get(i24), (l82.i0) priorVMState.f93634a.get(i24)));
                } else {
                    arrayList11.add(new l82.c0((u50.o) priorDisplayState.f93524a.get(i24), (l82.i0) priorVMState.f93634a.get(i24)));
                }
                i24 = i25;
            }
            ArrayList arrayList12 = new ArrayList(kotlin.collections.g0.q(arrayList11, 10));
            Iterator it11 = arrayList11.iterator();
            while (it11.hasNext()) {
                arrayList12.add((y0) ((l82.c0) it11.next()).f82212a);
            }
            a0 a0Var4 = new a0(arrayList12);
            ArrayList arrayList13 = new ArrayList(kotlin.collections.g0.q(arrayList11, 10));
            Iterator it12 = arrayList11.iterator();
            while (it12.hasNext()) {
                arrayList13.add((i2) ((l82.c0) it12.next()).f82213b);
            }
            j0 j0Var3 = new j0(arrayList13);
            ArrayList arrayList14 = new ArrayList(kotlin.collections.g0.q(arrayList11, 10));
            Iterator it13 = arrayList11.iterator();
            while (it13.hasNext()) {
                Object next5 = it13.next();
                int i26 = i14 + 1;
                if (i14 < 0) {
                    kotlin.collections.f0.p();
                    throw null;
                }
                arrayList14.add(new h0(i14, ((l82.c0) next5).f82214c));
                i14 = i26;
            }
            ArrayList arrayList15 = new ArrayList();
            Iterator it14 = arrayList14.iterator();
            while (it14.hasNext()) {
                Object next6 = it14.next();
                if (!((h0) next6).f93608b.isEmpty()) {
                    arrayList15.add(next6);
                }
            }
            c0Var = new l82.c0(a0Var4, j0Var3, arrayList15);
        } else {
            if (!(event instanceof e0)) {
                throw new NoWhenBranchMatchedException();
            }
            ArrayList arrayList16 = new ArrayList();
            int i27 = 0;
            for (Object obj5 : list) {
                int i28 = i27 + 1;
                if (i27 < 0) {
                    kotlin.collections.f0.p();
                    throw null;
                }
                l82.d dVar3 = (l82.d) obj5;
                e0 e0Var = (e0) event;
                int V = CollectionsKt.V(this.f93617c, e0Var.f93566a);
                if (V < 0) {
                    vb0.j.f125466a.F("No section with id " + e0Var.f93566a, tb0.p.PLATFORM, new Object[i14]);
                }
                if (i27 == V) {
                    arrayList16.add(dVar3.e(e0Var.f93567b, (u50.o) priorDisplayState.f93524a.get(i27), (l82.i0) priorVMState.f93634a.get(i27)));
                } else {
                    arrayList16.add(new l82.c0((u50.o) priorDisplayState.f93524a.get(i27), (l82.i0) priorVMState.f93634a.get(i27)));
                }
                i27 = i28;
                i14 = 0;
            }
            ArrayList arrayList17 = new ArrayList(kotlin.collections.g0.q(arrayList16, 10));
            Iterator it15 = arrayList16.iterator();
            while (it15.hasNext()) {
                arrayList17.add((y0) ((l82.c0) it15.next()).f82212a);
            }
            a0 a0Var5 = new a0(arrayList17);
            ArrayList arrayList18 = new ArrayList(kotlin.collections.g0.q(arrayList16, 10));
            Iterator it16 = arrayList16.iterator();
            while (it16.hasNext()) {
                arrayList18.add((i2) ((l82.c0) it16.next()).f82213b);
            }
            j0 j0Var4 = new j0(arrayList18);
            ArrayList arrayList19 = new ArrayList(kotlin.collections.g0.q(arrayList16, 10));
            Iterator it17 = arrayList16.iterator();
            int i29 = 0;
            while (it17.hasNext()) {
                Object next7 = it17.next();
                int i33 = i29 + 1;
                if (i29 < 0) {
                    kotlin.collections.f0.p();
                    throw null;
                }
                arrayList19.add(new h0(i29, ((l82.c0) next7).f82214c));
                i29 = i33;
            }
            ArrayList arrayList20 = new ArrayList();
            Iterator it18 = arrayList19.iterator();
            while (it18.hasNext()) {
                Object next8 = it18.next();
                if (!((h0) next8).f93608b.isEmpty()) {
                    arrayList20.add(next8);
                }
            }
            c0Var = new l82.c0(a0Var5, j0Var4, arrayList20);
        }
        return c0Var;
    }
}
