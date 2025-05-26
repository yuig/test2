package u52;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f120730a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f120731b;

    public s0(h32.i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f120730a = context;
        this.f120731b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return Intrinsics.d(this.f120730a, s0Var.f120730a) && Intrinsics.d(this.f120731b, s0Var.f120731b);
    }

    public final int hashCode() {
        return this.f120731b.hashCode() + (this.f120730a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogBackClick(context=");
        sb3.append(this.f120730a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f120731b, ")");
    }
}
