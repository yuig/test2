package b92;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f22246a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22247b;

    public a(String str, boolean z13) {
        this.f22246a = str;
        this.f22247b = z13;
    }

    public final boolean a() {
        return this.f22247b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f22246a, aVar.f22246a) && this.f22247b == aVar.f22247b;
    }

    public final int hashCode() {
        String str = this.f22246a;
        return Boolean.hashCode(this.f22247b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "TargetHandshakeAccessToken(accessToken=" + this.f22246a + ", isTemporaryToken=" + this.f22247b + ")";
    }
}
