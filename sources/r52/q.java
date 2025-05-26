package r52;

import h32.i0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q implements s {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f106294a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f106295b;

    public q(i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f106294a = context;
        this.f106295b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f106294a, qVar.f106294a) && Intrinsics.d(this.f106295b, qVar.f106295b);
    }

    public final int hashCode() {
        return this.f106295b.hashCode() + (this.f106294a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogBackClick(context=");
        sb3.append(this.f106294a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f106295b, ")");
    }
}
