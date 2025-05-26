package ru1;

import kotlin.jvm.internal.Intrinsics;
import u50.b0;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final u50.n f110017a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.n f110018b;

    /* renamed from: c, reason: collision with root package name */
    public final u50.n f110019c;

    /* renamed from: d, reason: collision with root package name */
    public final u50.n f110020d;

    /* renamed from: e, reason: collision with root package name */
    public final u50.n f110021e;

    /* renamed from: f, reason: collision with root package name */
    public final u50.n f110022f;

    /* renamed from: g, reason: collision with root package name */
    public final u50.n f110023g;

    /* renamed from: h, reason: collision with root package name */
    public final u50.n f110024h;

    /* renamed from: i, reason: collision with root package name */
    public final rm1.i f110025i;

    /* renamed from: j, reason: collision with root package name */
    public final vn1.c f110026j;

    /* renamed from: k, reason: collision with root package name */
    public final vn1.g f110027k;

    public c(b0 tabHeight, b0 tabWidth, b0 minimumTabWidth, b0 leftMargin, b0 rightMargin, b0 topMargin, b0 bottomMargin, b0 iconBottomMargin, rm1.i iconSize) {
        vn1.c labelColor = vn1.c.DEFAULT;
        vn1.g labelVariant = vn1.g.UI_100;
        Intrinsics.checkNotNullParameter(tabHeight, "tabHeight");
        Intrinsics.checkNotNullParameter(tabWidth, "tabWidth");
        Intrinsics.checkNotNullParameter(minimumTabWidth, "minimumTabWidth");
        Intrinsics.checkNotNullParameter(leftMargin, "leftMargin");
        Intrinsics.checkNotNullParameter(rightMargin, "rightMargin");
        Intrinsics.checkNotNullParameter(topMargin, "topMargin");
        Intrinsics.checkNotNullParameter(bottomMargin, "bottomMargin");
        Intrinsics.checkNotNullParameter(iconBottomMargin, "iconBottomMargin");
        Intrinsics.checkNotNullParameter(iconSize, "iconSize");
        Intrinsics.checkNotNullParameter(labelColor, "labelColor");
        Intrinsics.checkNotNullParameter(labelVariant, "labelVariant");
        this.f110017a = tabHeight;
        this.f110018b = tabWidth;
        this.f110019c = minimumTabWidth;
        this.f110020d = leftMargin;
        this.f110021e = rightMargin;
        this.f110022f = topMargin;
        this.f110023g = bottomMargin;
        this.f110024h = iconBottomMargin;
        this.f110025i = iconSize;
        this.f110026j = labelColor;
        this.f110027k = labelVariant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f110017a, cVar.f110017a) && Intrinsics.d(this.f110018b, cVar.f110018b) && Intrinsics.d(this.f110019c, cVar.f110019c) && Intrinsics.d(this.f110020d, cVar.f110020d) && Intrinsics.d(this.f110021e, cVar.f110021e) && Intrinsics.d(this.f110022f, cVar.f110022f) && Intrinsics.d(this.f110023g, cVar.f110023g) && Intrinsics.d(this.f110024h, cVar.f110024h) && this.f110025i == cVar.f110025i && this.f110026j == cVar.f110026j && this.f110027k == cVar.f110027k;
    }

    public final int hashCode() {
        return this.f110027k.hashCode() + ((this.f110026j.hashCode() + ((this.f110025i.hashCode() + d7.g.e(this.f110024h, d7.g.e(this.f110023g, d7.g.e(this.f110022f, d7.g.e(this.f110021e, d7.g.e(this.f110020d, d7.g.e(this.f110019c, d7.g.e(this.f110018b, this.f110017a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BottomNavBarTabDisplayState(tabHeight=" + this.f110017a + ", tabWidth=" + this.f110018b + ", minimumTabWidth=" + this.f110019c + ", leftMargin=" + this.f110020d + ", rightMargin=" + this.f110021e + ", topMargin=" + this.f110022f + ", bottomMargin=" + this.f110023g + ", iconBottomMargin=" + this.f110024h + ", iconSize=" + this.f110025i + ", labelColor=" + this.f110026j + ", labelVariant=" + this.f110027k + ")";
    }
}
