package al1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final List f15484a;

    /* renamed from: b, reason: collision with root package name */
    public final o f15485b;

    public g(List locations, o result) {
        Intrinsics.checkNotNullParameter(locations, "locations");
        Intrinsics.checkNotNullParameter("com.pinterest.EXTRA_COLLAGE_PICKER_RESULT_CODE", "bundleId");
        Intrinsics.checkNotNullParameter(result, "result");
        this.f15484a = locations;
        this.f15485b = result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f15484a, gVar.f15484a) && Intrinsics.d("com.pinterest.EXTRA_COLLAGE_PICKER_RESULT_CODE", "com.pinterest.EXTRA_COLLAGE_PICKER_RESULT_CODE") && Intrinsics.d(this.f15485b, gVar.f15485b);
    }

    public final int hashCode() {
        return this.f15485b.hashCode() + (((this.f15484a.hashCode() * 31) + 2134935546) * 31);
    }

    public final String toString() {
        return "RemoveFromBackStackWithResult(locations=" + this.f15484a + ", bundleId=com.pinterest.EXTRA_COLLAGE_PICKER_RESULT_CODE, result=" + this.f15485b + ")";
    }
}
