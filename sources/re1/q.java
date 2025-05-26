package re1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final vn1.g f107630a;

    /* renamed from: b, reason: collision with root package name */
    public final vn1.g f107631b;

    /* renamed from: c, reason: collision with root package name */
    public final int f107632c;

    /* renamed from: d, reason: collision with root package name */
    public final int f107633d;

    /* renamed from: e, reason: collision with root package name */
    public final int f107634e;

    /* renamed from: f, reason: collision with root package name */
    public final int f107635f;

    /* renamed from: g, reason: collision with root package name */
    public final int f107636g;

    /* renamed from: h, reason: collision with root package name */
    public final om1.e f107637h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f107638i;

    public q(vn1.g titleTextVariant, vn1.g subtitleTextVariant, int i13, int i14, om1.e iconButtonSize, boolean z13, int i15) {
        titleTextVariant = (i15 & 1) != 0 ? vn1.g.UI_400 : titleTextVariant;
        subtitleTextVariant = (i15 & 2) != 0 ? vn1.g.BODY_100 : subtitleTextVariant;
        int i16 = xe1.v.f134789d0;
        i13 = (i15 & 8) != 0 ? xe1.v.S : i13;
        int i17 = eo1.c.structured_feed_spotlight_empty_header_top_padding;
        i14 = (i15 & 32) != 0 ? xe1.v.X : i14;
        iconButtonSize = (i15 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? om1.e.MD : iconButtonSize;
        z13 = (i15 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : z13;
        Intrinsics.checkNotNullParameter(titleTextVariant, "titleTextVariant");
        Intrinsics.checkNotNullParameter(subtitleTextVariant, "subtitleTextVariant");
        Intrinsics.checkNotNullParameter(iconButtonSize, "iconButtonSize");
        this.f107630a = titleTextVariant;
        this.f107631b = subtitleTextVariant;
        this.f107632c = i16;
        this.f107633d = i13;
        this.f107634e = i17;
        this.f107635f = i14;
        this.f107636g = i13;
        this.f107637h = iconButtonSize;
        this.f107638i = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f107630a == qVar.f107630a && this.f107631b == qVar.f107631b && this.f107632c == qVar.f107632c && this.f107633d == qVar.f107633d && this.f107634e == qVar.f107634e && this.f107635f == qVar.f107635f && this.f107636g == qVar.f107636g && this.f107637h == qVar.f107637h && this.f107638i == qVar.f107638i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f107638i) + ((this.f107637h.hashCode() + ep.b.b(this.f107636g, ep.b.b(this.f107635f, ep.b.b(this.f107634e, ep.b.b(this.f107633d, ep.b.b(this.f107632c, (this.f107631b.hashCode() + (this.f107630a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HeaderDimensionsSpec(titleTextVariant=");
        sb3.append(this.f107630a);
        sb3.append(", subtitleTextVariant=");
        sb3.append(this.f107631b);
        sb3.append(", horizontalPadding=");
        sb3.append(this.f107632c);
        sb3.append(", topPadding=");
        sb3.append(this.f107633d);
        sb3.append(", spotlightEmptyHeaderTopPadding=");
        sb3.append(this.f107634e);
        sb3.append(", bottomPadding=");
        sb3.append(this.f107635f);
        sb3.append(", hiddenTitleViewHeight=");
        sb3.append(this.f107636g);
        sb3.append(", iconButtonSize=");
        sb3.append(this.f107637h);
        sb3.append(", applyHorizontalPaddingInternally=");
        return a.a.r(sb3, this.f107638i, ")");
    }
}
