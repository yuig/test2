package bk1;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g1 implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f23228a;

    public g1(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f23228a = pin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1) && Intrinsics.d(this.f23228a, ((g1) obj).f23228a);
    }

    public final int hashCode() {
        return this.f23228a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("WarmupStoryPinCloseup(pin="), this.f23228a, ")");
    }
}
