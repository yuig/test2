package p90;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c1 implements d1 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f99179a;

    /* renamed from: b, reason: collision with root package name */
    public final String f99180b;

    public c1(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f99179a = pin;
        String id3 = pin.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        this.f99180b = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1) && Intrinsics.d(this.f99179a, ((c1) obj).f99179a);
    }

    public final int hashCode() {
        return this.f99179a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("RelatedPinVMState(pin="), this.f99179a, ")");
    }
}
