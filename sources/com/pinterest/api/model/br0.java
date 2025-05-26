package com.pinterest.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class br0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    public final String f36172a;

    static {
        new ar0(null);
    }

    public br0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return this.f36172a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof br0) && Intrinsics.d(this.f36172a, ((br0) obj).f36172a);
    }

    public final int hashCode() {
        return this.f36172a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("StructuredFeedEOFEmptyStateModel(uid="), this.f36172a, ")");
    }

    public br0(@NotNull String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f36172a = uid;
    }

    public /* synthetic */ br0(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "structured_feed_eof_view" : str);
    }
}
