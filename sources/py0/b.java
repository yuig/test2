package py0;

import com.pinterest.api.model.f30;
import h32.a4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f101734a;

    /* renamed from: b, reason: collision with root package name */
    public final a4 f101735b;

    public b(f30 pin, a4 a4Var) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f101734a = pin;
        this.f101735b = a4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f101734a, bVar.f101734a) && this.f101735b == bVar.f101735b;
    }

    public final int hashCode() {
        int hashCode = this.f101734a.hashCode() * 31;
        a4 a4Var = this.f101735b;
        return hashCode + (a4Var == null ? 0 : a4Var.hashCode());
    }

    public final String toString() {
        return "RecordPinSelected(pin=" + this.f101734a + ", viewParameter=" + this.f101735b + ")";
    }
}
