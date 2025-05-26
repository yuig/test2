package com.pinterest.api.model;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    public final String f37398a = "ACTIVITY_COMPOSER_MODEL_ID";

    static {
        new e(null);
    }

    public f(boolean z13) {
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getPath() {
        return this.f37398a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(f.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type com.pinterest.api.model.ActivityComposeItem");
        return Intrinsics.d(this.f37398a, ((f) obj).f37398a);
    }

    public final int hashCode() {
        return this.f37398a.hashCode();
    }
}
