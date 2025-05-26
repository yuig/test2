package qp1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f104752a;

    /* renamed from: b, reason: collision with root package name */
    public final int f104753b;

    public b0(String str, int i13) {
        this.f104752a = str;
        this.f104753b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.d(this.f104752a, b0Var.f104752a) && this.f104753b == b0Var.f104753b;
    }

    public final int hashCode() {
        String str = this.f104752a;
        return Integer.hashCode(this.f104753b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OnWebViewError(failReason=");
        sb3.append(this.f104752a);
        sb3.append(", errorCode=");
        return a.a.n(sb3, this.f104753b, ")");
    }
}
