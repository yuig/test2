package j30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f implements d {

    /* renamed from: d, reason: collision with root package name */
    public final String f74550d;

    /* renamed from: e, reason: collision with root package name */
    public final e f74551e;

    public f(String __typename, e eVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f74550d = __typename;
        this.f74551e = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f74550d, fVar.f74550d) && Intrinsics.d(this.f74551e, fVar.f74551e);
    }

    public final int hashCode() {
        int hashCode = this.f74550d.hashCode() * 31;
        e eVar = this.f74551e;
        return hashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "V3GetUserHandlerV3GetUserHandlerQuery(__typename=" + this.f74550d + ", data=" + this.f74551e + ")";
    }
}
