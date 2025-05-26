package com.pinterest.framework.multisection.datasource.pagedlist;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final List f49145a;

    /* renamed from: b, reason: collision with root package name */
    public final String f49146b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f49147c;

    public l(String str, List responseItems, boolean z13) {
        Intrinsics.checkNotNullParameter(responseItems, "responseItems");
        this.f49145a = responseItems;
        this.f49146b = str;
        this.f49147c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f49145a, lVar.f49145a) && Intrinsics.d(this.f49146b, lVar.f49146b) && this.f49147c == lVar.f49147c;
    }

    public final int hashCode() {
        int hashCode = this.f49145a.hashCode() * 31;
        String str = this.f49146b;
        return Boolean.hashCode(this.f49147c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ParsedResponse(responseItems=");
        sb3.append(this.f49145a);
        sb3.append(", endCursor=");
        sb3.append(this.f49146b);
        sb3.append(", hasNextPage=");
        return a.a.r(sb3, this.f49147c, ")");
    }
}
