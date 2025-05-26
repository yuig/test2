package nx;

import h32.r2;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class t extends kg.a {

    /* renamed from: f, reason: collision with root package name */
    public final r2 f92466f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f92467g;

    public t(r2 impression, HashMap hashMap) {
        Intrinsics.checkNotNullParameter(impression, "impression");
        this.f92466f = impression;
        this.f92467g = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f92466f, tVar.f92466f) && Intrinsics.d(this.f92467g, tVar.f92467g);
    }

    public final int hashCode() {
        int hashCode = this.f92466f.hashCode() * 31;
        HashMap hashMap = this.f92467g;
        return hashCode + (hashMap == null ? 0 : hashMap.hashCode());
    }

    public final String toString() {
        return "Shuffle(impression=" + this.f92466f + ", auxData=" + this.f92467g + ")";
    }
}
