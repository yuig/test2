package bk1;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r0 implements o1 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f23308a;

    public r0(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f23308a = pin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && Intrinsics.d(this.f23308a, ((r0) obj).f23308a);
    }

    public final int hashCode() {
        return this.f23308a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("ComputeDeferredClickthroughValues(pin="), this.f23308a, ")");
    }
}
