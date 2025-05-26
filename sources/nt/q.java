package nt;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q extends gh0.b {

    /* renamed from: b, reason: collision with root package name */
    public final String f92138b;

    public q(String gender) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        this.f92138b = gender;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.d(this.f92138b, ((q) obj).f92138b);
    }

    public final int hashCode() {
        return this.f92138b.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("StringGenderName(gender="), this.f92138b, ")");
    }
}
