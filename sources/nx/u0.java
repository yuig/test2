package nx;

import h32.n2;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final n2 f92470a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f92471b;

    /* renamed from: c, reason: collision with root package name */
    public final h32.g0 f92472c;

    public u0(n2 impression, HashMap hashMap, h32.g0 g0Var) {
        Intrinsics.checkNotNullParameter(impression, "impression");
        this.f92470a = impression;
        this.f92471b = hashMap;
        this.f92472c = g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Intrinsics.d(this.f92470a, u0Var.f92470a) && Intrinsics.d(this.f92471b, u0Var.f92471b) && this.f92472c == u0Var.f92472c;
    }

    public final int hashCode() {
        int hashCode = this.f92470a.hashCode() * 31;
        HashMap hashMap = this.f92471b;
        int hashCode2 = (hashCode + (hashMap == null ? 0 : hashMap.hashCode())) * 31;
        h32.g0 g0Var = this.f92472c;
        return hashCode2 + (g0Var != null ? g0Var.hashCode() : 0);
    }

    public final String toString() {
        return "SearchImpressionContextWrapper(impression=" + this.f92470a + ", auxData=" + this.f92471b + ", componentType=" + this.f92472c + ")";
    }
}
