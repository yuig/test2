package x91;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements j {

    /* renamed from: a, reason: collision with root package name */
    public final String f134308a;

    public b(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f134308a = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f134308a, ((b) obj).f134308a);
    }

    public final int hashCode() {
        return this.f134308a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("LearnMoreLinkClick(url="), this.f134308a, ")");
    }
}
