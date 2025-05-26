package ij1;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes2.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f72372a;

    /* renamed from: b, reason: collision with root package name */
    public final int f72373b;

    public l(int i13, i0 text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f72372a = text;
        this.f72373b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f72372a, lVar.f72372a) && this.f72373b == lVar.f72373b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f72373b) + (this.f72372a.hashCode() * 31);
    }

    public final String toString() {
        return "Present(text=" + this.f72372a + ", numLines=" + this.f72373b + ")";
    }
}
