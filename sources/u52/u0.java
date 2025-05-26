package u52;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f120738a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f120739b;

    public u0(h32.i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f120738a = context;
        this.f120739b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Intrinsics.d(this.f120738a, u0Var.f120738a) && Intrinsics.d(this.f120739b, u0Var.f120739b);
    }

    public final int hashCode() {
        return this.f120739b.hashCode() + (this.f120738a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogReplacePinsClick(context=");
        sb3.append(this.f120738a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f120739b, ")");
    }
}
