package w21;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p1 implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f127769a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f127770b;

    public p1(h32.i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f127769a = context;
        this.f127770b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return Intrinsics.d(this.f127769a, p1Var.f127769a) && Intrinsics.d(this.f127770b, p1Var.f127770b);
    }

    @Override // w21.q1
    public final HashMap getAuxData() {
        return this.f127770b;
    }

    @Override // w21.q1
    public final h32.i0 getContext() {
        return this.f127769a;
    }

    public final int hashCode() {
        return this.f127770b.hashCode() + (this.f127769a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogView(context=");
        sb3.append(this.f127769a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f127770b, ")");
    }
}
