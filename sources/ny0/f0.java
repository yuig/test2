package ny0;

import a.cb;
import com.pinterest.api.model.f30;
import h32.a4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f92589a;

    /* renamed from: b, reason: collision with root package name */
    public final String f92590b;

    /* renamed from: c, reason: collision with root package name */
    public final a4 f92591c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f92592d;

    public f0(f30 pin, String useCaseId, a4 a4Var, boolean z13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(useCaseId, "useCaseId");
        this.f92589a = pin;
        this.f92590b = useCaseId;
        this.f92591c = a4Var;
        this.f92592d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.d(this.f92589a, f0Var.f92589a) && Intrinsics.d(this.f92590b, f0Var.f92590b) && this.f92591c == f0Var.f92591c && this.f92592d == f0Var.f92592d;
    }

    public final int hashCode() {
        int d2 = cb.d(this.f92590b, this.f92589a.hashCode() * 31, 31);
        a4 a4Var = this.f92591c;
        return Boolean.hashCode(this.f92592d) + ((d2 + (a4Var == null ? 0 : a4Var.hashCode())) * 31);
    }

    public final String toString() {
        return "TogglePinSelection(pin=" + this.f92589a + ", useCaseId=" + this.f92590b + ", viewParameter=" + this.f92591c + ", shouldToggleOnApi=" + this.f92592d + ")";
    }
}
