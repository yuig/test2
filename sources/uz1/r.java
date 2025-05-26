package uz1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r implements t {

    /* renamed from: a, reason: collision with root package name */
    public final List f123312a;

    public r(List bitmaps) {
        Intrinsics.checkNotNullParameter(bitmaps, "bitmaps");
        this.f123312a = bitmaps;
    }

    @Override // uz1.t
    public final List a() {
        return this.f123312a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f123312a, ((r) obj).f123312a);
    }

    public final int hashCode() {
        return this.f123312a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("SingleImageExpandedView(bitmaps="), this.f123312a, ")");
    }
}
