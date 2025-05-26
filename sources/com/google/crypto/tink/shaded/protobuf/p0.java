package com.google.crypto.tink.shaded.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class p0 extends r0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f33678c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    public static List d(int i13, long j13, Object obj) {
        n0 n0Var;
        List list = (List) d2.f33602c.i(j13, obj);
        if (list.isEmpty()) {
            List n0Var2 = list instanceof o0 ? new n0(i13) : ((list instanceof k1) && (list instanceof k0)) ? ((k0) list).g(i13) : new ArrayList(i13);
            d2.s(j13, obj, n0Var2);
            return n0Var2;
        }
        if (f33678c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i13);
            arrayList.addAll(list);
            d2.s(j13, obj, arrayList);
            n0Var = arrayList;
        } else {
            if (!(list instanceof y1)) {
                if (!(list instanceof k1) || !(list instanceof k0)) {
                    return list;
                }
                k0 k0Var = (k0) list;
                if (((c) k0Var).f33594a) {
                    return list;
                }
                k0 g13 = k0Var.g(list.size() + i13);
                d2.s(j13, obj, g13);
                return g13;
            }
            n0 n0Var3 = new n0(list.size() + i13);
            n0Var3.addAll((y1) list);
            d2.s(j13, obj, n0Var3);
            n0Var = n0Var3;
        }
        return n0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final void a(long j13, Object obj) {
        Object unmodifiableList;
        List list = (List) d2.f33602c.i(j13, obj);
        if (list instanceof o0) {
            unmodifiableList = ((o0) list).k();
        } else {
            if (f33678c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof k1) && (list instanceof k0)) {
                c cVar = (c) ((k0) list);
                boolean z13 = cVar.f33594a;
                if (z13 && z13) {
                    cVar.f33594a = false;
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        d2.s(j13, obj, unmodifiableList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final void b(long j13, Object obj, Object obj2) {
        List list = (List) d2.f33602c.i(j13, obj2);
        List d2 = d(list.size(), j13, obj);
        int size = d2.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            d2.addAll(list);
        }
        if (size > 0) {
            list = d2;
        }
        d2.s(j13, obj, list);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final List c(long j13, Object obj) {
        return d(10, j13, obj);
    }
}
