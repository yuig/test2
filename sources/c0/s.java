package c0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final s f24330b;

    /* renamed from: c, reason: collision with root package name */
    public static final s f24331c;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f24332a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new androidx.camera.core.impl.m1(0));
        f24330b = new s(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new androidx.camera.core.impl.m1(1));
        f24331c = new s(linkedHashSet2);
    }

    public s(LinkedHashSet linkedHashSet) {
        this.f24332a = linkedHashSet;
    }

    public final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = this.f24332a.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            List<r> unmodifiableList = Collections.unmodifiableList(arrayList2);
            androidx.camera.core.impl.m1 m1Var = (androidx.camera.core.impl.m1) qVar;
            m1Var.getClass();
            ArrayList arrayList3 = new ArrayList();
            for (r rVar : unmodifiableList) {
                com.bumptech.glide.d.g("The camera info doesn't contain internal implementation.", rVar instanceof androidx.camera.core.impl.h0);
                if (rVar.d() == m1Var.f16916b) {
                    arrayList3.add(rVar);
                }
            }
            arrayList2 = arrayList3;
        }
        arrayList2.retainAll(arrayList);
        return arrayList2;
    }

    public final Integer b() {
        Iterator it = this.f24332a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            q qVar = (q) it.next();
            if (qVar instanceof androidx.camera.core.impl.m1) {
                Integer valueOf = Integer.valueOf(((androidx.camera.core.impl.m1) qVar).f16916b);
                if (num == null) {
                    num = valueOf;
                } else if (!num.equals(valueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public final androidx.camera.core.impl.j0 c(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((androidx.camera.core.impl.j0) it.next()).g());
        }
        ArrayList a13 = a(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            androidx.camera.core.impl.j0 j0Var = (androidx.camera.core.impl.j0) it2.next();
            if (a13.contains(j0Var.g())) {
                linkedHashSet2.add(j0Var);
            }
        }
        Iterator it3 = linkedHashSet2.iterator();
        if (it3.hasNext()) {
            return (androidx.camera.core.impl.j0) it3.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }
}
