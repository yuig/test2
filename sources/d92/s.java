package d92;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s implements z {

    /* renamed from: a, reason: collision with root package name */
    public final String f54187a;

    /* renamed from: b, reason: collision with root package name */
    public final String f54188b;

    public s(String pinId, String error) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f54187a = pinId;
        this.f54188b = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f54187a, sVar.f54187a) && Intrinsics.d(this.f54188b, sVar.f54188b);
    }

    public final int hashCode() {
        return this.f54188b.hashCode() + (this.f54187a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OnInitializeError(pinId=");
        sb3.append(this.f54187a);
        sb3.append(", error=");
        return a.a.p(sb3, this.f54188b, ")");
    }
}
