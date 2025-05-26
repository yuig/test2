package tk0;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f117949a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f117950b;

    public c0(h32.i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f117949a = context;
        this.f117950b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.d(this.f117949a, c0Var.f117949a) && Intrinsics.d(this.f117950b, c0Var.f117950b);
    }

    @Override // tk0.d0
    public final HashMap getAuxData() {
        return this.f117950b;
    }

    @Override // tk0.d0
    public final h32.i0 getContext() {
        return this.f117949a;
    }

    public final int hashCode() {
        return this.f117950b.hashCode() + (this.f117949a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogToolViewed(context=");
        sb3.append(this.f117949a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f117950b, ")");
    }
}
