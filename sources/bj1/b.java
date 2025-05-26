package bj1;

import d7.g;
import kotlin.jvm.internal.Intrinsics;
import u50.b0;
import u50.n;

/* loaded from: classes5.dex */
public final class b implements aj1.a {

    /* renamed from: a, reason: collision with root package name */
    public final n f22962a;

    /* renamed from: b, reason: collision with root package name */
    public final n f22963b;

    /* renamed from: c, reason: collision with root package name */
    public final ej1.d f22964c;

    /* renamed from: d, reason: collision with root package name */
    public final d f22965d;

    public b(ej1.d pinTextDisplayState, d boardPinAttributionDrawableDisplayState) {
        b0 padding = new b0(eo1.c.structured_feed_footer_top_padding);
        b0 iconWith = new b0(eo1.c.lego_bricks_one_and_three_quarters);
        Intrinsics.checkNotNullParameter(padding, "padding");
        Intrinsics.checkNotNullParameter(iconWith, "iconWith");
        Intrinsics.checkNotNullParameter(pinTextDisplayState, "pinTextDisplayState");
        Intrinsics.checkNotNullParameter(boardPinAttributionDrawableDisplayState, "boardPinAttributionDrawableDisplayState");
        this.f22962a = padding;
        this.f22963b = iconWith;
        this.f22964c = pinTextDisplayState;
        this.f22965d = boardPinAttributionDrawableDisplayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f22962a, bVar.f22962a) && Intrinsics.d(this.f22963b, bVar.f22963b) && Intrinsics.d(this.f22964c, bVar.f22964c) && Intrinsics.d(this.f22965d, bVar.f22965d);
    }

    public final int hashCode() {
        return this.f22965d.f22968a.hashCode() + ((this.f22964c.hashCode() + g.e(this.f22963b, this.f22962a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "BoardPinAttributionDisplayState(padding=" + this.f22962a + ", iconWith=" + this.f22963b + ", pinTextDisplayState=" + this.f22964c + ", boardPinAttributionDrawableDisplayState=" + this.f22965d + ")";
    }
}
