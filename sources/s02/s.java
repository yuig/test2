package s02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s implements v {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f110347a;

    /* renamed from: b, reason: collision with root package name */
    public final String f110348b;

    public s(String str, boolean z13) {
        this.f110347a = z13;
        this.f110348b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f110347a == sVar.f110347a && Intrinsics.d(this.f110348b, sVar.f110348b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f110347a) * 31;
        String str = this.f110348b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "FinishAppealSideEffectRequest(success=" + this.f110347a + ", userid=" + this.f110348b + ")";
    }
}
