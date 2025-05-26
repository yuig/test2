package com.google.android.gms.internal.recaptcha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class j0 extends h0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f31756c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.recaptcha.h0
    public final void a(long j13, Object obj, Object obj2) {
        g0 g0Var;
        List list = (List) j1.k(obj2, j13);
        int size = list.size();
        List list2 = (List) j1.k(obj, j13);
        if (list2.isEmpty()) {
            list2 = list2 instanceof f0 ? new g0(size) : ((list2 instanceof w0) && (list2 instanceof e0)) ? ((g0) ((e0) list2)).c(size) : new ArrayList(size);
            j1.d(j13, obj, list2);
        } else {
            if (f31756c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                j1.d(j13, obj, arrayList);
                g0Var = arrayList;
            } else if (list2 instanceof d1) {
                g0 g0Var2 = new g0(list2.size() + size);
                g0Var2.addAll((d1) list2);
                j1.d(j13, obj, g0Var2);
                g0Var = g0Var2;
            } else if ((list2 instanceof w0) && (list2 instanceof e0)) {
                e0 e0Var = (e0) list2;
                if (!((n) e0Var).f31771a) {
                    list2 = ((g0) e0Var).c(list2.size() + size);
                    j1.d(j13, obj, list2);
                }
            }
            list2 = g0Var;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        j1.d(j13, obj, list);
    }

    @Override // com.google.android.gms.internal.recaptcha.h0
    public final void b(long j13, b0 b0Var) {
        Object unmodifiableList;
        List list = (List) j1.k(b0Var, j13);
        if (list instanceof f0) {
            unmodifiableList = ((f0) list).C0();
        } else {
            if (f31756c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof w0) && (list instanceof e0)) {
                n nVar = (n) ((e0) list);
                if (nVar.f31771a) {
                    nVar.f31771a = false;
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        j1.d(j13, b0Var, unmodifiableList);
    }
}
