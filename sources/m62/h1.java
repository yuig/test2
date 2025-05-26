package m62;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import r72.k2;

/* loaded from: classes4.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final k62.f f86008a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f86009b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86010c;

    public h1(k62.f fontListing, boolean z13) {
        Intrinsics.checkNotNullParameter(fontListing, "fontListing");
        this.f86008a = fontListing;
        this.f86009b = z13;
        this.f86010c = fontListing.f78434a;
    }

    public final k2 a() {
        return ((k62.e) CollectionsKt.S(this.f86008a.f78435b)).f78432a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return Intrinsics.d(this.f86008a, h1Var.f86008a) && this.f86009b == h1Var.f86009b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86009b) + (this.f86008a.hashCode() * 31);
    }

    public final String toString() {
        return "FontModel(fontListing=" + this.f86008a + ", isSelected=" + this.f86009b + ")";
    }
}
