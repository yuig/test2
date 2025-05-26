package i01;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f70706a;

    /* renamed from: b, reason: collision with root package name */
    public final String f70707b;

    /* renamed from: c, reason: collision with root package name */
    public final int f70708c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f70709d;

    /* renamed from: e, reason: collision with root package name */
    public final String f70710e;

    public z0(int i13, String text, String str, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f70706a = z13;
        this.f70707b = text;
        this.f70708c = i13;
        this.f70709d = z14;
        this.f70710e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.f70706a == z0Var.f70706a && Intrinsics.d(this.f70707b, z0Var.f70707b) && this.f70708c == z0Var.f70708c && this.f70709d == z0Var.f70709d && Intrinsics.d(this.f70710e, z0Var.f70710e);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f70709d, ep.b.b(this.f70708c, cb.d(this.f70707b, Boolean.hashCode(this.f70706a) * 31, 31), 31), 31);
        String str = this.f70710e;
        return e13 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FilterUIParams(isSelected=");
        sb3.append(this.f70706a);
        sb3.append(", text=");
        sb3.append(this.f70707b);
        sb3.append(", filterType=");
        sb3.append(this.f70708c);
        sb3.append(", isFilterOption=");
        sb3.append(this.f70709d);
        sb3.append(", iconColor=");
        return a.a.p(sb3, this.f70710e, ")");
    }
}
