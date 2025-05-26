package tu;

import h32.i0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n implements t {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f119297a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f119298b;

    /* renamed from: c, reason: collision with root package name */
    public final int f119299c;

    /* renamed from: d, reason: collision with root package name */
    public final pu.a0 f119300d;

    public n(i0 loggingContext, boolean z13, int i13, pu.a0 browserType) {
        Intrinsics.checkNotNullParameter(loggingContext, "loggingContext");
        Intrinsics.checkNotNullParameter(browserType, "browserType");
        this.f119297a = loggingContext;
        this.f119298b = z13;
        this.f119299c = i13;
        this.f119300d = browserType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f119297a, nVar.f119297a) && this.f119298b == nVar.f119298b && this.f119299c == nVar.f119299c && this.f119300d == nVar.f119300d;
    }

    public final int hashCode() {
        return this.f119300d.hashCode() + ep.b.b(this.f119299c, ep.b.e(this.f119298b, this.f119297a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "OnBrowserOpened(loggingContext=" + this.f119297a + ", isCCTEnabled=" + this.f119298b + ", currentIndex=" + this.f119299c + ", browserType=" + this.f119300d + ")";
    }
}
