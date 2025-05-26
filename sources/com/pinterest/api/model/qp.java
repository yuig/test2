package com.pinterest.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class qp {

    /* renamed from: a, reason: collision with root package name */
    public final String f41349a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f41350b;

    public qp(@NotNull String link, Boolean bool) {
        Intrinsics.checkNotNullParameter(link, "link");
        this.f41349a = link;
        this.f41350b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp)) {
            return false;
        }
        qp qpVar = (qp) obj;
        return Intrinsics.d(this.f41349a, qpVar.f41349a) && Intrinsics.d(this.f41350b, qpVar.f41350b);
    }

    public final int hashCode() {
        int hashCode = this.f41349a.hashCode() * 31;
        Boolean bool = this.f41350b;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("IdeaPinLink(link=");
        sb3.append(this.f41349a);
        sb3.append(", isValid=");
        return a.c.h(sb3, this.f41350b, ")");
    }

    public /* synthetic */ qp(String str, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : bool);
    }
}
