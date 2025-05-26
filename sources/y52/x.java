package y52;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f137868a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f137869b;

    public x(h32.i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f137868a = context;
        this.f137869b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.f137868a, xVar.f137868a) && Intrinsics.d(this.f137869b, xVar.f137869b);
    }

    @Override // y52.a0
    public final HashMap getAuxData() {
        return this.f137869b;
    }

    @Override // y52.a0
    public final h32.i0 getContext() {
        return this.f137868a;
    }

    public final int hashCode() {
        return this.f137869b.hashCode() + (this.f137868a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogTooltipDismiss(context=");
        sb3.append(this.f137868a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f137869b, ")");
    }
}
