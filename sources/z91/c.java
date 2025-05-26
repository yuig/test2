package z91;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final do1.d f141361a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f141362b;

    public c(do1.d displayState, boolean z13) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f141361a = displayState;
        this.f141362b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f141361a, cVar.f141361a) && this.f141362b == cVar.f141362b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f141362b) + (this.f141361a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShowToast(displayState=");
        sb3.append(this.f141361a);
        sb3.append(", isBottom=");
        return a.a.r(sb3, this.f141362b, ")");
    }
}
