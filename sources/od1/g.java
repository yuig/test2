package od1;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements l {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f94124a;

    public g(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f94124a = pin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f94124a, ((g) obj).f94124a);
    }

    public final int hashCode() {
        return this.f94124a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("PinLoaded(pin="), this.f94124a, ")");
    }
}
