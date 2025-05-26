package uz1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s implements t {

    /* renamed from: a, reason: collision with root package name */
    public final List f123313a;

    public s(ArrayList bitmaps) {
        Intrinsics.checkNotNullParameter(bitmaps, "bitmaps");
        this.f123313a = bitmaps;
    }

    @Override // uz1.t
    public final List a() {
        return this.f123313a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f123313a, ((s) obj).f123313a);
    }

    public final int hashCode() {
        return this.f123313a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("SixPinGridExpandedView(bitmaps="), this.f123313a, ")");
    }
}
