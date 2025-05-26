package g90;

import com.pinterest.framework.screens.ScreenLocation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final ScreenLocation f64527a;

    public g(ScreenLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f64527a = location;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f64527a, ((g) obj).f64527a);
    }

    public final int hashCode() {
        return this.f64527a.hashCode();
    }

    public final String toString() {
        return "SheetDismissed(location=" + this.f64527a + ")";
    }
}
