package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class n6 extends o6 {

    /* renamed from: c, reason: collision with root package name */
    public static final Class f31554c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.o6
    public final void a(long j13, Object obj, Object obj2) {
        m6 m6Var;
        List list = (List) x7.r(j13, obj2);
        int size = list.size();
        List list2 = (List) x7.r(j13, obj);
        if (list2.isEmpty()) {
            list2 = list2 instanceof l6 ? new m6(size) : ((list2 instanceof h7) && (list2 instanceof i6)) ? ((i6) list2).zza(size) : new ArrayList(size);
            x7.d(j13, obj, list2);
        } else {
            if (f31554c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                x7.d(j13, obj, arrayList);
                m6Var = arrayList;
            } else if (list2 instanceof s7) {
                m6 m6Var2 = new m6(list2.size() + size);
                m6Var2.addAll((s7) list2);
                x7.d(j13, obj, m6Var2);
                m6Var = m6Var2;
            } else if ((list2 instanceof h7) && (list2 instanceof i6)) {
                i6 i6Var = (i6) list2;
                if (!((i5) i6Var).f31439a) {
                    list2 = i6Var.zza(list2.size() + size);
                    x7.d(j13, obj, list2);
                }
            }
            list2 = m6Var;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        x7.d(j13, obj, list);
    }

    @Override // com.google.android.gms.internal.measurement.o6
    public final void b(long j13, Object obj) {
        Object unmodifiableList;
        List list = (List) x7.r(j13, obj);
        if (list instanceof l6) {
            unmodifiableList = ((l6) list).J();
        } else {
            if (f31554c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof h7) && (list instanceof i6)) {
                i5 i5Var = (i5) ((i6) list);
                boolean z13 = i5Var.f31439a;
                if (z13 && z13) {
                    i5Var.f31439a = false;
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        x7.d(j13, obj, unmodifiableList);
    }
}
