package an1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15698a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15699b;

    /* renamed from: c, reason: collision with root package name */
    public final fm1.c f15700c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15701d;

    public b(boolean z13, boolean z14, fm1.c visibility, int i13) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.f15698a = z13;
        this.f15699b = z14;
        this.f15700c = visibility;
        this.f15701d = i13;
    }

    public static b e(b bVar, boolean z13, fm1.c visibility, int i13) {
        boolean z14 = bVar.f15698a;
        if ((i13 & 2) != 0) {
            z13 = bVar.f15699b;
        }
        if ((i13 & 4) != 0) {
            visibility = bVar.f15700c;
        }
        int i14 = bVar.f15701d;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return new b(z14, z13, visibility, i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f15698a == bVar.f15698a && this.f15699b == bVar.f15699b && this.f15700c == bVar.f15700c && this.f15701d == bVar.f15701d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15701d) + d7.g.a(this.f15700c, ep.b.e(this.f15699b, Boolean.hashCode(this.f15698a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(enabled=");
        sb3.append(this.f15698a);
        sb3.append(", checked=");
        sb3.append(this.f15699b);
        sb3.append(", visibility=");
        sb3.append(this.f15700c);
        sb3.append(", id=");
        return a.a.n(sb3, this.f15701d, ")");
    }
}
