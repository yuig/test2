package nx;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final h32.t f92388a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f92389b;

    public e(h32.t impression, HashMap hashMap) {
        Intrinsics.checkNotNullParameter(impression, "impression");
        this.f92388a = impression;
        this.f92389b = hashMap;
    }

    public static e a(e eVar, HashMap hashMap) {
        h32.t impression = eVar.f92388a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(impression, "impression");
        return new e(impression, hashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f92388a, eVar.f92388a) && Intrinsics.d(this.f92389b, eVar.f92389b);
    }

    public final int hashCode() {
        int hashCode = this.f92388a.hashCode() * 31;
        HashMap hashMap = this.f92389b;
        return hashCode + (hashMap == null ? 0 : hashMap.hashCode());
    }

    public final String toString() {
        return "BoardImpressionWrapper(impression=" + this.f92388a + ", auxData=" + this.f92389b + ")";
    }
}
