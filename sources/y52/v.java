package y52;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f137856a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f137857b;

    public v(h32.i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f137856a = context;
        this.f137857b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.f137856a, vVar.f137856a) && Intrinsics.d(this.f137857b, vVar.f137857b);
    }

    @Override // y52.a0
    public final HashMap getAuxData() {
        return this.f137857b;
    }

    @Override // y52.a0
    public final h32.i0 getContext() {
        return this.f137856a;
    }

    public final int hashCode() {
        return this.f137857b.hashCode() + (this.f137856a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogLinkFieldClick(context=");
        sb3.append(this.f137856a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f137857b, ")");
    }
}
