package tu;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f119286a;

    public e(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f119286a = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f119286a, ((e) obj).f119286a);
    }

    public final int hashCode() {
        return this.f119286a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ShowWebviewBrowser(url="), this.f119286a, ")");
    }
}
