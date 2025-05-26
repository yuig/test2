package f72;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class g0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* renamed from: n, reason: collision with root package name */
    public static final no2.b[] f61251n = {null, null, null, null, null, new qo2.d(qo2.s.f104618a, 0), null, null, null, null, null, null, null};

    /* renamed from: a, reason: collision with root package name */
    public final String f61252a;

    /* renamed from: b, reason: collision with root package name */
    public final int f61253b;

    /* renamed from: c, reason: collision with root package name */
    public final i f61254c;

    /* renamed from: d, reason: collision with root package name */
    public final double f61255d;

    /* renamed from: e, reason: collision with root package name */
    public final double f61256e;

    /* renamed from: f, reason: collision with root package name */
    public final List f61257f;

    /* renamed from: g, reason: collision with root package name */
    public final String f61258g;

    /* renamed from: h, reason: collision with root package name */
    public final f0 f61259h;

    /* renamed from: i, reason: collision with root package name */
    public final p0 f61260i;

    /* renamed from: j, reason: collision with root package name */
    public final m0 f61261j;

    /* renamed from: k, reason: collision with root package name */
    public final g72.a0 f61262k;

    /* renamed from: l, reason: collision with root package name */
    public final r f61263l;

    /* renamed from: m, reason: collision with root package name */
    public final w1 f61264m;

    public g0(int i13, String str, int i14, i iVar, double d2, double d13, List list, String str2, f0 f0Var, p0 p0Var, m0 m0Var, g72.a0 a0Var, r rVar, w1 w1Var) {
        if (4031 != (i13 & 4031)) {
            kg.t.b1(i13, 4031, b0.f61233b);
            throw null;
        }
        this.f61252a = str;
        this.f61253b = i14;
        this.f61254c = iVar;
        this.f61255d = d2;
        this.f61256e = d13;
        this.f61257f = list;
        if ((i13 & 64) == 0) {
            this.f61258g = null;
        } else {
            this.f61258g = str2;
        }
        this.f61259h = f0Var;
        this.f61260i = p0Var;
        this.f61261j = m0Var;
        this.f61262k = a0Var;
        this.f61263l = rVar;
        if ((i13 & 4096) == 0) {
            this.f61264m = null;
        } else {
            this.f61264m = w1Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return Intrinsics.d(this.f61252a, g0Var.f61252a) && this.f61253b == g0Var.f61253b && Intrinsics.d(this.f61254c, g0Var.f61254c) && Double.compare(this.f61255d, g0Var.f61255d) == 0 && Double.compare(this.f61256e, g0Var.f61256e) == 0 && Intrinsics.d(this.f61257f, g0Var.f61257f) && Intrinsics.d(this.f61258g, g0Var.f61258g) && Intrinsics.d(this.f61259h, g0Var.f61259h) && Intrinsics.d(this.f61260i, g0Var.f61260i) && Intrinsics.d(this.f61261j, g0Var.f61261j) && Intrinsics.d(this.f61262k, g0Var.f61262k) && Intrinsics.d(this.f61263l, g0Var.f61263l) && Intrinsics.d(this.f61264m, g0Var.f61264m);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f61253b, this.f61252a.hashCode() * 31, 31);
        i iVar = this.f61254c;
        int c13 = ep.b.c(this.f61257f, a.c.a(this.f61256e, a.c.a(this.f61255d, (b13 + (iVar == null ? 0 : iVar.hashCode())) * 31, 31), 31), 31);
        String str = this.f61258g;
        int hashCode = (c13 + (str == null ? 0 : str.hashCode())) * 31;
        f0 f0Var = this.f61259h;
        int hashCode2 = (hashCode + (f0Var == null ? 0 : f0Var.f61248a.hashCode())) * 31;
        p0 p0Var = this.f61260i;
        int hashCode3 = (hashCode2 + (p0Var == null ? 0 : p0Var.hashCode())) * 31;
        m0 m0Var = this.f61261j;
        int hashCode4 = (this.f61262k.hashCode() + ((hashCode3 + (m0Var == null ? 0 : m0Var.hashCode())) * 31)) * 31;
        r rVar = this.f61263l;
        int hashCode5 = (hashCode4 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        w1 w1Var = this.f61264m;
        return hashCode5 + (w1Var != null ? w1Var.hashCode() : 0);
    }

    public final String toString() {
        return "ShuffleItemEntity(id=" + this.f61252a + ", item_type=" + this.f61253b + ", images=" + this.f61254c + ", scale=" + this.f61255d + ", rotation=" + this.f61256e + ", offset=" + this.f61257f + ", mask=" + this.f61258g + ", pin=" + this.f61259h + ", text=" + this.f61260i + ", shuffle_item_image=" + this.f61261j + ", effect_data=" + this.f61262k + ", shuffle_asset=" + this.f61263l + ", template_config=" + this.f61264m + ")";
    }
}
