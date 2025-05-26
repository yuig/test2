package p90;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements l {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f99188a;

    public g(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f99188a = pin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f99188a, ((g) obj).f99188a);
    }

    public final int hashCode() {
        return this.f99188a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("PinClicked(pin="), this.f99188a, ")");
    }
}
