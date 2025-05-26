package n70;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f89607a;

    public e0(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f89607a = pin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && Intrinsics.d(this.f89607a, ((e0) obj).f89607a);
    }

    public final int hashCode() {
        return this.f89607a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("RemoveSavedPin(pin="), this.f89607a, ")");
    }
}
