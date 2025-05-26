package jj1;

import kotlin.jvm.internal.Intrinsics;
import rm1.q;

/* loaded from: classes5.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final q f76308a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f76309b;

    public a(q icon, Integer num) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f76308a = icon;
        this.f76309b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f76308a == aVar.f76308a && Intrinsics.d(this.f76309b, aVar.f76309b);
    }

    public final int hashCode() {
        int hashCode = this.f76308a.hashCode() * 31;
        Integer num = this.f76309b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "CreatorSingleStatsDS(icon=" + this.f76308a + ", stats=" + this.f76309b + ")";
    }
}
