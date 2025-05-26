package u52;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f120735a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f120736b;

    public t0(h32.i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f120735a = context;
        this.f120736b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Intrinsics.d(this.f120735a, t0Var.f120735a) && Intrinsics.d(this.f120736b, t0Var.f120736b);
    }

    public final int hashCode() {
        return this.f120736b.hashCode() + (this.f120735a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogDoneClick(context=");
        sb3.append(this.f120735a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f120736b, ")");
    }
}
