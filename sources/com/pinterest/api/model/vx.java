package com.pinterest.api.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class vx implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    public final String f43014a;

    static {
        new ux(null);
    }

    public vx(@NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f43014a = query;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        String simpleName = vx.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }
}
