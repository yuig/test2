package zy;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f143075a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f143076b;

    public g0(String navTarget, HashMap auxData) {
        Intrinsics.checkNotNullParameter(navTarget, "navTarget");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f143075a = navTarget;
        this.f143076b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.d(this.f143075a, g0Var.f143075a) && Intrinsics.d(this.f143076b, g0Var.f143076b);
    }

    public final HashMap getAuxData() {
        return this.f143076b;
    }

    public final int hashCode() {
        return this.f143076b.hashCode() + (this.f143075a.hashCode() * 31);
    }

    public final String j() {
        return this.f143075a;
    }

    public final String toString() {
        return "LogViewSideEffectRequest(navTarget=" + this.f143075a + ", auxData=" + this.f143076b + ")";
    }
}
