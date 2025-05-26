package sv;

import com.pinterest.framework.screens.ScreenLocation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n implements o {

    /* renamed from: a, reason: collision with root package name */
    public final ScreenLocation f115309a;

    public n(ScreenLocation location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f115309a = location;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.f115309a, ((n) obj).f115309a);
    }

    public final int hashCode() {
        return this.f115309a.hashCode();
    }

    public final String toString() {
        return "ScreenClosed(location=" + this.f115309a + ")";
    }
}
