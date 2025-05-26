package mw1;

import a.cb;
import kh2.g3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g extends g3 {

    /* renamed from: a, reason: collision with root package name */
    public final ww1.c f88434a;

    /* renamed from: b, reason: collision with root package name */
    public final String f88435b;

    /* renamed from: c, reason: collision with root package name */
    public final String f88436c;

    public g(ww1.c metricType, String value, String str) {
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f88434a = metricType;
        this.f88435b = value;
        this.f88436c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f88434a == gVar.f88434a && Intrinsics.d(this.f88435b, gVar.f88435b) && Intrinsics.d(this.f88436c, gVar.f88436c);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f88435b, this.f88434a.hashCode() * 31, 31);
        String str = this.f88436c;
        return d2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Success(metricType=");
        sb3.append(this.f88434a);
        sb3.append(", value=");
        sb3.append(this.f88435b);
        sb3.append(", valueSuffix=");
        return a.a.p(sb3, this.f88436c, ")");
    }
}
