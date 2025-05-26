package hc2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f68779a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68780b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68781c;

    /* renamed from: d, reason: collision with root package name */
    public final int f68782d;

    public o(String str, int i13, int i14, int i15) {
        this.f68779a = str;
        this.f68780b = i13;
        this.f68781c = i14;
        this.f68782d = i15;
    }

    public final int a() {
        return this.f68782d;
    }

    public final String b() {
        return this.f68779a;
    }

    public final int c() {
        return this.f68781c;
    }

    public final int d() {
        return this.f68780b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f68779a, oVar.f68779a) && this.f68780b == oVar.f68780b && this.f68781c == oVar.f68781c && this.f68782d == oVar.f68782d;
    }

    public final int hashCode() {
        String str = this.f68779a;
        return Integer.hashCode(this.f68782d) + ep.b.b(this.f68781c, ep.b.b(this.f68780b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TrackInfo(formatId=");
        sb3.append(this.f68779a);
        sb3.append(", width=");
        sb3.append(this.f68780b);
        sb3.append(", height=");
        sb3.append(this.f68781c);
        sb3.append(", bitrate=");
        return a.a.n(sb3, this.f68782d, ")");
    }
}
