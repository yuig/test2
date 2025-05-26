package in1;

import hn1.h;
import hn1.n;
import kotlin.jvm.internal.Intrinsics;
import u50.o;

/* loaded from: classes5.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final h f72828a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f72829b;

    /* renamed from: c, reason: collision with root package name */
    public final int f72830c;

    /* renamed from: d, reason: collision with root package name */
    public final n f72831d;

    public b(h footerType, boolean z13, int i13, n padding) {
        Intrinsics.checkNotNullParameter(footerType, "footerType");
        Intrinsics.checkNotNullParameter(padding, "padding");
        this.f72828a = footerType;
        this.f72829b = z13;
        this.f72830c = i13;
        this.f72831d = padding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [hn1.h] */
    public static b e(b bVar, hn1.d dVar, boolean z13, n padding, int i13) {
        hn1.d footerType = dVar;
        if ((i13 & 1) != 0) {
            footerType = bVar.f72828a;
        }
        if ((i13 & 2) != 0) {
            z13 = bVar.f72829b;
        }
        int i14 = bVar.f72830c;
        if ((i13 & 8) != 0) {
            padding = bVar.f72831d;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(footerType, "footerType");
        Intrinsics.checkNotNullParameter(padding, "padding");
        return new b(footerType, z13, i14, padding);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f72828a, bVar.f72828a) && this.f72829b == bVar.f72829b && this.f72830c == bVar.f72830c && Intrinsics.d(this.f72831d, bVar.f72831d);
    }

    public final int hashCode() {
        return this.f72831d.hashCode() + ep.b.b(this.f72830c, ep.b.e(this.f72829b, this.f72828a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "DisplayState(footerType=" + this.f72828a + ", containsRecyclerView=" + this.f72829b + ", id=" + this.f72830c + ", padding=" + this.f72831d + ")";
    }
}
