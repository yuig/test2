package ua2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import com.pinterest.repository.pin.PinService;
import com.pinterest.ui.grid.LegoPinGridCell;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.jvm.internal.Intrinsics;
import x02.i2;

/* loaded from: classes4.dex */
public final class x extends g0 {

    /* renamed from: j, reason: collision with root package name */
    public final i2 f121621j;

    /* renamed from: k, reason: collision with root package name */
    public final PinService f121622k;

    /* renamed from: l, reason: collision with root package name */
    public final i92.k f121623l;

    /* renamed from: m, reason: collision with root package name */
    public final yk1.v f121624m;

    /* renamed from: n, reason: collision with root package name */
    public final nx.d0 f121625n;

    /* renamed from: o, reason: collision with root package name */
    public final String f121626o;

    /* renamed from: p, reason: collision with root package name */
    public final va2.i f121627p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f121628q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f121629r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f121630s;

    /* renamed from: t, reason: collision with root package name */
    public hk2.b f121631t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(LegoPinGridCellImpl legoGridCell, i2 pinRepository, PinService pinService, i92.k toastUtils, yk1.a viewResources, nx.d0 pinalytics, String str) {
        super(legoGridCell);
        Intrinsics.checkNotNullParameter(legoGridCell, "legoGridCell");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(pinService, "pinService");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f121621j = pinRepository;
        this.f121622k = pinService;
        this.f121623l = toastUtils;
        this.f121624m = viewResources;
        this.f121625n = pinalytics;
        this.f121626o = str;
        c72.o oVar = new c72.o(this, 13);
        Context context = legoGridCell.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f121627p = new va2.i(context, oVar);
        this.f121630s = true;
    }

    @Override // ua2.h0
    public final boolean B() {
        if (this.f121628q && this.f121630s) {
            this.f121630s = false;
            boolean z13 = this.f121629r;
            ck2.c cVar = ck2.i.f27923c;
            nx.d0 d0Var = this.f121625n;
            PinService pinService = this.f121622k;
            LegoPinGridCell legoPinGridCell = this.f121502f;
            String str = this.f121626o;
            if (z13) {
                d0Var.b0(h32.u0.PIN_UNFAVORITE_BUTTON, Intrinsics.d(str, "board") ? h32.g0.BOARD_PINS_GRID : Intrinsics.d(str, "user") ? h32.g0.PINS_TAB : h32.g0.FLOWED_PIN, legoPinGridCell.getPinUid(), false);
                F(false);
                hk2.b bVar = this.f121631t;
                if (bVar != null) {
                    bVar.dispose();
                }
                String pinUid = legoPinGridCell.getPinUid();
                Intrinsics.f(pinUid);
                hk2.k e13 = pinService.unfavorite(pinUid, n00.b.a(n00.c.BOARD_PIN_FEED)).h(tk2.e.f118017c).e(wj2.c.a());
                hk2.b bVar2 = new hk2.b(new v(1, new w(this, 2)), new v(2, new w(this, 3)), cVar);
                e13.f(bVar2);
                this.f121631t = bVar2;
            } else {
                d0Var.b0(h32.u0.PIN_FAVORITE_BUTTON, Intrinsics.d(str, "board") ? h32.g0.BOARD_PINS_GRID : Intrinsics.d(str, "user") ? h32.g0.PINS_TAB : h32.g0.FLOWED_PIN, legoPinGridCell.getPinUid(), false);
                F(true);
                hk2.b bVar3 = this.f121631t;
                if (bVar3 != null) {
                    bVar3.dispose();
                }
                String pinUid2 = legoPinGridCell.getPinUid();
                Intrinsics.f(pinUid2);
                hk2.k e14 = pinService.favorite(pinUid2, n00.b.a(n00.c.BOARD_PIN_FEED)).h(tk2.e.f118017c).e(wj2.c.a());
                hk2.b bVar4 = new hk2.b(new e82.b(29, new w(this, 0)), new v(0, new w(this, 1)), cVar);
                e14.f(bVar4);
                this.f121631t = bVar4;
            }
        }
        this.f121628q = false;
        return false;
    }

    @Override // ua2.h0
    public final boolean C(int i13, int i14) {
        va2.i iVar = this.f121627p;
        Rect bounds = iVar.f125376q.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        int centerX = bounds.centerX();
        int centerY = bounds.centerY();
        int V = bs1.c.V(iVar.f125371l, m60.r0.pin_grid_overflow_bounds_width) / 2;
        bounds.set(centerX - V, centerY - V, centerX + V, centerY + V);
        boolean contains = bounds.contains(i13, i14);
        this.f121628q = contains;
        return contains;
    }

    public final void E(int i13) {
        String str = "";
        if (i13 != 0) {
            if (i13 < 9) {
                str = String.valueOf(i13);
            } else if (i13 > 9) {
                str = "9+";
            }
        }
        va2.i iVar = this.f121627p;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        iVar.f125379t = str;
        iVar.invalidateSelf();
    }

    public final void F(boolean z13) {
        this.f121629r = z13;
        va2.i iVar = this.f121627p;
        BitmapDrawable bitmapDrawable = z13 ? iVar.f125374o : iVar.f125375p;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(bitmapDrawable, "<set-?>");
        iVar.f125376q = bitmapDrawable;
        iVar.invalidateSelf();
    }

    @Override // ua2.f1
    public final wa2.l k() {
        return this.f121627p;
    }

    @Override // ua2.f1
    public final void r(Canvas canvas, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        va2.i iVar = this.f121627p;
        boolean z13 = iVar.f128838a;
        int i17 = z13 ? 0 : i15 - iVar.f128841d;
        if (z13) {
            i15 = iVar.f128841d;
        }
        iVar.setBounds(i17, this.f121497h, i15, this.f121498i);
        iVar.draw(canvas);
        u(canvas);
    }

    @Override // ua2.f1
    public final z0 y(int i13, int i14) {
        va2.i iVar = this.f121627p;
        int max = Math.max(iVar.f125376q.getIntrinsicHeight(), iVar.f125376q.getIntrinsicWidth());
        if (!kotlin.text.z.j(iVar.f125379t)) {
            tn1.c cVar = (tn1.c) iVar.f125377r.getValue();
            String str = iVar.f125379t;
            int length = str.length();
            Rect rect = iVar.f125378s;
            cVar.getTextBounds(str, 0, length, rect);
            max += rect.width() + iVar.f125373n;
        }
        iVar.e(Math.max(iVar.f125376q.getIntrinsicHeight(), iVar.f125376q.getIntrinsicWidth()));
        iVar.f(max);
        return new z0(i13, iVar.f128842e);
    }
}
