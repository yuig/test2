package k62;

import kotlin.jvm.internal.Intrinsics;
import r72.g3;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final g3 f78436a;

    /* renamed from: b, reason: collision with root package name */
    public final int f78437b;

    /* renamed from: c, reason: collision with root package name */
    public final int f78438c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f78439d;

    public g(g3 tool, int i13, int i14, boolean z13) {
        Intrinsics.checkNotNullParameter(tool, "tool");
        this.f78436a = tool;
        this.f78437b = i13;
        this.f78438c = i14;
        this.f78439d = z13;
    }

    public static g a(g gVar, int i13) {
        g3 tool = gVar.f78436a;
        int i14 = gVar.f78438c;
        boolean z13 = gVar.f78439d;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(tool, "tool");
        return new g(tool, i13, i14, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f78436a, gVar.f78436a) && this.f78437b == gVar.f78437b && this.f78438c == gVar.f78438c && this.f78439d == gVar.f78439d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f78439d) + ep.b.b(this.f78438c, ep.b.b(this.f78437b, this.f78436a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ToolInfo(tool=" + this.f78436a + ", displayNameRes=" + this.f78437b + ", iconRes=" + this.f78438c + ", isComingSoon=" + this.f78439d + ")";
    }
}
