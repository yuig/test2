package o82;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a0 implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final List f93524a;

    public a0(List sectionStates) {
        Intrinsics.checkNotNullParameter(sectionStates, "sectionStates");
        this.f93524a = sectionStates;
    }

    public final y0 e() {
        Throwable th3;
        List list = this.f93524a;
        boolean z13 = false;
        if (list.isEmpty()) {
            return new y0(null, null, false, 7);
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((y0) it.next()).f93756a);
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object obj = it2.next();
        while (it2.hasNext()) {
            List list3 = (List) it2.next();
            ArrayList H0 = CollectionsKt.H0((List) obj);
            H0.addAll(list3);
            obj = H0;
        }
        List list4 = (List) obj;
        boolean z14 = list2 instanceof Collection;
        if (!z14 || !list2.isEmpty()) {
            Iterator it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (((y0) it3.next()).f93758c) {
                    z13 = true;
                    break;
                }
            }
        }
        kg.q qVar = v.f93728e;
        if (!z14 || !list2.isEmpty()) {
            Iterator it4 = list2.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                if (!Intrinsics.d(((y0) it4.next()).f93757b, qVar)) {
                    if (!z14 || !list2.isEmpty()) {
                        Iterator it5 = list2.iterator();
                        while (it5.hasNext()) {
                            kg.q qVar2 = ((y0) it5.next()).f93757b;
                            u uVar = u.f93720e;
                            if (Intrinsics.d(qVar2, uVar)) {
                                qVar = uVar;
                                break;
                            }
                        }
                    }
                    if (!z14 || !list2.isEmpty()) {
                        Iterator it6 = list2.iterator();
                        while (it6.hasNext()) {
                            kg.q qVar3 = ((y0) it6.next()).f93757b;
                            w wVar = w.f93734e;
                            if (Intrinsics.d(qVar3, wVar)) {
                                qVar = wVar;
                                break;
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list2, 10));
                    Iterator it7 = list2.iterator();
                    while (it7.hasNext()) {
                        arrayList2.add(((y0) it7.next()).f93757b);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it8 = arrayList2.iterator();
                    while (it8.hasNext()) {
                        Object next = it8.next();
                        if (next instanceof s) {
                            arrayList3.add(next);
                        }
                    }
                    s sVar = (s) CollectionsKt.firstOrNull(arrayList3);
                    qVar = (sVar == null || (th3 = sVar.f93705e) == null) ? t.f93712e : new s(th3);
                }
            }
        }
        return new y0(list4, qVar, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.d(this.f93524a, ((a0) obj).f93524a);
    }

    public final int f() {
        Iterator it = this.f93524a.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            i13 += ((y0) it.next()).f93756a.size();
        }
        return i13;
    }

    public final int hashCode() {
        return this.f93524a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("MultiSectionDisplayState(sectionStates="), this.f93524a, ")");
    }

    public a0() {
        this(kotlin.collections.q0.f80391a);
    }
}
