package om0;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f96499a;

    /* renamed from: b, reason: collision with root package name */
    public final int f96500b;

    public g0(int i13, f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f96499a = pin;
        this.f96500b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.d(this.f96499a, g0Var.f96499a) && this.f96500b == g0Var.f96500b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f96500b) + (this.f96499a.hashCode() * 31);
    }

    public final String toString() {
        return "PinRepState(pin=" + this.f96499a + ", position=" + this.f96500b + ")";
    }
}
