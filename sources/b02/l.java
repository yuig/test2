package b02;

import h32.g0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l extends m {

    /* renamed from: a, reason: collision with root package name */
    public final String f20785a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f20786b;

    public l(String email, g0 componentType) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        this.f20785a = email;
        this.f20786b = componentType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f20785a, lVar.f20785a) && this.f20786b == lVar.f20786b;
    }

    public final int hashCode() {
        return this.f20786b.hashCode() + (this.f20785a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateEmailEvent(email=" + this.f20785a + ", componentType=" + this.f20786b + ")";
    }
}
