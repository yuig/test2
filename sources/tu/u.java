package tu;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u implements w {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f119310a;

    public u(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f119310a = pin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f119310a, ((u) obj).f119310a);
    }

    @Override // tu.w
    public final String getPinId() {
        String f39332b = this.f119310a.getF39332b();
        Intrinsics.checkNotNullExpressionValue(f39332b, "getUid(...)");
        return f39332b;
    }

    public final int hashCode() {
        return this.f119310a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("LoadedPin(pin="), this.f119310a, ")");
    }
}
