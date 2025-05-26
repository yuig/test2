package mu;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k implements m {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f88209a;

    /* renamed from: b, reason: collision with root package name */
    public final int f88210b;

    public k(int i13, f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f88209a = pin;
        this.f88210b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f88209a, kVar.f88209a) && this.f88210b == kVar.f88210b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f88210b) + (this.f88209a.hashCode() * 31);
    }

    public final String toString() {
        return "PinLoaded(pin=" + this.f88209a + ", cachedCarouselIndex=" + this.f88210b + ")";
    }
}
