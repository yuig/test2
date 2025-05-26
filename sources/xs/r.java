package xs;

import com.pinterest.api.model.b1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r implements y {

    /* renamed from: a, reason: collision with root package name */
    public final b1 f135755a;

    public r(b1 adsCartingData) {
        Intrinsics.checkNotNullParameter(adsCartingData, "adsCartingData");
        this.f135755a = adsCartingData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f135755a, ((r) obj).f135755a);
    }

    public final int hashCode() {
        return this.f135755a.hashCode();
    }

    public final String toString() {
        return "LaunchRetailerEmptyScreen(adsCartingData=" + this.f135755a + ")";
    }
}
