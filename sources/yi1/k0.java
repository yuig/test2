package yi1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f139110a;

    public k0(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f139110a = url;
    }

    @Override // yi1.l0
    public final String a() {
        return this.f139110a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && Intrinsics.d(this.f139110a, ((k0) obj).f139110a);
    }

    public final int hashCode() {
        return this.f139110a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ValidRemoteUrl(url="), this.f139110a, ")");
    }
}
