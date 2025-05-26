package y52;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f137852a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f137853b;

    public u(h32.i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f137852a = context;
        this.f137853b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f137852a, uVar.f137852a) && Intrinsics.d(this.f137853b, uVar.f137853b);
    }

    @Override // y52.a0
    public final HashMap getAuxData() {
        return this.f137853b;
    }

    @Override // y52.a0
    public final h32.i0 getContext() {
        return this.f137852a;
    }

    public final int hashCode() {
        return this.f137853b.hashCode() + (this.f137852a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogCopyLink(context=");
        sb3.append(this.f137852a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f137853b, ")");
    }
}
