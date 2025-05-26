package am1;

import kotlin.jvm.internal.Intrinsics;
import u50.i0;
import u50.o;

/* loaded from: classes2.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final d f15523a;

    /* renamed from: b, reason: collision with root package name */
    public final c f15524b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15525c;

    /* renamed from: d, reason: collision with root package name */
    public final fm1.c f15526d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f15527e;

    /* renamed from: f, reason: collision with root package name */
    public final int f15528f;

    public b(d serviceVariant, c labelType, boolean z13, fm1.c visibility, i0 contentDescription, int i13) {
        Intrinsics.checkNotNullParameter(serviceVariant, "serviceVariant");
        Intrinsics.checkNotNullParameter(labelType, "labelType");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        this.f15523a = serviceVariant;
        this.f15524b = labelType;
        this.f15525c = z13;
        this.f15526d = visibility;
        this.f15527e = contentDescription;
        this.f15528f = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f15523a == bVar.f15523a && this.f15524b == bVar.f15524b && this.f15525c == bVar.f15525c && this.f15526d == bVar.f15526d && Intrinsics.d(this.f15527e, bVar.f15527e) && this.f15528f == bVar.f15528f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15528f) + ep.b.d(this.f15527e, d7.g.a(this.f15526d, ep.b.e(this.f15525c, (this.f15524b.hashCode() + (this.f15523a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "DisplayState(serviceVariant=" + this.f15523a + ", labelType=" + this.f15524b + ", enabled=" + this.f15525c + ", visibility=" + this.f15526d + ", contentDescription=" + this.f15527e + ", id=" + this.f15528f + ")";
    }
}
