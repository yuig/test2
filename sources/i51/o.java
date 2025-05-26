package i51;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements r {

    /* renamed from: a, reason: collision with root package name */
    public final bq.b f71600a;

    public o(bq.b sortingOption) {
        Intrinsics.checkNotNullParameter(sortingOption, "sortingOption");
        this.f71600a = sortingOption;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.f71600a == ((o) obj).f71600a;
    }

    public final int hashCode() {
        return this.f71600a.hashCode();
    }

    public final String toString() {
        return "SortOptionSelected(sortingOption=" + this.f71600a + ")";
    }
}
