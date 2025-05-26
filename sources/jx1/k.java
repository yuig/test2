package jx1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k implements l {

    /* renamed from: a, reason: collision with root package name */
    public final ox1.a f77690a;

    public k(ox1.a location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f77690a = location;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f77690a == ((k) obj).f77690a;
    }

    public final int hashCode() {
        return this.f77690a.hashCode();
    }

    public final String toString() {
        return "OnTopLocationSelected(location=" + this.f77690a + ")";
    }
}
