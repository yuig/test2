package t00;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f115662a;

    public a(String sourceUrl) {
        Intrinsics.checkNotNullParameter(sourceUrl, "sourceUrl");
        this.f115662a = sourceUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f115662a, ((a) obj).f115662a);
    }

    public final int hashCode() {
        return this.f115662a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("AuthFailureEvent(sourceUrl="), this.f115662a, ")");
    }
}
