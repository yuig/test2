package ox1;

import a.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f97983a;

    /* renamed from: b, reason: collision with root package name */
    public final List f97984b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f97985c;

    /* renamed from: d, reason: collision with root package name */
    public final List f97986d;

    public b(String str, List metros, List countries, boolean z13) {
        Intrinsics.checkNotNullParameter(metros, "metros");
        Intrinsics.checkNotNullParameter(countries, "countries");
        this.f97983a = str;
        this.f97984b = metros;
        this.f97985c = z13;
        this.f97986d = countries;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f97983a, bVar.f97983a) && Intrinsics.d(this.f97984b, bVar.f97984b) && this.f97985c == bVar.f97985c && Intrinsics.d(this.f97986d, bVar.f97986d);
    }

    public final int hashCode() {
        String str = this.f97983a;
        return this.f97986d.hashCode() + ep.b.e(this.f97985c, ep.b.c(this.f97984b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TopLocations(subtitle=");
        sb3.append(this.f97983a);
        sb3.append(", metros=");
        sb3.append(this.f97984b);
        sb3.append(", isMetrosVisible=");
        sb3.append(this.f97985c);
        sb3.append(", countries=");
        return c.j(sb3, this.f97986d, ")");
    }
}
