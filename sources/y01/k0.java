package y01;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f136426a;

    public k0(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f136426a = pin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && Intrinsics.d(this.f136426a, ((k0) obj).f136426a);
    }

    public final int hashCode() {
        return this.f136426a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("OnCheckPinSpamRequested(pin="), this.f136426a, ")");
    }
}
