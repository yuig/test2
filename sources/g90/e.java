package g90;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    public final List f64525a;

    public e(ArrayList cutouts) {
        Intrinsics.checkNotNullParameter(cutouts, "cutouts");
        this.f64525a = cutouts;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f64525a, ((e) obj).f64525a);
    }

    public final int hashCode() {
        return this.f64525a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("CutoutsLoaded(cutouts="), this.f64525a, ")");
    }
}
