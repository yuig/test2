package vv1;

import h32.u1;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final u1 f126792a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f126793b;

    public n(u1 impression, HashMap hashMap) {
        Intrinsics.checkNotNullParameter(impression, "impression");
        this.f126792a = impression;
        this.f126793b = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f126792a, nVar.f126792a) && Intrinsics.d(this.f126793b, nVar.f126793b);
    }

    public final int hashCode() {
        int hashCode = this.f126792a.hashCode() * 31;
        HashMap hashMap = this.f126793b;
        return hashCode + (hashMap == null ? 0 : hashMap.hashCode());
    }

    public final String toString() {
        return "OneBarModuleImpressionContextWrapper(impression=" + this.f126792a + ", extraAuxData=" + this.f126793b + ")";
    }
}
