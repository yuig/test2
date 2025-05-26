package w21;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l1 implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f127738a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f127739b;

    public l1(h32.i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f127738a = context;
        this.f127739b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return Intrinsics.d(this.f127738a, l1Var.f127738a) && Intrinsics.d(this.f127739b, l1Var.f127739b);
    }

    @Override // w21.q1
    public final HashMap getAuxData() {
        return this.f127739b;
    }

    @Override // w21.q1
    public final h32.i0 getContext() {
        return this.f127738a;
    }

    public final int hashCode() {
        return this.f127739b.hashCode() + (this.f127738a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogExit(context=");
        sb3.append(this.f127738a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f127739b, ")");
    }
}
