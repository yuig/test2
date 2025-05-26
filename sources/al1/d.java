package al1;

import com.pinterest.framework.screens.ScreenLocation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements i {

    /* renamed from: a, reason: collision with root package name */
    public final ScreenLocation f15479a;

    /* renamed from: b, reason: collision with root package name */
    public final o f15480b;

    public d(ScreenLocation stopPoppingAt, o result) {
        Intrinsics.checkNotNullParameter(stopPoppingAt, "stopPoppingAt");
        Intrinsics.checkNotNullParameter("RemixPinSelection.REMIX_PIN__SELECTION_RESULT_CODE", "bundleId");
        Intrinsics.checkNotNullParameter(result, "result");
        this.f15479a = stopPoppingAt;
        this.f15480b = result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f15479a, dVar.f15479a) && Intrinsics.d("RemixPinSelection.REMIX_PIN__SELECTION_RESULT_CODE", "RemixPinSelection.REMIX_PIN__SELECTION_RESULT_CODE") && Intrinsics.d(this.f15480b, dVar.f15480b);
    }

    public final int hashCode() {
        return this.f15480b.hashCode() + (((this.f15479a.hashCode() * 31) + 320142155) * 31);
    }

    public final String toString() {
        return "PopBackStackUntilWithResult(stopPoppingAt=" + this.f15479a + ", bundleId=RemixPinSelection.REMIX_PIN__SELECTION_RESULT_CODE, result=" + this.f15480b + ")";
    }
}
