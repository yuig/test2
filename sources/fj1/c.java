package fj1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import ej1.d;
import kotlin.jvm.internal.Intrinsics;
import rm1.i;
import rm1.q;

/* loaded from: classes2.dex */
public final class c implements aj1.a, vi1.a {

    /* renamed from: a, reason: collision with root package name */
    public final d f62247a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f62248b;

    /* renamed from: c, reason: collision with root package name */
    public final int f62249c;

    /* renamed from: d, reason: collision with root package name */
    public final q f62250d;

    /* renamed from: e, reason: collision with root package name */
    public final rm1.c f62251e;

    /* renamed from: f, reason: collision with root package name */
    public final i f62252f;

    /* renamed from: g, reason: collision with root package name */
    public final a f62253g;

    /* renamed from: h, reason: collision with root package name */
    public final g92.d f62254h;

    public c(d pinTextDisplayState, Integer num, int i13, q qVar, rm1.c gestaltIconColor, i gestaltIconSize, a iconHorizontalAlignment, g92.d dVar, int i14) {
        num = (i14 & 2) != 0 ? null : num;
        i13 = (i14 & 4) != 0 ? eo1.c.lego_spacing_horizontal_text_icon : i13;
        gestaltIconSize = (i14 & 32) != 0 ? GestaltIcon.f49403e : gestaltIconSize;
        iconHorizontalAlignment = (i14 & 64) != 0 ? a.END : iconHorizontalAlignment;
        dVar = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : dVar;
        Intrinsics.checkNotNullParameter(pinTextDisplayState, "pinTextDisplayState");
        Intrinsics.checkNotNullParameter(gestaltIconColor, "gestaltIconColor");
        Intrinsics.checkNotNullParameter(gestaltIconSize, "gestaltIconSize");
        Intrinsics.checkNotNullParameter(iconHorizontalAlignment, "iconHorizontalAlignment");
        this.f62247a = pinTextDisplayState;
        this.f62248b = num;
        this.f62249c = i13;
        this.f62250d = qVar;
        this.f62251e = gestaltIconColor;
        this.f62252f = gestaltIconSize;
        this.f62253g = iconHorizontalAlignment;
        this.f62254h = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f62247a, cVar.f62247a) && Intrinsics.d(this.f62248b, cVar.f62248b) && this.f62249c == cVar.f62249c && this.f62250d == cVar.f62250d && this.f62251e == cVar.f62251e && this.f62252f == cVar.f62252f && this.f62253g == cVar.f62253g && this.f62254h == cVar.f62254h;
    }

    public final int hashCode() {
        int hashCode = this.f62247a.hashCode() * 31;
        Integer num = this.f62248b;
        int b13 = ep.b.b(this.f62249c, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
        q qVar = this.f62250d;
        int hashCode2 = (this.f62253g.hashCode() + ((this.f62252f.hashCode() + ((this.f62251e.hashCode() + ((b13 + (qVar == null ? 0 : qVar.hashCode())) * 31)) * 31)) * 31)) * 31;
        g92.d dVar = this.f62254h;
        return hashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "PinTextWithIconDisplayState(pinTextDisplayState=" + this.f62247a + ", iconWidth=" + this.f62248b + ", iconPadding=" + this.f62249c + ", gestaltIcon=" + this.f62250d + ", gestaltIconColor=" + this.f62251e + ", gestaltIconSize=" + this.f62252f + ", iconHorizontalAlignment=" + this.f62253g + ", themeOverride=" + this.f62254h + ")";
    }
}
