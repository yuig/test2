package an0;

import kotlin.jvm.internal.Intrinsics;
import r72.l1;

/* loaded from: classes5.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final l1 f15633a;

    /* renamed from: b, reason: collision with root package name */
    public final l1 f15634b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15635c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15636d;

    public b(l1 from, l1 to3, int i13, int i14) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to3, "to");
        this.f15633a = from;
        this.f15634b = to3;
        this.f15635c = i13;
        this.f15636d = i14;
    }

    @Override // an0.c
    public final int a() {
        return this.f15635c;
    }

    @Override // an0.c
    public final int b() {
        return this.f15636d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f15633a, bVar.f15633a) && Intrinsics.d(this.f15634b, bVar.f15634b) && this.f15635c == bVar.f15635c && this.f15636d == bVar.f15636d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15636d) + ep.b.b(this.f15635c, (this.f15634b.hashCode() + (this.f15633a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Translate(from=");
        sb3.append(this.f15633a);
        sb3.append(", to=");
        sb3.append(this.f15634b);
        sb3.append(", beginFrame=");
        sb3.append(this.f15635c);
        sb3.append(", endFrame=");
        return a.a.n(sb3, this.f15636d, ")");
    }
}
