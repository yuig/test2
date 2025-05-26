package ha2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes4.dex */
public final class a0 implements g {

    /* renamed from: a, reason: collision with root package name */
    public final int f68399a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68400b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f68401c;

    /* renamed from: d, reason: collision with root package name */
    public final String f68402d;

    /* renamed from: e, reason: collision with root package name */
    public final w f68403e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f68404f;

    /* renamed from: g, reason: collision with root package name */
    public final vn1.c f68405g;

    /* renamed from: h, reason: collision with root package name */
    public final String f68406h;

    /* renamed from: i, reason: collision with root package name */
    public final vn1.g f68407i;

    /* renamed from: j, reason: collision with root package name */
    public final rm1.q f68408j;

    public a0(int i13, int i14, d0 d0Var, String str, w wVar, Integer num, vn1.c cVar, vn1.g gVar, rm1.q qVar, int i15) {
        d0Var = (i15 & 4) != 0 ? null : d0Var;
        str = (i15 & 8) != 0 ? null : str;
        wVar = (i15 & 16) != 0 ? null : wVar;
        num = (i15 & 32) != 0 ? null : num;
        cVar = (i15 & 64) != 0 ? null : cVar;
        gVar = (i15 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : gVar;
        qVar = (i15 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : qVar;
        this.f68399a = i13;
        this.f68400b = i14;
        this.f68401c = d0Var;
        this.f68402d = str;
        this.f68403e = wVar;
        this.f68404f = num;
        this.f68405g = cVar;
        this.f68406h = null;
        this.f68407i = gVar;
        this.f68408j = qVar;
    }

    @Override // ha2.g
    public final int a() {
        return this.f68399a;
    }

    @Override // ha2.g
    public final String b() {
        return this.f68406h;
    }

    @Override // ha2.g
    public final vn1.g c() {
        return this.f68407i;
    }

    @Override // ha2.g
    public final d0 d() {
        return this.f68401c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f68399a == a0Var.f68399a && this.f68400b == a0Var.f68400b && Intrinsics.d(this.f68401c, a0Var.f68401c) && Intrinsics.d(this.f68402d, a0Var.f68402d) && Intrinsics.d(this.f68403e, a0Var.f68403e) && Intrinsics.d(this.f68404f, a0Var.f68404f) && this.f68405g == a0Var.f68405g && Intrinsics.d(this.f68406h, a0Var.f68406h) && this.f68407i == a0Var.f68407i && this.f68408j == a0Var.f68408j;
    }

    @Override // ha2.g
    public final int getIndex() {
        return this.f68400b;
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f68400b, Integer.hashCode(this.f68399a) * 31, 31);
        d0 d0Var = this.f68401c;
        int hashCode = (b13 + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        String str = this.f68402d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        w wVar = this.f68403e;
        int hashCode3 = (hashCode2 + (wVar == null ? 0 : Integer.hashCode(wVar.f68476a))) * 31;
        Integer num = this.f68404f;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        vn1.c cVar = this.f68405g;
        int hashCode5 = (hashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str2 = this.f68406h;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        vn1.g gVar = this.f68407i;
        int hashCode7 = (hashCode6 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        rm1.q qVar = this.f68408j;
        return hashCode7 + (qVar != null ? qVar.hashCode() : 0);
    }

    public final String toString() {
        return "OptionItem(titleRes=" + this.f68399a + ", index=" + this.f68400b + ", paddings=" + this.f68401c + ", titleResVariableSubstitution=" + this.f68402d + ", extraLabel=" + this.f68403e + ", subtitleRes=" + this.f68404f + ", subtitleColor=" + this.f68405g + ", titleString=" + this.f68406h + ", titleTextVariant=" + this.f68407i + ", icon=" + this.f68408j + ")";
    }
}
