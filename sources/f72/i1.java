package f72;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class i1 extends p1 {

    @NotNull
    public static final h1 Companion = new h1();

    /* renamed from: i, reason: collision with root package name */
    public static final no2.b[] f61276i = {null, new qo2.d(qo2.s.f104618a, 0), null, null, null, null, null};

    /* renamed from: b, reason: collision with root package name */
    public final int f61277b;

    /* renamed from: c, reason: collision with root package name */
    public final List f61278c;

    /* renamed from: d, reason: collision with root package name */
    public final double f61279d;

    /* renamed from: e, reason: collision with root package name */
    public final double f61280e;

    /* renamed from: f, reason: collision with root package name */
    public final g72.a0 f61281f;

    /* renamed from: g, reason: collision with root package name */
    public final String f61282g;

    /* renamed from: h, reason: collision with root package name */
    public final long f61283h;

    public i1(int i13, int i14, List list, double d2, double d13, g72.a0 a0Var, String str, long j13) {
        if (127 != (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK)) {
            kg.t.b1(i13, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK, g1.f61266b);
            throw null;
        }
        this.f61277b = i14;
        this.f61278c = list;
        this.f61279d = d2;
        this.f61280e = d13;
        this.f61281f = a0Var;
        this.f61282g = str;
        this.f61283h = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return this.f61277b == i1Var.f61277b && Intrinsics.d(this.f61278c, i1Var.f61278c) && Double.compare(this.f61279d, i1Var.f61279d) == 0 && Double.compare(this.f61280e, i1Var.f61280e) == 0 && Intrinsics.d(this.f61281f, i1Var.f61281f) && Intrinsics.d(this.f61282g, i1Var.f61282g) && this.f61283h == i1Var.f61283h;
    }

    public final int hashCode() {
        int a13 = a.c.a(this.f61280e, a.c.a(this.f61279d, ep.b.c(this.f61278c, Integer.hashCode(this.f61277b) * 31, 31), 31), 31);
        g72.a0 a0Var = this.f61281f;
        int hashCode = (a13 + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        String str = this.f61282g;
        return Long.hashCode(this.f61283h) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Image(item_type=");
        sb3.append(this.f61277b);
        sb3.append(", offset=");
        sb3.append(this.f61278c);
        sb3.append(", scale=");
        sb3.append(this.f61279d);
        sb3.append(", rotation=");
        sb3.append(this.f61280e);
        sb3.append(", effect_data=");
        sb3.append(this.f61281f);
        sb3.append(", mask=");
        sb3.append(this.f61282g);
        sb3.append(", shuffle_item_image_id=");
        return a.a.o(sb3, this.f61283h, ")");
    }

    public i1(List offset, double d2, double d13, g72.a0 a0Var, String str, long j13) {
        Intrinsics.checkNotNullParameter(offset, "offset");
        this.f61277b = 3;
        this.f61278c = offset;
        this.f61279d = d2;
        this.f61280e = d13;
        this.f61281f = a0Var;
        this.f61282g = str;
        this.f61283h = j13;
    }
}
