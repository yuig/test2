package ca0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t implements u {

    /* renamed from: a, reason: collision with root package name */
    public final String f27163a;

    public t(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f27163a = title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.d(this.f27163a, ((t) obj).f27163a);
    }

    public final int hashCode() {
        return this.f27163a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("TitleChanged(title="), this.f27163a, ")");
    }
}
