package aa1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final do1.d f1640a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1641b;

    public c(do1.d displayState, boolean z13) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f1640a = displayState;
        this.f1641b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f1640a, cVar.f1640a) && this.f1641b == cVar.f1641b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1641b) + (this.f1640a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShowToast(displayState=");
        sb3.append(this.f1640a);
        sb3.append(", isBottom=");
        return a.a.r(sb3, this.f1641b, ")");
    }
}
