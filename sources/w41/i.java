package w41;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f128016a;

    public i(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f128016a = pin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f128016a, ((i) obj).f128016a);
    }

    public final int hashCode() {
        return this.f128016a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("ProfilePinVMState(pin="), this.f128016a, ")");
    }
}
