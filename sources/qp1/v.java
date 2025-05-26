package qp1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f104847a;

    /* renamed from: b, reason: collision with root package name */
    public final String f104848b;

    public v(String pinId, String error) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f104847a = pinId;
        this.f104848b = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.f104847a, vVar.f104847a) && Intrinsics.d(this.f104848b, vVar.f104848b);
    }

    public final int hashCode() {
        return this.f104848b.hashCode() + (this.f104847a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OnInitializeError(pinId=");
        sb3.append(this.f104847a);
        sb3.append(", error=");
        return a.a.p(sb3, this.f104848b, ")");
    }
}
