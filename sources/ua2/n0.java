package ua2;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import com.pinterest.ui.grid.LegoPinGridCell;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class n0 extends g0 {

    /* renamed from: j, reason: collision with root package name */
    public final int f121582j;

    /* renamed from: k, reason: collision with root package name */
    public final va2.l f121583k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(LegoPinGridCell legoGridCell, int i13) {
        super(legoGridCell);
        Intrinsics.checkNotNullParameter(legoGridCell, "legoGridCell");
        this.f121582j = i13;
        Context context = legoGridCell.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f121583k = new va2.l(context);
    }

    @Override // ua2.h0
    public boolean C(int i13, int i14) {
        return false;
    }

    public final void E(boolean z13) {
        va2.l lVar = this.f121583k;
        if (z13) {
            tn1.c cVar = lVar.f125401m;
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            cVar.a(new tn1.a(cVar, 1));
        } else {
            lVar.p(vn1.g.BODY_100);
        }
        lVar.m(vn1.b.START);
    }

    public final void F(SpannableStringBuilder spannableStringBuilder) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "spannableStringBuilder");
        this.f121583k.f125409u = spannableStringBuilder;
    }

    public final void G(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f121583k.o(text);
    }

    public final void H(vn1.c color) {
        Intrinsics.checkNotNullParameter(color, "textColor");
        va2.l lVar = this.f121583k;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(color, "color");
        lVar.f125401m.b(color);
    }

    public final void I(List style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f121583k.n(style);
    }

    @Override // ua2.f1
    public final wa2.l k() {
        return this.f121583k;
    }

    @Override // ua2.f1
    public void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i17 = this.f121582j;
        int i18 = i13 + i17;
        int i19 = this.f121497h;
        int i23 = i15 - i17;
        int i24 = this.f121498i;
        va2.l lVar = this.f121583k;
        lVar.setBounds(i18, i19, i23, i24);
        lVar.draw(canvas);
        u(canvas);
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        int i15 = i13 - (this.f121582j * 2);
        va2.l lVar = this.f121583k;
        lVar.f125407s = i15;
        lVar.l();
        return new z0(i13, lVar.f128842e);
    }
}
