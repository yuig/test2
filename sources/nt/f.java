package nt;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Map f92029a;

    /* renamed from: b, reason: collision with root package name */
    public final e f92030b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f92031c;

    /* renamed from: d, reason: collision with root package name */
    public final List f92032d;

    /* renamed from: e, reason: collision with root package name */
    public final List f92033e;

    public f(Map dataCache, e gender, boolean z13, List countries, List months) {
        Intrinsics.checkNotNullParameter(dataCache, "dataCache");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(countries, "countries");
        Intrinsics.checkNotNullParameter(months, "months");
        this.f92029a = dataCache;
        this.f92030b = gender;
        this.f92031c = z13;
        this.f92032d = countries;
        this.f92033e = months;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f92029a, fVar.f92029a) && Intrinsics.d(this.f92030b, fVar.f92030b) && this.f92031c == fVar.f92031c && Intrinsics.d(this.f92032d, fVar.f92032d) && Intrinsics.d(this.f92033e, fVar.f92033e);
    }

    public final int hashCode() {
        return this.f92033e.hashCode() + ep.b.c(this.f92032d, ep.b.e(this.f92031c, (this.f92030b.hashCode() + (this.f92029a.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CacheLeadGen(dataCache=");
        sb3.append(this.f92029a);
        sb3.append(", gender=");
        sb3.append(this.f92030b);
        sb3.append(", isSignedUp=");
        sb3.append(this.f92031c);
        sb3.append(", countries=");
        sb3.append(this.f92032d);
        sb3.append(", months=");
        return a.c.j(sb3, this.f92033e, ")");
    }
}
