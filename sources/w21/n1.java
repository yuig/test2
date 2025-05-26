package w21;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n1 implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f127756a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f127757b;

    public n1(h32.i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f127756a = context;
        this.f127757b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return Intrinsics.d(this.f127756a, n1Var.f127756a) && Intrinsics.d(this.f127757b, n1Var.f127757b);
    }

    @Override // w21.q1
    public final HashMap getAuxData() {
        return this.f127757b;
    }

    @Override // w21.q1
    public final h32.i0 getContext() {
        return this.f127756a;
    }

    public final int hashCode() {
        return this.f127757b.hashCode() + (this.f127756a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogRefresh(context=");
        sb3.append(this.f127756a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f127757b, ")");
    }
}
