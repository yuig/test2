package com.pinterest.api.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ge implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f38048a;

    /* renamed from: b, reason: collision with root package name */
    public final String f38049b;

    static {
        new fe(null);
    }

    public ge(@NotNull f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f38048a = pin;
        this.f38049b = "COMMUNITY_INSIGHT_HEADER_ITEM_ID";
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f38049b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(ge.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.api.model.ActivityComposeItem");
        return false;
    }

    public final int hashCode() {
        return this.f38049b.hashCode();
    }
}
