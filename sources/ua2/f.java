package ua2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.webkit.URLUtil;
import com.pinterest.api.model.bu0;
import com.pinterest.ui.grid.LegoPinGridCell;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f extends h0 {

    /* renamed from: h, reason: collision with root package name */
    public final int f121486h;

    /* renamed from: i, reason: collision with root package name */
    public final e f121487i;

    /* renamed from: j, reason: collision with root package name */
    public final xk2.v f121488j;

    /* renamed from: k, reason: collision with root package name */
    public int f121489k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(LegoPinGridCellImpl legoGridCell, hs1.q imageCache, int i13, e alignment) {
        super(legoGridCell, b1.FIXED);
        Intrinsics.checkNotNullParameter(legoGridCell, "legoGridCell");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.f121486h = i13;
        this.f121487i = alignment;
        this.f121488j = xk2.m.b(new et1.r0(16, legoGridCell, imageCache));
    }

    @Override // ua2.h0
    public final boolean C(int i13, int i14) {
        return false;
    }

    public final va2.d E() {
        return (va2.d) this.f121488j.getValue();
    }

    public final void F(bu0 badge) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        String k13 = badge.k();
        if (k13 != null) {
            if (URLUtil.isValidUrl(k13)) {
                E().h(k13, new mp0.b(4, this, badge));
            } else {
                G(badge);
            }
        }
    }

    public final void G(bu0 bu0Var) {
        Drawable drawable;
        boolean d2 = Intrinsics.d(bu0Var.j(), d.PRIME.getBadgeId());
        LegoPinGridCell legoPinGridCell = this.f121502f;
        if (d2) {
            Context context = legoPinGridCell.getContext();
            int i13 = m60.s0.badge_prime;
            Object obj = d5.a.f53679a;
            drawable = context.getDrawable(i13);
        } else {
            drawable = null;
        }
        if (drawable != null) {
            E().k(drawable);
            legoPinGridCell.requestLayout();
            legoPinGridCell.invalidate();
        }
    }

    @Override // ua2.f1
    public final wa2.l k() {
        return E();
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        int i17;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (E().f128846i) {
            return;
        }
        int w13 = w();
        int i18 = this.f121486h;
        int i19 = w13 + i18;
        boolean z13 = this.f121494c;
        e eVar = this.f121487i;
        if (!(z13 && eVar == e.START) && (z13 || eVar != e.END)) {
            i17 = this.f121489k + i13 + i18;
        } else {
            i17 = i15 - ((x() + i18) + this.f121489k);
        }
        int x13 = x() + i17;
        E().j(i17, i18, x13, i19);
        E().l(i17, i18, x13, i19);
        E().draw(canvas);
        u(canvas);
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        E().i();
        return new z0(E().f128841d, E().f128842e);
    }
}
