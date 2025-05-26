package f72;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class o1 extends p1 {

    @NotNull
    public static final n1 Companion = new n1();

    /* renamed from: h, reason: collision with root package name */
    public static final no2.b[] f61323h = {null, new qo2.d(qo2.s.f104618a, 0), null, null, null, null};

    /* renamed from: b, reason: collision with root package name */
    public final int f61324b;

    /* renamed from: c, reason: collision with root package name */
    public final List f61325c;

    /* renamed from: d, reason: collision with root package name */
    public final double f61326d;

    /* renamed from: e, reason: collision with root package name */
    public final double f61327e;

    /* renamed from: f, reason: collision with root package name */
    public final g72.a0 f61328f;

    /* renamed from: g, reason: collision with root package name */
    public final p0 f61329g;

    public o1(int i13, int i14, List list, double d2, double d13, g72.a0 a0Var, p0 p0Var) {
        if (63 != (i13 & 63)) {
            kg.t.b1(i13, 63, m1.f61319b);
            throw null;
        }
        this.f61324b = i14;
        this.f61325c = list;
        this.f61326d = d2;
        this.f61327e = d13;
        this.f61328f = a0Var;
        this.f61329g = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return this.f61324b == o1Var.f61324b && Intrinsics.d(this.f61325c, o1Var.f61325c) && Double.compare(this.f61326d, o1Var.f61326d) == 0 && Double.compare(this.f61327e, o1Var.f61327e) == 0 && Intrinsics.d(this.f61328f, o1Var.f61328f) && Intrinsics.d(this.f61329g, o1Var.f61329g);
    }

    public final int hashCode() {
        int a13 = a.c.a(this.f61327e, a.c.a(this.f61326d, ep.b.c(this.f61325c, Integer.hashCode(this.f61324b) * 31, 31), 31), 31);
        g72.a0 a0Var = this.f61328f;
        return this.f61329g.hashCode() + ((a13 + (a0Var == null ? 0 : a0Var.hashCode())) * 31);
    }

    public final String toString() {
        return "Text(item_type=" + this.f61324b + ", offset=" + this.f61325c + ", scale=" + this.f61326d + ", rotation=" + this.f61327e + ", effect_data=" + this.f61328f + ", text=" + this.f61329g + ")";
    }

    public o1(List offset, double d2, double d13, g72.a0 a0Var, p0 text) {
        Intrinsics.checkNotNullParameter(offset, "offset");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f61324b = 2;
        this.f61325c = offset;
        this.f61326d = d2;
        this.f61327e = d13;
        this.f61328f = a0Var;
        this.f61329g = text;
    }
}
