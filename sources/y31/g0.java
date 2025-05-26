package y31;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f136796a;

    public g0(c link) {
        Intrinsics.checkNotNullParameter(link, "link");
        this.f136796a = link;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && Intrinsics.d(this.f136796a, ((g0) obj).f136796a);
    }

    public final int hashCode() {
        return this.f136796a.hashCode();
    }

    public final String toString() {
        return "OpenLink(link=" + this.f136796a + ")";
    }
}
