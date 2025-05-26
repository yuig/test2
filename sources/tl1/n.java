package tl1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import sl1.s;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f118106a;

    /* renamed from: b, reason: collision with root package name */
    public final o f118107b;

    /* renamed from: c, reason: collision with root package name */
    public final int f118108c;

    /* renamed from: d, reason: collision with root package name */
    public final int f118109d;

    /* renamed from: e, reason: collision with root package name */
    public final int f118110e;

    /* renamed from: f, reason: collision with root package name */
    public final Function0 f118111f;

    public n(yv1.h hVar, int i13, int i14, yv1.i iVar, int i15) {
        Function2 overflowTextProvider = hVar;
        if ((i15 & 1) != 0) {
            int i16 = g.f118090a;
            overflowTextProvider = f.f118089i;
        }
        o textStyle = o.Bold;
        int i17 = eo1.b.color_themed_text_default;
        i13 = (i15 & 8) != 0 ? s.avatar_group_default_chip_background : i13;
        i14 = (i15 & 16) != 0 ? eo1.c.font_size_300 : i14;
        Function0 tapAction = iVar;
        tapAction = (i15 & 32) != 0 ? l.f118097k : tapAction;
        Intrinsics.checkNotNullParameter(overflowTextProvider, "overflowTextProvider");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(tapAction, "tapAction");
        this.f118106a = overflowTextProvider;
        this.f118107b = textStyle;
        this.f118108c = i17;
        this.f118109d = i13;
        this.f118110e = i14;
        this.f118111f = tapAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f118106a, nVar.f118106a) && this.f118107b == nVar.f118107b && this.f118108c == nVar.f118108c && this.f118109d == nVar.f118109d && this.f118110e == nVar.f118110e && Intrinsics.d(this.f118111f, nVar.f118111f);
    }

    public final int hashCode() {
        return this.f118111f.hashCode() + ep.b.b(this.f118110e, ep.b.b(this.f118109d, ep.b.b(this.f118108c, (this.f118107b.hashCode() + (this.f118106a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OverflowChipViewModel(overflowTextProvider=");
        sb3.append(this.f118106a);
        sb3.append(", textStyle=");
        sb3.append(this.f118107b);
        sb3.append(", textColorResId=");
        sb3.append(this.f118108c);
        sb3.append(", backgroundResId=");
        sb3.append(this.f118109d);
        sb3.append(", fontSize=");
        sb3.append(this.f118110e);
        sb3.append(", tapAction=");
        return pk2.f.i(sb3, this.f118111f, ")");
    }
}
