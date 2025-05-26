package bk1;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a1 implements o1 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f23153a;

    public a1(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f23153a = pin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1) && Intrinsics.d(this.f23153a, ((a1) obj).f23153a);
    }

    public final int hashCode() {
        return this.f23153a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("PerfLogApplicationUtilsSER(pin="), this.f23153a, ")");
    }
}
