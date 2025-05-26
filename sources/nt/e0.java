package nt;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f92016a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f92017b;

    public e0(Integer num, int i13) {
        this.f92016a = i13;
        this.f92017b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f92016a == e0Var.f92016a && Intrinsics.d(this.f92017b, e0Var.f92017b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f92016a) * 31;
        Integer num = this.f92017b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "SubmitErrorEvent(errorMessage=" + this.f92016a + ", errorCode=" + this.f92017b + ")";
    }
}
