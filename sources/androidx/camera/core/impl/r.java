package androidx.camera.core.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a */
    public final Serializable f16956a;

    public r(q qVar) {
        this.f16956a = qVar;
    }

    public static String d(r rVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) rVar.f16956a).iterator();
        while (it.hasNext()) {
            arrayList.add(((x1) it.next()).getClass().getSimpleName());
        }
        return String.join(" | ", arrayList);
    }

    public final boolean a(Class cls) {
        Iterator it = ((List) this.f16956a).iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((x1) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public final x1 b(Class cls) {
        for (x1 x1Var : (List) this.f16956a) {
            if (x1Var.getClass() == cls) {
                return x1Var;
            }
        }
        return null;
    }

    public final ArrayList c(Class cls) {
        ArrayList arrayList = new ArrayList();
        for (x1 x1Var : (List) this.f16956a) {
            if (cls.isAssignableFrom(x1Var.getClass())) {
                arrayList.add(x1Var);
            }
        }
        return arrayList;
    }

    public r(List list) {
        this.f16956a = new ArrayList(list);
    }
}
