package jx1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f implements l {

    /* renamed from: a, reason: collision with root package name */
    public final gx1.d f77683a;

    public f(gx1.d audienceType) {
        Intrinsics.checkNotNullParameter(audienceType, "audienceType");
        this.f77683a = audienceType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f77683a == ((f) obj).f77683a;
    }

    public final int hashCode() {
        return this.f77683a.hashCode();
    }

    public final String toString() {
        return "FetchData(audienceType=" + this.f77683a + ")";
    }
}
