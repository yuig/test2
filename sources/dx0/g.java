package dx0;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f56438a;

    public g(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f56438a = pin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f56438a, ((g) obj).f56438a);
    }

    public final int hashCode() {
        return this.f56438a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("ItemOneTapSaved(pin="), this.f56438a, ")");
    }
}
