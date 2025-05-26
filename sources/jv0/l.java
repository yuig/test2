package jv0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l extends l3.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f77641a;

    public l(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f77641a = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f77641a, ((l) obj).f77641a);
    }

    public final int hashCode() {
        return this.f77641a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ItemAddSelected(pinId="), this.f77641a, ")");
    }
}
