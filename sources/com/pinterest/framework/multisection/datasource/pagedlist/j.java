package com.pinterest.framework.multisection.datasource.pagedlist;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements wt1.a {

    /* renamed from: a, reason: collision with root package name */
    public Function1 f49143a;

    public j(Function1 function1) {
        this.f49143a = function1;
    }

    @Override // wt1.a
    public boolean y(Object obj, Object obj2) {
        Function1 function1 = this.f49143a;
        return Intrinsics.d(function1.invoke(obj), function1.invoke(obj2));
    }
}
