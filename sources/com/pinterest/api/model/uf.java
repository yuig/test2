package com.pinterest.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class uf {
    private uf() {
    }

    public /* synthetic */ uf(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static vf a(vd0.c coverPositionObject) {
        Intrinsics.checkNotNullParameter(coverPositionObject, "coverPositionObject");
        return new vf(Double.valueOf(coverPositionObject.i("x", Double.NaN)), Double.valueOf(coverPositionObject.i("y", Double.NaN)));
    }
}
