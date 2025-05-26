package ni1;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f90790a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f90791b;

    public s(f30 pin, boolean z13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f90790a = pin;
        this.f90791b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f90790a, sVar.f90790a) && this.f90791b == sVar.f90791b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f90791b) + (this.f90790a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RegisterAttributionSourceEvent(pin=");
        sb3.append(this.f90790a);
        sb3.append(", isClick=");
        return a.a.r(sb3, this.f90791b, ")");
    }
}
