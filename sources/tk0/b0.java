package tk0;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f117947a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f117948b;

    public b0(h32.i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f117947a = context;
        this.f117948b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.d(this.f117947a, b0Var.f117947a) && Intrinsics.d(this.f117948b, b0Var.f117948b);
    }

    @Override // tk0.d0
    public final HashMap getAuxData() {
        return this.f117948b;
    }

    @Override // tk0.d0
    public final h32.i0 getContext() {
        return this.f117947a;
    }

    public final int hashCode() {
        return this.f117948b.hashCode() + (this.f117947a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogToolTapped(context=");
        sb3.append(this.f117947a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f117948b, ")");
    }
}
