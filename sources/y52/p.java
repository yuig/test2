package y52;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f137833a;

    public p(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        this.f137833a = link;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.f137833a, ((p) obj).f137833a);
    }

    public final int hashCode() {
        return this.f137833a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("CopyToClipboard(link="), this.f137833a, ")");
    }
}
