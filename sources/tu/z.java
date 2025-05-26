package tu;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f119313a;

    public z(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f119313a = pin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.d(this.f119313a, ((z) obj).f119313a);
    }

    public final int hashCode() {
        return this.f119313a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("RegisterAttributionSourceEvent(pin="), this.f119313a, ")");
    }
}
