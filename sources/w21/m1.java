package w21;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m1 implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f127751a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f127752b;

    public m1(h32.i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f127751a = context;
        this.f127752b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return Intrinsics.d(this.f127751a, m1Var.f127751a) && Intrinsics.d(this.f127752b, m1Var.f127752b);
    }

    @Override // w21.q1
    public final HashMap getAuxData() {
        return this.f127752b;
    }

    @Override // w21.q1
    public final h32.i0 getContext() {
        return this.f127751a;
    }

    public final int hashCode() {
        return this.f127752b.hashCode() + (this.f127751a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogPinSelected(context=");
        sb3.append(this.f127751a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f127752b, ")");
    }
}
