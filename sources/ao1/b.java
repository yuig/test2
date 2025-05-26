package ao1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import u50.i0;
import u50.o;

/* loaded from: classes2.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f20030a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f20031b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f20032c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20033d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f20034e;

    /* renamed from: f, reason: collision with root package name */
    public final yn1.f f20035f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f20036g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20037h;

    /* renamed from: i, reason: collision with root package name */
    public final int f20038i;

    /* renamed from: j, reason: collision with root package name */
    public final int f20039j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f20040k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f20041l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f20042m;

    /* renamed from: n, reason: collision with root package name */
    public final fm1.c f20043n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f20044o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f20045p;

    /* renamed from: q, reason: collision with root package name */
    public final List f20046q;

    /* renamed from: r, reason: collision with root package name */
    public final List f20047r;

    /* renamed from: s, reason: collision with root package name */
    public final List f20048s;

    /* renamed from: t, reason: collision with root package name */
    public final List f20049t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f20050u;

    /* renamed from: v, reason: collision with root package name */
    public final int f20051v;

    public b(i0 text, i0 labelText, i0 helperText, int i13, i0 hintText, yn1.f variant, boolean z13, int i14, int i15, int i16, boolean z14, boolean z15, boolean z16, fm1.c visibility, boolean z17, Integer num, List list, List list2, List list3, List list4, boolean z18, int i17) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(labelText, "labelText");
        Intrinsics.checkNotNullParameter(helperText, "helperText");
        Intrinsics.checkNotNullParameter(hintText, "hintText");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.f20030a = text;
        this.f20031b = labelText;
        this.f20032c = helperText;
        this.f20033d = i13;
        this.f20034e = hintText;
        this.f20035f = variant;
        this.f20036g = z13;
        this.f20037h = i14;
        this.f20038i = i15;
        this.f20039j = i16;
        this.f20040k = z14;
        this.f20041l = z15;
        this.f20042m = z16;
        this.f20043n = visibility;
        this.f20044o = z17;
        this.f20045p = num;
        this.f20046q = list;
        this.f20047r = list2;
        this.f20048s = list3;
        this.f20049t = list4;
        this.f20050u = z18;
        this.f20051v = i17;
    }

    public static b e(b bVar, i0 i0Var, i0 i0Var2, i0 i0Var3, i0 i0Var4, yn1.f fVar, boolean z13, int i13, int i14, int i15, boolean z14, boolean z15, boolean z16, fm1.c cVar, boolean z17, Integer num, List list, List list2, List list3, List list4, int i16, int i17) {
        i0 text = (i17 & 1) != 0 ? bVar.f20030a : i0Var;
        i0 labelText = (i17 & 2) != 0 ? bVar.f20031b : i0Var2;
        i0 helperText = (i17 & 4) != 0 ? bVar.f20032c : i0Var3;
        int i18 = bVar.f20033d;
        i0 hintText = (i17 & 16) != 0 ? bVar.f20034e : i0Var4;
        yn1.f variant = (i17 & 32) != 0 ? bVar.f20035f : fVar;
        boolean z18 = (i17 & 64) != 0 ? bVar.f20036g : z13;
        int i19 = (i17 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? bVar.f20037h : i13;
        int i23 = (i17 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? bVar.f20038i : i14;
        int i24 = (i17 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? bVar.f20039j : i15;
        boolean z19 = (i17 & 1024) != 0 ? bVar.f20040k : z14;
        boolean z23 = (i17 & 2048) != 0 ? bVar.f20041l : z15;
        boolean z24 = (i17 & 4096) != 0 ? bVar.f20042m : z16;
        fm1.c visibility = (i17 & 8192) != 0 ? bVar.f20043n : cVar;
        boolean z25 = (i17 & 16384) != 0 ? bVar.f20044o : z17;
        Integer num2 = (32768 & i17) != 0 ? bVar.f20045p : num;
        List list5 = (65536 & i17) != 0 ? bVar.f20046q : list;
        List list6 = (131072 & i17) != 0 ? bVar.f20047r : list2;
        List list7 = (262144 & i17) != 0 ? bVar.f20048s : list3;
        List list8 = (524288 & i17) != 0 ? bVar.f20049t : list4;
        boolean z26 = bVar.f20050u;
        int i25 = (i17 & 2097152) != 0 ? bVar.f20051v : i16;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(labelText, "labelText");
        Intrinsics.checkNotNullParameter(helperText, "helperText");
        Intrinsics.checkNotNullParameter(hintText, "hintText");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return new b(text, labelText, helperText, i18, hintText, variant, z18, i19, i23, i24, z19, z23, z24, visibility, z25, num2, list5, list6, list7, list8, z26, i25);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f20030a, bVar.f20030a) && Intrinsics.d(this.f20031b, bVar.f20031b) && Intrinsics.d(this.f20032c, bVar.f20032c) && this.f20033d == bVar.f20033d && Intrinsics.d(this.f20034e, bVar.f20034e) && this.f20035f == bVar.f20035f && this.f20036g == bVar.f20036g && this.f20037h == bVar.f20037h && this.f20038i == bVar.f20038i && this.f20039j == bVar.f20039j && this.f20040k == bVar.f20040k && this.f20041l == bVar.f20041l && this.f20042m == bVar.f20042m && this.f20043n == bVar.f20043n && this.f20044o == bVar.f20044o && Intrinsics.d(this.f20045p, bVar.f20045p) && Intrinsics.d(this.f20046q, bVar.f20046q) && Intrinsics.d(this.f20047r, bVar.f20047r) && Intrinsics.d(this.f20048s, bVar.f20048s) && Intrinsics.d(this.f20049t, bVar.f20049t) && this.f20050u == bVar.f20050u && this.f20051v == bVar.f20051v;
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f20044o, d7.g.a(this.f20043n, ep.b.e(this.f20042m, ep.b.e(this.f20041l, ep.b.e(this.f20040k, ep.b.b(this.f20039j, ep.b.b(this.f20038i, ep.b.b(this.f20037h, ep.b.e(this.f20036g, (this.f20035f.hashCode() + ep.b.d(this.f20034e, ep.b.b(this.f20033d, ep.b.d(this.f20032c, ep.b.d(this.f20031b, this.f20030a.hashCode() * 31, 31), 31), 31), 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        Integer num = this.f20045p;
        int hashCode = (e13 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.f20046q;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f20047r;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f20048s;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.f20049t;
        return Integer.hashCode(this.f20051v) + ep.b.e(this.f20050u, (hashCode4 + (list4 != null ? list4.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(text=");
        sb3.append(this.f20030a);
        sb3.append(", labelText=");
        sb3.append(this.f20031b);
        sb3.append(", helperText=");
        sb3.append(this.f20032c);
        sb3.append(", helperTextLines=");
        sb3.append(this.f20033d);
        sb3.append(", hintText=");
        sb3.append(this.f20034e);
        sb3.append(", variant=");
        sb3.append(this.f20035f);
        sb3.append(", isSingleLine=");
        sb3.append(this.f20036g);
        sb3.append(", minLines=");
        sb3.append(this.f20037h);
        sb3.append(", maxLines=");
        sb3.append(this.f20038i);
        sb3.append(", maxLength=");
        sb3.append(this.f20039j);
        sb3.append(", limitTextToMaxLength=");
        sb3.append(this.f20040k);
        sb3.append(", enabled=");
        sb3.append(this.f20041l);
        sb3.append(", isPassword=");
        sb3.append(this.f20042m);
        sb3.append(", visibility=");
        sb3.append(this.f20043n);
        sb3.append(", hasClearText=");
        sb3.append(this.f20044o);
        sb3.append(", cursorIndex=");
        sb3.append(this.f20045p);
        sb3.append(", imeOptions=");
        sb3.append(this.f20046q);
        sb3.append(", inputType=");
        sb3.append(this.f20047r);
        sb3.append(", rawInputType=");
        sb3.append(this.f20048s);
        sb3.append(", autofillHints=");
        sb3.append(this.f20049t);
        sb3.append(", supportLinks=");
        sb3.append(this.f20050u);
        sb3.append(", id=");
        return a.a.n(sb3, this.f20051v, ")");
    }
}
