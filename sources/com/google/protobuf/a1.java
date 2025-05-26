package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a1 extends c1 {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f33852c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    public static List d(int i13, long j13, Object obj) {
        y0 y0Var;
        List list = (List) q2.f33962c.j(j13, obj);
        if (list.isEmpty()) {
            List y0Var2 = list instanceof z0 ? new y0(i13) : ((list instanceof x1) && (list instanceof v0)) ? ((v0) list).g(i13) : new ArrayList(i13);
            q2.v(j13, obj, y0Var2);
            return y0Var2;
        }
        if (f33852c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i13);
            arrayList.addAll(list);
            q2.v(j13, obj, arrayList);
            y0Var = arrayList;
        } else {
            if (!(list instanceof l2)) {
                if (!(list instanceof x1) || !(list instanceof v0)) {
                    return list;
                }
                v0 v0Var = (v0) list;
                if (((c) v0Var).f33862a) {
                    return list;
                }
                v0 g13 = v0Var.g(list.size() + i13);
                q2.v(j13, obj, g13);
                return g13;
            }
            y0 y0Var3 = new y0(list.size() + i13);
            y0Var3.addAll((l2) list);
            q2.v(j13, obj, y0Var3);
            y0Var = y0Var3;
        }
        return y0Var;
    }

    @Override // com.google.protobuf.c1
    public final void a(long j13, Object obj) {
        Object unmodifiableList;
        List list = (List) q2.f33962c.j(j13, obj);
        if (list instanceof z0) {
            unmodifiableList = ((z0) list).k();
        } else {
            if (f33852c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof x1) && (list instanceof v0)) {
                c cVar = (c) ((v0) list);
                if (cVar.f33862a) {
                    cVar.f33862a = false;
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        q2.v(j13, obj, unmodifiableList);
    }

    @Override // com.google.protobuf.c1
    public final void b(long j13, Object obj, Object obj2) {
        List list = (List) q2.f33962c.j(j13, obj2);
        List d2 = d(list.size(), j13, obj);
        int size = d2.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d2.addAll(list);
        }
        if (size > 0) {
            list = d2;
        }
        q2.v(j13, obj, list);
    }

    @Override // com.google.protobuf.c1
    public final List c(long j13, Object obj) {
        return d(10, j13, obj);
    }
}
