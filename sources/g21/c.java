package g21;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f63391a;

    /* renamed from: b, reason: collision with root package name */
    public final b f63392b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f63393c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f63394d;

    public c(String uri, b deepLinkExtras) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(deepLinkExtras, "deepLinkExtras");
        this.f63391a = uri;
        this.f63392b = deepLinkExtras;
        this.f63393c = true;
        this.f63394d = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f63391a, cVar.f63391a) && Intrinsics.d(this.f63392b, cVar.f63392b) && this.f63393c == cVar.f63393c && this.f63394d == cVar.f63394d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63394d) + ep.b.e(this.f63393c, (this.f63392b.hashCode() + (this.f63391a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DeepLinkModel(uri=");
        sb3.append(this.f63391a);
        sb3.append(", deepLinkExtras=");
        sb3.append(this.f63392b);
        sb3.append(", shouldTryInAppNavigation=");
        sb3.append(this.f63393c);
        sb3.append(", shouldUseInAppBrowser=");
        return a.a.r(sb3, this.f63394d, ")");
    }
}
