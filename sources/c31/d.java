package c31;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements j {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f25574a;

    public d(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f25574a = pin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f25574a, ((d) obj).f25574a);
    }

    public final int hashCode() {
        return this.f25574a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("PinClicked(pin="), this.f25574a, ")");
    }
}
