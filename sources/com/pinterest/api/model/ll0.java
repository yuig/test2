package com.pinterest.api.model;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ll0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final ll0 f39817i = new ll0();

    public ll0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        uo0 page = (uo0) obj;
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(page, "<this>");
        cp0[] values = cp0.values();
        ArrayList arrayList = new ArrayList();
        for (cp0 cp0Var : values) {
            if (cp0Var != cp0.AD) {
                arrayList.add(cp0Var);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(cp0.valueOf(((cp0) it.next()).name()).getType()));
        }
        return Boolean.valueOf(arrayList2.contains(page.r()));
    }
}
