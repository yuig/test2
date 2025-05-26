package n70;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f89603a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f89604b;

    public b0(h32.i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f89603a = context;
        this.f89604b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.d(this.f89603a, b0Var.f89603a) && Intrinsics.d(this.f89604b, b0Var.f89604b);
    }

    @Override // n70.c0
    public final HashMap getAuxData() {
        return this.f89604b;
    }

    @Override // n70.c0
    public final h32.i0 getContext() {
        return this.f89603a;
    }

    public final int hashCode() {
        return this.f89604b.hashCode() + (this.f89603a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogPinUnsaved(context=");
        sb3.append(this.f89603a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f89604b, ")");
    }
}
