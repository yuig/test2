package em1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import u50.f0;
import u50.i0;

/* loaded from: classes5.dex */
public final class d implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final b f59598a;

    /* renamed from: b, reason: collision with root package name */
    public final e f59599b;

    /* renamed from: c, reason: collision with root package name */
    public final fm1.c f59600c;

    /* renamed from: d, reason: collision with root package name */
    public final i0 f59601d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f59602e;

    /* renamed from: f, reason: collision with root package name */
    public final i0 f59603f;

    /* renamed from: g, reason: collision with root package name */
    public final int f59604g;

    /* renamed from: h, reason: collision with root package name */
    public final rn1.b f59605h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f59606i;

    /* renamed from: j, reason: collision with root package name */
    public final int f59607j;

    public d(b bVar, e eVar, fm1.c cVar, i0 i0Var, i0 i0Var2, int i13, boolean z13, int i14) {
        this((i14 & 1) != 0 ? GestaltCheckBox.f49354f : bVar, (i14 & 2) != 0 ? GestaltCheckBox.f49355g : eVar, (i14 & 4) != 0 ? GestaltCheckBox.f49356h : cVar, i0Var, (i14 & 16) != 0 ? GestaltCheckBox.f49358j : i0Var2, null, (i14 & 64) != 0 ? 1 : i13, GestaltCheckBox.f49359k, (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : z13, Integer.MIN_VALUE);
    }

    public static d e(d dVar, b bVar, e eVar, fm1.c cVar, i0 i0Var, f0 f0Var, f0 f0Var2, int i13, rn1.b bVar2, boolean z13, int i14, int i15) {
        b checkedState = (i15 & 1) != 0 ? dVar.f59598a : bVar;
        e variant = (i15 & 2) != 0 ? dVar.f59599b : eVar;
        fm1.c visibility = (i15 & 4) != 0 ? dVar.f59600c : cVar;
        i0 label = (i15 & 8) != 0 ? dVar.f59601d : i0Var;
        i0 helperText = (i15 & 16) != 0 ? dVar.f59602e : f0Var;
        i0 i0Var2 = (i15 & 32) != 0 ? dVar.f59603f : f0Var2;
        int i16 = (i15 & 64) != 0 ? dVar.f59604g : i13;
        rn1.b ellipsize = (i15 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? dVar.f59605h : bVar2;
        boolean z14 = (i15 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? dVar.f59606i : z13;
        int i17 = (i15 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? dVar.f59607j : i14;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(checkedState, "checkedState");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(helperText, "helperText");
        Intrinsics.checkNotNullParameter(ellipsize, "ellipsize");
        return new d(checkedState, variant, visibility, label, helperText, i0Var2, i16, ellipsize, z14, i17);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f59598a == dVar.f59598a && this.f59599b == dVar.f59599b && this.f59600c == dVar.f59600c && Intrinsics.d(this.f59601d, dVar.f59601d) && Intrinsics.d(this.f59602e, dVar.f59602e) && Intrinsics.d(this.f59603f, dVar.f59603f) && this.f59604g == dVar.f59604g && this.f59605h == dVar.f59605h && this.f59606i == dVar.f59606i && this.f59607j == dVar.f59607j;
    }

    public final int hashCode() {
        int d2 = ep.b.d(this.f59602e, ep.b.d(this.f59601d, d7.g.a(this.f59600c, (this.f59599b.hashCode() + (this.f59598a.hashCode() * 31)) * 31, 31), 31), 31);
        i0 i0Var = this.f59603f;
        return Integer.hashCode(this.f59607j) + ep.b.e(this.f59606i, (this.f59605h.hashCode() + ep.b.b(this.f59604g, (d2 + (i0Var == null ? 0 : i0Var.hashCode())) * 31, 31)) * 31, 31);
    }

    public final String toString() {
        return "DisplayState(checkedState=" + this.f59598a + ", variant=" + this.f59599b + ", visibility=" + this.f59600c + ", label=" + this.f59601d + ", helperText=" + this.f59602e + ", contentDescription=" + this.f59603f + ", maxLines=" + this.f59604g + ", ellipsize=" + this.f59605h + ", supportLinks=" + this.f59606i + ", id=" + this.f59607j + ")";
    }

    public d(b checkedState, e variant, fm1.c visibility, i0 label, i0 helperText, i0 i0Var, int i13, rn1.b ellipsize, boolean z13, int i14) {
        Intrinsics.checkNotNullParameter(checkedState, "checkedState");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(helperText, "helperText");
        Intrinsics.checkNotNullParameter(ellipsize, "ellipsize");
        this.f59598a = checkedState;
        this.f59599b = variant;
        this.f59600c = visibility;
        this.f59601d = label;
        this.f59602e = helperText;
        this.f59603f = i0Var;
        this.f59604g = i13;
        this.f59605h = ellipsize;
        this.f59606i = z13;
        this.f59607j = i14;
    }
}
