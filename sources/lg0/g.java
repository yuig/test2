package lg0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f83216a;

    /* renamed from: b, reason: collision with root package name */
    public final int f83217b;

    /* renamed from: c, reason: collision with root package name */
    public final int f83218c;

    public g(String url, int i13, int i14) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f83216a = url;
        this.f83217b = i13;
        this.f83218c = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f83216a, gVar.f83216a) && this.f83217b == gVar.f83217b && this.f83218c == gVar.f83218c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f83218c) + ep.b.b(this.f83217b, this.f83216a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SignInCardImage(url=");
        sb3.append(this.f83216a);
        sb3.append(", width=");
        sb3.append(this.f83217b);
        sb3.append(", height=");
        return a.a.n(sb3, this.f83218c, ")");
    }
}
