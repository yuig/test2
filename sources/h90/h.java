package h90;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f68260a;

    public h(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f68260a = pin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f68260a, ((h) obj).f68260a);
    }

    public final int hashCode() {
        return this.f68260a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("PinClicked(pin="), this.f68260a, ")");
    }
}
