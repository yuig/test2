package n70;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements m {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f89605a;

    public c(ArrayList appliedProductFilters) {
        Intrinsics.checkNotNullParameter(appliedProductFilters, "appliedProductFilters");
        this.f89605a = appliedProductFilters;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f89605a, ((c) obj).f89605a);
    }

    public final int hashCode() {
        return this.f89605a.hashCode();
    }

    public final String toString() {
        return "FiltersUpdated(appliedProductFilters=" + this.f89605a + ")";
    }
}
