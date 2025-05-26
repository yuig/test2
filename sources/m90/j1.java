package m90;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j1 implements k1 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f86667a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86668b;

    public j1(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f86667a = pin;
        String id3 = pin.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        this.f86668b = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1) && Intrinsics.d(this.f86667a, ((j1) obj).f86667a);
    }

    @Override // m90.k1
    public final String getId() {
        return this.f86668b;
    }

    public final int hashCode() {
        return this.f86667a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("CollageContentPinVMState(pin="), this.f86667a, ")");
    }
}
