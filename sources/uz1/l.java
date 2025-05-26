package uz1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l implements t {

    /* renamed from: a, reason: collision with root package name */
    public final List f123303a;

    public l(ArrayList bitmaps) {
        Intrinsics.checkNotNullParameter(bitmaps, "bitmaps");
        this.f123303a = bitmaps;
    }

    @Override // uz1.t
    public final List a() {
        return this.f123303a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f123303a, ((l) obj).f123303a);
    }

    public final int hashCode() {
        return this.f123303a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("FourPinGridExpandedView(bitmaps="), this.f123303a, ")");
    }
}
