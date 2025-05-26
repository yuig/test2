package ek1;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f59262a;

    /* renamed from: b, reason: collision with root package name */
    public final nv.c f59263b;

    public j0(f30 pin, nv.c pinValidationContext) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pinValidationContext, "pinValidationContext");
        this.f59262a = pin;
        this.f59263b = pinValidationContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return Intrinsics.d(this.f59262a, j0Var.f59262a) && Intrinsics.d(this.f59263b, j0Var.f59263b);
    }

    public final int hashCode() {
        return this.f59263b.hashCode() + (this.f59262a.hashCode() * 31);
    }

    public final String toString() {
        return "ValidateAndLogError(pin=" + this.f59262a + ", pinValidationContext=" + this.f59263b + ")";
    }
}
