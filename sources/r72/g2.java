package r72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g2 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f106487b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f106488a;

    static {
        Intrinsics.checkNotNullParameter("M0 0H0Z", "value");
        Intrinsics.checkNotNullParameter("M0 0H1V1H0Z", "value");
    }

    public /* synthetic */ g2(String str) {
        this.f106488a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g2) {
            return Intrinsics.d(this.f106488a, ((g2) obj).f106488a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f106488a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("SvgMask(value="), this.f106488a, ")");
    }
}
