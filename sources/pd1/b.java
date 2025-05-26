package pd1;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;

/* loaded from: classes5.dex */
public final class b implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f99803a;

    public b(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f99803a = pin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f99803a, ((b) obj).f99803a);
    }

    public final int hashCode() {
        return this.f99803a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("PinItem(pin="), this.f99803a, ")");
    }
}
