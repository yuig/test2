package cn1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import u50.k0;

/* loaded from: classes5.dex */
public final class y implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final u50.i0 f28241a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.i0 f28242b;

    /* renamed from: c, reason: collision with root package name */
    public final rm1.q f28243c;

    /* renamed from: d, reason: collision with root package name */
    public final f f28244d;

    /* renamed from: e, reason: collision with root package name */
    public final f f28245e;

    /* renamed from: f, reason: collision with root package name */
    public final dn1.d f28246f;

    /* renamed from: g, reason: collision with root package name */
    public final int f28247g;

    /* renamed from: h, reason: collision with root package name */
    public final fm1.c f28248h;

    /* renamed from: i, reason: collision with root package name */
    public final dn1.e f28249i;

    /* renamed from: j, reason: collision with root package name */
    public final c f28250j;

    /* renamed from: k, reason: collision with root package name */
    public final g f28251k;

    /* renamed from: l, reason: collision with root package name */
    public final c f28252l;

    /* renamed from: m, reason: collision with root package name */
    public final c f28253m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f28254n;

    /* renamed from: o, reason: collision with root package name */
    public final u50.i0 f28255o;

    /* renamed from: p, reason: collision with root package name */
    public final u50.i0 f28256p;

    public y(u50.i0 text, u50.i0 hint, rm1.q leadingIcon, f fVar, f fVar2, dn1.d style, int i13, fm1.c visibility, dn1.e variant, c cVar, g gVar, c cVar2, c cVar3, boolean z13, u50.i0 helperText, u50.i0 labelText) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(leadingIcon, "leadingIcon");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(helperText, "helperText");
        Intrinsics.checkNotNullParameter(labelText, "labelText");
        this.f28241a = text;
        this.f28242b = hint;
        this.f28243c = leadingIcon;
        this.f28244d = fVar;
        this.f28245e = fVar2;
        this.f28246f = style;
        this.f28247g = i13;
        this.f28248h = visibility;
        this.f28249i = variant;
        this.f28250j = cVar;
        this.f28251k = gVar;
        this.f28252l = cVar2;
        this.f28253m = cVar3;
        this.f28254n = z13;
        this.f28255o = helperText;
        this.f28256p = labelText;
    }

    public static y e(y yVar, k0 k0Var, dn1.d dVar, int i13, fm1.c cVar, dn1.e eVar, c cVar2, c cVar3, int i14) {
        u50.i0 text = yVar.f28241a;
        u50.i0 hint = (i14 & 2) != 0 ? yVar.f28242b : k0Var;
        rm1.q leadingIcon = yVar.f28243c;
        f fVar = yVar.f28244d;
        f fVar2 = yVar.f28245e;
        dn1.d style = (i14 & 32) != 0 ? yVar.f28246f : dVar;
        int i15 = (i14 & 64) != 0 ? yVar.f28247g : i13;
        fm1.c visibility = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? yVar.f28248h : cVar;
        dn1.e variant = (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? yVar.f28249i : eVar;
        c cVar4 = yVar.f28250j;
        g gVar = yVar.f28251k;
        c cVar5 = (i14 & 2048) != 0 ? yVar.f28252l : cVar2;
        c cVar6 = (i14 & 4096) != 0 ? yVar.f28253m : cVar3;
        boolean z13 = yVar.f28254n;
        u50.i0 helperText = yVar.f28255o;
        u50.i0 labelText = yVar.f28256p;
        yVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(leadingIcon, "leadingIcon");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(helperText, "helperText");
        Intrinsics.checkNotNullParameter(labelText, "labelText");
        return new y(text, hint, leadingIcon, fVar, fVar2, style, i15, visibility, variant, cVar4, gVar, cVar5, cVar6, z13, helperText, labelText);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.f28241a, yVar.f28241a) && Intrinsics.d(this.f28242b, yVar.f28242b) && this.f28243c == yVar.f28243c && Intrinsics.d(this.f28244d, yVar.f28244d) && Intrinsics.d(this.f28245e, yVar.f28245e) && this.f28246f == yVar.f28246f && this.f28247g == yVar.f28247g && this.f28248h == yVar.f28248h && this.f28249i == yVar.f28249i && Intrinsics.d(this.f28250j, yVar.f28250j) && Intrinsics.d(this.f28251k, yVar.f28251k) && Intrinsics.d(this.f28252l, yVar.f28252l) && Intrinsics.d(this.f28253m, yVar.f28253m) && this.f28254n == yVar.f28254n && Intrinsics.d(this.f28255o, yVar.f28255o) && Intrinsics.d(this.f28256p, yVar.f28256p);
    }

    public final int hashCode() {
        int hashCode = (this.f28243c.hashCode() + ep.b.d(this.f28242b, this.f28241a.hashCode() * 31, 31)) * 31;
        f fVar = this.f28244d;
        int hashCode2 = (hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        f fVar2 = this.f28245e;
        int hashCode3 = (this.f28249i.hashCode() + d7.g.a(this.f28248h, ep.b.b(this.f28247g, (this.f28246f.hashCode() + ((hashCode2 + (fVar2 == null ? 0 : fVar2.hashCode())) * 31)) * 31, 31), 31)) * 31;
        c cVar = this.f28250j;
        int hashCode4 = (hashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        g gVar = this.f28251k;
        int hashCode5 = (hashCode4 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        c cVar2 = this.f28252l;
        int hashCode6 = (hashCode5 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        c cVar3 = this.f28253m;
        return this.f28256p.hashCode() + ep.b.d(this.f28255o, ep.b.e(this.f28254n, (hashCode6 + (cVar3 != null ? cVar3.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(text=");
        sb3.append(this.f28241a);
        sb3.append(", hint=");
        sb3.append(this.f28242b);
        sb3.append(", leadingIcon=");
        sb3.append(this.f28243c);
        sb3.append(", trailingIcon=");
        sb3.append(this.f28244d);
        sb3.append(", leftTrailingIcon=");
        sb3.append(this.f28245e);
        sb3.append(", style=");
        sb3.append(this.f28246f);
        sb3.append(", id=");
        sb3.append(this.f28247g);
        sb3.append(", visibility=");
        sb3.append(this.f28248h);
        sb3.append(", variant=");
        sb3.append(this.f28249i);
        sb3.append(", externalLeadingIconButton=");
        sb3.append(this.f28250j);
        sb3.append(", externalTrailingButton=");
        sb3.append(this.f28251k);
        sb3.append(", endActionIconButtonOne=");
        sb3.append(this.f28252l);
        sb3.append(", endActionIconButtonTwo=");
        sb3.append(this.f28253m);
        sb3.append(", hasErrorState=");
        sb3.append(this.f28254n);
        sb3.append(", helperText=");
        sb3.append(this.f28255o);
        sb3.append(", labelText=");
        return jq.b.k(sb3, this.f28256p, ")");
    }
}
