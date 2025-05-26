package fz0;

import h32.i0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements q {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f63144a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f63145b;

    public o(i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f63144a = context;
        this.f63145b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f63144a, oVar.f63144a) && Intrinsics.d(this.f63145b, oVar.f63145b);
    }

    public final int hashCode() {
        return this.f63145b.hashCode() + (this.f63144a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogBackClick(context=");
        sb3.append(this.f63144a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f63145b, ")");
    }
}
