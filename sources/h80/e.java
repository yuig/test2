package h80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final String f68087a;

    public e(String style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f68087a = style;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f68087a, ((e) obj).f68087a);
    }

    public final int hashCode() {
        return this.f68087a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OutpaintImage(style="), this.f68087a, ")");
    }
}
