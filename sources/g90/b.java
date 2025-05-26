package g90;

import com.pinterest.framework.screens.ScreenLocation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final ScreenLocation f64508a;

    public b(ScreenLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f64508a = location;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f64508a, ((b) obj).f64508a);
    }

    public final int hashCode() {
        return this.f64508a.hashCode();
    }

    public final String toString() {
        return "CancelButtonClicked(location=" + this.f64508a + ")";
    }
}
