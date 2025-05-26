package m90;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements m {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f86661a;

    public i(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f86661a = pin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f86661a, ((i) obj).f86661a);
    }

    public final int hashCode() {
        return this.f86661a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("PinClicked(pin="), this.f86661a, ")");
    }
}
