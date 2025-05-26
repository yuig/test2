package cj0;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u0 implements h {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f27868a;

    public u0(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f27868a = pin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0) && Intrinsics.d(this.f27868a, ((u0) obj).f27868a);
    }

    public final int hashCode() {
        return this.f27868a.hashCode();
    }

    public final String toString() {
        return jq.b.e(new StringBuilder("PinSaveButtonClicked(pin="), this.f27868a, ")");
    }
}
