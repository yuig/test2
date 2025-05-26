package g72;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class y1 {

    @NotNull
    public static final x1 Companion = new x1();

    /* renamed from: h, reason: collision with root package name */
    public static final no2.b[] f64150h = {null, null, new qo2.d(qo2.s.f104618a, 0), null, null, null, null};

    /* renamed from: a, reason: collision with root package name */
    public final Float f64151a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f64152b;

    /* renamed from: c, reason: collision with root package name */
    public final List f64153c;

    /* renamed from: d, reason: collision with root package name */
    public final double f64154d;

    /* renamed from: e, reason: collision with root package name */
    public final Double f64155e;

    /* renamed from: f, reason: collision with root package name */
    public final Double f64156f;

    /* renamed from: g, reason: collision with root package name */
    public final double f64157g;

    public y1(int i13, Float f13, Boolean bool, List list, double d2, Double d13, Double d14, double d15) {
        if (76 != (i13 & 76)) {
            kg.t.b1(i13, 76, w1.f64134b);
            throw null;
        }
        this.f64151a = (i13 & 1) == 0 ? Float.valueOf(1.0f) : f13;
        if ((i13 & 2) == 0) {
            this.f64152b = Boolean.FALSE;
        } else {
            this.f64152b = bool;
        }
        this.f64153c = list;
        this.f64154d = d2;
        if ((i13 & 16) == 0) {
            this.f64155e = Double.valueOf(0.0d);
        } else {
            this.f64155e = d13;
        }
        if ((i13 & 32) == 0) {
            this.f64156f = Double.valueOf(0.0d);
        } else {
            this.f64156f = d14;
        }
        this.f64157g = d15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return Intrinsics.d(this.f64151a, y1Var.f64151a) && Intrinsics.d(this.f64152b, y1Var.f64152b) && Intrinsics.d(this.f64153c, y1Var.f64153c) && Double.compare(this.f64154d, y1Var.f64154d) == 0 && Intrinsics.d(this.f64155e, y1Var.f64155e) && Intrinsics.d(this.f64156f, y1Var.f64156f) && Double.compare(this.f64157g, y1Var.f64157g) == 0;
    }

    public final int hashCode() {
        Float f13 = this.f64151a;
        int hashCode = (f13 == null ? 0 : f13.hashCode()) * 31;
        Boolean bool = this.f64152b;
        int a13 = a.c.a(this.f64154d, ep.b.c(this.f64153c, (hashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31), 31);
        Double d2 = this.f64155e;
        int hashCode2 = (a13 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d13 = this.f64156f;
        return Double.hashCode(this.f64157g) + ((hashCode2 + (d13 != null ? d13.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ItemStateEntity(alpha=" + this.f64151a + ", isHidden=" + this.f64152b + ", offset=" + this.f64153c + ", rotation=" + this.f64154d + ", rotationX=" + this.f64155e + ", rotationY=" + this.f64156f + ", scale=" + this.f64157g + ")";
    }
}
