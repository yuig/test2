package w1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k1 {

    /* renamed from: g, reason: collision with root package name */
    public static final k1 f127342g = new k1(null, 0, 0, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);

    /* renamed from: a, reason: collision with root package name */
    public final int f127343a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f127344b;

    /* renamed from: c, reason: collision with root package name */
    public final int f127345c;

    /* renamed from: d, reason: collision with root package name */
    public final int f127346d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f127347e;

    /* renamed from: f, reason: collision with root package name */
    public final i4.c f127348f;

    public k1(Boolean bool, int i13, int i14, int i15) {
        bool = (i15 & 2) != 0 ? null : bool;
        i13 = (i15 & 4) != 0 ? 0 : i13;
        i14 = (i15 & 8) != 0 ? -1 : i14;
        this.f127343a = -1;
        this.f127344b = bool;
        this.f127345c = i13;
        this.f127346d = i14;
        this.f127347e = null;
        this.f127348f = null;
    }

    public final h4.o a(boolean z13) {
        int i13 = this.f127343a;
        h4.r rVar = new h4.r(i13);
        if (h4.r.a(i13, -1)) {
            rVar = null;
        }
        int i14 = rVar != null ? rVar.f67608a : 0;
        Boolean bool = this.f127344b;
        boolean booleanValue = bool != null ? bool.booleanValue() : true;
        int i15 = this.f127345c;
        h4.s sVar = new h4.s(i15);
        if (h4.s.a(i15, 0)) {
            sVar = null;
        }
        int i16 = sVar != null ? sVar.f67609a : 1;
        int i17 = this.f127346d;
        h4.n nVar = h4.n.a(i17, -1) ? null : new h4.n(i17);
        int i18 = nVar != null ? nVar.f67594a : 1;
        i4.c cVar = this.f127348f;
        if (cVar == null) {
            cVar = i4.c.f71503c;
        }
        return new h4.o(z13, i14, booleanValue, i16, i18, cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        if (!h4.r.a(this.f127343a, k1Var.f127343a) || !Intrinsics.d(this.f127344b, k1Var.f127344b) || !h4.s.a(this.f127345c, k1Var.f127345c) || !h4.n.a(this.f127346d, k1Var.f127346d)) {
            return false;
        }
        k1Var.getClass();
        return Intrinsics.d(null, null) && Intrinsics.d(this.f127347e, k1Var.f127347e) && Intrinsics.d(this.f127348f, k1Var.f127348f);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f127343a) * 31;
        Boolean bool = this.f127344b;
        int b13 = ep.b.b(this.f127346d, ep.b.b(this.f127345c, (hashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 961);
        Boolean bool2 = this.f127347e;
        int hashCode2 = (b13 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        i4.c cVar = this.f127348f;
        return hashCode2 + (cVar != null ? cVar.f71504a.hashCode() : 0);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) h4.r.b(this.f127343a)) + ", autoCorrectEnabled=" + this.f127344b + ", keyboardType=" + ((Object) h4.s.b(this.f127345c)) + ", imeAction=" + ((Object) h4.n.b(this.f127346d)) + ", platformImeOptions=nullshowKeyboardOnFocus=" + this.f127347e + ", hintLocales=" + this.f127348f + ')';
    }
}
