package wb0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final j f128971a;

    /* renamed from: b, reason: collision with root package name */
    public final i f128972b;

    public a(j viewModel, i style) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f128971a = viewModel;
        this.f128972b = style;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f128971a, aVar.f128971a) && Intrinsics.d(this.f128972b, aVar.f128972b);
    }

    public final int hashCode() {
        return this.f128972b.hashCode() + (this.f128971a.hashCode() * 31);
    }

    public final String toString() {
        return "ActionButtonGridItem(viewModel=" + this.f128971a + ", style=" + this.f128972b + ")";
    }
}
