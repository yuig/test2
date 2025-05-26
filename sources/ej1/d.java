package ej1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import ps0.y;
import u50.h0;
import u50.i0;
import u50.o0;
import vn1.e;
import vn1.g;

/* loaded from: classes2.dex */
public final class d implements aj1.a {

    /* renamed from: k, reason: collision with root package name */
    public static final y f59102k = new y(10, 0);

    /* renamed from: l, reason: collision with root package name */
    public static final g f59103l = g.BODY_100;

    /* renamed from: m, reason: collision with root package name */
    public static final vn1.b f59104m = vn1.b.START;

    /* renamed from: n, reason: collision with root package name */
    public static final List f59105n = e0.b(e.BOLD);

    /* renamed from: o, reason: collision with root package name */
    public static final vn1.c f59106o = vn1.c.DEFAULT;

    /* renamed from: a, reason: collision with root package name */
    public final int f59107a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f59108b;

    /* renamed from: c, reason: collision with root package name */
    public final vn1.c f59109c;

    /* renamed from: d, reason: collision with root package name */
    public final List f59110d;

    /* renamed from: e, reason: collision with root package name */
    public final int f59111e;

    /* renamed from: f, reason: collision with root package name */
    public final b f59112f;

    /* renamed from: g, reason: collision with root package name */
    public final o0 f59113g;

    /* renamed from: h, reason: collision with root package name */
    public final g f59114h;

    /* renamed from: i, reason: collision with root package name */
    public final vn1.b f59115i;

    /* renamed from: j, reason: collision with root package name */
    public final c f59116j;

    public d(int i13, i0 text, vn1.c textColor, List textStyle, int i14, b bVar, o0 o0Var, g textVariant, vn1.b textAlign, c cVar) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(textVariant, "textVariant");
        Intrinsics.checkNotNullParameter(textAlign, "textAlign");
        this.f59107a = i13;
        this.f59108b = text;
        this.f59109c = textColor;
        this.f59110d = textStyle;
        this.f59111e = i14;
        this.f59112f = bVar;
        this.f59113g = o0Var;
        this.f59114h = textVariant;
        this.f59115i = textAlign;
        this.f59116j = cVar;
    }

    public static d e(d dVar, vn1.c cVar, List list, o0 o0Var, g gVar, int i13) {
        int i14 = dVar.f59107a;
        i0 text = dVar.f59108b;
        vn1.c textColor = (i13 & 4) != 0 ? dVar.f59109c : cVar;
        List textStyle = (i13 & 8) != 0 ? dVar.f59110d : list;
        int i15 = dVar.f59111e;
        b bVar = dVar.f59112f;
        o0 o0Var2 = (i13 & 64) != 0 ? dVar.f59113g : o0Var;
        g textVariant = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? dVar.f59114h : gVar;
        vn1.b textAlign = dVar.f59115i;
        c cVar2 = dVar.f59116j;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(textVariant, "textVariant");
        Intrinsics.checkNotNullParameter(textAlign, "textAlign");
        return new d(i14, text, textColor, textStyle, i15, bVar, o0Var2, textVariant, textAlign, cVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f59107a == dVar.f59107a && Intrinsics.d(this.f59108b, dVar.f59108b) && this.f59109c == dVar.f59109c && Intrinsics.d(this.f59110d, dVar.f59110d) && this.f59111e == dVar.f59111e && Intrinsics.d(this.f59112f, dVar.f59112f) && Intrinsics.d(this.f59113g, dVar.f59113g) && this.f59114h == dVar.f59114h && this.f59115i == dVar.f59115i && this.f59116j == dVar.f59116j;
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f59111e, ep.b.c(this.f59110d, (this.f59109c.hashCode() + ep.b.d(this.f59108b, Integer.hashCode(this.f59107a) * 31, 31)) * 31, 31), 31);
        b bVar = this.f59112f;
        int hashCode = (b13 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        o0 o0Var = this.f59113g;
        int hashCode2 = (this.f59115i.hashCode() + ((this.f59114h.hashCode() + ((hashCode + (o0Var == null ? 0 : o0Var.hashCode())) * 31)) * 31)) * 31;
        c cVar = this.f59116j;
        return hashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "PinTextDisplayState(padding=" + this.f59107a + ", text=" + this.f59108b + ", textColor=" + this.f59109c + ", textStyle=" + this.f59110d + ", textLines=" + this.f59111e + ", ipDisclosureTextState=" + this.f59112f + ", spannableText=" + this.f59113g + ", textVariant=" + this.f59114h + ", textAlign=" + this.f59115i + ", identifier=" + this.f59116j + ")";
    }

    public /* synthetic */ d(int i13, i0 i0Var, vn1.c cVar, List list, int i14, b bVar, o0 o0Var, g gVar, vn1.b bVar2, c cVar2, int i15) {
        this((i15 & 1) != 0 ? eo1.c.ignore : i13, (i15 & 2) != 0 ? h0.f120562a : i0Var, (i15 & 4) != 0 ? f59106o : cVar, (i15 & 8) != 0 ? f59105n : list, (i15 & 16) != 0 ? 3 : i14, (i15 & 32) != 0 ? null : bVar, (i15 & 64) != 0 ? null : o0Var, (i15 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? f59103l : gVar, (i15 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? f59104m : bVar2, (i15 & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 0 ? cVar2 : null);
    }
}
