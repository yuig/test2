package wa0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f128624a;

    /* renamed from: b, reason: collision with root package name */
    public final int f128625b;

    /* renamed from: c, reason: collision with root package name */
    public final int f128626c;

    public c(String url, int i13, int i14) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f128624a = url;
        this.f128625b = i13;
        this.f128626c = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f128624a, cVar.f128624a) && this.f128625b == cVar.f128625b && this.f128626c == cVar.f128626c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f128626c) + ep.b.b(this.f128625b, this.f128624a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Image(url=");
        sb3.append(this.f128624a);
        sb3.append(", width=");
        sb3.append(this.f128625b);
        sb3.append(", height=");
        return a.a.n(sb3, this.f128626c, ")");
    }
}
