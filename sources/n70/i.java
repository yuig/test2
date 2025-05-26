package n70;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements m {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f89616a;

    /* renamed from: b, reason: collision with root package name */
    public final String f89617b;

    public i(f30 newPin, String originalPinId) {
        Intrinsics.checkNotNullParameter(newPin, "newPin");
        Intrinsics.checkNotNullParameter(originalPinId, "originalPinId");
        this.f89616a = newPin;
        this.f89617b = originalPinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f89616a, iVar.f89616a) && Intrinsics.d(this.f89617b, iVar.f89617b);
    }

    public final int hashCode() {
        return this.f89617b.hashCode() + (this.f89616a.hashCode() * 31);
    }

    public final String toString() {
        return "PinSaved(newPin=" + this.f89616a + ", originalPinId=" + this.f89617b + ")";
    }
}
