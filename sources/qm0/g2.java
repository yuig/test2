package qm0;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g2 implements h2 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f104275a;

    public g2(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f104275a = pin;
        Intrinsics.checkNotNullExpressionValue(pin.getUid(), "getUid(...)");
        bs1.c.p0(pin);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2) && Intrinsics.d(this.f104275a, ((g2) obj).f104275a);
    }

    public final int hashCode() {
        return this.f104275a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("PinPreview(pin="), this.f104275a, ")");
    }
}
