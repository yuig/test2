package y52;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f137888a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f137889b;

    public z(h32.i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f137888a = context;
        this.f137889b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.d(this.f137888a, zVar.f137888a) && Intrinsics.d(this.f137889b, zVar.f137889b);
    }

    @Override // y52.a0
    public final HashMap getAuxData() {
        return this.f137889b;
    }

    @Override // y52.a0
    public final h32.i0 getContext() {
        return this.f137888a;
    }

    public final int hashCode() {
        return this.f137889b.hashCode() + (this.f137888a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogViewEvent(context=");
        sb3.append(this.f137888a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f137889b, ")");
    }
}
