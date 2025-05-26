package mu;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f88196a;

    /* renamed from: b, reason: collision with root package name */
    public final jo1.a f88197b;

    public d0(f30 pin, jo1.a fragmentType) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(fragmentType, "fragmentType");
        this.f88196a = pin;
        this.f88197b = fragmentType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.d(this.f88196a, d0Var.f88196a) && this.f88197b == d0Var.f88197b;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f88197b.hashCode() + (this.f88196a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "OverflowModalAction(pin=" + this.f88196a + ", fragmentType=" + this.f88197b + ", isCloseup=true)";
    }
}
