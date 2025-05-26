package wn1;

import android.widget.ImageView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import u50.i0;

/* loaded from: classes5.dex */
public final class d implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f130514a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f130515b;

    /* renamed from: c, reason: collision with root package name */
    public final f f130516c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f130517d;

    /* renamed from: e, reason: collision with root package name */
    public final int f130518e;

    /* renamed from: f, reason: collision with root package name */
    public final int f130519f;

    /* renamed from: g, reason: collision with root package name */
    public final int f130520g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f130521h;

    /* renamed from: i, reason: collision with root package name */
    public final String f130522i;

    /* renamed from: j, reason: collision with root package name */
    public final String f130523j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f130524k;

    /* renamed from: l, reason: collision with root package name */
    public final ImageView.ScaleType f130525l;

    /* renamed from: m, reason: collision with root package name */
    public final int f130526m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f130527n;

    /* renamed from: o, reason: collision with root package name */
    public final fm1.c f130528o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f130529p;

    /* renamed from: q, reason: collision with root package name */
    public final List f130530q;

    /* renamed from: r, reason: collision with root package name */
    public final List f130531r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f130532s;

    /* renamed from: t, reason: collision with root package name */
    public final om1.c f130533t;

    /* renamed from: u, reason: collision with root package name */
    public final om1.c f130534u;

    /* renamed from: v, reason: collision with root package name */
    public final om1.c f130535v;

    /* renamed from: w, reason: collision with root package name */
    public final int f130536w;

    public d(i0 i0Var, i0 i0Var2, f variant, boolean z13, int i13, int i14, int i15, boolean z14, String str, String str2, boolean z15, ImageView.ScaleType mediaScaleType, int i16, boolean z16, fm1.c visibility, Integer num, List list, List list2, boolean z17, om1.c cVar, om1.c cVar2, om1.c cVar3, int i17) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(mediaScaleType, "mediaScaleType");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.f130514a = i0Var;
        this.f130515b = i0Var2;
        this.f130516c = variant;
        this.f130517d = z13;
        this.f130518e = i13;
        this.f130519f = i14;
        this.f130520g = i15;
        this.f130521h = z14;
        this.f130522i = str;
        this.f130523j = str2;
        this.f130524k = z15;
        this.f130525l = mediaScaleType;
        this.f130526m = i16;
        this.f130527n = z16;
        this.f130528o = visibility;
        this.f130529p = num;
        this.f130530q = list;
        this.f130531r = list2;
        this.f130532s = z17;
        this.f130533t = cVar;
        this.f130534u = cVar2;
        this.f130535v = cVar3;
        this.f130536w = i17;
    }

    public static d e(d dVar, i0 i0Var, i0 i0Var2, String str, String str2, boolean z13, Integer num, om1.c cVar, om1.c cVar2, om1.c cVar3, int i13) {
        boolean z14;
        Integer num2;
        List list;
        om1.c cVar4;
        i0 i0Var3 = (i13 & 1) != 0 ? dVar.f130514a : i0Var;
        i0 i0Var4 = (i13 & 2) != 0 ? dVar.f130515b : i0Var2;
        f variant = dVar.f130516c;
        boolean z15 = dVar.f130517d;
        int i14 = dVar.f130518e;
        int i15 = dVar.f130519f;
        int i16 = dVar.f130520g;
        boolean z16 = dVar.f130521h;
        String str3 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? dVar.f130522i : str;
        String str4 = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? dVar.f130523j : str2;
        boolean z17 = (i13 & 1024) != 0 ? dVar.f130524k : z13;
        ImageView.ScaleType mediaScaleType = dVar.f130525l;
        int i17 = dVar.f130526m;
        boolean z18 = dVar.f130527n;
        fm1.c visibility = dVar.f130528o;
        if ((i13 & 32768) != 0) {
            z14 = z18;
            num2 = dVar.f130529p;
        } else {
            z14 = z18;
            num2 = num;
        }
        List list2 = dVar.f130530q;
        boolean z19 = z17;
        List list3 = dVar.f130531r;
        boolean z23 = dVar.f130532s;
        if ((i13 & 524288) != 0) {
            list = list2;
            cVar4 = dVar.f130533t;
        } else {
            list = list2;
            cVar4 = cVar;
        }
        om1.c cVar5 = (1048576 & i13) != 0 ? dVar.f130534u : cVar2;
        om1.c cVar6 = (i13 & 2097152) != 0 ? dVar.f130535v : cVar3;
        int i18 = dVar.f130536w;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(mediaScaleType, "mediaScaleType");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return new d(i0Var3, i0Var4, variant, z15, i14, i15, i16, z16, str3, str4, z19, mediaScaleType, i17, z14, visibility, num2, list, list3, z23, cVar4, cVar5, cVar6, i18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f130514a, dVar.f130514a) && Intrinsics.d(this.f130515b, dVar.f130515b) && this.f130516c == dVar.f130516c && this.f130517d == dVar.f130517d && this.f130518e == dVar.f130518e && this.f130519f == dVar.f130519f && this.f130520g == dVar.f130520g && this.f130521h == dVar.f130521h && Intrinsics.d(this.f130522i, dVar.f130522i) && Intrinsics.d(this.f130523j, dVar.f130523j) && this.f130524k == dVar.f130524k && this.f130525l == dVar.f130525l && this.f130526m == dVar.f130526m && this.f130527n == dVar.f130527n && this.f130528o == dVar.f130528o && Intrinsics.d(this.f130529p, dVar.f130529p) && Intrinsics.d(this.f130530q, dVar.f130530q) && Intrinsics.d(this.f130531r, dVar.f130531r) && this.f130532s == dVar.f130532s && Intrinsics.d(this.f130533t, dVar.f130533t) && Intrinsics.d(this.f130534u, dVar.f130534u) && Intrinsics.d(this.f130535v, dVar.f130535v) && this.f130536w == dVar.f130536w;
    }

    public final i0 f() {
        return this.f130514a;
    }

    public final int hashCode() {
        i0 i0Var = this.f130514a;
        int hashCode = (i0Var == null ? 0 : i0Var.hashCode()) * 31;
        i0 i0Var2 = this.f130515b;
        int e13 = ep.b.e(this.f130521h, ep.b.b(this.f130520g, ep.b.b(this.f130519f, ep.b.b(this.f130518e, ep.b.e(this.f130517d, (this.f130516c.hashCode() + ((hashCode + (i0Var2 == null ? 0 : i0Var2.hashCode())) * 31)) * 31, 31), 31), 31), 31), 31);
        String str = this.f130522i;
        int hashCode2 = (e13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f130523j;
        int a13 = d7.g.a(this.f130528o, ep.b.e(this.f130527n, ep.b.b(this.f130526m, (this.f130525l.hashCode() + ep.b.e(this.f130524k, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31)) * 31, 31), 31), 31);
        Integer num = this.f130529p;
        int hashCode3 = (a13 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.f130530q;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f130531r;
        int e14 = ep.b.e(this.f130532s, (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31, 31);
        om1.c cVar = this.f130533t;
        int hashCode5 = (e14 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        om1.c cVar2 = this.f130534u;
        int hashCode6 = (hashCode5 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        om1.c cVar3 = this.f130535v;
        return Integer.hashCode(this.f130536w) + ((hashCode6 + (cVar3 != null ? cVar3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(text=");
        sb3.append(this.f130514a);
        sb3.append(", hintText=");
        sb3.append(this.f130515b);
        sb3.append(", variant=");
        sb3.append(this.f130516c);
        sb3.append(", isSingleLine=");
        sb3.append(this.f130517d);
        sb3.append(", minLines=");
        sb3.append(this.f130518e);
        sb3.append(", maxLines=");
        sb3.append(this.f130519f);
        sb3.append(", maxLength=");
        sb3.append(this.f130520g);
        sb3.append(", hasMaxLengthLimit=");
        sb3.append(this.f130521h);
        sb3.append(", mediaFilePath=");
        sb3.append(this.f130522i);
        sb3.append(", mediaUrl=");
        sb3.append(this.f130523j);
        sb3.append(", isMediaRemovable=");
        sb3.append(this.f130524k);
        sb3.append(", mediaScaleType=");
        sb3.append(this.f130525l);
        sb3.append(", mediaCornerRadii=");
        sb3.append(this.f130526m);
        sb3.append(", enabled=");
        sb3.append(this.f130527n);
        sb3.append(", visibility=");
        sb3.append(this.f130528o);
        sb3.append(", cursorIndex=");
        sb3.append(this.f130529p);
        sb3.append(", imeOptions=");
        sb3.append(this.f130530q);
        sb3.append(", inputType=");
        sb3.append(this.f130531r);
        sb3.append(", supportLinks=");
        sb3.append(this.f130532s);
        sb3.append(", primaryButton=");
        sb3.append(this.f130533t);
        sb3.append(", secondaryButton=");
        sb3.append(this.f130534u);
        sb3.append(", tertiaryButton=");
        sb3.append(this.f130535v);
        sb3.append(", id=");
        return a.a.n(sb3, this.f130536w, ")");
    }
}
