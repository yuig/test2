package nx;

import h32.r2;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final r2 f92473a;

    /* renamed from: b, reason: collision with root package name */
    public final String f92474b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f92475c;

    public v0(r2 impression, String str, HashMap hashMap) {
        Intrinsics.checkNotNullParameter(impression, "impression");
        this.f92473a = impression;
        this.f92474b = str;
        this.f92475c = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return Intrinsics.d(this.f92473a, v0Var.f92473a) && Intrinsics.d(this.f92474b, v0Var.f92474b) && Intrinsics.d(this.f92475c, v0Var.f92475c);
    }

    public final int hashCode() {
        int hashCode = this.f92473a.hashCode() * 31;
        String str = this.f92474b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        HashMap hashMap = this.f92475c;
        return hashCode2 + (hashMap != null ? hashMap.hashCode() : 0);
    }

    public final String toString() {
        return "ShuffleImpressionContextWrapper(impression=" + this.f92473a + ", id=" + this.f92474b + ", auxData=" + this.f92475c + ")";
    }
}
