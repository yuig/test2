package h31;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;

/* loaded from: classes5.dex */
public final class f implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f66811a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f66812b;

    public f(f30 pin, boolean z13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f66811a = pin;
        this.f66812b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f66811a, fVar.f66811a) && this.f66812b == fVar.f66812b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f66812b) + (this.f66811a.hashCode() * 31);
    }

    public final String toString() {
        return "PinItem(pin=" + this.f66811a + ", isMe=" + this.f66812b + ")";
    }
}
