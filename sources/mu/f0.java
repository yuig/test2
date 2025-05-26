package mu;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f88201a;

    public f0(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f88201a = pin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && Intrinsics.d(this.f88201a, ((f0) obj).f88201a);
    }

    @Override // mu.h0
    public final String getPinId() {
        String id3 = this.f88201a.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        return id3;
    }

    public final int hashCode() {
        return this.f88201a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("LoadedPin(pin="), this.f88201a, ")");
    }
}
