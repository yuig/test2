package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class o0 extends q0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f18113c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    public static List d(int i13, long j13, Object obj) {
        m0 m0Var;
        List list = (List) h2.f18070d.i(j13, obj);
        if (list.isEmpty()) {
            List m0Var2 = list instanceof n0 ? new m0(i13) : ((list instanceof h1) && (list instanceof i0)) ? ((i0) list).g(i13) : new ArrayList(i13);
            h2.s(j13, obj, m0Var2);
            return m0Var2;
        }
        if (f18113c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i13);
            arrayList.addAll(list);
            h2.s(j13, obj, arrayList);
            m0Var = arrayList;
        } else {
            if (!(list instanceof b2)) {
                if (!(list instanceof h1) || !(list instanceof i0)) {
                    return list;
                }
                i0 i0Var = (i0) list;
                if (((c) i0Var).f18035a) {
                    return list;
                }
                i0 g13 = i0Var.g(list.size() + i13);
                h2.s(j13, obj, g13);
                return g13;
            }
            m0 m0Var3 = new m0(list.size() + i13);
            m0Var3.addAll((b2) list);
            h2.s(j13, obj, m0Var3);
            m0Var = m0Var3;
        }
        return m0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void a(long j13, Object obj) {
        Object unmodifiableList;
        List list = (List) h2.f18070d.i(j13, obj);
        if (list instanceof n0) {
            unmodifiableList = ((n0) list).k();
        } else {
            if (f18113c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof h1) && (list instanceof i0)) {
                c cVar = (c) ((i0) list);
                if (cVar.f18035a) {
                    cVar.f18035a = false;
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        h2.s(j13, obj, unmodifiableList);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void b(long j13, Object obj, Object obj2) {
        List list = (List) h2.f18070d.i(j13, obj2);
        List d2 = d(list.size(), j13, obj);
        int size = d2.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d2.addAll(list);
        }
        if (size > 0) {
            list = d2;
        }
        h2.s(j13, obj, list);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final List c(long j13, Object obj) {
        return d(10, j13, obj);
    }
}
