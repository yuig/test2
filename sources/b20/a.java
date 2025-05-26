package b20;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f21275a;

    public a(String str) {
        this.f21275a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f21275a, ((a) obj).f21275a);
    }

    public final int hashCode() {
        String str = this.f21275a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("PlayIntegrityNonceResponse(nonce="), this.f21275a, ")");
    }
}
