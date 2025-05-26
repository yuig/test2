package uz1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q implements t {

    /* renamed from: a, reason: collision with root package name */
    public final List f123311a;

    public q(ArrayList bitmaps) {
        Intrinsics.checkNotNullParameter(bitmaps, "bitmaps");
        this.f123311a = bitmaps;
    }

    @Override // uz1.t
    public final List a() {
        return this.f123311a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.d(this.f123311a, ((q) obj).f123311a);
    }

    public final int hashCode() {
        return this.f123311a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("PinGridNoTextExpandedView(bitmaps="), this.f123311a, ")");
    }
}
