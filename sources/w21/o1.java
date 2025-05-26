package w21;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o1 implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f127761a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f127762b;

    public o1(h32.i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f127761a = context;
        this.f127762b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return Intrinsics.d(this.f127761a, o1Var.f127761a) && Intrinsics.d(this.f127762b, o1Var.f127762b);
    }

    @Override // w21.q1
    public final HashMap getAuxData() {
        return this.f127762b;
    }

    @Override // w21.q1
    public final h32.i0 getContext() {
        return this.f127761a;
    }

    public final int hashCode() {
        return this.f127762b.hashCode() + (this.f127761a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogSelectedPinClicked(context=");
        sb3.append(this.f127761a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f127762b, ")");
    }
}
