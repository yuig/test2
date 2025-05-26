package tu;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f119312a;

    public y(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f119312a = pin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Intrinsics.d(this.f119312a, ((y) obj).f119312a);
    }

    public final int hashCode() {
        return this.f119312a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("PerformSpamCheck(pin="), this.f119312a, ")");
    }
}
