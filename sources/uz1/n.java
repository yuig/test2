package uz1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n implements t {

    /* renamed from: a, reason: collision with root package name */
    public final List f123306a;

    public n(ArrayList bitmaps) {
        Intrinsics.checkNotNullParameter(bitmaps, "bitmaps");
        this.f123306a = bitmaps;
    }

    @Override // uz1.t
    public final List a() {
        return this.f123306a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.f123306a, ((n) obj).f123306a);
    }

    public final int hashCode() {
        return this.f123306a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("LeftImageCollapsedView(bitmaps="), this.f123306a, ")");
    }
}
