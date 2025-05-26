package com.pinterest.api.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class hx0 implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    public final int f38561a;

    /* renamed from: b, reason: collision with root package name */
    public final f30 f38562b;

    /* renamed from: c, reason: collision with root package name */
    public final String f38563c;

    static {
        new gx0(null);
    }

    public hx0(int i13, @NotNull f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f38561a = i13;
        this.f38562b = pin;
        this.f38563c = "UNIFIED_COMMENTS_COUNT_HEADER_ITEM_ID";
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return this.f38563c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(hx0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.api.model.ActivityComposeItem");
        return false;
    }

    public final int hashCode() {
        return this.f38563c.hashCode();
    }
}
