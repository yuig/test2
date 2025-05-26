package ti1;

import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final LegoPinGridCellImpl f117707a;

    public c(LegoPinGridCellImpl value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f117707a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f117707a, ((c) obj).f117707a);
    }

    public final int hashCode() {
        return this.f117707a.hashCode();
    }

    public final String toString() {
        return "LPGC(value=" + this.f117707a + ")";
    }
}
