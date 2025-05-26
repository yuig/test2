package f72;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@no2.g
/* loaded from: classes4.dex */
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* renamed from: a, reason: collision with root package name */
    public final String f61349a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f61350b;

    /* renamed from: c, reason: collision with root package name */
    public final String f61351c;

    /* renamed from: d, reason: collision with root package name */
    public final e72.f f61352d;

    /* renamed from: e, reason: collision with root package name */
    public final m0 f61353e;

    /* renamed from: f, reason: collision with root package name */
    public final i f61354f;

    /* renamed from: g, reason: collision with root package name */
    public final g72.r f61355g;

    /* renamed from: h, reason: collision with root package name */
    public final t1 f61356h;

    /* renamed from: i, reason: collision with root package name */
    public final i f61357i;

    public r(int i13, String str, boolean z13, String str2, e72.f fVar, m0 m0Var, i iVar, g72.r rVar, t1 t1Var, i iVar2) {
        if (1 != (i13 & 1)) {
            kg.t.b1(i13, 1, p.f61331b);
            throw null;
        }
        this.f61349a = str;
        if ((i13 & 2) == 0) {
            this.f61350b = false;
        } else {
            this.f61350b = z13;
        }
        if ((i13 & 4) == 0) {
            this.f61351c = null;
        } else {
            this.f61351c = str2;
        }
        if ((i13 & 8) == 0) {
            this.f61352d = null;
        } else {
            this.f61352d = fVar;
        }
        if ((i13 & 16) == 0) {
            this.f61353e = null;
        } else {
            this.f61353e = m0Var;
        }
        if ((i13 & 32) == 0) {
            this.f61354f = null;
        } else {
            this.f61354f = iVar;
        }
        if ((i13 & 64) == 0) {
            this.f61355g = null;
        } else {
            this.f61355g = rVar;
        }
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0) {
            this.f61356h = null;
        } else {
            this.f61356h = t1Var;
        }
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 0) {
            this.f61357i = null;
        } else {
            this.f61357i = iVar2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f61349a, rVar.f61349a) && this.f61350b == rVar.f61350b && Intrinsics.d(this.f61351c, rVar.f61351c) && Intrinsics.d(this.f61352d, rVar.f61352d) && Intrinsics.d(this.f61353e, rVar.f61353e) && Intrinsics.d(this.f61354f, rVar.f61354f) && Intrinsics.d(this.f61355g, rVar.f61355g) && Intrinsics.d(this.f61356h, rVar.f61356h) && Intrinsics.d(this.f61357i, rVar.f61357i);
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f61350b, this.f61349a.hashCode() * 31, 31);
        String str = this.f61351c;
        int hashCode = (e13 + (str == null ? 0 : str.hashCode())) * 31;
        e72.f fVar = this.f61352d;
        int hashCode2 = (hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        m0 m0Var = this.f61353e;
        int hashCode3 = (hashCode2 + (m0Var == null ? 0 : m0Var.hashCode())) * 31;
        i iVar = this.f61354f;
        int hashCode4 = (hashCode3 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        g72.r rVar = this.f61355g;
        int hashCode5 = (hashCode4 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        t1 t1Var = this.f61356h;
        int hashCode6 = (hashCode5 + (t1Var == null ? 0 : t1Var.f61363a.hashCode())) * 31;
        i iVar2 = this.f61357i;
        return hashCode6 + (iVar2 != null ? iVar2.hashCode() : 0);
    }

    public final String toString() {
        return "id=" + this.f61349a + ", is_favorited_by_me=" + this.f61350b + ", mask=" + kh2.r.l1(this.f61351c) + ", bitmap_mask=" + kh2.r.l1(String.valueOf(this.f61355g)) + ", pin=" + this.f61352d + ", item_image=" + this.f61353e + ", user=" + this.f61356h;
    }
}
