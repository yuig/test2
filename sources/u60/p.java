package u60;

import android.os.Handler;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.appbar.AppBarLayout;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.feature.board.common.filter.view.BoardPinsFilterToolbar;
import df.j1;
import dl1.s0;
import i32.y0;
import ja.y;
import java.util.Iterator;
import java.util.List;
import kl0.z;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wa2.a0;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f120798i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f120799j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(s sVar, int i13) {
        super(1);
        this.f120798i = i13;
        this.f120799j = sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.pinterest.feature.board.detail.a aVar;
        BoardPinsFilterToolbar boardPinsFilterToolbar;
        int i13 = this.f120798i;
        int i14 = -1;
        boolean z13 = false;
        r3 = false;
        boolean z14 = false;
        r3 = false;
        r3 = false;
        boolean z15 = false;
        int i15 = 0;
        r3 = false;
        r3 = false;
        r3 = false;
        boolean z16 = false;
        z13 = false;
        s sVar = this.f120799j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter((Pair) obj, "it");
                if (sVar.i0() && sVar.f120803b0) {
                    z13 = true;
                }
                return Boolean.valueOf(z13);
            case 1:
                sVar.i2();
                hl0.v vVar = (hl0.v) sVar.R;
                vVar.M3(true);
                com.pinterest.feature.board.detail.a aVar2 = (com.pinterest.feature.board.detail.a) vVar.getViewIfBound();
                if (aVar2 != null) {
                    ((z) aVar2).E8(0, false);
                }
                vVar.I3();
                return Unit.f80348a;
            case 2:
                s0 it = (s0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                f30 f30Var = (f30) it.f55286b;
                return Boolean.valueOf((b40.e(f30Var, sVar.L) && f30Var.j6() == null && sVar.i0() && sVar.f120803b0) || !b40.e((f30) it.f55286b, sVar.L));
            case 3:
                s0 s0Var = (s0) obj;
                sVar.f120802a0 = sVar.O.t();
                int i16 = q.f120800a[s0Var.f55285a.ordinal()];
                com.pinterest.feature.board.detail.b bVar = sVar.R;
                dl1.s sVar2 = s0Var.f55286b;
                if (i16 == 1) {
                    f30 f30Var2 = (f30) sVar2;
                    String str = sVar.L;
                    if (!b40.e(f30Var2, str) || f30Var2.j6() != null) {
                        int g03 = sVar.g0(f30Var2);
                        if (sVar.d2(g03)) {
                            sVar.removeItem(g03);
                        }
                        ((hl0.v) bVar).M3(true);
                    } else if (b40.e(f30Var2, str) && f30Var2.j6() == null && sVar.i0() && sVar.f120803b0) {
                        sVar.j0(f30Var2);
                        int g04 = sVar.g0(f30Var2);
                        dl1.s item = sVar.getItem(g04);
                        f30 f30Var3 = item instanceof f30 ? (f30) item : null;
                        boolean z17 = !Intrinsics.d(f30Var3 != null ? f30Var3.o4() : null, f30Var2.o4());
                        if (sVar.d2(g04)) {
                            sVar.u1(g04, f30Var2);
                        }
                        if (z17) {
                            hl0.v vVar2 = (hl0.v) bVar;
                            vVar2.M3(true);
                            v7 v7Var = vVar2.K;
                            if (v7Var != null) {
                                vVar2.f69545t.getClass();
                                y0 y0Var = y0.ANDROID_BOARD_FILTER_ICON;
                                i32.l lVar = i32.l.ANDROID_BOARD_FAVORITE_FILTER_TOOLTIP;
                                boolean D0 = j1.D0(y0Var, lVar);
                                if (kh2.w.i0(v7Var) && !vVar2.f69527j && D0 && (aVar = (com.pinterest.feature.board.detail.a) vVar2.getViewIfBound()) != null) {
                                    z zVar = (z) aVar;
                                    if (zVar.f91282J && (boardPinsFilterToolbar = zVar.M1) != null) {
                                        ViewParent parent = boardPinsFilterToolbar.getParent();
                                        Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
                                        if (zVar.f80154w1.d(boardPinsFilterToolbar, (View) parent, null) > 99.5f) {
                                            ur0.g.d(y0Var, zVar, null);
                                            xk2.v vVar3 = zVar.f80152u1;
                                            ((Handler) vVar3.getValue()).removeCallbacksAndMessages(null);
                                            ((Handler) vVar3.getValue()).postDelayed(new y(zVar, y0Var, lVar, 15), 5000L);
                                        } else {
                                            AppBarLayout appBarLayout = zVar.L1;
                                            if (appBarLayout == null) {
                                                Intrinsics.r("boardHeaderContainer");
                                                throw null;
                                            }
                                            appBarLayout.n(true, true, true);
                                            zVar.f80155x1 = true;
                                        }
                                    }
                                }
                            }
                            if (!f30Var2.o4().booleanValue() && 6 == vVar2.V && sVar.N == 6) {
                                sVar.i2();
                            }
                        }
                    }
                } else if (i16 == 2) {
                    sVar.k0((f30) sVar2, false);
                } else if (i16 == 3) {
                    int g05 = sVar.g0((f30) sVar2);
                    if (sVar.d2(g05)) {
                        sVar.removeItem(g05);
                    }
                    ((hl0.v) bVar).M3(true);
                }
                return Unit.f80348a;
            case 4:
                ((hl0.v) sVar.R).N3();
                return Unit.f80348a;
            case 5:
                gb2.i it2 = (gb2.i) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2.f64754b == wa2.p.STATE_REPORTED) {
                    if (it2.f64755c.compareTo(wa2.o.UI_ONLY) > 0 && sVar.i0() && sVar.f120803b0) {
                        z16 = true;
                    }
                }
                return Boolean.valueOf(z16);
            case 6:
                gb2.i iVar = (gb2.i) obj;
                Iterator it3 = sVar.d().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (Intrinsics.d(((dl1.s) it3.next()).getUid(), iVar.f64753a)) {
                            i14 = i15;
                        } else {
                            i15++;
                        }
                    }
                }
                dl1.s item2 = sVar.getItem(i14);
                if (item2 != null) {
                    sVar.u1(i14, item2);
                }
                return Unit.f80348a;
            case 7:
                List it4 = (List) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                if (((gb2.k) d7.b.j0(it4)).f64759b.compareTo(a0.PIN_GRID_SAVED_OVERLAY_STATE_HIDDEN) > 0 && sVar.i0() && sVar.f120803b0) {
                    z15 = true;
                }
                return Boolean.valueOf(z15);
            case 8:
                List<gb2.k> list = (List) obj;
                Intrinsics.f(list);
                sVar.getClass();
                for (gb2.k kVar : list) {
                    gb2.k kVar2 = (gb2.k) dn.c.h0(sVar.Y, kVar.f64758a, kVar);
                    if (kVar2 != null) {
                        Iterator it5 = sVar.d().iterator();
                        int i17 = 0;
                        while (true) {
                            if (!it5.hasNext()) {
                                i17 = -1;
                            } else if (!Intrinsics.d(((dl1.s) it5.next()).getUid(), kVar2.f64758a)) {
                                i17++;
                            }
                        }
                        dl1.s item3 = sVar.getItem(i17);
                        if (item3 != null) {
                            sVar.u1(i17, item3);
                        }
                    }
                }
                return Unit.f80348a;
            case 9:
                Intrinsics.checkNotNullParameter((String) obj, "it");
                if (sVar.i0() && sVar.f120803b0) {
                    z14 = true;
                }
                return Boolean.valueOf(z14);
            default:
                sVar.i2();
                return Unit.f80348a;
        }
    }
}
