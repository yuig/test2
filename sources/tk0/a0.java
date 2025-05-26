package tk0;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f117945a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f117946b;

    public a0(h32.i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f117945a = context;
        this.f117946b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.d(this.f117945a, a0Var.f117945a) && Intrinsics.d(this.f117946b, a0Var.f117946b);
    }

    @Override // tk0.d0
    public final HashMap getAuxData() {
        return this.f117946b;
    }

    @Override // tk0.d0
    public final h32.i0 getContext() {
        return this.f117945a;
    }

    public final int hashCode() {
        return this.f117946b.hashCode() + (this.f117945a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogSelectAllTapped(context=");
        sb3.append(this.f117945a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f117946b, ")");
    }
}
