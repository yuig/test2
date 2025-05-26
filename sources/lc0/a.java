package lc0;

import a.c;
import b4.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final q0 f82842a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f82843b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f82844c;

    /* renamed from: d, reason: collision with root package name */
    public final q0 f82845d;

    public a(q0 labelTextStyle, q0 itemTextStyle, q0 helperTextStyle, q0 errorTextStyle) {
        Intrinsics.checkNotNullParameter(labelTextStyle, "labelTextStyle");
        Intrinsics.checkNotNullParameter(itemTextStyle, "itemTextStyle");
        Intrinsics.checkNotNullParameter(helperTextStyle, "helperTextStyle");
        Intrinsics.checkNotNullParameter(errorTextStyle, "errorTextStyle");
        this.f82842a = labelTextStyle;
        this.f82843b = itemTextStyle;
        this.f82844c = helperTextStyle;
        this.f82845d = errorTextStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f82842a, aVar.f82842a) && Intrinsics.d(this.f82843b, aVar.f82843b) && Intrinsics.d(this.f82844c, aVar.f82844c) && Intrinsics.d(this.f82845d, aVar.f82845d);
    }

    public final int hashCode() {
        return this.f82845d.hashCode() + c.c(this.f82844c, c.c(this.f82843b, this.f82842a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "SelectListTextStyle(labelTextStyle=" + this.f82842a + ", itemTextStyle=" + this.f82843b + ", helperTextStyle=" + this.f82844c + ", errorTextStyle=" + this.f82845d + ")";
    }
}
