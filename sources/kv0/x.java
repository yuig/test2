package kv0;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f81023a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81024b;

    public x(f30 pin, boolean z13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f81023a = pin;
        this.f81024b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.f81023a, xVar.f81023a) && this.f81024b == xVar.f81024b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f81024b) + (this.f81023a.hashCode() * 31);
    }

    public final String toString() {
        return "ProductPin(pin=" + this.f81023a + ", isEditable=" + this.f81024b + ")";
    }
}
