package com.pinterest.feature.unauth.sba;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface e0 extends l82.i0 {
    static c0 n(e0 e0Var) {
        y yVar = y.f48879a;
        v onItemTap = v.f48876l;
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        Intrinsics.checkNotNullParameter(onItemTap, "onItemTap");
        return new c0(e0Var.getTitle(), e0Var.getDescription(), e0Var.u(), e0Var.e(), e0Var.l(), e0Var.g(), e0Var.s(), e0Var.a());
    }

    String a();

    String e();

    String g();

    String getDescription();

    String getId();

    String getTitle();

    String l();

    String s();

    String u();
}
