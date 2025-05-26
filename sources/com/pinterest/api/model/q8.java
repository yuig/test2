package com.pinterest.api.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class q8 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    public final String f41229a;

    /* renamed from: b, reason: collision with root package name */
    public List f41230b;

    static {
        new p8(null);
    }

    public q8(@NotNull String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f41229a = uid;
    }

    public final void a(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getUid() {
        return this.f41229a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q8) && Intrinsics.d(this.f41229a, ((q8) obj).f41229a);
    }

    public final int hashCode() {
        return this.f41229a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("BoardMoreIdeasCardsCarousel(uid="), this.f41229a, ")");
    }
}
