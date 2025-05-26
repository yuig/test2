package com.pinterest.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class jx implements dl1.s {
    static {
        new ix(null);
    }

    public jx(@NotNull String query, boolean z13) {
        Intrinsics.checkNotNullParameter(query, "query");
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getPath() {
        String simpleName = jx.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    public /* synthetic */ jx(String str, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, z13);
    }
}
