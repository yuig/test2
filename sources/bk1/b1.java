package bk1;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b1 implements o1 {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f23182a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23183b;

    /* renamed from: c, reason: collision with root package name */
    public final g2 f23184c;

    public b1(f30 pin, boolean z13, g2 source) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f23182a = pin;
        this.f23183b = z13;
        this.f23184c = source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return Intrinsics.d(this.f23182a, b1Var.f23182a) && this.f23183b == b1Var.f23183b && this.f23184c == b1Var.f23184c;
    }

    public final int hashCode() {
        return this.f23184c.hashCode() + ep.b.e(this.f23183b, this.f23182a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "PinActionHandlerSER(pin=" + this.f23182a + ", shouldLog=" + this.f23183b + ", source=" + this.f23184c + ")";
    }
}
