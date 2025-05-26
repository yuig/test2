package f72;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class l1 extends p1 {

    @NotNull
    public static final k1 Companion = new k1();

    /* renamed from: i, reason: collision with root package name */
    public static final no2.b[] f61298i = {null, new qo2.d(qo2.s.f104618a, 0), null, null, null, null, null};

    /* renamed from: b, reason: collision with root package name */
    public final int f61299b;

    /* renamed from: c, reason: collision with root package name */
    public final List f61300c;

    /* renamed from: d, reason: collision with root package name */
    public final double f61301d;

    /* renamed from: e, reason: collision with root package name */
    public final double f61302e;

    /* renamed from: f, reason: collision with root package name */
    public final g72.a0 f61303f;

    /* renamed from: g, reason: collision with root package name */
    public final String f61304g;

    /* renamed from: h, reason: collision with root package name */
    public final String f61305h;

    public l1(int i13, int i14, List list, double d2, double d13, g72.a0 a0Var, String str, String str2) {
        if (127 != (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK)) {
            kg.t.b1(i13, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK, j1.f61287b);
            throw null;
        }
        this.f61299b = i14;
        this.f61300c = list;
        this.f61301d = d2;
        this.f61302e = d13;
        this.f61303f = a0Var;
        this.f61304g = str;
        this.f61305h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return this.f61299b == l1Var.f61299b && Intrinsics.d(this.f61300c, l1Var.f61300c) && Double.compare(this.f61301d, l1Var.f61301d) == 0 && Double.compare(this.f61302e, l1Var.f61302e) == 0 && Intrinsics.d(this.f61303f, l1Var.f61303f) && Intrinsics.d(this.f61304g, l1Var.f61304g) && Intrinsics.d(this.f61305h, l1Var.f61305h);
    }

    public final int hashCode() {
        int a13 = a.c.a(this.f61302e, a.c.a(this.f61301d, ep.b.c(this.f61300c, Integer.hashCode(this.f61299b) * 31, 31), 31), 31);
        g72.a0 a0Var = this.f61303f;
        int hashCode = (a13 + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        String str = this.f61304g;
        return this.f61305h.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Pin(item_type=");
        sb3.append(this.f61299b);
        sb3.append(", offset=");
        sb3.append(this.f61300c);
        sb3.append(", scale=");
        sb3.append(this.f61301d);
        sb3.append(", rotation=");
        sb3.append(this.f61302e);
        sb3.append(", effect_data=");
        sb3.append(this.f61303f);
        sb3.append(", mask=");
        sb3.append(this.f61304g);
        sb3.append(", pin_id=");
        return a.a.p(sb3, this.f61305h, ")");
    }

    public l1(List offset, double d2, double d13, g72.a0 a0Var, String str, String pin_id) {
        Intrinsics.checkNotNullParameter(offset, "offset");
        Intrinsics.checkNotNullParameter(pin_id, "pin_id");
        this.f61299b = 1;
        this.f61300c = offset;
        this.f61301d = d2;
        this.f61302e = d13;
        this.f61303f = a0Var;
        this.f61304g = str;
        this.f61305h = pin_id;
    }
}
