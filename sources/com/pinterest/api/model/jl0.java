package com.pinterest.api.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class jl0 {
    public static final ArrayList a(dl0 dl0Var) {
        List o13;
        Intrinsics.checkNotNullParameter(dl0Var, "<this>");
        List s13 = dl0Var.s();
        if (s13 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        el0 el0Var = new el0(arrayList, Unit.f80348a);
        uo0 uo0Var = (uo0) CollectionsKt.firstOrNull(s13);
        if (uo0Var != null && (o13 = uo0Var.o()) != null) {
            Iterator it = o13.iterator();
            while (it.hasNext()) {
                ((ro0) it.next()).a(el0Var);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((mp0) it2.next()).l());
        }
        return arrayList2;
    }

    public static final long b(dl0 dl0Var) {
        Intrinsics.checkNotNullParameter(dl0Var, "<this>");
        return dl0Var.u().intValue() * 5000;
    }
}
