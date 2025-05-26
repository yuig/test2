package com.pinterest.api.model;

import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zg0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    public final List f44324a;

    static {
        new yg0(null);
    }

    public zg0(@NotNull List<? extends xg0> tabs) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f44324a = tabs;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return String.valueOf(Objects.hash(this.f44324a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zg0) && Intrinsics.d(this.f44324a, ((zg0) obj).f44324a);
    }

    public final int hashCode() {
        return this.f44324a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("SearchFeedTabsResponse(tabs="), this.f44324a, ")");
    }
}
