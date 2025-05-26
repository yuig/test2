package cc0;

import b4.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final q0 f27440a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f27441b;

    public a(q0 baseLabelTextStyle, q0 labelTextStyle) {
        Intrinsics.checkNotNullParameter(baseLabelTextStyle, "baseLabelTextStyle");
        Intrinsics.checkNotNullParameter(labelTextStyle, "labelTextStyle");
        this.f27440a = baseLabelTextStyle;
        this.f27441b = labelTextStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f27440a, aVar.f27440a) && Intrinsics.d(this.f27441b, aVar.f27441b);
    }

    public final int hashCode() {
        return this.f27441b.hashCode() + (this.f27440a.hashCode() * 31);
    }

    public final String toString() {
        return "BaseApiUrlStyles(baseLabelTextStyle=" + this.f27440a + ", labelTextStyle=" + this.f27441b + ")";
    }
}
