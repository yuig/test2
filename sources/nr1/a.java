package nr1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import qr1.m;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final m f91885a;

    /* renamed from: b, reason: collision with root package name */
    public final String f91886b;

    /* renamed from: c, reason: collision with root package name */
    public final String f91887c;

    public a(m authority, String id3, String str) {
        Intrinsics.checkNotNullParameter(authority, "authority");
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f91885a = authority;
        this.f91886b = id3;
        this.f91887c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f91885a, aVar.f91885a) && Intrinsics.d(this.f91886b, aVar.f91886b) && Intrinsics.d(this.f91887c, aVar.f91887c);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f91886b, this.f91885a.hashCode() * 31, 31);
        String str = this.f91887c;
        return d2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Credential(authority=");
        sb3.append(this.f91885a);
        sb3.append(", id=");
        sb3.append(this.f91886b);
        sb3.append(", password=");
        return a.a.p(sb3, this.f91887c, ")");
    }
}
