package yi1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f139109a;

    public j0(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f139109a = url;
    }

    @Override // yi1.l0
    public final String a() {
        return this.f139109a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && Intrinsics.d(this.f139109a, ((j0) obj).f139109a);
    }

    public final int hashCode() {
        return this.f139109a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("PossibleResId(url="), this.f139109a, ")");
    }
}
