package tu;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q implements t {

    /* renamed from: a, reason: collision with root package name */
    public final pu.a0 f119303a;

    /* renamed from: b, reason: collision with root package name */
    public final String f119304b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f119305c;

    public q(pu.a0 browserType, String str, boolean z13) {
        Intrinsics.checkNotNullParameter(browserType, "browserType");
        this.f119303a = browserType;
        this.f119304b = str;
        this.f119305c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f119303a == qVar.f119303a && Intrinsics.d(this.f119304b, qVar.f119304b) && this.f119305c == qVar.f119305c;
    }

    public final int hashCode() {
        int hashCode = this.f119303a.hashCode() * 31;
        String str = this.f119304b;
        return Boolean.hashCode(this.f119305c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OpenBrowser(browserType=");
        sb3.append(this.f119303a);
        sb3.append(", customUrl=");
        sb3.append(this.f119304b);
        sb3.append(", isSkipOutboundPinClickEvent=");
        return a.a.r(sb3, this.f119305c, ")");
    }
}
