package g21;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f63389a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f63390b;

    public b(HashMap hashMap, int i13) {
        hashMap = (i13 & 2) != 0 ? null : hashMap;
        this.f63389a = null;
        this.f63390b = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f63389a, bVar.f63389a) && Intrinsics.d(this.f63390b, bVar.f63390b);
    }

    public final int hashCode() {
        String str = this.f63389a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        HashMap hashMap = this.f63390b;
        return hashCode + (hashMap != null ? hashMap.hashCode() : 0);
    }

    public final String toString() {
        return "DeepLinkAnalyticsExtra(analytics=" + this.f63389a + ", analyticsMap=" + this.f63390b + ")";
    }
}
