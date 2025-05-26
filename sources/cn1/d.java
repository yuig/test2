package cn1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes5.dex */
public final class d implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final u50.i0 f28152a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.i0 f28153b;

    /* renamed from: c, reason: collision with root package name */
    public final u50.i0 f28154c;

    /* renamed from: d, reason: collision with root package name */
    public final u50.i0 f28155d;

    /* renamed from: e, reason: collision with root package name */
    public final rm1.q f28156e;

    /* renamed from: f, reason: collision with root package name */
    public final f f28157f;

    /* renamed from: g, reason: collision with root package name */
    public final f f28158g;

    /* renamed from: h, reason: collision with root package name */
    public final e f28159h;

    /* renamed from: i, reason: collision with root package name */
    public final c f28160i;

    /* renamed from: j, reason: collision with root package name */
    public final g f28161j;

    /* renamed from: k, reason: collision with root package name */
    public final dn1.e f28162k;

    /* renamed from: l, reason: collision with root package name */
    public final List f28163l;

    /* renamed from: m, reason: collision with root package name */
    public final List f28164m;

    /* renamed from: n, reason: collision with root package name */
    public final List f28165n;

    /* renamed from: o, reason: collision with root package name */
    public final fm1.c f28166o;

    /* renamed from: p, reason: collision with root package name */
    public final c f28167p;

    /* renamed from: q, reason: collision with root package name */
    public final c f28168q;

    /* renamed from: r, reason: collision with root package name */
    public final int f28169r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f28170s;

    public d(u50.i0 text, u50.i0 labelText, u50.i0 helperText, u50.i0 i0Var, rm1.q qVar, f fVar, f fVar2, e eVar, c cVar, g gVar, dn1.e variant, List list, List list2, List list3, fm1.c visibility, c cVar2, c cVar3, int i13, boolean z13) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(labelText, "labelText");
        Intrinsics.checkNotNullParameter(helperText, "helperText");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.f28152a = text;
        this.f28153b = labelText;
        this.f28154c = helperText;
        this.f28155d = i0Var;
        this.f28156e = qVar;
        this.f28157f = fVar;
        this.f28158g = fVar2;
        this.f28159h = eVar;
        this.f28160i = cVar;
        this.f28161j = gVar;
        this.f28162k = variant;
        this.f28163l = list;
        this.f28164m = list2;
        this.f28165n = list3;
        this.f28166o = visibility;
        this.f28167p = cVar2;
        this.f28168q = cVar3;
        this.f28169r = i13;
        this.f28170s = z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19, types: [u50.i0] */
    public static d e(d dVar, u50.f0 f0Var, u50.i0 i0Var, rm1.q qVar, f fVar, f fVar2, e eVar, g gVar, dn1.e eVar2, fm1.c cVar, c cVar2, c cVar3, int i13) {
        List list;
        c cVar4;
        u50.f0 text = (i13 & 1) != 0 ? dVar.f28152a : f0Var;
        u50.i0 labelText = dVar.f28153b;
        u50.i0 helperText = dVar.f28154c;
        u50.i0 i0Var2 = (i13 & 8) != 0 ? dVar.f28155d : i0Var;
        rm1.q qVar2 = (i13 & 16) != 0 ? dVar.f28156e : qVar;
        f fVar3 = (i13 & 32) != 0 ? dVar.f28157f : fVar;
        f fVar4 = (i13 & 64) != 0 ? dVar.f28158g : fVar2;
        e eVar3 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? dVar.f28159h : eVar;
        c cVar5 = dVar.f28160i;
        g gVar2 = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? dVar.f28161j : gVar;
        dn1.e variant = (i13 & 1024) != 0 ? dVar.f28162k : eVar2;
        List list2 = dVar.f28163l;
        List list3 = dVar.f28164m;
        List list4 = dVar.f28165n;
        fm1.c visibility = (i13 & 16384) != 0 ? dVar.f28166o : cVar;
        if ((i13 & 32768) != 0) {
            list = list3;
            cVar4 = dVar.f28167p;
        } else {
            list = list3;
            cVar4 = cVar2;
        }
        c cVar6 = (i13 & 65536) != 0 ? dVar.f28168q : cVar3;
        int i14 = dVar.f28169r;
        boolean z13 = dVar.f28170s;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(labelText, "labelText");
        Intrinsics.checkNotNullParameter(helperText, "helperText");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return new d(text, labelText, helperText, i0Var2, qVar2, fVar3, fVar4, eVar3, cVar5, gVar2, variant, list2, list, list4, visibility, cVar4, cVar6, i14, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f28152a, dVar.f28152a) && Intrinsics.d(this.f28153b, dVar.f28153b) && Intrinsics.d(this.f28154c, dVar.f28154c) && Intrinsics.d(this.f28155d, dVar.f28155d) && this.f28156e == dVar.f28156e && Intrinsics.d(this.f28157f, dVar.f28157f) && Intrinsics.d(this.f28158g, dVar.f28158g) && Intrinsics.d(this.f28159h, dVar.f28159h) && Intrinsics.d(this.f28160i, dVar.f28160i) && Intrinsics.d(this.f28161j, dVar.f28161j) && this.f28162k == dVar.f28162k && Intrinsics.d(this.f28163l, dVar.f28163l) && Intrinsics.d(this.f28164m, dVar.f28164m) && Intrinsics.d(this.f28165n, dVar.f28165n) && this.f28166o == dVar.f28166o && Intrinsics.d(this.f28167p, dVar.f28167p) && Intrinsics.d(this.f28168q, dVar.f28168q) && this.f28169r == dVar.f28169r && this.f28170s == dVar.f28170s;
    }

    public final int hashCode() {
        int d2 = ep.b.d(this.f28154c, ep.b.d(this.f28153b, this.f28152a.hashCode() * 31, 31), 31);
        u50.i0 i0Var = this.f28155d;
        int hashCode = (d2 + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        rm1.q qVar = this.f28156e;
        int hashCode2 = (hashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
        f fVar = this.f28157f;
        int hashCode3 = (hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        f fVar2 = this.f28158g;
        int hashCode4 = (hashCode3 + (fVar2 == null ? 0 : fVar2.hashCode())) * 31;
        e eVar = this.f28159h;
        int hashCode5 = (hashCode4 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        c cVar = this.f28160i;
        int hashCode6 = (hashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        g gVar = this.f28161j;
        int hashCode7 = (this.f28162k.hashCode() + ((hashCode6 + (gVar == null ? 0 : gVar.hashCode())) * 31)) * 31;
        List list = this.f28163l;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f28164m;
        int hashCode9 = (hashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f28165n;
        int a13 = d7.g.a(this.f28166o, (hashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31, 31);
        c cVar2 = this.f28167p;
        int hashCode10 = (a13 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        c cVar3 = this.f28168q;
        return Boolean.hashCode(this.f28170s) + ep.b.b(this.f28169r, (hashCode10 + (cVar3 != null ? cVar3.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(text=");
        sb3.append(this.f28152a);
        sb3.append(", labelText=");
        sb3.append(this.f28153b);
        sb3.append(", helperText=");
        sb3.append(this.f28154c);
        sb3.append(", hintText=");
        sb3.append(this.f28155d);
        sb3.append(", leadingIcon=");
        sb3.append(this.f28156e);
        sb3.append(", trailingIcon=");
        sb3.append(this.f28157f);
        sb3.append(", leftTrailingIcon=");
        sb3.append(this.f28158g);
        sb3.append(", trailingAnimatedIcon=");
        sb3.append(this.f28159h);
        sb3.append(", externalLeadingIconButton=");
        sb3.append(this.f28160i);
        sb3.append(", externalTrailingButton=");
        sb3.append(this.f28161j);
        sb3.append(", variant=");
        sb3.append(this.f28162k);
        sb3.append(", autofillHints=");
        sb3.append(this.f28163l);
        sb3.append(", imeOptions=");
        sb3.append(this.f28164m);
        sb3.append(", inputType=");
        sb3.append(this.f28165n);
        sb3.append(", visibility=");
        sb3.append(this.f28166o);
        sb3.append(", endActionIconButtonOne=");
        sb3.append(this.f28167p);
        sb3.append(", endActionIconButtonTwo=");
        sb3.append(this.f28168q);
        sb3.append(", id=");
        sb3.append(this.f28169r);
        sb3.append(", hasErrorState=");
        return a.a.r(sb3, this.f28170s, ")");
    }
}
