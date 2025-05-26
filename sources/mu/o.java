package mu;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o implements q {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f88219a;

    public o(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f88219a = pin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f88219a, ((o) obj).f88219a);
    }

    public final int hashCode() {
        return this.f88219a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("GetLastCarouselIndexForPin(pin="), this.f88219a, ")");
    }
}
