package qr1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final m f105025a;

    /* renamed from: b, reason: collision with root package name */
    public final String f105026b;

    public p(m authority, String str) {
        Intrinsics.checkNotNullParameter(authority, "authority");
        this.f105025a = authority;
        this.f105026b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.f105025a, pVar.f105025a) && Intrinsics.d(this.f105026b, pVar.f105026b);
    }

    public final int hashCode() {
        int hashCode = this.f105025a.hashCode() * 31;
        String str = this.f105026b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ConnectionData(authority=" + this.f105025a + ", id=" + this.f105026b + ")";
    }
}
