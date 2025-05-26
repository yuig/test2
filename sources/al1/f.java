package al1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final List f15483a;

    public f(List locations) {
        Intrinsics.checkNotNullParameter(locations, "locations");
        this.f15483a = locations;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f15483a, ((f) obj).f15483a);
    }

    public final int hashCode() {
        return this.f15483a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("RemoveFromBackStack(locations="), this.f15483a, ")");
    }
}
