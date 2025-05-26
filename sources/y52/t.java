package y52;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f137847a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f137848b;

    public t(h32.i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f137847a = context;
        this.f137848b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f137847a, tVar.f137847a) && Intrinsics.d(this.f137848b, tVar.f137848b);
    }

    @Override // y52.a0
    public final HashMap getAuxData() {
        return this.f137848b;
    }

    @Override // y52.a0
    public final h32.i0 getContext() {
        return this.f137847a;
    }

    public final int hashCode() {
        return this.f137848b.hashCode() + (this.f137847a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogClickShareToInstagram(context=");
        sb3.append(this.f137847a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f137848b, ")");
    }
}
