package p90;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y0 implements z0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f99248a;

    /* renamed from: b, reason: collision with root package name */
    public final String f99249b;

    public y0(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f99248a = pin;
        String id3 = pin.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        this.f99249b = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0) && Intrinsics.d(this.f99248a, ((y0) obj).f99248a);
    }

    @Override // p90.z0
    public final String getId() {
        return this.f99249b;
    }

    public final int hashCode() {
        return this.f99248a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("PinSourceMetadataVMState(pin="), this.f99248a, ")");
    }
}
