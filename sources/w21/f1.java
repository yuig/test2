package w21;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f1 implements v1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f127686a;

    public f1(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f127686a = title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1) && Intrinsics.d(this.f127686a, ((f1) obj).f127686a);
    }

    public final int hashCode() {
        return this.f127686a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("DisplayCta(title="), this.f127686a, ")");
    }
}
