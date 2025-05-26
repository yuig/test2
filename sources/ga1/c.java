package ga1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final e82.u f64618a;

    public c(e82.u backfillOption) {
        Intrinsics.checkNotNullParameter(backfillOption, "backfillOption");
        this.f64618a = backfillOption;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f64618a == ((c) obj).f64618a;
    }

    public final int hashCode() {
        return this.f64618a.hashCode();
    }

    public final String toString() {
        return "BackfillOptionSelected(backfillOption=" + this.f64618a + ")";
    }
}
