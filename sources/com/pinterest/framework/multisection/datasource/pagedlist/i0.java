package com.pinterest.framework.multisection.datasource.pagedlist;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f49140a;

    /* renamed from: b, reason: collision with root package name */
    public final List f49141b;

    /* renamed from: c, reason: collision with root package name */
    public final String f49142c;

    public i0(String bookmark, String str, List models) {
        Intrinsics.checkNotNullParameter(bookmark, "bookmark");
        Intrinsics.checkNotNullParameter(models, "models");
        this.f49140a = bookmark;
        this.f49141b = models;
        this.f49142c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Intrinsics.d(this.f49140a, i0Var.f49140a) && Intrinsics.d(this.f49141b, i0Var.f49141b) && Intrinsics.d(this.f49142c, i0Var.f49142c);
    }

    public final int hashCode() {
        int c13 = ep.b.c(this.f49141b, this.f49140a.hashCode() * 31, 31);
        String str = this.f49142c;
        return c13 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PagedResponse(bookmark=");
        sb3.append(this.f49140a);
        sb3.append(", models=");
        sb3.append(this.f49141b);
        sb3.append(", url=");
        return a.a.p(sb3, this.f49142c, ")");
    }
}
