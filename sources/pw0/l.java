package pw0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f101520a;

    /* renamed from: b, reason: collision with root package name */
    public final int f101521b;

    /* renamed from: c, reason: collision with root package name */
    public final n f101522c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f101523d;

    public l(int i13, int i14, n type, boolean z13) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f101520a = i13;
        this.f101521b = i14;
        this.f101522c = type;
        this.f101523d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f101520a == lVar.f101520a && this.f101521b == lVar.f101521b && this.f101522c == lVar.f101522c && this.f101523d == lVar.f101523d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f101523d) + ((this.f101522c.hashCode() + ep.b.b(this.f101521b, Integer.hashCode(this.f101520a) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GalleryTab(idRes=");
        sb3.append(this.f101520a);
        sb3.append(", displayTextRes=");
        sb3.append(this.f101521b);
        sb3.append(", type=");
        sb3.append(this.f101522c);
        sb3.append(", selected=");
        return a.a.r(sb3, this.f101523d, ")");
    }
}
