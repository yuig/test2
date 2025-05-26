package jv0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m extends l3.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f77642a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f77643b;

    public m(String pinId, boolean z13) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f77642a = pinId;
        this.f77643b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f77642a, mVar.f77642a) && this.f77643b == mVar.f77643b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f77643b) + (this.f77642a.hashCode() * 31);
    }

    public final String toString() {
        return "ItemDeleteClicked(pinId=" + this.f77642a + ", isInvisibleTag=" + this.f77643b + ")";
    }
}
