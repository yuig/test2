package hk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements o {

    /* renamed from: a, reason: collision with root package name */
    public final String f69353a;

    public i(String str) {
        this.f69353a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f69353a, ((i) obj).f69353a);
    }

    public final int hashCode() {
        String str = this.f69353a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String j() {
        return this.f69353a;
    }

    public final String toString() {
        return a.a.p(new StringBuilder("FavoriteSingleTap(trafficSource="), this.f69353a, ")");
    }
}
