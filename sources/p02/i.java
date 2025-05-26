package p02;

import kotlin.jvm.internal.Intrinsics;
import o82.g0;

/* loaded from: classes4.dex */
public final class i implements m {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f98421a;

    /* renamed from: b, reason: collision with root package name */
    public final String f98422b;

    public i(g0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f98421a = event;
        this.f98422b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f98421a, iVar.f98421a) && Intrinsics.d(this.f98422b, iVar.f98422b);
    }

    public final int hashCode() {
        int hashCode = this.f98421a.hashCode() * 31;
        String str = this.f98422b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ListEvent(event=" + this.f98421a + ", userId=" + this.f98422b + ")";
    }
}
