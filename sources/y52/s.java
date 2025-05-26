package y52;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f137842a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f137843b;

    public s(h32.i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f137842a = context;
        this.f137843b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f137842a, sVar.f137842a) && Intrinsics.d(this.f137843b, sVar.f137843b);
    }

    @Override // y52.a0
    public final HashMap getAuxData() {
        return this.f137843b;
    }

    @Override // y52.a0
    public final h32.i0 getContext() {
        return this.f137842a;
    }

    public final int hashCode() {
        return this.f137843b.hashCode() + (this.f137842a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogClickBackButton(context=");
        sb3.append(this.f137842a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f137843b, ")");
    }
}
