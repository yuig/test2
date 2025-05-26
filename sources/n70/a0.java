package n70;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f89600a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f89601b;

    public a0(h32.i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f89600a = context;
        this.f89601b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.d(this.f89600a, a0Var.f89600a) && Intrinsics.d(this.f89601b, a0Var.f89601b);
    }

    @Override // n70.c0
    public final HashMap getAuxData() {
        return this.f89601b;
    }

    @Override // n70.c0
    public final h32.i0 getContext() {
        return this.f89600a;
    }

    public final int hashCode() {
        return this.f89601b.hashCode() + (this.f89600a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogPinSaved(context=");
        sb3.append(this.f89600a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f89601b, ")");
    }
}
