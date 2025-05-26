package al1;

import com.pinterest.framework.screens.ScreenLocation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final ScreenLocation f15478a;

    public c(ScreenLocation stopPoppingAt) {
        Intrinsics.checkNotNullParameter(stopPoppingAt, "stopPoppingAt");
        this.f15478a = stopPoppingAt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f15478a, ((c) obj).f15478a);
    }

    public final int hashCode() {
        return this.f15478a.hashCode();
    }

    public final String toString() {
        return "PopBackStackUntil(stopPoppingAt=" + this.f15478a + ")";
    }
}
