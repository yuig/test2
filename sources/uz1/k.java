package uz1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k implements t {

    /* renamed from: a, reason: collision with root package name */
    public final List f123302a;

    public k(ArrayList bitmaps) {
        Intrinsics.checkNotNullParameter(bitmaps, "bitmaps");
        this.f123302a = bitmaps;
    }

    @Override // uz1.t
    public final List a() {
        return this.f123302a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.f123302a, ((k) obj).f123302a);
    }

    public final int hashCode() {
        return this.f123302a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("DefaultCollapsedView(bitmaps="), this.f123302a, ")");
    }
}
