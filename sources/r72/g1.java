package r72;

import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f106479a;

    /* renamed from: b, reason: collision with root package name */
    public final float f106480b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f106481c;

    /* renamed from: d, reason: collision with root package name */
    public final l1 f106482d;

    /* renamed from: e, reason: collision with root package name */
    public final double f106483e;

    /* renamed from: f, reason: collision with root package name */
    public final double f106484f;

    /* renamed from: g, reason: collision with root package name */
    public final double f106485g;

    /* renamed from: h, reason: collision with root package name */
    public final double f106486h;

    public g1(String id3, float f13, boolean z13, l1 offset, double d2, double d13, double d14, double d15) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(offset, "offset");
        this.f106479a = id3;
        this.f106480b = f13;
        this.f106481c = z13;
        this.f106482d = offset;
        this.f106483e = d2;
        this.f106484f = d13;
        this.f106485g = d14;
        this.f106486h = d15;
    }

    public static g1 a(g1 g1Var, boolean z13, l1 l1Var, double d2, int i13) {
        l1 offset = (i13 & 8) != 0 ? g1Var.f106482d : l1Var;
        double d13 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? g1Var.f106486h : d2;
        String id3 = g1Var.f106479a;
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(offset, "offset");
        return new g1(id3, g1Var.f106480b, z13, offset, g1Var.f106483e, g1Var.f106484f, g1Var.f106485g, d13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return Intrinsics.d(this.f106479a, g1Var.f106479a) && Float.compare(this.f106480b, g1Var.f106480b) == 0 && this.f106481c == g1Var.f106481c && Intrinsics.d(this.f106482d, g1Var.f106482d) && Double.compare(this.f106483e, g1Var.f106483e) == 0 && Double.compare(this.f106484f, g1Var.f106484f) == 0 && Double.compare(this.f106485g, g1Var.f106485g) == 0 && Double.compare(this.f106486h, g1Var.f106486h) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f106486h) + a.c.a(this.f106485g, a.c.a(this.f106484f, a.c.a(this.f106483e, (this.f106482d.hashCode() + ep.b.e(this.f106481c, a.a.a(this.f106480b, this.f106479a.hashCode() * 31, 31), 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder o13 = cb.o("KeyframeItemState(id=", a.a.p(new StringBuilder("ObjectId(value="), this.f106479a, ")"), ", alpha=");
        o13.append(this.f106480b);
        o13.append(", isHidden=");
        o13.append(this.f106481c);
        o13.append(", offset=");
        o13.append(this.f106482d);
        o13.append(", rotation=");
        o13.append(this.f106483e);
        o13.append(", rotationX=");
        o13.append(this.f106484f);
        o13.append(", rotationY=");
        o13.append(this.f106485g);
        o13.append(", scale=");
        o13.append(this.f106486h);
        o13.append(")");
        return o13.toString();
    }
}
