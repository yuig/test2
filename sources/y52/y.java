package y52;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f137886a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f137887b;

    public y(h32.i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f137886a = context;
        this.f137887b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.f137886a, yVar.f137886a) && Intrinsics.d(this.f137887b, yVar.f137887b);
    }

    @Override // y52.a0
    public final HashMap getAuxData() {
        return this.f137887b;
    }

    @Override // y52.a0
    public final h32.i0 getContext() {
        return this.f137886a;
    }

    public final int hashCode() {
        return this.f137887b.hashCode() + (this.f137886a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogTooltipRender(context=");
        sb3.append(this.f137886a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f137887b, ")");
    }
}
