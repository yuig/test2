package y90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f138192a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f138193b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f138194c;

    public j0(String itemId, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        this.f138192a = itemId;
        this.f138193b = z13;
        this.f138194c = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return Intrinsics.d(this.f138192a, j0Var.f138192a) && this.f138193b == j0Var.f138193b && this.f138194c == j0Var.f138194c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f138194c) + ep.b.e(this.f138193b, this.f138192a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Init(itemId=");
        sb3.append(this.f138192a);
        sb3.append(", showShapeTool=");
        sb3.append(this.f138193b);
        sb3.append(", showExtraTools=");
        return a.a.r(sb3, this.f138194c, ")");
    }
}
