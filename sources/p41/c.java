package p41;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f98850a;

    public c(b tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        this.f98850a = tab;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f98850a, ((c) obj).f98850a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f98850a.f98844a);
    }

    public final String toString() {
        return "UserProfileTabConfiguration(tab=" + this.f98850a + ")";
    }
}
