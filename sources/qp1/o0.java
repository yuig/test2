package qp1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o0 implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f104815a;

    /* renamed from: b, reason: collision with root package name */
    public final String f104816b;

    public o0(String pinId, String str) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f104815a = pinId;
        this.f104816b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Intrinsics.d(this.f104815a, o0Var.f104815a) && Intrinsics.d(this.f104816b, o0Var.f104816b);
    }

    public final int hashCode() {
        int hashCode = this.f104815a.hashCode() * 31;
        String str = this.f104816b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LoadPin(pinId=");
        sb3.append(this.f104815a);
        sb3.append(", adDestinationURL=");
        return a.a.p(sb3, this.f104816b, ")");
    }
}
